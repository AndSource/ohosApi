package ohos.javax.xml.stream;

import ohos.javax.xml.namespace.NamespaceContext;
import ohos.javax.xml.stream.events.XMLEvent;
import ohos.javax.xml.stream.util.XMLEventConsumer;

public interface XMLEventWriter extends XMLEventConsumer {
  void flush() throws XMLStreamException;
  
  void close() throws XMLStreamException;
  
  void add(XMLEvent paramXMLEvent) throws XMLStreamException;
  
  void add(XMLEventReader paramXMLEventReader) throws XMLStreamException;
  
  String getPrefix(String paramString) throws XMLStreamException;
  
  void setPrefix(String paramString1, String paramString2) throws XMLStreamException;
  
  void setDefaultNamespace(String paramString) throws XMLStreamException;
  
  void setNamespaceContext(NamespaceContext paramNamespaceContext) throws XMLStreamException;
  
  NamespaceContext getNamespaceContext();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/javax/xml/stream/XMLEventWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */