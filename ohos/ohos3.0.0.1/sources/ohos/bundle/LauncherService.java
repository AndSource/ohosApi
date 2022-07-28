package ohos.bundle;

import java.util.List;
import java.util.Optional;
import ohos.aafwk.content.Intent;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/LauncherService.class */
public class LauncherService {
    public LauncherService(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void registerCallback(BundleStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterCallback() {
        throw new RuntimeException("Stub!");
    }

    public Optional<List<LauncherAbilityInfo>> getAbilityList(String bundleName, int userId) {
        throw new RuntimeException("Stub!");
    }

    public Optional<LauncherAbilityInfo> getAbilityInfo(Intent intent, int userId) {
        throw new RuntimeException("Stub!");
    }

    public Optional<ApplicationInfo> getApplicationInfo(String bundleName, int flags, int userId) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBundleEnabled(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAbilityEnabled(AbilityInfo abilityInfo) {
        throw new RuntimeException("Stub!");
    }

    public Optional<List<LauncherShortcutInfo>> getShortcutInfos(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public void startShortcut(String shortcutId, String bundleName) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/bundle/LauncherService$BundleStatusCallback.class */
    public static abstract class BundleStatusCallback {
        public abstract void onBundleAdded(String str, int i);

        public abstract void onBundleUpdated(String str, int i);

        public abstract void onBundleRemoved(String str, int i);

        public BundleStatusCallback() {
            throw new RuntimeException("Stub!");
        }
    }
}
