package ohos.javax.xml.stream.events;

import java.util.Iterator;
import ohos.javax.xml.namespace.NamespaceContext;
import ohos.javax.xml.namespace.QName;

public interface StartElement extends XMLEvent {
  QName getName();
  
  Iterator getAttributes();
  
  Iterator getNamespaces();
  
  Attribute getAttributeByName(QName paramQName);
  
  NamespaceContext getNamespaceContext();
  
  String getNamespaceURI(String paramString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/javax/xml/stream/events/StartElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */