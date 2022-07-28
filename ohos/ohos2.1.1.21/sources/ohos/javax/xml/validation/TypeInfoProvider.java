package ohos.javax.xml.validation;

import ohos.org.w3c.dom.TypeInfo;

/* loaded from: ohos2.1.1.21.jar:ohos/javax/xml/validation/TypeInfoProvider.class */
public abstract class TypeInfoProvider {
    public abstract TypeInfo getElementTypeInfo();

    public abstract TypeInfo getAttributeTypeInfo(int i);

    public abstract boolean isIdAttribute(int i);

    public abstract boolean isSpecified(int i);

    protected TypeInfoProvider() {
        throw new RuntimeException("Stub!");
    }
}
