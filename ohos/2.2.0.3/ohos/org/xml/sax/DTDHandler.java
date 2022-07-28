package ohos.org.xml.sax;

public interface DTDHandler {
  void notationDecl(String paramString1, String paramString2, String paramString3) throws SAXException;
  
  void unparsedEntityDecl(String paramString1, String paramString2, String paramString3, String paramString4) throws SAXException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/org/xml/sax/DTDHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */