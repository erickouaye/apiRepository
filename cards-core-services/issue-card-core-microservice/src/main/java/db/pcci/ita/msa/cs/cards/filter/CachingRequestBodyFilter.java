package db.pcci.ita.msa.cs.cards.filter;

import db.pcci.ita.msa.cs.cards.service.MultipleReadHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by oprecos on 07.11.2017.
 */

@Component
public class CachingRequestBodyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest currentRequest = (HttpServletRequest) servletRequest;
        MultipleReadHttpRequest wrappedRequest = new MultipleReadHttpRequest(currentRequest);
        //TO DO: Check if request is valid with the schema

//        ((HttpServletResponse) servletResponse).sendError(HttpServletResponse.SC_BAD_REQUEST, "Bad request");
        chain.doFilter(wrappedRequest, servletResponse);


    }
}