package ohos.javax.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import ohos.javax.xml.stream.util.XMLEventAllocator;
import ohos.javax.xml.transform.Source;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/stream/XMLInputFactory.class */
public abstract class XMLInputFactory {
    public static final String ALLOCATOR = "javax.xml.stream.allocator";
    public static final String IS_COALESCING = "javax.xml.stream.isCoalescing";
    public static final String IS_NAMESPACE_AWARE = "javax.xml.stream.isNamespaceAware";
    public static final String IS_REPLACING_ENTITY_REFERENCES = "javax.xml.stream.isReplacingEntityReferences";
    public static final String IS_SUPPORTING_EXTERNAL_ENTITIES = "javax.xml.stream.isSupportingExternalEntities";
    public static final String IS_VALIDATING = "javax.xml.stream.isValidating";
    public static final String REPORTER = "javax.xml.stream.reporter";
    public static final String RESOLVER = "javax.xml.stream.resolver";
    public static final String SUPPORT_DTD = "javax.xml.stream.supportDTD";

    public abstract XMLStreamReader createXMLStreamReader(Reader reader) throws XMLStreamException;

    public abstract XMLStreamReader createXMLStreamReader(Source source) throws XMLStreamException;

    public abstract XMLStreamReader createXMLStreamReader(InputStream inputStream) throws XMLStreamException;

    public abstract XMLStreamReader createXMLStreamReader(InputStream inputStream, String str) throws XMLStreamException;

    public abstract XMLStreamReader createXMLStreamReader(String str, InputStream inputStream) throws XMLStreamException;

    public abstract XMLStreamReader createXMLStreamReader(String str, Reader reader) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(Reader reader) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(String str, Reader reader) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(XMLStreamReader xMLStreamReader) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(Source source) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(InputStream inputStream) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(InputStream inputStream, String str) throws XMLStreamException;

    public abstract XMLEventReader createXMLEventReader(String str, InputStream inputStream) throws XMLStreamException;

    public abstract XMLStreamReader createFilteredReader(XMLStreamReader xMLStreamReader, StreamFilter streamFilter) throws XMLStreamException;

    public abstract XMLEventReader createFilteredReader(XMLEventReader xMLEventReader, EventFilter eventFilter) throws XMLStreamException;

    public abstract XMLResolver getXMLResolver();

    public abstract void setXMLResolver(XMLResolver xMLResolver);

    public abstract XMLReporter getXMLReporter();

    public abstract void setXMLReporter(XMLReporter xMLReporter);

    public abstract void setProperty(String str, Object obj) throws IllegalArgumentException;

    public abstract Object getProperty(String str) throws IllegalArgumentException;

    public abstract boolean isPropertySupported(String str);

    public abstract void setEventAllocator(XMLEventAllocator xMLEventAllocator);

    public abstract XMLEventAllocator getEventAllocator();

    protected XMLInputFactory() {
        throw new RuntimeException("Stub!");
    }

    public static XMLInputFactory newInstance() throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    public static XMLInputFactory newFactory() throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static XMLInputFactory newInstance(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    public static XMLInputFactory newFactory(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }
}
