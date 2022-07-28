package ohos.javax.xml.stream.events;

public interface Characters extends XMLEvent {
  String getData();
  
  boolean isWhiteSpace();
  
  boolean isCData();
  
  boolean isIgnorableWhiteSpace();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/events/Characters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */