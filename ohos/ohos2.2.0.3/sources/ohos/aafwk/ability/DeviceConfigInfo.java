package ohos.aafwk.ability;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/DeviceConfigInfo.class */
public class DeviceConfigInfo implements Sequenceable {
    public static final int GLES_VERSION_DEFAULT = 0;
    public static final int INPUT_FLAG_FIVE_WAY_NAV = 2;
    public static final int INPUT_FLAG_HARD_KEYBOARD = 1;
    public static final int KEY_BOARD_12KEY = 3;
    public static final int KEY_BOARD_COMMON = 2;
    public static final int KEY_BOARD_DEFAULT = 0;
    public static final int KEY_BOARD_NOKEYS = 1;
    public static final int NAVIGATION_DEFAULT = 0;
    public static final int NAVIGATION_DPAD = 2;
    public static final int NAVIGATION_NONAV = 1;
    public static final int NAVIGATION_TRACKBALL = 3;
    public static final int NAVIGATION_WHEEL = 4;
    public static final int TOUCH_SCREEN_DEFAULT = 0;
    public static final int TOUCH_SCREEN_FINGER = 3;
    public static final int TOUCH_SCREEN_NOTOUCH = 1;

    DeviceConfigInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getTouchScreenType() {
        throw new RuntimeException("Stub!");
    }

    public int getKeyBoardType() {
        throw new RuntimeException("Stub!");
    }

    public int getNavigationType() {
        throw new RuntimeException("Stub!");
    }

    public int getExternalInputDevices() {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceGLESVersion() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
