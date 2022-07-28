package ohos.org.xml.sax.helpers;

import java.io.IOException;
import ohos.org.xml.sax.Attributes;
import ohos.org.xml.sax.ContentHandler;
import ohos.org.xml.sax.DTDHandler;
import ohos.org.xml.sax.EntityResolver;
import ohos.org.xml.sax.ErrorHandler;
import ohos.org.xml.sax.InputSource;
import ohos.org.xml.sax.Locator;
import ohos.org.xml.sax.SAXException;
import ohos.org.xml.sax.SAXParseException;

/* loaded from: ohos3.0.0.1.jar:ohos/org/xml/sax/helpers/DefaultHandler.class */
public class DefaultHandler implements EntityResolver, DTDHandler, ContentHandler, ErrorHandler {
    public DefaultHandler() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.EntityResolver
    public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DTDHandler
    public void notationDecl(String name, String publicId, String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void endPrefixMapping(String prefix) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void endElement(String uri, String localName, String qName) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void characters(char[] ch, int start, int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void processingInstruction(String target, String data) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ContentHandler
    public void skippedEntity(String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    public void warning(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    public void error(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
