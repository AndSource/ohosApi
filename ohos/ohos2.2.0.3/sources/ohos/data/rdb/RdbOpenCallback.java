package ohos.data.rdb;

import java.io.File;

/* loaded from: ohos2.2.0.3.jar:ohos/data/rdb/RdbOpenCallback.class */
public abstract class RdbOpenCallback {
    public abstract void onCreate(RdbStore rdbStore);

    public abstract void onUpgrade(RdbStore rdbStore, int i, int i2);

    public RdbOpenCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onDowngrade(RdbStore store, int currentVersion, int targetVersion) {
        throw new RuntimeException("Stub!");
    }

    public void onOpen(RdbStore store) {
        throw new RuntimeException("Stub!");
    }

    public void onCorruption(File databaseFile) {
        throw new RuntimeException("Stub!");
    }
}
