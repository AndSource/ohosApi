package ohos.aafwk.ability;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import ohos.aafwk.ability.AbilityLifecycleExecutor;
import ohos.aafwk.ability.continuation.IContinuationRegisterManager;
import ohos.aafwk.ability.startsetting.AbilityStartSetting;
import ohos.aafwk.content.Intent;
import ohos.accessibility.AccessibilityEventInfo;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.ComponentProvider;
import ohos.agp.window.service.Window;
import ohos.agp.window.service.WindowManager;
import ohos.app.AbilityContext;
import ohos.bundle.AbilityInfo;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;
import ohos.event.notification.NotificationRequest;
import ohos.global.configuration.Configuration;
import ohos.global.resource.RawFileDescriptor;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.TouchEvent;
import ohos.rpc.IRemoteObject;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/Ability.class */
public class Ability extends AbilityContext implements ILifecycle {
    public static final int FORM_INVISIBLE = 2;
    public static final int FORM_VISIBLE = 1;

    public Ability() {
        throw new RuntimeException("Stub!");
    }

    protected void onInitialized(AbilityInfo abilityInfo) {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, long delayTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean supportHighPerformanceUI() {
        throw new RuntimeException("Stub!");
    }

    public AbilityPackage getAbilityPackage() {
        throw new RuntimeException("Stub!");
    }

    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }

    public final void setUIContent(int layoutRes) {
        throw new RuntimeException("Stub!");
    }

    public void setUIContent(ComponentContainer componentContainer) {
        throw new RuntimeException("Stub!");
    }

    public void setAVController(Object controller) {
        throw new RuntimeException("Stub!");
    }

    public Object getAVController() {
        throw new RuntimeException("Stub!");
    }

