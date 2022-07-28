package ohos.bluetooth.ble;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/ble/BlePeripheralManager.class */
public class BlePeripheralManager {
    public BlePeripheralManager(Context context, BlePeripheralManagerCallback callback, int transport) {
        throw new RuntimeException("Stub!");
    }

    public synchronized List<GattService> getServices() {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean addService(GattService service) {
        throw new RuntimeException("Stub!");
    }

    public void cancelConnection(BlePeripheralDevice device) {
        throw new RuntimeException("Stub!");
    }

    public void close() {
        throw new RuntimeException("Stub!");
    }

    public void clearServices() {
        throw new RuntimeException("Stub!");
    }

    public List<BlePeripheralDevice> getDevicesByStates(int[] states) {
        throw new RuntimeException("Stub!");
    }

    public boolean notifyCharacteristicChanged(BlePeripheralDevice device, GattCharacteristic characteristic, boolean confirm) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeGattService(GattService service) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendResponse(BlePeripheralDevice device, int requestId, int status, int offset, byte[] value) {
        throw new RuntimeException("Stub!");
    }
}
