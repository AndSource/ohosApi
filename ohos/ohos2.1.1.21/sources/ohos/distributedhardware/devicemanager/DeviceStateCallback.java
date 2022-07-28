package ohos.distributedhardware.devicemanager;

/* loaded from: ohos2.1.1.21.jar:ohos/distributedhardware/devicemanager/DeviceStateCallback.class */
public interface DeviceStateCallback {
    void onDeviceOffline(DeviceInfo deviceInfo);

    void onDeviceOnline(DeviceInfo deviceInfo);
}
