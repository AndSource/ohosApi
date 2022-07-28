package ohos.interwork.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/interwork/utils/PacMapEx.class */
public class PacMapEx implements ParcelableEx, Sequenceable {
    protected final HashMap<String, Object> dataMap = null;

    public PacMapEx(int capacity) {
        throw new RuntimeException("Stub!");
    }

    public PacMapEx() {
        throw new RuntimeException("Stub!");
    }

    public PacMapEx(PacMapEx outMap, boolean isDeepCopy) {
        throw new RuntimeException("Stub!");
    }

    public void setCustomClassLoader(ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }

    public ClassLoader getCustomClassLoader() {
        throw new RuntimeException("Stub!");
    }

    public int size() {
        throw new RuntimeException("Stub!");
    }

    public void putAll(Map<String, Object> map) {
        throw new RuntimeException("Stub!");
    }

    public void putObjectValue(String key, Object value) {
        throw new RuntimeException("Stub!");
    }

    public Optional<Object> getObjectValue(String key) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.interwork.utils.ParcelableEx
    public void marshallingEx(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.interwork.utils.ParcelableEx
    public void unmarshallingEx(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean hasFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
}
