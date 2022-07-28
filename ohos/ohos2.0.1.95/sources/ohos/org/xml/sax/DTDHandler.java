package ohos.org.xml.sax;

/* loaded from: ohos2.0.1.95.jar:ohos/org/xml/sax/DTDHandler.class */
public interface DTDHandler {
    void notationDecl(String str, String str2, String str3) throws SAXException;

    void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException;
}
