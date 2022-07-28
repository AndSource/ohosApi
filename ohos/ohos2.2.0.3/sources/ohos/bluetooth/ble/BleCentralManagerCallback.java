package ohos.bluetooth.ble;

import java.util.List;

/* loaded from: ohos2.2.0.3.jar:ohos/bluetooth/ble/BleCentralManagerCallback.class */
public interface BleCentralManagerCallback {
    void scanResultEvent(BleScanResult bleScanResult);

    void scanFailedEvent(int i);

    void groupScanResultsEvent(List<BleScanResult> list);
}
