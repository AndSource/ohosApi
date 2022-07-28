package ohos.aafwk.ability;

import ohos.app.AbilityContext;
import ohos.app.ElementsCallback;
import ohos.global.configuration.Configuration;
import ohos.utils.PacMap;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/AbilityPackage.class */
public class AbilityPackage extends AbilityContext implements ElementsCallback {
    public AbilityPackage() {
        throw new RuntimeException("Stub!");
    }

    public void onInitialize() {
        throw new RuntimeException("Stub!");
    }

    public void onEnd() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.ElementsCallback
    public void onMemoryLevel(int level) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.ElementsCallback
    public void onConfigurationUpdated(Configuration configuration) {
        throw new RuntimeException("Stub!");
    }

    public void registerCallbacks(AbilityLifecycleCallbacks abilityLifecycleCallbacks, ElementsCallback elementsCallback) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterCallbacks(AbilityLifecycleCallbacks abilityLifecycleCallbacks, ElementsCallback elementsCallback) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAbilitySavedState(PacMap outState) {
        throw new RuntimeException("Stub!");
    }
}
