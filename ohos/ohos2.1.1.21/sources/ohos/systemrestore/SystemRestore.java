package ohos.systemrestore;

import java.io.File;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/systemrestore/SystemRestore.class */
public class SystemRestore {
    public SystemRestore() {
        throw new RuntimeException("Stub!");
    }

    public static boolean rebootAndCleanCache(Context context) throws SystemRestoreException {
        throw new RuntimeException("Stub!");
    }

    public static boolean rebootAndCleanUserData(Context context) throws SystemRestoreException {
        throw new RuntimeException("Stub!");
    }

    public static void verifyUpgradePackage(File upgradeFile, ISystemRestoreProgressListener listener, File deviceCertsZipFile) throws SystemRestoreException {
        throw new RuntimeException("Stub!");
    }

    public static void rebootAndInstallUpgradePackage(Context context, File upgradeFile) throws SystemRestoreException {
        throw new RuntimeException("Stub!");
    }
}
