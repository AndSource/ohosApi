package ohos.org.xml.sax;

public interface ErrorHandler {
  void warning(SAXParseException paramSAXParseException) throws SAXException;
  
  void error(SAXParseException paramSAXParseException) throws SAXException;
  
  void fatalError(SAXParseException paramSAXParseException) throws SAXException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/org/xml/sax/ErrorHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */