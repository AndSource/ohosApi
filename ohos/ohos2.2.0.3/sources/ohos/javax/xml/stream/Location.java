package ohos.javax.xml.stream;

/* loaded from: ohos2.2.0.3.jar:ohos/javax/xml/stream/Location.class */
public interface Location {
    int getLineNumber();

    int getColumnNumber();

    int getCharacterOffset();

    String getPublicId();

    String getSystemId();
}
