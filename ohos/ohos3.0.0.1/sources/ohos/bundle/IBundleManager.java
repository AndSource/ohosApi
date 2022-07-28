package ohos.bundle;

import java.util.List;
import java.util.Optional;
import ohos.aafwk.content.Intent;
import ohos.media.image.PixelMap;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;
import ohos.security.permission.PermissionDef;
import ohos.security.permission.PermissionGroupDef;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/IBundleManager.class */
public interface IBundleManager extends IRemoteBroker {
    public static final int ERROR_CODE_DOWNLOAD_FAILED = 2;
    public static final int ERROR_CODE_INSTALL_FAILED = 3;
    public static final int ERROR_CODE_QUERY_FAILED = 1;
    public static final int GET_ABILITY_INFO_WITH_APPLICATION = 4;
    public static final int GET_ABILITY_INFO_WITH_PERMISSION = 2;
    public static final int GET_APPLICATION_INFO_WITH_PERMISSION = 8;
    public static final int GET_BUNDLE_DEFAULT = 0;
    public static final int GET_BUNDLE_WITH_ABILITIES = 1;
    public static final int GET_BUNDLE_WITH_REQUESTED_PERMISSION = 16;
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_GRANTED = 0;
    public static final int QUERY_SHORTCUT_HOME = 0;
    public static final int SHORTCUT_EXISTENCE_EXISTS = 0;
    public static final int SHORTCUT_EXISTENCE_NOT_EXISTS = 1;
    public static final int SHORTCUT_EXISTENCE_UNKNOW = 2;
    public static final int SIGNATURE_MATCHED = 0;
    public static final int SIGNATURE_NOT_MATCHED = 1;
    public static final int SIGNATURE_UNKNOWN_BUNDLE = 2;

    BundleInfo getBundleInfo(String str, int i) throws RemoteException;

    BundleInfo getBundleInfo(String str, String str2, int i) throws RemoteException;

    IBundleInstaller getBundleInstaller() throws RemoteException;

    ApplicationInfo getApplicationInfo(String str, int i, int i2) throws RemoteException;

    int checkPermission(String str, String str2);

    List<AbilityInfo> queryAbilityByIntent(Intent intent, int i, int i2) throws RemoteException;

    List<BundleInfo> getBundleInfos(int i) throws RemoteException;

    int getUidByBundleName(String str, int i) throws RemoteException;

    List<String> getBundlesForUid(int i) throws RemoteException;

    void registerAllPermissionsChanged(IRemoteObject iRemoteObject) throws RemoteException;

    void registerPermissionsChanged(int[] iArr, IRemoteObject iRemoteObject) throws RemoteException;

    void unregisterPermissionsChanged(IRemoteObject iRemoteObject) throws RemoteException;

    List<ApplicationInfo> getApplicationInfos(int i, int i2) throws RemoteException;

    List<String> getSystemAvailableCapabilities();

    boolean hasSystemCapability(String str);

    int[] getBundleGids(String str);

    int checkPublicKeys(String str, String str2) throws RemoteException;

    String getNameForUid(int i) throws RemoteException;

    BundleInfo getBundleArchiveInfo(String str, int i);

    boolean isSafeMode();

    Intent getLaunchIntentForBundle(String str) throws RemoteException;

    void setApplicationEnabled(String str, boolean z) throws IllegalArgumentException;

    void setAbilityEnabled(AbilityInfo abilityInfo, boolean z) throws IllegalArgumentException;

    boolean isApplicationEnabled(String str) throws IllegalArgumentException;

    boolean isAbilityEnabled(AbilityInfo abilityInfo) throws IllegalArgumentException;

    int startBackupSession(IBackupSessionCallback iBackupSessionCallback);

    int executeBackupTask(int i, String str);

    int finishBackupSession(int i);

    List<ShortcutInfo> getShortcutInfos(String str) throws RemoteException;

    PermissionDef getPermissionDef(String str);

    Optional<PermissionGroupDef> getPermissionGroupDef(String str);

    Optional<List<PermissionDef>> getPermissionDefByGroup(String str);

    void cleanBundleCacheFiles(String str, ICleanCacheCallback iCleanCacheCallback);

    void startShortcut(String str, String str2) throws RemoteException;

    String getAppType(String str) throws RemoteException;

    int isShortcutExist(String str, int i);

    boolean isShortcutExist(String str);

    boolean isHomeShortcutSupported();

    boolean addHomeShortcut(ShortcutInfo shortcutInfo) throws IllegalArgumentException, IllegalStateException;

    boolean updateShortcuts(List<ShortcutInfo> list);

    void disableHomeShortcuts(List<String> list) throws IllegalArgumentException;

    void enableHomeShortcuts(List<String> list) throws IllegalArgumentException;

    List<ShortcutInfo> getHomeShortcutInfos();

    Optional<List<PermissionGroupDef>> getAllPermissionGroupDefs();

    List<String> getAppsGrantedPermissions(String[] strArr) throws RemoteException;

    PixelMap getAbilityIcon(String str, String str2) throws RemoteException;

    String getAbilityLabel(String str, String str2) throws RemoteException;

    List<FormInfo> getAllFormsInfo() throws RemoteException;

    List<FormInfo> getFormsInfoByApp(String str) throws RemoteException;

    List<FormInfo> getFormsInfoByModule(String str, String str2) throws RemoteException;

    AbilityInfo getModuleMainAbility(String str, String str2) throws RemoteException;

    boolean getClearUserDataFlag(String str, String str2);

    boolean setClearUserDataFlag(String str, boolean z);

    boolean setFormEnabled(FormBaseInfo formBaseInfo, boolean z) throws IllegalArgumentException, RemoteException, SecurityException;

    @Deprecated
    default List<FormInfo> getAllForms() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    default List<FormInfo> getFormsByApp(String bundleName) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    default List<FormInfo> getFormsByModule(String bundleName, String moduleName) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
