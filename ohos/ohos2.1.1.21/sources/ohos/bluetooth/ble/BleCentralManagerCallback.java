package ohos.bluetooth.ble;

import java.util.List;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/ble/BleCentralManagerCallback.class */
public interface BleCentralManagerCallback {
    void scanResultEvent(BleScanResult bleScanResult);

    void scanFailedEvent(int i);

    void groupScanResultsEvent(List<BleScanResult> list);
}
