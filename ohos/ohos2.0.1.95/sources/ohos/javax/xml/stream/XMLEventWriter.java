package ohos.javax.xml.stream;

import ohos.javax.xml.namespace.NamespaceContext;
import ohos.javax.xml.stream.events.XMLEvent;
import ohos.javax.xml.stream.util.XMLEventConsumer;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/stream/XMLEventWriter.class */
public interface XMLEventWriter extends XMLEventConsumer {
    void flush() throws XMLStreamException;

    void close() throws XMLStreamException;

    @Override // ohos.javax.xml.stream.util.XMLEventConsumer
    void add(XMLEvent xMLEvent) throws XMLStreamException;

    void add(XMLEventReader xMLEventReader) throws XMLStreamException;

    String getPrefix(String str) throws XMLStreamException;

    void setPrefix(String str, String str2) throws XMLStreamException;

    void setDefaultNamespace(String str) throws XMLStreamException;

    void setNamespaceContext(NamespaceContext namespaceContext) throws XMLStreamException;

    NamespaceContext getNamespaceContext();
}
