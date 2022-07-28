package ohos.accessibility;

import java.util.ArrayList;

/* loaded from: ohos2.0.1.95.jar:ohos/accessibility/AccessibilityEventInfo.class */
public class AccessibilityEventInfo {
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED_EVENT = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED_EVENT = 65536;
    public static final int TYPE_VIEW_CLICKED_EVENT = 1;
    public static final int TYPE_VIEW_FOCUSED_EVENT = 8;
    public static final int TYPE_VIEW_HOVER_ENTER_EVENT = 128;
    public static final int TYPE_VIEW_HOVER_EXIT_EVENT = 256;
    public static final int TYPE_VIEW_LONG_CLICKED_EVENT = 2;
    public static final int TYPE_VIEW_SCROLLED_EVENT = 4096;
    public static final int TYPE_VIEW_SELECTED_EVENT = 4;
    public static final int TYPE_VIEW_TEXT_CHANGED_EVENT = 16;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED_EVENT = 8192;
    public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = 128;
    public static final int WINDOWS_CHANGE_ACTIVE = 32;
    public static final int WINDOWS_CHANGE_ADDED = 1;
    public static final int WINDOWS_CHANGE_BOUNDS = 8;
    public static final int WINDOWS_CHANGE_CHILDREN = 512;
    public static final int WINDOWS_CHANGE_FOCUSED = 64;
    public static final int WINDOWS_CHANGE_LAYER = 16;
    public static final int WINDOWS_CHANGE_PARENT = 256;
    public static final int WINDOWS_CHANGE_PIP = 1024;
    public static final int WINDOWS_CHANGE_REMOVED = 2;
    public static final int WINDOWS_CHANGE_TITLE = 4;

    public AccessibilityEventInfo() {
        throw new RuntimeException("Stub!");
    }

    public AccessibilityEventInfo(int eventType) {
        throw new RuntimeException("Stub!");
    }

    public AccessibilityEventInfo(AccessibilityEventInfo eventInfo) {
        throw new RuntimeException("Stub!");
    }

    public int getTriggerAction() {
        throw new RuntimeException("Stub!");
    }

    public int getWindowChangeTypes() {
        throw new RuntimeException("Stub!");
    }

    public int getAccessibilityEventType() {
        throw new RuntimeException("Stub!");
    }

    public int getTextMoveStep() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public int getViewId() {
        throw new RuntimeException("Stub!");
    }

    public void addRecord(AccessibilityEventInfo eventInfo) {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<AccessibilityEventInfo> getRecords() {
        throw new RuntimeException("Stub!");
    }

    public void setTriggerAction(int action) {
        throw new RuntimeException("Stub!");
    }

    public void setTextMoveStep(int moveStep) {
        throw new RuntimeException("Stub!");
    }

    public void setBundleName(CharSequence bundleName) {
        throw new RuntimeException("Stub!");
    }

    public void setAccessibilityEventType(int accessibilityEventType) {
        throw new RuntimeException("Stub!");
    }

    public void setWindowChangeTypes(int changeTypes) {
        throw new RuntimeException("Stub!");
    }

    public void setViewId(int viewId) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getClassName() {
        throw new RuntimeException("Stub!");
    }

    public void setClassName(CharSequence className) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }

    public void setDescription(CharSequence description) {
        throw new RuntimeException("Stub!");
    }

    public int getCount() {
        throw new RuntimeException("Stub!");
    }

    public void setCount(int count) {
        throw new RuntimeException("Stub!");
    }

    public int getPresentIndex() {
        throw new RuntimeException("Stub!");
    }

    public void setPresentIndex(int presentIndex) {
        throw new RuntimeException("Stub!");
    }

    public int getStartIndex() {
        throw new RuntimeException("Stub!");
    }

    public void setStartIndex(int startIndex) {
        throw new RuntimeException("Stub!");
    }

    public int getEndIndex() {
        throw new RuntimeException("Stub!");
    }

    public void setEndIndex(int endIndex) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getLastContent() {
        throw new RuntimeException("Stub!");
    }

    public void setLastContent(CharSequence lastContent) {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<CharSequence> getContentList() {
        throw new RuntimeException("Stub!");
    }
}
