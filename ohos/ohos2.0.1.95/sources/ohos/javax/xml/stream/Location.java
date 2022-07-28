package ohos.javax.xml.stream;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/stream/Location.class */
public interface Location {
    int getLineNumber();

    int getColumnNumber();

    int getCharacterOffset();

    String getPublicId();

    String getSystemId();
}
