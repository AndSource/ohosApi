package ohos.data.distributed.common;

/* loaded from: ohos2.1.1.21.jar:ohos/data/distributed/common/KvStoreObserver.class */
public interface KvStoreObserver {
    default void onChange(ChangeNotification changeNotification) {
        throw new RuntimeException("Stub!");
    }
}
