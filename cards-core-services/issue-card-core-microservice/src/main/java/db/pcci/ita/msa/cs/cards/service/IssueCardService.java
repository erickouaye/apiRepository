package db.pcci.ita.msa.cs.cards.service;

import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardResponseType;
import javafx.util.Pair;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static java.lang.System.in;

/**
 * Created by oprecos on 06.11.2017.
 */
@Service
public class IssueCardService {
    //TO DO

    @Value("${application.soap.url}")
    private String SOAP_URL;

    @Value("${application.soap.action}")
    private String SOAP_ACTION;

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private static Logger LOGGER = Logger.getLogger(IssueCardService.class);

    public JAXBElement<IssuePrimaryCardResponseType> getIssuePrimaryCardResponse(JAXBElement<IssuePrimaryCardRequestType> issuePrimaryCardRequestType) throws Exception {
        isValidated(issuePrimaryCardRequestType);
        JAXBElement<IssuePrimaryCardResponseType> response;
        LOGGER.info(issuePrimaryCardRequestType);
        try {
            response = (JAXBElement<IssuePrimaryCardResponseType>) webServiceTemplate.marshalSendAndReceive(
                    SOAP_URL,
                    issuePrimaryCardRequestType,
                    message -> ((SoapMessage) message).setSoapAction(SOAP_ACTION)
            );
        } catch (SoapFaultClientException ex) {
            throw new Exception();
        }

        return response;
    }

    private boolean isValidated(JAXBElement<IssuePrimaryCardRequestType> issuePrimaryCardRequestType){
        try {
            JAXBContext jc = JAXBContext.newInstance(IssuePrimaryCardRequestType.class);
            JAXBSource source = new JAXBSource(jc, issuePrimaryCardRequestType);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema;
            schema = sf.newSchema(new File(this.getClass().getClassLoader().getResource("wsdl/xsd/CardOrderManagementMessages.xsd").getFile()));
            Validator validator = schema.newValidator();
//        validator.setErrorHandler(new MyErrorHandler());
            validator.validate(source);

        } catch (JAXBException | SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
