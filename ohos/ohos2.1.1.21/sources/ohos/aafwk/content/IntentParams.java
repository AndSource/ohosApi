package ohos.aafwk.content;

import java.util.Set;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/content/IntentParams.class */
public class IntentParams implements Sequenceable {
    public static final Sequenceable.Producer<IntentParams> PRODUCER = null;

    public IntentParams() {
        throw new RuntimeException("Stub!");
    }

    public IntentParams(IntentParams intentParams) {
        throw new RuntimeException("Stub!");
    }

    public ClassLoader getClassLoader() {
        throw new RuntimeException("Stub!");
    }

    public void setClassLoader(ClassLoader classLoader) {
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

    public <T> void setParam(String key, T value) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public int size() {
        throw new RuntimeException("Stub!");
    }

    public void remove(String key) {
        throw new RuntimeException("Stub!");
    }

    public Object getParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasParam(String key) {
        throw new RuntimeException("Stub!");
    }

    public Set<String> keySet() {
        throw new RuntimeException("Stub!");
    }
}