    public WindowManager.LayoutConfig getLayoutParams() {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutParams(WindowManager.LayoutConfig params) {
        throw new RuntimeException("Stub!");
    }

    public Component findComponentById(int resID) {
        throw new RuntimeException("Stub!");
    }

    public void setIsAmbientMode(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public IContinuationRegisterManager getContinuationRegisterManager() {
        throw new RuntimeException("Stub!");
    }

    public boolean onHotkeyTriggered(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onKeyPressAndHold(int keyCode, KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    protected void onBackPressed() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public boolean connectAbility(Intent intent, IAbilityConnection conn) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public void disconnectAbility(IAbilityConnection conn) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.ILifecycle
    public final Lifecycle getLifecycle() {
        throw new RuntimeException("Stub!");
    }

    public int insert(Uri uri, ValuesBucket value) {
        throw new RuntimeException("Stub!");
    }

    public int batchInsert(Uri uri, ValuesBucket[] values) {
        throw new RuntimeException("Stub!");
    }

    public int delete(Uri uri, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    public int update(Uri uri, ValuesBucket value, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityResult[] executeBatch(ArrayList<DataAbilityOperation> operations) throws OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public RawFileDescriptor openRawFile(Uri uri, String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public <T> FileDescriptor createPipeFile(Uri uri, String mimeType, PacMap pacMap, T args, PipeFileWriter<T> pipeFileWriter) throws FileNotFoundException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public String[] getFileTypes(Uri uri, String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }

    public PacMap call(String method, String arg, PacMap extras) {
        throw new RuntimeException("Stub!");
    }

    public void shutdown() {
        throw new RuntimeException("Stub!");
    }

    public String getType(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public boolean isTemporary() {
        throw new RuntimeException("Stub!");
    }

    protected void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onPostStart(PacMap pacMap) {
        throw new RuntimeException("Stub!");
    }

    protected void onStop() {
        throw new RuntimeException("Stub!");
    }

    protected void onActive() {
        throw new RuntimeException("Stub!");
    }

    protected void onUnloadForm() {
        throw new RuntimeException("Stub!");
    }

    protected void onPostActive() {
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

    protected IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onDisconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected void onCommand(Intent intent, boolean restart) {
        throw new RuntimeException("Stub!");
    }

    protected void onCommand(Intent intent, boolean restart, int startId) {
        throw new RuntimeException("Stub!");
    }

    protected void onNewIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void onConfigurationUpdated(Configuration configuration) {
        throw new RuntimeException("Stub!");
    }

    protected boolean onTouchEvent(TouchEvent event) {
        throw new RuntimeException("Stub!");
    }

    protected void onOrientationChanged(AbilityInfo.DisplayOrientation displayOrientation) {
        throw new RuntimeException("Stub!");
    }

    public void onMemoryLevel(int level) {
        throw new RuntimeException("Stub!");
    }

    public void onReconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void onMissionDeleted(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
        throw new RuntimeException("Stub!");
    }

    protected AbilityForm onCreateForm() {
        throw new RuntimeException("Stub!");
    }

    protected ProviderFormInfo onCreateForm(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected void onDeleteForm(int formId) {
        throw new RuntimeException("Stub!");
    }

    protected void onDeleteForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected void onUpdateForm(int formId) {
        throw new RuntimeException("Stub!");
    }

    protected void onUpdateForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    protected void onEventNotify(Map<Long, Integer> formEvents) {
        throw new RuntimeException("Stub!");
    }

    protected void onCastTempForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    protected void onTriggerFormEvent(int formId, String message) {
        throw new RuntimeException("Stub!");
    }

    protected void onTriggerFormEvent(long formId, String message) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean updateForm(int formId, ComponentProvider component) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean updateForm(long formId, ComponentProvider component) throws FormException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean updateForm(int formId, FormBindingData formBindingData) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean updateForm(long formId, FormBindingData formBindingData) throws FormException {
        throw new RuntimeException("Stub!");
    }

    public boolean setFormNextRefreshTime(long formId, long nextTime) throws FormException {
        throw new RuntimeException("Stub!");
    }

    protected FormState onAcquireFormState(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void onSaveAbilityState(PacMap outState) {
        throw new RuntimeException("Stub!");
    }

    public Object onStoreDataWhenConfigChange() {
        throw new RuntimeException("Stub!");
    }

    public Uri onSetCaller() {
        throw new RuntimeException("Stub!");
    }

    public void onRestoreAbilityState(PacMap inState) {
        throw new RuntimeException("Stub!");
    }

    public void onRequestPermissionsFromUserResult(int requestCode, String[] permissions, int[] grantResults) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence onNewDescription() {
        throw new RuntimeException("Stub!");
    }

    public void onLeaveForeground() {
        throw new RuntimeException("Stub!");
    }

    public void onEventDispatch() {
        throw new RuntimeException("Stub!");
    }

    public final void startAbility(Intent intent) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void startAbility(Intent intent, IAbilityStartCallback callback) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public void onTopActiveAbilityChanged(boolean topActive) {
        throw new RuntimeException("Stub!");
    }

    public final void startAbility(Intent intent, AbilityStartSetting abilityStartSetting) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void startAbilityForResult(Intent intent, int requestCode, AbilityStartSetting abilityStartSetting) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void startAbilityForResult(Intent intent, int requestCode) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void setResult(int resultCode, Intent resultData) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public final void terminateAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.app.AbilityContext, ohos.app.Context
    public final boolean stopAbility(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public final void setMainRoute(String entry) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void addActionRoute(String action, String entry) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void setWindowBackgroundColor(int red, int green, int blue) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void keepBackgroundRunning(int id, NotificationRequest notificationRequest) {
        throw new RuntimeException("Stub!");
    }

    public final void cancelBackgroundRunning() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public final void continueAbility() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final void continueAbility(String deviceId) throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final void continueAbilityReversibly() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final void continueAbilityReversibly(String deviceId) throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final boolean reverseContinueAbility() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final ContinuationState getContinuationState() throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final String getOriginalDeviceId() throws UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }

    public final void setAbilitySliceAnimator(AbilitySliceAnimator abilitySliceAnimator) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }

    public boolean isTerminating() {
        throw new RuntimeException("Stub!");
    }

    public void setIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasWindowFocus() {
        throw new RuntimeException("Stub!");
    }

    public Component getCurrentFocus() {
        throw new RuntimeException("Stub!");
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSwipeToDismiss(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public Uri normalizeUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public Uri denormalizeUri(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAccessibilityEventInfo(AccessibilityEventInfo info) {
        throw new RuntimeException("Stub!");
    }

    public boolean reload(Uri uri, PacMap extras) {
        throw new RuntimeException("Stub!");
    }

    public void setVolumeTypeAdjustedByKey(int volumeType) {
        throw new RuntimeException("Stub!");
    }

    public int getVolumeTypeAdjustedByKey() {
        throw new RuntimeException("Stub!");
    }

    public String getAbilityName() {
        throw new RuntimeException("Stub!");
    }

    public final AbilityLifecycleExecutor.LifecycleState getState() {
        throw new RuntimeException("Stub!");
    }

    public void executeOperation(DataAbilityOperation operation, DataAbilityResult[] refResults, int refIndex) throws OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    public ValuesBucket parseValuesBucketReference(DataAbilityResult[] refResults, DataAbilityOperation operation, int numRefs) throws OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityPredicates parsePredictionArgsReference(DataAbilityResult[] refResults, DataAbilityOperation operation, int numRef) throws OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/Ability$LayoutParamsHelper.class */
    public static class LayoutParamsHelper {
        public LayoutParamsHelper(Intent intentLayout) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setX(int x) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setY(int y) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setWidth(int width) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setHeight(int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setAlpha(float alpha) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setDimAmount(float dimAmount) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setFlags(int flags, int mask) {
            throw new RuntimeException("Stub!");
        }

        public LayoutParamsHelper setAlignment(int alignment) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/Ability$WindowAttributeHelper.class */
    public static class WindowAttributeHelper {
        public WindowAttributeHelper(Intent intentAttribute) {
            throw new RuntimeException("Stub!");
        }

        public WindowAttributeHelper setLeftPadding(int left) {
            throw new RuntimeException("Stub!");
        }

        public WindowAttributeHelper setTopPadding(int top) {
            throw new RuntimeException("Stub!");
        }

        public WindowAttributeHelper setRightPadding(int right) {
            throw new RuntimeException("Stub!");
        }

        public WindowAttributeHelper setBottomPadding(int bottom) {
            throw new RuntimeException("Stub!");
        }
    }
}
