package ohos.accessibility.ability;

import java.util.Optional;
import ohos.agp.utils.Rect;

/* loaded from: ohos2.0.1.95.jar:ohos/accessibility/ability/AccessibilityWindow.class */
public class AccessibilityWindow {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;

    AccessibilityWindow() {
        throw new RuntimeException("Stub!");
    }

    public static AccessibilityWindow get() {
        throw new RuntimeException("Stub!");
    }

    public static AccessibilityWindow get(AccessibilityWindow srcWindow) {
        throw new RuntimeException("Stub!");
    }

    public int getWindowId() {
        throw new RuntimeException("Stub!");
    }

    public int getWindowType() {
        throw new RuntimeException("Stub!");
    }

    public int getWindowLayer() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getWindowTitle() {
        throw new RuntimeException("Stub!");
    }

    public Rect getRectInScreen() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAccessibilityFocused() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocused() {
        throw new RuntimeException("Stub!");
    }

    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }

    public int getChildNum() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityWindow> getChild(int index) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityWindow> getParent() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> getRootAccessibilityInfo() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> getAnchor() {
        throw new RuntimeException("Stub!");
    }
}
