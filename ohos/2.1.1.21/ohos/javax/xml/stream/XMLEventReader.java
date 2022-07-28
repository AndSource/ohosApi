package ohos.javax.xml.stream;

import java.util.Iterator;
import ohos.javax.xml.stream.events.XMLEvent;

public interface XMLEventReader extends Iterator {
  XMLEvent nextEvent() throws XMLStreamException;
  
  boolean hasNext();
  
  XMLEvent peek() throws XMLStreamException;
  
  String getElementText() throws XMLStreamException;
  
  XMLEvent nextTag() throws XMLStreamException;
  
  Object getProperty(String paramString) throws IllegalArgumentException;
  
  void close() throws XMLStreamException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/XMLEventReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */