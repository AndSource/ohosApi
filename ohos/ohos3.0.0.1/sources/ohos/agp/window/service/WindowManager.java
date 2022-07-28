package ohos.agp.window.service;

import java.util.Optional;
import ohos.agp.components.ComponentContainer;
import ohos.agp.utils.Rect;
import ohos.app.Context;
import ohos.media.image.PixelMap;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/window/service/WindowManager.class */
public class WindowManager {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/window/service/WindowManager$NotchMode.class */
    public enum NotchMode {
        DEFAULT,
        ALWAYS,
        NEVER
    }

    WindowManager() {
        throw new RuntimeException("Stub!");
    }

    public static WindowManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    public Optional<Window> getTopWindow() {
        throw new RuntimeException("Stub!");
    }

    public int getWindowCount(Context context) {
        throw new RuntimeException("Stub!");
    }

    public Window addComponent(ComponentContainer component, Context context, int typeFlag) {
        throw new RuntimeException("Stub!");
    }

    public void destroyWindow(Window window) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap captureScreen(Rect rectangle, int width, int height, int angle) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/window/service/WindowManager$LayoutConfig.class */
    public static class LayoutConfig {
        public static final int ALTER_ALPHA = 128;
        public static final int ALTER_DIM = 2048;
        public static final int ALTER_FLAGS = 512;
        public static final int ALTER_FORMAT = 8;
        public static final int ALTER_LAYOUT = 2;
        public static final int ALTER_TITLE = 32;
        public static final int FIRST_SUB_WINDOW = 1000;
        public static final int FIRST_SYSTEM_WINDOW = 2000;
        public static final int INPUT_ADJUST_NOTHING = 24;
        public static final int INPUT_ADJUST_PAN = 16;
        public static final int INPUT_ADJUST_RESIZE = 8;
        public static final int INPUT_ADJUST_UNSPECIFIED = 0;
        public static final int INPUT_IS_FORWARD_NAVIGATION = 128;
        public static final int INPUT_MASK_ADJUST = 120;
        public static final int INPUT_MASK_STATE = -2147483641;
        public static final int INPUT_STATE_ALWAYS_HIDDEN = -2147483647;
        public static final int INPUT_STATE_ALWAYS_VISIBLE = -2147483646;
        public static final int INPUT_STATE_HIDDEN = 1;
        public static final int INPUT_STATE_UNCHANGED = Integer.MIN_VALUE;
        public static final int INPUT_STATE_UNSPECIFIED = 0;
        public static final int INPUT_STATE_VISIBLE = 2;
        public static final int LAYOUT_IN_DISPLAY_SIDE_MODE_ALWAYS = 1;
        public static final int LAYOUT_IN_DISPLAY_SIDE_MODE_DEFAULT = 0;
        public static final int LAYOUT_IN_DISPLAY_SIDE_MODE_NEVER = 2;
        public static final int MARK_ALLOW_EXTEND_LAYOUT = 256;
        public static final int MARK_ALLOW_LAYOUT_COVER_SCREEN = 128;
        public static final int MARK_ALLOW_LAYOUT_OVERSCAN = 16777216;
        public static final int MARK_ALT_FOCUSABLE_IM = 65536;
        public static final int MARK_DIM_EVE_WINDOW_BEHIND = 1;
        public static final int MARK_DRAWS_SYSTEM_BAR_BACKGROUNDS = 1073741824;
        public static final int MARK_FOCUSABLE_IMPOSSIBLE = 4;
        public static final int MARK_FORCE_FULLSCREEN_IMPOSSIBLE = 1024;
        public static final int MARK_FULL_SCREEN = 512;
        public static final int MARK_LAYOUT_ATTACHED_IN_DECOR = 536870912;
        public static final int MARK_LAYOUT_INSET_DECOR = 32768;
        public static final int MARK_LOCAL_FOCUS_MODE = 134217728;
        public static final int MARK_LOCK_AS_SCREEN_ON = Integer.MIN_VALUE;
        public static final int MARK_NOT_RESPOD_CHEEK_PRESSES = 16384;
        public static final int MARK_OUTSIDE_TOUCH = 4194304;
        public static final int MARK_REMOTE_DEV_INPUT = 1;
        public static final int MARK_SCALED = 8192;
        public static final int MARK_SCREEN_ON_ALWAYS = 64;
        public static final int MARK_SECURE = 4096;
        public static final int MARK_TOUCHABLE_IMPOSSIBLE = 8;
        public static final int MARK_TOUCH_MODAL_IMPOSSIBLE = 16;
        public static final int MARK_TRANSLUCENT_NAVIGATION = 67108864;
        public static final int MARK_TRANSLUCENT_STATUS = 33554432;
        public static final int MARK_WALLPAPER_BEHIND = 524288;
        public static final int MARK_WATCH_OUTSIDE_TOUCH = 131072;
        public static final int MOD_APPLICATION = 2;
        public static final int MOD_APPLICATION_MEDIA = 1001;
        public static final int MOD_APPLICATION_OVERLAY = 2038;
        public static final int MOD_APPLICATION_PANEL = 1000;
        public static final int MOD_INPUT_METHOD = 2011;
        public static final int MOD_KEYGUARD = 2004;
        public static final int MOD_PRESENTATION = 2037;
        public static final int MOD_STATUS_BAR = 2000;
        public static final int MOD_TOAST = 2005;
        public static final int SYSTEM_BAR_BRIGHT_NAVIGATION = 16;
        public static final int SYSTEM_BAR_BRIGHT_STATUS = 32;
        public static final int SYSTEM_BAR_HIDE_NAVIGATION_AUTO = 2;
        public static final int SYSTEM_BAR_HIDE_NAVIGATION_ONCE = 1;
        public static final int SYSTEM_BAR_HIDE_STATUS_AUTO = 8;
        public static final int SYSTEM_BAR_HIDE_STATUS_ONCE = 4;
        public int alignment;
        public int flags;
        public int height;
        public String title;
        public int type;
        public int width;
        public int x;
        public int y;
        public float alpha = 1.0f;
        public int animations = -1;
        public float dim = 1.0f;
        public int layoutInDisplaySideMode = 0;
        public int notchMode = 0;
        public int pixelFormat = -1;
        public float windowBrightness = -1.0f;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/window/service/WindowManager$PermissionException.class */
    public static class PermissionException extends RuntimeException {
        public PermissionException() {
            throw new RuntimeException("Stub!");
        }

        public PermissionException(String name) {
            throw new RuntimeException("Stub!");
        }
    }
}
