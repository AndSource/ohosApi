package ohos.javax.xml.parsers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import ohos.javax.xml.validation.Schema;
import ohos.org.xml.sax.InputSource;
import ohos.org.xml.sax.SAXException;
import ohos.org.xml.sax.SAXNotRecognizedException;
import ohos.org.xml.sax.SAXNotSupportedException;
import ohos.org.xml.sax.XMLReader;
import ohos.org.xml.sax.helpers.DefaultHandler;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/parsers/SAXParser.class */
public abstract class SAXParser {
    public abstract XMLReader getXMLReader() throws SAXException;

    public abstract boolean isNamespaceAware();

    public abstract boolean isValidating();

    public abstract void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException;

    public abstract Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    protected SAXParser() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public void parse(InputStream is, DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public void parse(InputStream is, DefaultHandler dh, String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public void parse(String uri, DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public void parse(File f, DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public void parse(InputSource is, DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    public Schema getSchema() {
        throw new RuntimeException("Stub!");
    }

    public boolean isXIncludeAware() {
        throw new RuntimeException("Stub!");
    }
}
