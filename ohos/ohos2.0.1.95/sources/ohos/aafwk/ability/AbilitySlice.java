package ohos.aafwk.ability;

import ohos.aafwk.ability.AbilityForm;
import ohos.aafwk.ability.AbilitySliceLifecycleExecutor;
import ohos.aafwk.ability.startsetting.AbilityStartSetting;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.window.service.Window;
import ohos.agp.window.service.WindowManager;
import ohos.app.AbilityContext;
import ohos.bundle.AbilityInfo;
import ohos.multimodalinput.event.KeyEvent;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/ability/AbilitySlice.class */
public class AbilitySlice extends AbilityContext implements ILifecycle {
    public AbilitySlice() {
        throw new RuntimeException("Stub!");
    }

    protected void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onActive() {
        throw new RuntimeException("Stub!");
    }

    protected void onInactive() {
        throw new RuntimeException("Stub!");
    }

    protected void onForeground(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onBackground() {
        throw new RuntimeException("Stub!");
    }

    protected void onStop() {
        throw new RuntimeException("Stub!");
    }

    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
        throw new RuntimeException("Stub!");
    }

    protected void onResult(int requestCode, Intent resultIntent) {
        throw new RuntimeException("Stub!");
    }

    protected void onOrientationChanged(AbilityInfo.DisplayOrientation displayOrientation) {
        throw new RuntimeException("Stub!");
    }

    protected void onBackPressed() {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, long delayTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }

    public WindowManager.LayoutConfig getLayoutParams() {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutParams(WindowManager.LayoutConfig params) {
        throw new RuntimeException("Stub!");
    }

    public void setIsAmbientMode(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public final void setUIContent(int layoutRes) {
        throw new RuntimeException("Stub!");
    }

    public void setUIContent(ComponentContainer componentContainer) {
        throw new RuntimeException("Stub!");
    }

    public Component findComponentById(int resID) {
        throw new RuntimeException("Stub!");
    }

    public final void present(AbilitySlice targetSlice, Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public final void presentForResult(AbilitySlice targetSlice, Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public final void setResult(Intent resultData) {
        throw new RuntimeException("Stub!");
    }

    public final void terminate() {
        throw new RuntimeException("Stub!");
    }

    public void startAbility(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void startAbility(Intent intent, AbilityStartSetting abilityStartSetting) {
        throw new RuntimeException("Stub!");
    }

    public void startAbilityForResult(Intent intent, int requestCode, AbilityStartSetting abilityStartSetting) {
        throw new RuntimeException("Stub!");
    }

    public void startAbilityForResult(Intent intent, int requestCode) {
        throw new RuntimeException("Stub!");
    }

    public final AbilitySliceLifecycleExecutor.LifecycleState getState() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public final boolean stopAbility(Intent intent) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public void terminateAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public final boolean connectAbility(Intent intent, IAbilityConnection conn) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public final void disconnectAbility(IAbilityConnection conn) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public void continueAbility() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public void continueAbility(String deviceId) throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public void continueAbilityReversibly() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public void continueAbilityReversibly(String deviceId) throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public boolean reverseContinueAbility() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final ContinuationState getContinuationState() throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final String getOriginalDeviceId() throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public void setDisplayOrientation(AbilityInfo.DisplayOrientation requestedOrientation) {
        throw new RuntimeException("Stub!");
    }

    public boolean acquireAbilityFormAsync(Intent intent, AbilityForm.OnAcquiredCallback acquiredCallback) {
        throw new RuntimeException("Stub!");
    }

    public void releaseAbilityForm(AbilityForm abilityForm) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.ILifecycle
    public final Lifecycle getLifecycle() {
        throw new RuntimeException("Stub!");
    }

    public final Ability getAbility() {
        throw new RuntimeException("Stub!");
    }
}
