package ohos.javax.xml.parsers;

import ohos.javax.xml.validation.Schema;
import ohos.org.xml.sax.SAXException;
import ohos.org.xml.sax.SAXNotRecognizedException;
import ohos.org.xml.sax.SAXNotSupportedException;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/parsers/SAXParserFactory.class */
public abstract class SAXParserFactory {
    public abstract SAXParser newSAXParser() throws ParserConfigurationException, SAXException;

    public abstract void setFeature(String str, boolean z) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;

    public abstract boolean getFeature(String str) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;

    protected SAXParserFactory() {
        throw new RuntimeException("Stub!");
    }

    public static SAXParserFactory newInstance() {
        throw new RuntimeException("Stub!");
    }

    public static SAXParserFactory newInstance(String factoryClassName, ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }

    public void setNamespaceAware(boolean awareness) {
        throw new RuntimeException("Stub!");
    }

    public void setValidating(boolean validating) {
        throw new RuntimeException("Stub!");
    }

    public boolean isNamespaceAware() {
        throw new RuntimeException("Stub!");
    }

    public boolean isValidating() {
        throw new RuntimeException("Stub!");
    }

    public Schema getSchema() {
        throw new RuntimeException("Stub!");
    }

    public void setSchema(Schema schema) {
        throw new RuntimeException("Stub!");
    }

    public void setXIncludeAware(boolean state) {
        throw new RuntimeException("Stub!");
    }

    public boolean isXIncludeAware() {
        throw new RuntimeException("Stub!");
    }
}
