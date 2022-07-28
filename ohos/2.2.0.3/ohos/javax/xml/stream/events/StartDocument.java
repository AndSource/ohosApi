package ohos.javax.xml.stream.events;

public interface StartDocument extends XMLEvent {
  String getSystemId();
  
  String getCharacterEncodingScheme();
  
  boolean encodingSet();
  
  boolean isStandalone();
  
  boolean standaloneSet();
  
  String getVersion();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/javax/xml/stream/events/StartDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */