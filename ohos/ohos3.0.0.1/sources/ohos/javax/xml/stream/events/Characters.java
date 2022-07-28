package ohos.javax.xml.stream.events;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/stream/events/Characters.class */
public interface Characters extends XMLEvent {
    String getData();

    boolean isWhiteSpace();

    boolean isCData();

    boolean isIgnorableWhiteSpace();
}
