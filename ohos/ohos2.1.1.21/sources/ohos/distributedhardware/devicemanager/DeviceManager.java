package ohos.distributedhardware.devicemanager;

import java.util.List;
import java.util.Map;

/* loaded from: ohos2.1.1.21.jar:ohos/distributedhardware/devicemanager/DeviceManager.class */
public class DeviceManager {
    public static final String SIFT_FILTER = "siftFilter";
    public static final String SORT_TYPE = "sortType";
    public static final String TARGET_PACKAGE_NAME = "targetPkgName";

    /* loaded from: ohos2.1.1.21.jar:ohos/distributedhardware/devicemanager/DeviceManager$DeviceManagerCallback.class */
    public interface DeviceManagerCallback {
        void onGet(DeviceManager deviceManager);

        void onDied();
    }

    DeviceManager() {
        throw new RuntimeException("Stub!");
    }

    public static synchronized int createInstance(DeviceManagerCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized void releaseInstance() {
        throw new RuntimeException("Stub!");
    }

    public List<DeviceInfo> getTrustedDeviceList(String bundleName, Map<String, Object> extras) throws SecurityException {
        throw new RuntimeException("Stub!");
    }

    public int selectDeviceList(String bundleName, Map<String, Object> extras, SelectDeviceListListener listener) throws SecurityException {
        throw new RuntimeException("Stub!");
    }

    public DeviceInfo getLocalDeviceInfo() throws SecurityException {
        throw new RuntimeException("Stub!");
    }

    public int registerDeviceStateCallback(String bundleName, Map<String, Object> extras, DeviceStateCallback callback) throws SecurityException {
        throw new RuntimeException("Stub!");
    }

    public int unregisterDeviceStateCallback(String bundleName, DeviceStateCallback callback) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
}
