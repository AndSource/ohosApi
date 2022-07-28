package ohos.javax.xml.namespace;

import java.util.Iterator;

/* loaded from: ohos3.0.0.1.jar:ohos/javax/xml/namespace/NamespaceContext.class */
public interface NamespaceContext {
    String getNamespaceURI(String str);

    String getPrefix(String str);

    Iterator getPrefixes(String str);
}
