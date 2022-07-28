package ohos.utils;

/* loaded from: ohos3.0.0.1.jar:ohos/utils/ObjectAttribute.class */
public abstract class ObjectAttribute<O, T> {
    public abstract T get(O o);

    public ObjectAttribute(Class<T> attrType, String attrName) {
        throw new RuntimeException("Stub!");
    }

    public void set(O obj, T value) {
        throw new RuntimeException("Stub!");
    }

    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public Class<T> getAttrType() {
        throw new RuntimeException("Stub!");
    }
}
