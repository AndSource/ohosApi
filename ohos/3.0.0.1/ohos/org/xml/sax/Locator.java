package ohos.org.xml.sax;

public interface Locator {
  String getPublicId();
  
  String getSystemId();
  
  int getLineNumber();
  
  int getColumnNumber();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/org/xml/sax/Locator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */