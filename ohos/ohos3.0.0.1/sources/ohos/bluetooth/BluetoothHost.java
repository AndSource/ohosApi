package ohos.bluetooth;

import java.util.List;
import java.util.Optional;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/BluetoothHost.class */
public final class BluetoothHost {
    public static final int BLE_CAP_2M_PHY = 1;
    public static final int BLE_CAP_CODED_PHY = 2;
    public static final int BLE_CAP_EXTENDED_ADV = 4;
    public static final int BLE_CAP_MULTIPLE_ADV = 16;
    public static final int BLE_CAP_OFFLOADED_FILTER = 32;
    public static final int BLE_CAP_OFFLOADED_SCAN_BATCH = 64;
    public static final int BLE_CAP_PERIODIC_ADV = 8;
    public static final String EVENT_HOST_DISCOVERY_FINISHED = "usual.event.bluetooth.host.DISCOVERY_FINISHED";
    public static final String EVENT_HOST_DISCOVERY_STARTED = "usual.event.bluetooth.host.DISCOVERY_STARTED";
    public static final String EVENT_HOST_NAME_UPDATE = "usual.event.bluetooth.host.NAME_UPDATE";
    public static final String EVENT_HOST_SCAN_MODE_UPDATE = "usual.event.bluetooth.host.SCAN_MODE_UPDATE";
    public static final String EVENT_HOST_STATE_UPDATE = "usual.event.bluetooth.host.STATE_UPDATE";
    public static final String HOST_PARAM_CUR_STATE = "usual.event.bluetoothhost.PARAM_CUR_STATE";
    public static final String HOST_PARAM_DISCOVERABLE_TERM = "usual.event.bluetoothhost.PARAM_DISCOVERABLE_TERM";
    public static final String HOST_PARAM_HOST_NAME = "usual.event.bluetoothhost.PARAM_HOST_NAME";
    public static final String HOST_PARAM_PRE_STATE = "usual.event.bluetoothhost.PARAM_PRE_STATE";
    public static final String HOST_PARAM_SCAN_METHOD = "usual.event.bluetoothhost.PARAM_SCAN_METHOD";
    public static final int SCAN_MODE_CONNECTABLE = 1;
    public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 3;
    public static final int SCAN_MODE_NONE = 0;
    public static final int STATE_BLE_ON = 5;
    public static final int STATE_BLE_TURNING_OFF = 6;
    public static final int STATE_BLE_TURNING_ON = 4;
    public static final int STATE_OFF = 0;
    public static final int STATE_ON = 2;
    public static final int STATE_TURNING_OFF = 3;
    public static final int STATE_TURNING_ON = 1;

    BluetoothHost(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized BluetoothHost getDefaultHost(Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableBt() {
        throw new RuntimeException("Stub!");
    }

    public boolean disableBt() {
        throw new RuntimeException("Stub!");
    }

    public int getBtState() {
        throw new RuntimeException("Stub!");
    }

    public BluetoothRemoteDevice getRemoteDev(String addr) {
        throw new RuntimeException("Stub!");
    }

    public Optional<String> getLocalName() {
        throw new RuntimeException("Stub!");
    }

    public boolean setLocalName(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean startBtDiscovery() {
        throw new RuntimeException("Stub!");
    }

    public boolean cancelBtDiscovery() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBtDiscovering() {
        throw new RuntimeException("Stub!");
    }

    public int getBtScanMode() {
        throw new RuntimeException("Stub!");
    }

    public int getProfileConnState(int profile) {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothRemoteDevice> getPairedDevices() {
        throw new RuntimeException("Stub!");
    }

    public int getBleCapabilities() {
        throw new RuntimeException("Stub!");
    }

    public int getBleMaxAdvertisingDataLength() {
        throw new RuntimeException("Stub!");
    }

    public boolean setBtScanMode(int mode, int duration) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDevicePairingConfirmation(BluetoothRemoteDevice device, boolean accept) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isValidBluetoothAddr(String addr) {
        throw new RuntimeException("Stub!");
    }
}
