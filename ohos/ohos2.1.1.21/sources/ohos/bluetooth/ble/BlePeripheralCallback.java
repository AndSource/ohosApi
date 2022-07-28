package ohos.bluetooth.ble;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/ble/BlePeripheralCallback.class */
public abstract class BlePeripheralCallback {
    public BlePeripheralCallback() {
        throw new RuntimeException("Stub!");
    }

    public void servicesDiscoveredEvent(int status) {
        throw new RuntimeException("Stub!");
    }

    public void connectionStateChangeEvent(int connectionState) {
        throw new RuntimeException("Stub!");
    }

    public void characteristicReadEvent(GattCharacteristic characteristic, int ret) {
        throw new RuntimeException("Stub!");
    }

    public void characteristicWriteEvent(GattCharacteristic characteristic, int ret) {
        throw new RuntimeException("Stub!");
    }

    public void characteristicChangedEvent(GattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }

    public void descriptorReadEvent(GattDescriptor descriptor, int ret) {
        throw new RuntimeException("Stub!");
    }

    public void descriptorWriteEvent(GattDescriptor descriptor, int ret) {
        throw new RuntimeException("Stub!");
    }

    public void readRemoteRssiEvent(int rssi, int ret) {
        throw new RuntimeException("Stub!");
    }

    public void mtuUpdateEvent(int mtu, int ret) {
        throw new RuntimeException("Stub!");
    }
}
