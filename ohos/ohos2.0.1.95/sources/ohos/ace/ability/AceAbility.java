package ohos.ace.ability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.IAbilityContinuation;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.IntentParams;
import ohos.global.configuration.Configuration;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos2.0.1.95.jar:ohos/ace/ability/AceAbility.class */
public class AceAbility extends Ability implements IAbilityContinuation {
    public AceAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onConfigurationUpdated(Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onNewIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onBackPressed() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onForeground(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onBackground() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onActive() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onInactive() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.IAbilityContinuation
    public boolean onStartContinuation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.IAbilityContinuation
    public void onCompleteContinuation(int code) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.IAbilityContinuation
    public boolean onSaveData(IntentParams saveData) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public boolean onTouchEvent(TouchEvent event) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.IAbilityContinuation
    public boolean onRestoreData(IntentParams restoreData) {
        throw new RuntimeException("Stub!");
    }

    public void setInstanceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void setPageParams(String url, IntentParams params) {
        throw new RuntimeException("Stub!");
    }

    public void pushPage(String url, IntentParams params) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onRequestPermissionsFromUserResult(int requestCode, String[] permissions, int[] grantResults) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
        throw new RuntimeException("Stub!");
    }
}
