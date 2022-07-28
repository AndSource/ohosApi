package ohos.data.distributed.common;

/* loaded from: ohos3.0.0.1.jar:ohos/data/distributed/common/KvStoreObserver.class */
public interface KvStoreObserver {
    default void onChange(ChangeNotification changeNotification) {
        throw new RuntimeException("Stub!");
    }
}
