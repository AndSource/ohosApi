package ohos.javax.xml.stream;

import java.util.Iterator;
import ohos.javax.xml.stream.events.XMLEvent;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/stream/XMLEventReader.class */
public interface XMLEventReader extends Iterator {
    XMLEvent nextEvent() throws XMLStreamException;

    @Override // java.util.Iterator
    boolean hasNext();

    XMLEvent peek() throws XMLStreamException;

    String getElementText() throws XMLStreamException;

    XMLEvent nextTag() throws XMLStreamException;

    Object getProperty(String str) throws IllegalArgumentException;

    void close() throws XMLStreamException;
}
