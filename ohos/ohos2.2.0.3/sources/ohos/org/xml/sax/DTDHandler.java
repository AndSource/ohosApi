package ohos.org.xml.sax;

/* loaded from: ohos2.2.0.3.jar:ohos/org/xml/sax/DTDHandler.class */
public interface DTDHandler {
    void notationDecl(String str, String str2, String str3) throws SAXException;

    void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException;
}
