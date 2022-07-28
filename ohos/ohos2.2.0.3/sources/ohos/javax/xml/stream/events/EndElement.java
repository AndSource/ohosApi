package ohos.javax.xml.stream.events;

import java.util.Iterator;
import ohos.javax.xml.namespace.QName;

/* loaded from: ohos2.2.0.3.jar:ohos/javax/xml/stream/events/EndElement.class */
public interface EndElement extends XMLEvent {
    QName getName();

    Iterator getNamespaces();
}
