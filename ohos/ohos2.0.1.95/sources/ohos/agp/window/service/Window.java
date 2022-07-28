package ohos.agp.window.service;

import java.util.Optional;
import ohos.accessibility.AccessibilityEventInfo;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Component;
import ohos.agp.utils.Rect;
import ohos.agp.window.service.WindowManager;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/window/service/Window.class */
public class Window {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/service/Window$IAccessibilityEventListener.class */
    public interface IAccessibilityEventListener {
        void onDispatchEvent(AccessibilityEventInfo accessibilityEventInfo);
    }

    public Window() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMovable() {
        throw new RuntimeException("Stub!");
    }

    public void setMovable(boolean movable) {
        throw new RuntimeException("Stub!");
    }

    public Rect getBoundRect() {
        throw new RuntimeException("Stub!");
    }

    public void setBoundRect(Rect boundRect) {
        throw new RuntimeException("Stub!");
    }

    public Optional<WindowManager.LayoutConfig> getLayoutConfig() {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutConfig(WindowManager.LayoutConfig param) {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public void addFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public void clearFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public void setLayoutFlags(int flags, int mask) {
        throw new RuntimeException("Stub!");
    }

    public void setWindowLayout(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void setNavigationBarColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public void setStatusBarColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public void setPadding(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setStatusBarVisibility(int visibility) {
        throw new RuntimeException("Stub!");
    }

    public int getStatusBarVisibility() {
        throw new RuntimeException("Stub!");
    }

    public Optional<Component> getCurrentComponentFocus() {
        throw new RuntimeException("Stub!");
    }

    public void setBackgroundColor(RgbColor rgbColor) {
        throw new RuntimeException("Stub!");
    }

    public void setBackground(String elementPath) {
        throw new RuntimeException("Stub!");
    }

    public void addWindowFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public void clearWindowFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public void setWindowFlags(int flags, int mask) {
        throw new RuntimeException("Stub!");
    }

    public void setTransparent(boolean isEnable) {
        throw new RuntimeException("Stub!");
    }

    public void setAccessibilityEventListener(IAccessibilityEventListener pListener) {
        throw new RuntimeException("Stub!");
    }

    public void setInputPanelDisplayType(int type) {
        throw new RuntimeException("Stub!");
    }
}
