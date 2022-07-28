package ohos.data.distributed.device;

import java.util.List;
import ohos.data.distributed.common.Entry;
import ohos.data.distributed.common.KvStore;
import ohos.data.distributed.common.KvStoreException;
import ohos.data.distributed.common.KvStoreResultSet;
import ohos.data.distributed.common.Query;
import ohos.data.distributed.common.SyncCallback;
import ohos.data.distributed.common.SyncMode;

public interface DeviceKvStore extends KvStore {
  boolean getBoolean(String paramString1, String paramString2) throws KvStoreException;
  
  int getInt(String paramString1, String paramString2) throws KvStoreException;
  
  float getFloat(String paramString1, String paramString2) throws KvStoreException;
  
  double getDouble(String paramString1, String paramString2) throws KvStoreException;
  
  String getString(String paramString1, String paramString2) throws KvStoreException;
  
  byte[] getByteArray(String paramString1, String paramString2) throws KvStoreException;
  
  List<Entry> getEntries(String paramString1, String paramString2) throws KvStoreException;
  
  List<Entry> getEntries(Query paramQuery) throws KvStoreException;
  
  List<Entry> getEntries(String paramString, Query paramQuery) throws KvStoreException;
  
  KvStoreResultSet getResultSet(String paramString1, String paramString2) throws KvStoreException;
  
  KvStoreResultSet getResultSet(Query paramQuery) throws KvStoreException;
  
  KvStoreResultSet getResultSet(String paramString, Query paramQuery) throws KvStoreException;
  
  void closeResultSet(KvStoreResultSet paramKvStoreResultSet) throws KvStoreException;
  
  int getResultSize(Query paramQuery) throws KvStoreException;
  
  int getResultSize(String paramString, Query paramQuery) throws KvStoreException;
  
  void sync(List<String> paramList, SyncMode paramSyncMode) throws KvStoreException;
  
  void removeDeviceData(String paramString) throws KvStoreException;
  
  void registerSyncCallback(SyncCallback paramSyncCallback) throws KvStoreException;
  
  void unRegisterSyncCallback() throws KvStoreException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/distributed/device/DeviceKvStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */