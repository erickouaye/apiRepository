package db.pcci.ita.msa.cs.cards.service;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;

public class MultipleReadHttpRequest extends HttpServletRequestWrapper {
    private ByteArrayOutputStream cachedContent;
    private String body;
    public MultipleReadHttpRequest(HttpServletRequest request) throws IOException {
        super(request);
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();

            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                char[] charBuffer = new char[128];
                int bytesRead = -1;

                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
//            logger.error("Error reading the request body...");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
//                    logger.error("Error closing bufferedReader...");
                }
            }
        }

         body = stringBuilder.toString();
        // Read the request body and populate the cachedContent
    }

    public String getBody() {
        return body;
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        // Create input stream from cachedContent
        // and return it
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes());

        ServletInputStream inputStream = new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            public int read () throws IOException {
                return byteArrayInputStream.read();
            }
        };

        return inputStream;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        // Create a reader from cachedContent
        // and return it
        return super.getReader();
    }
}