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
  
  BundleInfo getBundleInfo(String paramString, int paramInt) throws RemoteException;
  
  IBundleInstaller getBundleInstaller() throws RemoteException;
  
  ApplicationInfo getApplicationInfo(String paramString, int paramInt1, int paramInt2) throws RemoteException;
  
  int checkPermission(String paramString1, String paramString2);
  
  List<AbilityInfo> queryAbilityByIntent(Intent paramIntent, int paramInt1, int paramInt2) throws RemoteException;
  
  List<BundleInfo> getBundleInfos(int paramInt) throws RemoteException;
  
  int getUidByBundleName(String paramString, int paramInt) throws RemoteException;
  
  List<String> getBundlesForUid(int paramInt) throws RemoteException;
  
  void registerAllPermissionsChanged(IRemoteObject paramIRemoteObject) throws RemoteException;
  
  void registerPermissionsChanged(int[] paramArrayOfint, IRemoteObject paramIRemoteObject) throws RemoteException;
  
  void unregisterPermissionsChanged(IRemoteObject paramIRemoteObject) throws RemoteException;
  
  List<ApplicationInfo> getApplicationInfos(int paramInt1, int paramInt2) throws RemoteException;
  
  List<String> getSystemAvailableCapabilities();
  
  boolean hasSystemCapability(String paramString);
  
  int[] getBundleGids(String paramString);
  
  int checkPublicKeys(String paramString1, String paramString2) throws RemoteException;
  
  String getNameForUid(int paramInt) throws RemoteException;
  
  BundleInfo getBundleArchiveInfo(String paramString, int paramInt);
  
  boolean isSafeMode();
  
  Intent getLaunchIntentForBundle(String paramString) throws RemoteException;
  
  void setApplicationEnabled(String paramString, boolean paramBoolean) throws IllegalArgumentException;
  
  void setAbilityEnabled(AbilityInfo paramAbilityInfo, boolean paramBoolean) throws IllegalArgumentException;
  
  boolean isApplicationEnabled(String paramString) throws IllegalArgumentException;
  
  boolean isAbilityEnabled(AbilityInfo paramAbilityInfo) throws IllegalArgumentException;
  
  int startBackupSession(IBackupSessionCallback paramIBackupSessionCallback);
  
  int executeBackupTask(int paramInt, String paramString);
  
  int finishBackupSession(int paramInt);
  
  List<ShortcutInfo> getShortcutInfos(String paramString) throws RemoteException;
  
  PermissionDef getPermissionDef(String paramString);
  
  Optional<PermissionGroupDef> getPermissionGroupDef(String paramString);
  
  Optional<List<PermissionDef>> getPermissionDefByGroup(String paramString);
  
  void cleanBundleCacheFiles(String paramString, ICleanCacheCallback paramICleanCacheCallback);
  
  void startShortcut(String paramString1, String paramString2) throws RemoteException;
  
  String getAppType(String paramString) throws RemoteException;
  
  int isShortcutExist(String paramString, int paramInt);
  
  boolean isShortcutExist(String paramString);
  
  boolean isHomeShortcutSupported();
  
  boolean addHomeShortcut(ShortcutInfo paramShortcutInfo) throws IllegalArgumentException, IllegalStateException;
  
  boolean updateShortcuts(List<ShortcutInfo> paramList);
  
  void disableHomeShortcuts(List<String> paramList) throws IllegalArgumentException;
  
  void enableHomeShortcuts(List<String> paramList) throws IllegalArgumentException;
  
  List<ShortcutInfo> getHomeShortcutInfos();
  
  Optional<List<PermissionGroupDef>> getAllPermissionGroupDefs();
  
  List<String> getAppsGrantedPermissions(String[] paramArrayOfString) throws RemoteException;
  
  PixelMap getAbilityIcon(String paramString1, String paramString2) throws RemoteException;
  
  String getAbilityLabel(String paramString1, String paramString2) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/bundle/IBundleManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */