package ohos.bluetooth.ble;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/BlePeripheralDevice.class */
public class BlePeripheralDevice {
    public static final int CONNECTION_PRIORITY_HIGH = 1;
    public static final int CONNECTION_PRIORITY_LOW = 2;
    public static final int CONNECTION_PRIORITY_NORMAL = 0;
    public static final int OPERATION_SUCC = 0;

    BlePeripheralDevice(String address) {
        throw new RuntimeException("Stub!");
    }

    public boolean connect(boolean isAutoConnect, BlePeripheralCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean discoverServices() {
        throw new RuntimeException("Stub!");
    }

    public List<GattService> getServices() {
        throw new RuntimeException("Stub!");
    }

    public Optional<GattService> getService(UUID uuid) {
        throw new RuntimeException("Stub!");
    }

    public boolean disconnect() {
        throw new RuntimeException("Stub!");
    }

    public boolean close() {
        throw new RuntimeException("Stub!");
    }

    public boolean readCharacteristic(GattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }

    public boolean writeCharacteristic(GattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }

    public boolean setNotifyCharacteristic(GattCharacteristic characteristic, boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean readDescriptor(GattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public boolean writeDescriptor(GattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public boolean readRemoteRssiValue() {
        throw new RuntimeException("Stub!");
    }

    public boolean requestBleConnectionPriority(int connPriority) {
        throw new RuntimeException("Stub!");
    }

    public boolean requestBleMtuSize(int mtu) {
        throw new RuntimeException("Stub!");
    }
}
