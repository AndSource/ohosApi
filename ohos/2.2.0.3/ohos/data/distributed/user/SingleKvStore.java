package ohos.data.distributed.user;

import java.util.List;
import ohos.data.distributed.common.Entry;
import ohos.data.distributed.common.KvStore;
import ohos.data.distributed.common.KvStoreException;
import ohos.data.distributed.common.KvStoreResultSet;
import ohos.data.distributed.common.Query;
import ohos.data.distributed.common.SecurityLevel;
import ohos.data.distributed.common.SyncCallback;
import ohos.data.distributed.common.SyncMode;

public interface SingleKvStore extends KvStore {
  boolean getBoolean(String paramString) throws KvStoreException;
  
  int getInt(String paramString) throws KvStoreException;
  
  float getFloat(String paramString) throws KvStoreException;
  
  double getDouble(String paramString) throws KvStoreException;
  
  String getString(String paramString) throws KvStoreException;
  
  byte[] getByteArray(String paramString) throws KvStoreException;
  
  List<Entry> getEntries(String paramString) throws KvStoreException;
  
  List<Entry> getEntries(Query paramQuery) throws KvStoreException;
  
  KvStoreResultSet getResultSet(String paramString) throws KvStoreException;
  
  KvStoreResultSet getResultSet(Query paramQuery) throws KvStoreException;
  
  void closeResultSet(KvStoreResultSet paramKvStoreResultSet) throws KvStoreException;
  
  int getResultSize(Query paramQuery) throws KvStoreException;
  
  void sync(List<String> paramList, SyncMode paramSyncMode) throws KvStoreException;
  
  void sync(List<String> paramList, SyncMode paramSyncMode, int paramInt) throws KvStoreException;
  
  void removeDeviceData(String paramString) throws KvStoreException;
  
  void registerSyncCallback(SyncCallback paramSyncCallback) throws KvStoreException;
  
  void unRegisterSyncCallback() throws KvStoreException;
  
  void setSyncParam(int paramInt) throws KvStoreException;
  
  SecurityLevel getSecurityLevel() throws KvStoreException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/distributed/user/SingleKvStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */