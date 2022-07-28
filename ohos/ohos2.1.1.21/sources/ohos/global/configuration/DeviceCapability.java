package ohos.global.configuration;

/* loaded from: ohos2.1.1.21.jar:ohos/global/configuration/DeviceCapability.class */
public class DeviceCapability {
    public static final int DEVICE_TYPE_CAR = 2;
    public static final int DEVICE_TYPE_PC = 3;
    public static final int DEVICE_TYPE_PHONE = 0;
    public static final int DEVICE_TYPE_TABLET = 1;
    public static final int DEVICE_TYPE_TV = 4;
    public static final int DEVICE_TYPE_UNDEFINED = -1;
    public static final int DEVICE_TYPE_WEARABLE = 6;
    public static final int FLOAT_UNDEFINED = -1;
    public static final int SCREEN_DEFAULT = -2;
    public static final int SCREEN_LDPI = 240;
    public static final int SCREEN_MDPI = 160;
    public static final int SCREEN_SDPI = 120;
    public static final int SCREEN_XLDPI = 320;
    public static final int SCREEN_XXLDPI = 480;
    public static final int SCREEN_XXXLDPI = 640;
    public int deviceType;
    public int height;
    public boolean isRound;
    public int screenDensity;
    public int width;

    public DeviceCapability() {
        throw new RuntimeException("Stub!");
    }

    public DeviceCapability(DeviceCapability capability) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
