package ohos.javax.xml.stream.events;

import ohos.javax.xml.namespace.QName;

public interface Attribute extends XMLEvent {
  QName getName();
  
  String getValue();
  
  String getDTDType();
  
  boolean isSpecified();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/events/Attribute.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */