package ohos.bluetooth.ble;

import java.util.List;

public interface BleCentralManagerCallback {
  void scanResultEvent(BleScanResult paramBleScanResult);
  
  void scanFailedEvent(int paramInt);
  
  void groupScanResultsEvent(List<BleScanResult> paramList);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/ble/BleCentralManagerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */