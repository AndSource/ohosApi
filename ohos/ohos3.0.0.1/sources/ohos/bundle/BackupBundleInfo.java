package ohos.bundle;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/BackupBundleInfo.class */
public class BackupBundleInfo implements Sequenceable {
    public static final Sequenceable.Producer<BackupBundleInfo> PRODUCER = null;

    public BackupBundleInfo() {
        throw new RuntimeException("Stub!");
    }

    public BackupBundleInfo(String bundleName, int versionCode) {
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

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public int getVersionCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
