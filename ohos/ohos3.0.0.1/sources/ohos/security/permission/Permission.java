package ohos.security.permission;

/* loaded from: ohos3.0.0.1.jar:ohos/security/permission/Permission.class */
public class Permission {

    @Deprecated
    /* loaded from: ohos3.0.0.1.jar:ohos/security/permission/Permission$OnRequestPermissionsResult.class */
    public interface OnRequestPermissionsResult {
        @Deprecated
        void onResult(String str, String[] strArr, int[] iArr);

        @Deprecated
        void onCancel(String str, String[] strArr);

        @Deprecated
        void onTimeOut(String str, String[] strArr);
    }

    Permission() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean canRequestPermissionFromRemote(String permission, String nodeId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static void requestPermissionsFromRemote(String[] permissions, OnRequestPermissionsResult callback, String nodeId, String bundleName, int reasonResId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static int verifyPermissionFromRemote(String permission, String nodeId, String appIdInfo) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static int verifySelfPermissionFromRemote(String permission, String nodeId) {
        throw new RuntimeException("Stub!");
    }
}
