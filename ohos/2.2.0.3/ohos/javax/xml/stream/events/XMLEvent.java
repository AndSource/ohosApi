package ohos.javax.xml.stream.events;

import java.io.Writer;
import ohos.javax.xml.namespace.QName;
import ohos.javax.xml.stream.Location;
import ohos.javax.xml.stream.XMLStreamConstants;
import ohos.javax.xml.stream.XMLStreamException;

public interface XMLEvent extends XMLStreamConstants {
  int getEventType();
  
  Location getLocation();
  
  boolean isStartElement();
  
  boolean isAttribute();
  
  boolean isNamespace();
  
  boolean isEndElement();
  
  boolean isEntityReference();
  
  boolean isProcessingInstruction();
  
  boolean isCharacters();
  
  boolean isStartDocument();
  
  boolean isEndDocument();
  
  StartElement asStartElement();
  
  EndElement asEndElement();
  
  Characters asCharacters();
  
  QName getSchemaType();
  
  void writeAsEncodedUnicode(Writer paramWriter) throws XMLStreamException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/javax/xml/stream/events/XMLEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */