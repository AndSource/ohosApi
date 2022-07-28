package ohos.app;

import java.io.File;
import ohos.aafwk.ability.IAbilityConnection;
import ohos.aafwk.ability.startsetting.AbilityStartSetting;
import ohos.aafwk.content.Intent;
import ohos.app.dispatcher.TaskDispatcher;
import ohos.app.dispatcher.task.TaskPriority;
import ohos.bundle.AbilityInfo;
import ohos.bundle.ApplicationInfo;
import ohos.bundle.ElementName;
import ohos.bundle.HapModuleInfo;
import ohos.bundle.IBundleManager;
import ohos.global.configuration.Configuration;
import ohos.global.resource.ResourceManager;
import ohos.global.resource.solidxml.Pattern;
import ohos.global.resource.solidxml.Theme;
import ohos.utils.net.Uri;

public interface Context {
  public static final int CONTEXT_IGNORE_SECURITY = 2;
  
  public static final int CONTEXT_INCLUDE_CODE = 1;
  
  public static final int CONTEXT_RESOUCE_ONLY = 8;
  
  public static final int CONTEXT_RESTRICTED = 4;
  
  public static final int MODE_APPEND = 32768;
  
  public static final int MODE_PRIVATE = 0;
  
  TaskDispatcher createParallelTaskDispatcher(String paramString, TaskPriority paramTaskPriority);
  
  TaskDispatcher createSerialTaskDispatcher(String paramString, TaskPriority paramTaskPriority);
  
  TaskDispatcher getGlobalTaskDispatcher(TaskPriority paramTaskPriority);
  
  TaskDispatcher getMainTaskDispatcher();
  
  TaskDispatcher getUITaskDispatcher();
  
  ApplicationInfo getApplicationInfo();
  
  ProcessInfo getProcessInfo();
  
  AbilityInfo getAbilityInfo();
  
  ResourceManager getResourceManager();
  
  File getPreferencesDir();
  
  File getDatabaseDir();
  
  File getDistributedDir();
  
  void switchToDeviceEncryptedStorageContext();
  
  void switchToCredentialEncryptedStorageContext();
  
  boolean isDeviceEncryptedStorage();
  
  boolean isCredentialEncryptedStorage();
  
  int verifyCallingPermission(String paramString);
  
  int verifySelfPermission(String paramString);
  
  int verifyCallingOrSelfPermission(String paramString);
  
  int verifyPermission(String paramString, int paramInt1, int paramInt2);
  
  ClassLoader getClassloader();
  
  Context getApplicationContext();
  
  void terminateAbility();
  
  void terminateAbility(int paramInt);
  
  void displayUnlockMissionMessage();
  
  void lockMission();
  
  void unlockMission();
  
  String getLocalClassName();
  
  ElementName getElementName();
  
  ElementName getCallingAbility();
  
  String getCallingBundle();
  
  boolean stopAbility(Intent paramIntent);
  
  void startAbility(Intent paramIntent, int paramInt);
  
  void startAbility(Intent paramIntent, int paramInt, AbilityStartSetting paramAbilityStartSetting);
  
  void startAbilities(Intent[] paramArrayOfIntent);
  
  Context createBundleContext(String paramString, int paramInt);
  
  boolean canRequestPermission(String paramString);
  
  void requestPermissionsFromUser(String[] paramArrayOfString, int paramInt);
  
  boolean connectAbility(Intent paramIntent, IAbilityConnection paramIAbilityConnection);
  
  void disconnectAbility(IAbilityConnection paramIAbilityConnection);
  
  void setDisplayOrientation(AbilityInfo.DisplayOrientation paramDisplayOrientation);
  
  IBundleManager getBundleManager();
  
  String getBundleName();
  
  String getBundleCodePath();
  
  String getBundleResourcePath();
  
  File getDataDir();
  
  File getCacheDir();
  
  File getCodeCacheDir();
  
  File[] getExternalMediaDirs();
  
  File getNoBackupFilesDir();
  
  File getFilesDir();
  
  File getDir(String paramString, int paramInt);
  
  File getExternalCacheDir();
  
  File[] getExternalCacheDirs();
  
  File getExternalFilesDir(String paramString);
  
  File[] getExternalFilesDirs(String paramString);
  
  boolean deleteFile(String paramString);
  
  IAbilityManager getAbilityManager();
  
  boolean terminateAbilityResult(int paramInt);
  
  int getDisplayOrientation();
  
  void setShowOnLockScreen(boolean paramBoolean);
  
  void setWakeUpScreen(boolean paramBoolean);
  
  void restart();
  
  void setTransitionAnimation(int paramInt1, int paramInt2);
  
  boolean isUpdatingConfigurations();
  
  void setTheme(int paramInt);
  
  Theme getTheme();
  
  void setPattern(int paramInt);
  
  Pattern getPattern();
  
  String getAppType();
  
  ResourceManager getResourceManager(Configuration paramConfiguration);
  
  Object getLastStoredDataWhenConfigChanged();
  
  void printDrawnCompleted();
  
  void compelVerifyPermission(String paramString1, String paramString2);
  
  void compelVerifyUriPermission(Uri paramUri, int paramInt, String paramString);
  
  void compelVerifyCallerPermission(String paramString1, String paramString2);
  
  void compelVerifyCallerUriPermission(Uri paramUri, int paramInt, String paramString);
  
  void compelVerifyPermission(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  void compelVerifyUriPermission(Uri paramUri, int paramInt1, int paramInt2, int paramInt3, String paramString);
  
  void compelVerifyUriPermission(Uri paramUri, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3);
  
  String getProcessName();
  
  Context getAbilityPackageContext();
  
  HapModuleInfo getHapModuleInfo();
  
  Uri getCaller();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/app/Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */