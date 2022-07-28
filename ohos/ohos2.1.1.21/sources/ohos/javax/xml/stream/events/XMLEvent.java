package ohos.javax.xml.stream.events;

import java.io.Writer;
import ohos.javax.xml.namespace.QName;
import ohos.javax.xml.stream.Location;
import ohos.javax.xml.stream.XMLStreamConstants;
import ohos.javax.xml.stream.XMLStreamException;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/stream/events/XMLEvent.class */
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

    void writeAsEncodedUnicode(Writer writer) throws XMLStreamException;
}
