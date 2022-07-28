package ohos.org.xml.sax;

@Deprecated
/* loaded from: ohos2.2.0.3.jar:ohos/org/xml/sax/HandlerBase.class */
public class HandlerBase implements EntityResolver, DTDHandler, DocumentHandler, ErrorHandler {
    @Deprecated
    public HandlerBase() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.EntityResolver
    @Deprecated
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DTDHandler
    @Deprecated
    public void notationDecl(String name, String publicId, String systemId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DTDHandler
    @Deprecated
    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void setDocumentLocator(Locator locator) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void startDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void endDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void startElement(String name, AttributeList attributes) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void endElement(String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void characters(char[] ch, int start, int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DocumentHandler
    @Deprecated
    public void processingInstruction(String target, String data) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    @Deprecated
    public void warning(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    @Deprecated
    public void error(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    @Deprecated
    public void fatalError(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
