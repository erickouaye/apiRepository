package db.pcci.ita.msa.cs.cards.xmlConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

/**
 * Created by oprecos on 06.11.2017.
 */

@Configuration
public class XMLMarshallingConfig {

    @Value("${client.ssl.key-store-password}")
    private String keyStorePassword;

    @Value("${client.ssl.trust-store-password}")
    private String trustStorePassword;

    @Value("${client.ssl.keyStore.path}")
    private String keyStorePath;

    @Value("${client.ssl.trustStore.path}")
    private String trustStorePath;


    @Bean
    Jaxb2Marshaller jaxb2Marshaller() {

        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("db.pcci.ita.msa.cards.soap.client");
        return jaxb2Marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(){
        HttpsURLConnection.setDefaultHostnameVerifier ((hostname, session) -> true);
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller());

        try{
            KeyStore ks = KeyStore.getInstance("JKS");
            InputStream keyStore = this.getClass().getClassLoader().getResourceAsStream(keyStorePath);
            ks.load(keyStore, keyStorePassword.toCharArray());


            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("PKIX");
            keyManagerFactory.init(ks, keyStorePassword.toCharArray());
            KeyStore ts = KeyStore.getInstance("JKS");
            InputStream trustStore = this.getClass().getClassLoader().getResourceAsStream(trustStorePath);
            ts.load(trustStore, trustStorePassword.toCharArray());

            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
            trustManagerFactory.init(ts);
            HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
            messageSender.setKeyManagers(keyManagerFactory.getKeyManagers());
            messageSender.setTrustManagers(trustManagerFactory.getTrustManagers());
            webServiceTemplate.setMessageSender(messageSender);

            return webServiceTemplate;

        } catch (IOException | CertificateException | NoSuchAlgorithmException | UnrecoverableKeyException | KeyStoreException e) {
            e.printStackTrace();
            return null;
        }
    }
}
