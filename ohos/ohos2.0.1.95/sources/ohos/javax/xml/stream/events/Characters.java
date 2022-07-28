package ohos.javax.xml.stream.events;

/* loaded from: ohos2.0.1.95.jar:ohos/javax/xml/stream/events/Characters.class */
public interface Characters extends XMLEvent {
    String getData();

    boolean isWhiteSpace();

    boolean isCData();

    boolean isIgnorableWhiteSpace();
}
