package ohos.data.distributed.common;

import java.util.List;

public interface KvStore {
  public static final int MAX_BATCH_SIZE = 128;
  
  public static final int MAX_KEY_LENGTH = 1024;
  
  public static final int MAX_KEY_LENGTH_DEVICE = 896;
  
  public static final int MAX_QUERY_LENGTH = 512000;
  
  public static final int MAX_STORE_ID_LENGTH = 128;
  
  public static final int MAX_VALUE_LENGTH = 4194303;
  
  String getStoreId() throws KvStoreException;
  
  void putBoolean(String paramString, boolean paramBoolean) throws KvStoreException;
  
  void putInt(String paramString, int paramInt) throws KvStoreException;
  
  void putFloat(String paramString, float paramFloat) throws KvStoreException;
  
  void putDouble(String paramString, double paramDouble) throws KvStoreException;
  
  void putString(String paramString1, String paramString2) throws KvStoreException;
  
  void putByteArray(String paramString, byte[] paramArrayOfbyte) throws KvStoreException;
  
  void delete(String paramString) throws KvStoreException;
  
  void subscribe(SubscribeType paramSubscribeType, KvStoreObserver paramKvStoreObserver) throws KvStoreException;
  
  void unSubscribe(KvStoreObserver paramKvStoreObserver) throws KvStoreException;
  
  void putBatch(List<Entry> paramList) throws KvStoreException;
  
  void deleteBatch(List<String> paramList) throws KvStoreException;
  
  void startTransaction() throws KvStoreException;
  
  void commit() throws KvStoreException;
  
  void rollback() throws KvStoreException;
  
  void enableSync(boolean paramBoolean) throws KvStoreException;
  
  void setSyncRange(List<String> paramList1, List<String> paramList2) throws KvStoreException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/data/distributed/common/KvStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */