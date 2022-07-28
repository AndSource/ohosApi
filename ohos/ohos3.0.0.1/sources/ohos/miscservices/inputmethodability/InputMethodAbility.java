package ohos.miscservices.inputmethodability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ComponentContainer;
import ohos.global.configuration.Configuration;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos3.0.0.1.jar:ohos/miscservices/inputmethodability/InputMethodAbility.class */
public abstract class InputMethodAbility extends Ability {
    protected abstract KeyboardDelegate onCreateKeyboardInterface();

    public InputMethodAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onDisconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onCommand(Intent intent, boolean restart, int startId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onConfigurationUpdated(Configuration configuration) {
        throw new RuntimeException("Stub!");
    }

    protected ComponentContainer onCreateKeyboardContainer() {
        throw new RuntimeException("Stub!");
    }

    protected void onBeginInput(KeyboardController kbController, TextInputClient textInputClient) {
        throw new RuntimeException("Stub!");
    }

    protected void onEndInput() {
        throw new RuntimeException("Stub!");
    }

    protected void onShowKeyboard() {
        throw new RuntimeException("Stub!");
    }

    protected void onScreenOrientationChanged(int direction) {
        throw new RuntimeException("Stub!");
    }

    protected void onHideKeyboard() {
        throw new RuntimeException("Stub!");
    }
}
