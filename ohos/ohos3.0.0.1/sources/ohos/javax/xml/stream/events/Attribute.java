package ohos.javax.xml.stream.events;

import ohos.javax.xml.namespace.QName;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/stream/events/Attribute.class */
public interface Attribute extends XMLEvent {
    QName getName();

    String getValue();

    String getDTDType();

    boolean isSpecified();
}
