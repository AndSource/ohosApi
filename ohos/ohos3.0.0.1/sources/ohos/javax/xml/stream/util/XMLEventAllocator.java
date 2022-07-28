package ohos.javax.xml.stream.util;

import ohos.javax.xml.stream.XMLStreamException;
import ohos.javax.xml.stream.XMLStreamReader;
import ohos.javax.xml.stream.events.XMLEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/stream/util/XMLEventAllocator.class */
public interface XMLEventAllocator {
    XMLEventAllocator newInstance();

    XMLEvent allocate(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    void allocate(XMLStreamReader xMLStreamReader, XMLEventConsumer xMLEventConsumer) throws XMLStreamException;
}
