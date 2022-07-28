package ohos.bundle;

import java.util.Map;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/ShortcutIntent.class */
public class ShortcutIntent implements Sequenceable {
    public static final Sequenceable.Producer<ShortcutIntent> PRODUCER = null;

    public ShortcutIntent() {
        throw new RuntimeException("Stub!");
    }

    public ShortcutIntent(ShortcutIntent source) {
        throw new RuntimeException("Stub!");
    }

    public ShortcutIntent(String targetBundle, String targetClass) {
        throw new RuntimeException("Stub!");
    }

    public void setTargetBundle(String targetBundle) {
        throw new RuntimeException("Stub!");
    }

    public String getTargetBundle() {
        throw new RuntimeException("Stub!");
    }

    public void setTargetClass(String targetClass) {
        throw new RuntimeException("Stub!");
    }

    public String getTargetClass() {
        throw new RuntimeException("Stub!");
    }

    public Map<String, String> getParams() {
        throw new RuntimeException("Stub!");
    }

    public void addParam(String key, String value) {
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
}
