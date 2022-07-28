package ohos.javax.xml.stream.events;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/stream/events/Characters.class */
public interface Characters extends XMLEvent {
    String getData();

    boolean isWhiteSpace();

    boolean isCData();

    boolean isIgnorableWhiteSpace();
}
