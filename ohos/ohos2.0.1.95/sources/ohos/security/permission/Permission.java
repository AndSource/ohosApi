package ohos.security.permission;

/* loaded from: ohos2.0.1.95.jar:ohos/security/permission/Permission.class */
public class Permission {

    /* loaded from: ohos2.0.1.95.jar:ohos/security/permission/Permission$OnRequestPermissionsResult.class */
    public interface OnRequestPermissionsResult {
        void onResult(String str, String[] strArr, int[] iArr);

        void onCancel(String str, String[] strArr);

        void onTimeOut(String str, String[] strArr);
    }

    Permission() {
        throw new RuntimeException("Stub!");
    }

    public static boolean canRequestPermissionFromRemote(String permission, String nodeId) {
        throw new RuntimeException("Stub!");
    }

    public static void requestPermissionsFromRemote(String[] permissions, OnRequestPermissionsResult callback, String nodeId, String bundleName, int reasonResId) {
        throw new RuntimeException("Stub!");
    }

    public static int verifyPermissionFromRemote(String permission, String nodeId, String appIdInfo) {
        throw new RuntimeException("Stub!");
    }

    public static int verifySelfPermissionFromRemote(String permission, String nodeId) {
        throw new RuntimeException("Stub!");
    }
}
