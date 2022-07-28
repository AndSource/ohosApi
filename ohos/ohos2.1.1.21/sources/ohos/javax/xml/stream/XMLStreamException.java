package ohos.javax.xml.stream;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/stream/XMLStreamException.class */
public class XMLStreamException extends Exception {
    protected Location location;
    protected Throwable nested;

    public XMLStreamException() {
        throw new RuntimeException("Stub!");
    }

    public XMLStreamException(String msg) {
        throw new RuntimeException("Stub!");
    }

    public XMLStreamException(Throwable th) {
        throw new RuntimeException("Stub!");
    }

    public XMLStreamException(String msg, Throwable th) {
        throw new RuntimeException("Stub!");
    }

    public XMLStreamException(String msg, Location location, Throwable th) {
        throw new RuntimeException("Stub!");
    }

    public XMLStreamException(String msg, Location location) {
        throw new RuntimeException("Stub!");
    }

    public Throwable getNestedException() {
        throw new RuntimeException("Stub!");
    }

    public Location getLocation() {
        throw new RuntimeException("Stub!");
    }
}
