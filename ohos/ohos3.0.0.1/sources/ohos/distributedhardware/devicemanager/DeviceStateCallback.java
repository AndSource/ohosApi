package ohos.distributedhardware.devicemanager;

/* loaded from: ohos3.0.0.1.jar:ohos/distributedhardware/devicemanager/DeviceStateCallback.class */
public interface DeviceStateCallback {
    void onDeviceOffline(DeviceInfo deviceInfo);

    void onDeviceOnline(DeviceInfo deviceInfo);
}
