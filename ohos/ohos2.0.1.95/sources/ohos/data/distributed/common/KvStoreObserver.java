package ohos.data.distributed.common;

/* loaded from: ohos2.0.1.95.jar:ohos/data/distributed/common/KvStoreObserver.class */
public interface KvStoreObserver {
    default void onChange(ChangeNotification changeNotification) {
        throw new RuntimeException("Stub!");
    }
}
