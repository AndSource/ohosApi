package ohos.javax.xml.stream.events;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/stream/events/StartDocument.class */
public interface StartDocument extends XMLEvent {
    String getSystemId();

    String getCharacterEncodingScheme();

    boolean encodingSet();

    boolean isStandalone();

    boolean standaloneSet();

    String getVersion();
}
