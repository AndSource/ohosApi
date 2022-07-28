package ohos.distributedhardware.devicemanager;

/* loaded from: ohos2.1.1.21.jar:ohos/distributedhardware/devicemanager/DeviceInfo.class */
public class DeviceInfo {
    public DeviceInfo() {
        throw new RuntimeException("Stub!");
    }

    public DeviceInfo(String networkId, String deviceName, DeviceType deviceType) {
        throw new RuntimeException("Stub!");
    }

    public String getNetworkId() {
        throw new RuntimeException("Stub!");
    }

    public DeviceType getDeviceType() {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/distributedhardware/devicemanager/DeviceInfo$DeviceType.class */
    public enum DeviceType {
        UNKNOWN_TYPE,
        SPEAKER,
        PHONE,
        TABLET,
        WEARABLE,
        CAR,
        TV;

        public int value() {
            throw new RuntimeException("Stub!");
        }

        public static DeviceType valueOf(int val) {
            throw new RuntimeException("Stub!");
        }
    }
}
