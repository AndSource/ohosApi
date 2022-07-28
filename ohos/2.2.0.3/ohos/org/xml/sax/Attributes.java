package ohos.org.xml.sax;

public interface Attributes {
  int getLength();
  
  String getURI(int paramInt);
  
  String getLocalName(int paramInt);
  
  String getQName(int paramInt);
  
  String getType(int paramInt);
  
  String getValue(int paramInt);
  
  int getIndex(String paramString1, String paramString2);
  
  int getIndex(String paramString);
  
  String getType(String paramString1, String paramString2);
  
  String getType(String paramString);
  
  String getValue(String paramString1, String paramString2);
  
  String getValue(String paramString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/org/xml/sax/Attributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */