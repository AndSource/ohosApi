package ohos.accessibility.ability;

import java.util.List;
import java.util.Optional;
import ohos.agp.utils.Rect;

/* loaded from: ohos3.0.0.1.jar:ohos/accessibility/ability/AccessibilityInfo.class */
public class AccessibilityInfo {
    public static final int ACCESSIBILITY_OPERATION_ACCESSIBILITY_FOCUS = 64;
    public static final int ACCESSIBILITY_OPERATION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACCESSIBILITY_OPERATION_CLEAR_FOCUS = 2;
    public static final int ACCESSIBILITY_OPERATION_CLEAR_SELECTION = 8;
    public static final int ACCESSIBILITY_OPERATION_CLICK = 16;
    public static final int ACCESSIBILITY_OPERATION_COPY = 16384;
    public static final int ACCESSIBILITY_OPERATION_CUT = 65536;
    public static final int ACCESSIBILITY_OPERATION_FOCUS = 1;
    public static final int ACCESSIBILITY_OPERATION_LONG_CLICK = 32;
    public static final int ACCESSIBILITY_OPERATION_PASTE = 32768;
    public static final int ACCESSIBILITY_OPERATION_SCROLL_BACKWARD = 8192;
    public static final int ACCESSIBILITY_OPERATION_SCROLL_FORWARD = 4096;
    public static final int ACCESSIBILITY_OPERATION_SELECT = 4;
    public static final int ACCESSIBILITY_OPERATION_SET_SELECTION = 131072;
    public static final int ACCESSIBILITY_OPERATION_SET_TEXT = 2097152;
    public static final int DIRECTION_BACKWARD = 1;
    public static final int DIRECTION_DOWN = 130;
    public static final int DIRECTION_FORWARD = 2;
    public static final int DIRECTION_LEFT = 17;
    public static final int DIRECTION_RIGHT = 66;
    public static final int DIRECTION_UP = 33;
    public static final int FOCUS_TYPE_ACCESSIBILITY = 2;
    public static final int FOCUS_TYPE_INPUT = 1;

    public AccessibilityInfo() {
        throw new RuntimeException("Stub!");
    }

    public long getAccessibilityId() {
        throw new RuntimeException("Stub!");
    }

    public String getComponentResourceId() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getContent() {
        throw new RuntimeException("Stub!");
    }

    public Rect getRectInScreen() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getDescriptionInfo() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> getChild(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getChildCount() {
        throw new RuntimeException("Stub!");
    }

    public long getChildId(int index) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> gainFocus(int focusType) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AccessibilityInfo> gainNextFocus(int direction) {
        throw new RuntimeException("Stub!");
    }

    public List<AccessibilityInfo> getAccessibleInfoViaContent(String text) {
        throw new RuntimeException("Stub!");
    }

    public boolean executeOperation(int operation) {
        throw new RuntimeException("Stub!");
    }

    public void addOperation(AccessibleOperation operation) {
        throw new RuntimeException("Stub!");
    }

    public List<AccessibleOperation> getOperations() {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteOperation(AccessibleOperation operation) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPopupSupported() {
        throw new RuntimeException("Stub!");
    }

    public void setPopupSupported(boolean supportPopup) {
        throw new RuntimeException("Stub!");
    }

    public String getClassName() {
        throw new RuntimeException("Stub!");
    }

    public void setClassName(String className) {
        throw new RuntimeException("Stub!");
    }

    public String getHint() {
        throw new RuntimeException("Stub!");
    }

    public void setHint(String hint) {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumLength() {
        throw new RuntimeException("Stub!");
    }

    public void setMaximumLength(int maxLength) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasGainedAccessibilitySelected() {
        throw new RuntimeException("Stub!");
    }

    public void setAccessibleFocusStatus(boolean accessibilityFocused) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCheckable() {
        throw new RuntimeException("Stub!");
    }

    public void setCheckable(boolean checkable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }

    public void setChecked(boolean checked) {
        throw new RuntimeException("Stub!");
    }

    public boolean isClickable() {
        throw new RuntimeException("Stub!");
    }

    public void setClickable(boolean clickable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeletable() {
        throw new RuntimeException("Stub!");
    }

    public void setDeletable(boolean dismissible) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEditable() {
        throw new RuntimeException("Stub!");
    }

    public void setEditable(boolean editable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocused() {
        throw new RuntimeException("Stub!");
    }

    public void setFocused(boolean focused) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFocusable() {
        throw new RuntimeException("Stub!");
    }

    public void setFocusable(boolean focusable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEssential() {
        throw new RuntimeException("Stub!");
    }

    public void setEssential(boolean essential) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLongClickable() {
        throw new RuntimeException("Stub!");
    }

    public void setLongClickable(boolean longClickable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPluralLineSupported() {
        throw new RuntimeException("Stub!");
    }

    public void setPluralLineSupported(boolean pluralLineSupported) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPassword() {
        throw new RuntimeException("Stub!");
    }

    public void setPassword(boolean password) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScrollable() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollable(boolean scrollable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSelected() {
        throw new RuntimeException("Stub!");
    }

    public void setSelected(boolean selected) {
        throw new RuntimeException("Stub!");
    }

    public boolean isGivingHint() {
        throw new RuntimeException("Stub!");
    }

    public void setHinting(boolean givingHintText) {
        throw new RuntimeException("Stub!");
    }

    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }

    public void setVisible(boolean visibleToUser) {
        throw new RuntimeException("Stub!");
    }
}
