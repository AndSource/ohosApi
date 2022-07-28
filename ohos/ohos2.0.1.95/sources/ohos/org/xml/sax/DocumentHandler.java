package ohos.org.xml.sax;

@Deprecated
/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/DocumentHandler.class */
public interface DocumentHandler {
    @Deprecated
    void setDocumentLocator(Locator locator);

    @Deprecated
    void startDocument() throws SAXException;

    @Deprecated
    void endDocument() throws SAXException;

    @Deprecated
    void startElement(String str, AttributeList attributeList) throws SAXException;

    @Deprecated
    void endElement(String str) throws SAXException;

    @Deprecated
    void characters(char[] cArr, int i, int i2) throws SAXException;

    @Deprecated
    void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException;

    @Deprecated
    void processingInstruction(String str, String str2) throws SAXException;
}
