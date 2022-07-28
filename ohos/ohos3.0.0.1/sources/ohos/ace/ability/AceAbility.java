package ohos.ace.ability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.IAbilityContinuation;
import ohos.aafwk.ability.assistance.AbilityAgent;
import ohos.aafwk.ability.assistance.IAssistanceChannel;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.IntentParams;
import ohos.global.configuration.Configuration;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.TouchEvent;
import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/ace/ability/AceAbility.class */
public class AceAbility extends Ability implements IAbilityContinuation, IAssistanceChannel {
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
    public void onSaveAbilityState(PacMap outState) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onRestoreAbilityState(PacMap outState) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onMemoryLevel(int level) {
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

    public void onNewWant(Intent intent) {
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

    @Override // ohos.aafwk.ability.IAbilityContinuation
    public void onRemoteTerminated() {
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

    @Override // ohos.aafwk.ability.assistance.IAssistanceChannel
    public void onConnected(AbilityAgent agent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.assistance.IAssistanceChannel
    public void onConnectFailed(int errorCode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.assistance.IAssistanceChannel
    public void onDisconnected(int errorCode) {
        throw new RuntimeException("Stub!");
    }
}
