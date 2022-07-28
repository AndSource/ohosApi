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

/* loaded from: ohos2.2.0.3.jar:ohos/app/AbilityContext.class */
public abstract class AbilityContext implements Context {
    public AbilityContext() {
        throw new RuntimeException("Stub!");
    }

    public AbilityContext(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void attachBaseContext(Context base) {
        throw new RuntimeException("Stub!");
    }

    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }

    public void init() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public final TaskDispatcher getUITaskDispatcher() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public final TaskDispatcher getMainTaskDispatcher() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public TaskDispatcher createParallelTaskDispatcher(String name, TaskPriority priority) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public TaskDispatcher createSerialTaskDispatcher(String name, TaskPriority priority) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public TaskDispatcher getGlobalTaskDispatcher(TaskPriority priority) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ApplicationInfo getApplicationInfo() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public AbilityInfo getAbilityInfo() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ProcessInfo getProcessInfo() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ResourceManager getResourceManager() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getPreferencesDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getDatabaseDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getDistributedDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void switchToDeviceEncryptedStorageContext() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void switchToCredentialEncryptedStorageContext() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean isDeviceEncryptedStorage() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean isCredentialEncryptedStorage() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int verifyCallingPermission(String permission) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int verifySelfPermission(String permission) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int verifyCallingOrSelfPermission(String permission) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int verifyPermission(String permission, int pid, int uid) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ClassLoader getClassloader() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Context getApplicationContext() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void terminateAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void terminateAbility(int requestCode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void displayUnlockMissionMessage() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void lockMission() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void unlockMission() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public final boolean terminateAbilityResult(int startId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getLocalClassName() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ElementName getElementName() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ElementName getCallingAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getCallingBundle() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean stopAbility(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void startAbility(Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void startAbility(Intent intent, AbilityStartSetting abilityStartSetting, IAbilityStartCallback callback) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void startAbility(Intent intent, int requestCode, AbilityStartSetting abilityStartSetting) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void startAbilities(Intent[] intents) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Context createBundleContext(String bundleName, int flag) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getDataDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getBundleResourcePath() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean canRequestPermission(String permission) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void requestPermissionsFromUser(String[] permissions, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean connectAbility(Intent intent, IAbilityConnection conn) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void disconnectAbility(IAbilityConnection conn) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setDisplayOrientation(AbilityInfo.DisplayOrientation newOrientation) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public IBundleManager getBundleManager() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getBundleCodePath() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getCacheDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getCodeCacheDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File[] getExternalMediaDirs() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getNoBackupFilesDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getFilesDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getDir(String name, int mode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getExternalCacheDir() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File[] getExternalCacheDirs() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File getExternalFilesDir(String type) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public File[] getExternalFilesDirs(String type) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean deleteFile(String fileName) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public IAbilityManager getAbilityManager() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int getDisplayOrientation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setShowOnLockScreen(boolean showOnLockScreen) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setWakeUpScreen(boolean wakeUpScreen) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void restart() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setTransitionAnimation(int enterAnim, int exitAnim) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public boolean isUpdatingConfigurations() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setTheme(int themeId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Theme getTheme() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setPattern(int patternId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Pattern getPattern() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getAppType() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public ResourceManager getResourceManager(Configuration configuration) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Object getLastStoredDataWhenConfigChanged() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void printDrawnCompleted() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyPermission(String permission, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyUriPermission(Uri uri, int modeFlags, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyCallerPermission(String permission, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyCallerUriPermission(Uri uri, int modeFlags, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyPermission(String permission, int pid, int uid, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void compelVerifyUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int getColor(int resId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getString(int resId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getString(int resId, Object... formatArgs) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String[] getStringArray(int resId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int[] getIntArray(int resId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Context getAbilityPackageContext() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public HapModuleInfo getHapModuleInfo() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public Uri getCaller() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int getThemeId() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public void setColorMode(int mode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.Context
    public int getColorMode() {
        throw new RuntimeException("Stub!");
    }
}
