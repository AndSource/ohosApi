package ohos.distributedschedule.interwork;

import java.util.List;
import ohos.aafwk.content.Intent;
import ohos.bundle.AbilityInfo;
import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/distributedschedule/interwork/DeviceManager.class */
public class DeviceManager {
    DeviceManager() {
        throw new RuntimeException("Stub!");
    }

    public static boolean registerDeviceStateCallback(IDeviceStateCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public static boolean unregisterDeviceStateCallback(IDeviceStateCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public static List<DeviceInfo> getDeviceList(int flag) {
        throw new RuntimeException("Stub!");
    }

    public static DeviceInfo getDeviceInfo(String deviceId) {
        throw new RuntimeException("Stub!");
    }

    public static List<AbilityInfo> queryRemoteAbilityByIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public static void initDistributedEnvironment(String deviceId, IInitCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void unInitDistributedEnvironment(String deviceId, IInitCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
