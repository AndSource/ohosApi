package ohos.accessibility.ability;

import java.util.List;
import java.util.Optional;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.accessibility.AccessibilityEventInfo;
import ohos.multimodalinput.event.KeyEvent;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos3.0.0.1.jar:ohos/accessibility/ability/AccessibleAbility.class */
public abstract class AccessibleAbility extends Ability {
    public static final int GLOBAL_ACTION_BACK = 1;
    public static final int GLOBAL_ACTION_HOME = 2;
    public static final int GLOBAL_ACTION_LOCK_SCREEN = 8;
    public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
    public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
    public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
    public static final int GLOBAL_ACTION_RECENTS = 3;
    public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = 9;
    public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
    public static final int SHOW_MODE_AUTO = 0;
    public static final int SHOW_MODE_HIDE = 1;
    public static final int SHOW_MODE_IGNORE_HARD_KEYBOARD = 2;

    public abstract void onAccessibilityEvent(AccessibilityEventInfo accessibilityEventInfo);

    public abstract void onInterrupt();

    public AccessibleAbility() {
        throw new RuntimeException("Stub!");
    }

    public final void disableAbility() {
        throw new RuntimeException("Stub!");
    }

    protected boolean onKeyPressEvent(KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public final SoftKeyBoardController getSoftKeyBoardController() {
        throw new RuntimeException("Stub!");
    }

    public final DisplayResizeController getDisplayResizeController() {
        throw new RuntimeException("Stub!");
    }

    public final DisplayResizeController getDisplayResizeController(int displayId) {
        throw new RuntimeException("Stub!");
    }

    protected void onAbilityConnected() {
        throw new RuntimeException("Stub!");
    }

    protected boolean onGesture(int gestureId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean gestureSimulate(List<GesturePathDefine> gesturePathDefineList, GestureResultListener listener) {
        throw new RuntimeException("Stub!");
    }

    public List<AccessibilityWindow> getWindows() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> getRootAccessibilityInfo() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> gainFocus(int focusType) {
        throw new RuntimeException("Stub!");
    }

    public final boolean performCommonAction(int action) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public final IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
