package ohos.org.xml.sax;

import java.io.IOException;
import java.util.Locale;

@Deprecated
public interface Parser {
  @Deprecated
  void setLocale(Locale paramLocale) throws SAXException;
  
  @Deprecated
  void setEntityResolver(EntityResolver paramEntityResolver);
  
  @Deprecated
  void setDTDHandler(DTDHandler paramDTDHandler);
  
  @Deprecated
  void setDocumentHandler(DocumentHandler paramDocumentHandler);
  
  @Deprecated
  void setErrorHandler(ErrorHandler paramErrorHandler);
  
  @Deprecated
  void parse(InputSource paramInputSource) throws IOException, SAXException;
  
  @Deprecated
  void parse(String paramString) throws IOException, SAXException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/org/xml/sax/Parser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */