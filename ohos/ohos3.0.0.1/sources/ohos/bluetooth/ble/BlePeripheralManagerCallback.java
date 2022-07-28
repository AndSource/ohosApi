package ohos.bluetooth.ble;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/ble/BlePeripheralManagerCallback.class */
public abstract class BlePeripheralManagerCallback {
    public BlePeripheralManagerCallback() {
        throw new RuntimeException("Stub!");
    }

    public void receiveCharacteristicReadEvent(BlePeripheralDevice device, int transId, int offset, GattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }

    public void receiveCharacteristicWriteEvent(BlePeripheralDevice device, int transId, GattCharacteristic characteristic, boolean isPrep, boolean needRsp, int offset, byte[] value) {
        throw new RuntimeException("Stub!");
    }

    public void connectionStateChangeEvent(BlePeripheralDevice device, int interval, int latency, int timeout, int status) {
        throw new RuntimeException("Stub!");
    }

    public void receiveDescriptorReadEvent(BlePeripheralDevice device, int transId, int offset, GattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public void receiveDescriptorWriteRequestEvent(BlePeripheralDevice device, int transId, GattDescriptor descriptor, boolean isPrep, boolean needRsp, int offset, byte[] value) {
        throw new RuntimeException("Stub!");
    }

    public void executeWriteEvent(BlePeripheralDevice device, int transId, boolean execute) {
        throw new RuntimeException("Stub!");
    }

    public void mtuUpdateEvent(BlePeripheralDevice device, int mtu) {
        throw new RuntimeException("Stub!");
    }

    public void notificationSentEvent(BlePeripheralDevice device, int status) {
        throw new RuntimeException("Stub!");
    }

    public void serviceAddedEvent(int status, GattService service) {
        throw new RuntimeException("Stub!");
    }
}
