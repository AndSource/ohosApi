package ohos.storageinfomgr;

import java.io.IOException;
import java.util.UUID;
import ohos.app.Context;
import ohos.global.resource.NotExistException;

/* loaded from: ohos2.1.1.21.jar:ohos/storageinfomgr/StorageInfoManager.class */
public final class StorageInfoManager {
    StorageInfoManager(Object adapter) {
        throw new RuntimeException("Stub!");
    }

    public static StorageInfoManager newInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public long getFreeSize(UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public long getWholeSize(UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public StorageInfo queryInfoByPackageName(UUID storageUuid, String packageName, int uid) throws IOException, NotExistException {
        throw new RuntimeException("Stub!");
    }

    public StorageInfo queryInfoByUid(UUID storageUuid, int uid) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
