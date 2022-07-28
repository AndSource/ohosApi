package ohos.org.xml.sax;

@Deprecated
public interface DocumentHandler {
  @Deprecated
  void setDocumentLocator(Locator paramLocator);
  
  @Deprecated
  void startDocument() throws SAXException;
  
  @Deprecated
  void endDocument() throws SAXException;
  
  @Deprecated
  void startElement(String paramString, AttributeList paramAttributeList) throws SAXException;
  
  @Deprecated
  void endElement(String paramString) throws SAXException;
  
  @Deprecated
  void characters(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws SAXException;
  
  @Deprecated
  void ignorableWhitespace(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws SAXException;
  
  @Deprecated
  void processingInstruction(String paramString1, String paramString2) throws SAXException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/org/xml/sax/DocumentHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */