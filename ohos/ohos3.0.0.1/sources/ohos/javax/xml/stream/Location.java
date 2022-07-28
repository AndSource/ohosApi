package ohos.javax.xml.stream;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/stream/Location.class */
public interface Location {
    int getLineNumber();

    int getColumnNumber();

    int getCharacterOffset();

    String getPublicId();

    String getSystemId();
}
