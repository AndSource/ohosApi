package ohos.javax.xml.namespace;

import java.util.Iterator;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/namespace/NamespaceContext.class */
public interface NamespaceContext {
    String getNamespaceURI(String str);

    String getPrefix(String str);

    Iterator getPrefixes(String str);
}
