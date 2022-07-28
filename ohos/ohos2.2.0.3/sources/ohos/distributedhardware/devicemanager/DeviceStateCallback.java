package ohos.distributedhardware.devicemanager;

/* loaded from: ohos2.2.0.3.jar:ohos/distributedhardware/devicemanager/DeviceStateCallback.class */
public interface DeviceStateCallback {
    void onDeviceOffline(DeviceInfo deviceInfo);

    void onDeviceOnline(DeviceInfo deviceInfo);
}
