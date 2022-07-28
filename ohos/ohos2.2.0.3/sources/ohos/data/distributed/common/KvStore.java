package ohos.data.distributed.common;

import java.util.List;

/* loaded from: ohos2.2.0.3.jar:ohos/data/distributed/common/KvStore.class */
public interface KvStore {
    public static final int MAX_BATCH_SIZE = 128;
    public static final int MAX_KEY_LENGTH = 1024;
    public static final int MAX_KEY_LENGTH_DEVICE = 896;
    public static final int MAX_QUERY_LENGTH = 512000;
    public static final int MAX_STORE_ID_LENGTH = 128;
    public static final int MAX_VALUE_LENGTH = 4194303;

    String getStoreId() throws KvStoreException;

    void putBoolean(String str, boolean z) throws KvStoreException;

    void putInt(String str, int i) throws KvStoreException;

    void putFloat(String str, float f) throws KvStoreException;

    void putDouble(String str, double d) throws KvStoreException;

    void putString(String str, String str2) throws KvStoreException;

    void putByteArray(String str, byte[] bArr) throws KvStoreException;

    void delete(String str) throws KvStoreException;

    void subscribe(SubscribeType subscribeType, KvStoreObserver kvStoreObserver) throws KvStoreException;

    void unSubscribe(KvStoreObserver kvStoreObserver) throws KvStoreException;

    void putBatch(List<Entry> list) throws KvStoreException;

    void deleteBatch(List<String> list) throws KvStoreException;

    void startTransaction() throws KvStoreException;

    void commit() throws KvStoreException;

    void rollback() throws KvStoreException;

    void enableSync(boolean z) throws KvStoreException;

    void setSyncRange(List<String> list, List<String> list2) throws KvStoreException;
}
