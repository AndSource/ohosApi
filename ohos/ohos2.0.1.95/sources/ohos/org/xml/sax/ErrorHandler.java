package ohos.org.xml.sax;

/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/ErrorHandler.class */
public interface ErrorHandler {
    void warning(SAXParseException sAXParseException) throws SAXException;

    void error(SAXParseException sAXParseException) throws SAXException;

    void fatalError(SAXParseException sAXParseException) throws SAXException;
}
