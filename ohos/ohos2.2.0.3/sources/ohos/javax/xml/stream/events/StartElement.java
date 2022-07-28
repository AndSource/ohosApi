package ohos.javax.xml.stream.events;

import java.util.Iterator;
import ohos.javax.xml.namespace.NamespaceContext;
import ohos.javax.xml.namespace.QName;

/* loaded from: ohos2.2.0.3.jar:ohos/javax/xml/stream/events/StartElement.class */
public interface StartElement extends XMLEvent {
    QName getName();

    Iterator getAttributes();

    Iterator getNamespaces();

    Attribute getAttributeByName(QName qName);

    NamespaceContext getNamespaceContext();

    String getNamespaceURI(String str);
}
