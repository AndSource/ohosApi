package ohos.wifi.p2p;

import ohos.app.Context;
import ohos.eventhandler.EventRunner;
import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.0.1.95.jar:ohos/wifi/p2p/WifiP2pController.class */
public final class WifiP2pController {
    public static final int DEVICE_INFO_REQUEST = 2;
    public static final int DEVICE_LIST_REQUEST = 6;
    public static final int GROUP_INFO_REQUEST = 1;
    public static final int NETWORK_INFO_REQUEST = 4;

    WifiP2pController(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static WifiP2pController getInstance(Context context) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public IRemoteObject init(EventRunner eventRunner, WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void discoverDevices(WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void stopDeviceDiscovery(WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void createGroup(WifiP2pConfig wifiP2pConfig, WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void removeGroup(WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void requestP2pInfo(int requestType, WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void connect(WifiP2pConfig wifiP2pConfig, WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void cancelConnect(WifiP2pCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
