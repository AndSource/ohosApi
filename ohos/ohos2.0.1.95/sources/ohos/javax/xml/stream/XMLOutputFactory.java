package ohos.javax.xml.stream;

import java.io.OutputStream;
import java.io.Writer;
import ohos.javax.xml.transform.Result;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/stream/XMLOutputFactory.class */
public abstract class XMLOutputFactory {
    public static final String IS_REPAIRING_NAMESPACES = "javax.xml.stream.isRepairingNamespaces";

    public abstract XMLStreamWriter createXMLStreamWriter(Writer writer) throws XMLStreamException;

    public abstract XMLStreamWriter createXMLStreamWriter(OutputStream outputStream) throws XMLStreamException;

    public abstract XMLStreamWriter createXMLStreamWriter(OutputStream outputStream, String str) throws XMLStreamException;

    public abstract XMLStreamWriter createXMLStreamWriter(Result result) throws XMLStreamException;

    public abstract XMLEventWriter createXMLEventWriter(Result result) throws XMLStreamException;

    public abstract XMLEventWriter createXMLEventWriter(OutputStream outputStream) throws XMLStreamException;

    public abstract XMLEventWriter createXMLEventWriter(OutputStream outputStream, String str) throws XMLStreamException;

    public abstract XMLEventWriter createXMLEventWriter(Writer writer) throws XMLStreamException;

    public abstract void setProperty(String str, Object obj) throws IllegalArgumentException;

    public abstract Object getProperty(String str) throws IllegalArgumentException;

    public abstract boolean isPropertySupported(String str);

    protected XMLOutputFactory() {
        throw new RuntimeException("Stub!");
    }

    public static XMLOutputFactory newInstance() throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    public static XMLOutputFactory newFactory() throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static XMLInputFactory newInstance(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }

    public static XMLOutputFactory newFactory(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }
}
