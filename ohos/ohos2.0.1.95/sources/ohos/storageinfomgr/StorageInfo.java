package ohos.storageinfomgr;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/storageinfomgr/StorageInfo.class */
public final class StorageInfo implements Sequenceable {
    public static final Sequenceable.Producer<StorageInfo> PRODUCER = null;

    StorageInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public long getAppSize() {
        throw new RuntimeException("Stub!");
    }

    public long getDataSize() {
        throw new RuntimeException("Stub!");
    }

    public long getCacheSize() {
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
