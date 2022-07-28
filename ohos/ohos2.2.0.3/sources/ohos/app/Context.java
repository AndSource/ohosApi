package ohos.app;

import java.io.File;
import ohos.aafwk.ability.IAbilityConnection;
import ohos.aafwk.ability.IAbilityStartCallback;
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

/* loaded from: ohos2.2.0.3.jar:ohos/app/Context.class */
public interface Context {
    public static final int CONTEXT_IGNORE_SECURITY = 2;
    public static final int CONTEXT_INCLUDE_CODE = 1;
    public static final int CONTEXT_RESOUCE_ONLY = 8;
    public static final int CONTEXT_RESTRICTED = 4;
    public static final int MODE_APPEND = 32768;
    public static final int MODE_PRIVATE = 0;

    TaskDispatcher createParallelTaskDispatcher(String str, TaskPriority taskPriority);

    TaskDispatcher createSerialTaskDispatcher(String str, TaskPriority taskPriority);

    TaskDispatcher getGlobalTaskDispatcher(TaskPriority taskPriority);

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

    int verifyCallingPermission(String str);

    int verifySelfPermission(String str);

    int verifyCallingOrSelfPermission(String str);

    int verifyPermission(String str, int i, int i2);

    ClassLoader getClassloader();

    Context getApplicationContext();

    void terminateAbility();

    void terminateAbility(int i);

    void displayUnlockMissionMessage();

    void lockMission();

    void unlockMission();

    String getLocalClassName();

    ElementName getElementName();

    ElementName getCallingAbility();

    String getCallingBundle();

    boolean stopAbility(Intent intent);

    void startAbility(Intent intent, int i);

    void startAbility(Intent intent, AbilityStartSetting abilityStartSetting, IAbilityStartCallback iAbilityStartCallback);

    void startAbility(Intent intent, int i, AbilityStartSetting abilityStartSetting);

    void startAbilities(Intent[] intentArr);

    Context createBundleContext(String str, int i);

    boolean canRequestPermission(String str);

    void requestPermissionsFromUser(String[] strArr, int i);

    boolean connectAbility(Intent intent, IAbilityConnection iAbilityConnection);

    void disconnectAbility(IAbilityConnection iAbilityConnection);

    void setDisplayOrientation(AbilityInfo.DisplayOrientation displayOrientation);

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

    File getDir(String str, int i);

    File getExternalCacheDir();

    File[] getExternalCacheDirs();

    File getExternalFilesDir(String str);

    File[] getExternalFilesDirs(String str);

    boolean deleteFile(String str);

    IAbilityManager getAbilityManager();

    boolean terminateAbilityResult(int i);

    int getDisplayOrientation();

    void setShowOnLockScreen(boolean z);

    void setWakeUpScreen(boolean z);

    void restart();

    void setTransitionAnimation(int i, int i2);

    boolean isUpdatingConfigurations();

    void setTheme(int i);

    Theme getTheme();

    int getThemeId();

    void setPattern(int i);

    Pattern getPattern();

    String getAppType();

    ResourceManager getResourceManager(Configuration configuration);

    Object getLastStoredDataWhenConfigChanged();

    void printDrawnCompleted();

    void compelVerifyPermission(String str, String str2);

    void compelVerifyUriPermission(Uri uri, int i, String str);

    void compelVerifyCallerPermission(String str, String str2);

    void compelVerifyCallerUriPermission(Uri uri, int i, String str);

    void compelVerifyPermission(String str, int i, int i2, String str2);

    void compelVerifyUriPermission(Uri uri, int i, int i2, int i3, String str);

    void compelVerifyUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3);

    int getColor(int i);

    String getString(int i);

    String getString(int i, Object... objArr);

    String[] getStringArray(int i);

    int[] getIntArray(int i);

    String getProcessName();

    Context getAbilityPackageContext();

    HapModuleInfo getHapModuleInfo();

    Uri getCaller();

    void setColorMode(int i);

    int getColorMode();
}
