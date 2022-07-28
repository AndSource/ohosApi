package ohos.javax.xml.validation;

import ohos.org.w3c.dom.ls.LSResourceResolver;
import ohos.org.xml.sax.ContentHandler;
import ohos.org.xml.sax.ErrorHandler;
import ohos.org.xml.sax.SAXNotRecognizedException;
import ohos.org.xml.sax.SAXNotSupportedException;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/validation/ValidatorHandler.class */
public abstract class ValidatorHandler implements ContentHandler {
    public abstract void setContentHandler(ContentHandler contentHandler);

    public abstract ContentHandler getContentHandler();

    public abstract void setErrorHandler(ErrorHandler errorHandler);

    public abstract ErrorHandler getErrorHandler();

    public abstract void setResourceResolver(LSResourceResolver lSResourceResolver);

    public abstract LSResourceResolver getResourceResolver();

    public abstract TypeInfoProvider getTypeInfoProvider();

    protected ValidatorHandler() {
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
