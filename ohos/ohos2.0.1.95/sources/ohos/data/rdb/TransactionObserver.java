package ohos.data.rdb;

/* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/TransactionObserver.class */
public interface TransactionObserver {
    void onBegin();

    void onCommit();

    void onRollback();
}
