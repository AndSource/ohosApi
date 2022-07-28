package ohos.javax.xml.stream.events;

import java.util.Iterator;
import ohos.javax.xml.namespace.QName;

public interface EndElement extends XMLEvent {
  QName getName();
  
  Iterator getNamespaces();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/events/EndElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */