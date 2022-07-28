package ohos.javax.xml.validation;

import java.io.IOException;
import ohos.javax.xml.transform.Result;
import ohos.javax.xml.transform.Source;
import ohos.org.w3c.dom.ls.LSResourceResolver;
import ohos.org.xml.sax.ErrorHandler;
import ohos.org.xml.sax.SAXException;
import ohos.org.xml.sax.SAXNotRecognizedException;
import ohos.org.xml.sax.SAXNotSupportedException;

/* loaded from: ohos2.2.0.3.jar:ohos/javax/xml/validation/Validator.class */
public abstract class Validator {
    public abstract void reset();

    public abstract void validate(Source source, Result result) throws IOException, SAXException;

    public abstract void setErrorHandler(ErrorHandler errorHandler);

    public abstract ErrorHandler getErrorHandler();

    public abstract void setResourceResolver(LSResourceResolver lSResourceResolver);

    public abstract LSResourceResolver getResourceResolver();

    protected Validator() {
        throw new RuntimeException("Stub!");
    }

    public void validate(Source source) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
