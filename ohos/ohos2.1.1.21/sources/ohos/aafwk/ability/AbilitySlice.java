package ohos.aafwk.ability;

import java.util.List;
import ohos.aafwk.ability.AbilityForm;
import ohos.aafwk.ability.AbilitySliceLifecycleExecutor;
import ohos.aafwk.ability.continuation.IContinuationRegisterManager;
import ohos.aafwk.ability.startsetting.AbilityStartSetting;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.window.service.Window;
import ohos.agp.window.service.WindowManager;
import ohos.app.AbilityContext;
import ohos.bundle.AbilityInfo;
import ohos.bundle.FormInfo;
import ohos.multimodalinput.event.KeyEvent;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/AbilitySlice.class */
public class AbilitySlice extends AbilityContext implements ILifecycle {
    public static final String PARAM_FORM_CUSTOMIZE_KEY = "ohos.extra.param.key.form_customize";
    public static final String PARAM_FORM_DIMENSION_KEY = "ohos.extra.param.key.form_dimension";
    public static final String PARAM_FORM_HEIGHT_KEY = "ohos.extra.param.key.form_height";
    public static final String PARAM_FORM_IDENTITY_KEY = "ohos.extra.param.key.form_identity";
    @Deprecated
    public static final String PARAM_FORM_ID_KEY = "ohos.extra.param.key.form_id";
    public static final String PARAM_FORM_NAME_KEY = "ohos.extra.param.key.form_name";
    public static final String PARAM_FORM_TEMPORARY_KEY = "ohos.extra.param.key.form_temporary";
    public static final String PARAM_FORM_WIDTH_KEY = "ohos.extra.param.key.form_width";
    public static final String PARAM_MODULE_NAME_KEY = "ohos.extra.param.key.module_name";

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

    public void postTask(Runnable task, long delayTime) {
        throw new RuntimeException("Stub!");
    }

    public boolean onHotkeyTriggered(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyPressAndHold(int keyCode, KeyEvent keyEvent) {
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

    public IContinuationRegisterManager getContinuationRegisterManager() {
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

    public boolean acquireForm(Intent intent, FormCallback callback) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean deleteForm(int formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteForm(long formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean releaseForm(int formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseForm(long formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseForm(long formId, boolean isReleaseCache) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean castTempForm(long formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public void notifyVisibleForms(List<Long> formIds) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public void notifyInvisibleForms(List<Long> formIds) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public int checkAndDeleteInvalidForms(List<Long> persistedIds) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public List<FormInfo> getAllFormsInfo() throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public List<FormInfo> getAllForms() throws FormException {
        throw new RuntimeException("Stub!");
    }

    public List<FormInfo> getFormsInfoByApp(String bundleName) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public List<FormInfo> getFormsByApp(String bundleName) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public List<FormInfo> getFormsInfoByModule(String bundleName, String moduleName) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public List<FormInfo> getFormsByModule(String bundleName, String moduleName) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean requestForm(int formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean requestForm(long formId) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean requestForm(long formId, Intent intent) throws FormException {
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

    /* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/AbilitySlice$FormCallback.class */
    public interface FormCallback {
        public static final int OHOS_FORM_ACQUIRE_SUCCESS = 0;
        public static final int OHOS_FORM_APPLY_FAILURE = 2;
        public static final int OHOS_FORM_PREVIEW_FAILURE = 1;
        public static final int OHOS_FORM_REAPPLY_FAILURE = 3;
        public static final int OHOS_FORM_RESTORE_FAILURE = 4;

        void onAcquired(int i, Form form);

        @Deprecated
        void onFormUninstalled(int i);

        default void onFormUninstalled(long formId) {
            throw new RuntimeException("Stub!");
        }
    }
}
