package ohos.data.distributed.common;

import java.util.List;
import ohos.data.distributed.device.DeviceChangeCallback;
import ohos.data.distributed.device.DeviceFilterStrategy;
import ohos.data.distributed.device.DeviceInfo;

public interface KvManager {
  <KVSTORE extends KvStore> KVSTORE getKvStore(Options paramOptions, String paramString) throws KvStoreException;
  
  void closeKvStore(KvStore paramKvStore) throws KvStoreException;
  
  void deleteKvStore(String paramString) throws KvStoreException;
  
  List<String> getAllKvStoreId() throws KvStoreException;
  
  List<DeviceInfo> getConnectedDevicesInfo(DeviceFilterStrategy paramDeviceFilterStrategy) throws KvStoreException;
  
  DeviceInfo getLocalDeviceInfo() throws KvStoreException;
  
  void registerDeviceChangeCallback(DeviceChangeCallback paramDeviceChangeCallback, DeviceFilterStrategy paramDeviceFilterStrategy) throws KvStoreException;
  
  void unRegisterDeviceChangeCallback(DeviceChangeCallback paramDeviceChangeCallback) throws KvStoreException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/distributed/common/KvManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */