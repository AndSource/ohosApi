package ohos.bluetooth.ble;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/BleCentralManager.class */
public class BleCentralManager {
    public BleCentralManager(Context context, BleCentralManagerCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void startScan(List<BleScanFilter> filters) {
        throw new RuntimeException("Stub!");
    }

    public void startScan(List<BleScanFilter> filters, int dutyRatio, int matchingMode) {
        throw new RuntimeException("Stub!");
    }

    public void startScan(List<BleScanFilter> filters, int dutyRatio, int matchingMode, long time) {
        throw new RuntimeException("Stub!");
    }

    public void stopScan() {
        throw new RuntimeException("Stub!");
    }

    public List<BlePeripheralDevice> getDevicesByStates(int[] states) {
        throw new RuntimeException("Stub!");
    }
}
