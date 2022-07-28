package ohos.javax.xml.stream.util;

import ohos.javax.xml.stream.XMLStreamException;
import ohos.javax.xml.stream.XMLStreamReader;
import ohos.javax.xml.stream.events.XMLEvent;

public interface XMLEventAllocator {
  XMLEventAllocator newInstance();
  
  XMLEvent allocate(XMLStreamReader paramXMLStreamReader) throws XMLStreamException;
  
  void allocate(XMLStreamReader paramXMLStreamReader, XMLEventConsumer paramXMLEventConsumer) throws XMLStreamException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/util/XMLEventAllocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */