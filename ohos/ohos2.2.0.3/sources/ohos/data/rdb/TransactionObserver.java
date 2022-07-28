package ohos.data.rdb;

/* loaded from: ohos2.2.0.3.jar:ohos/data/rdb/TransactionObserver.class */
public interface TransactionObserver {
    void onBegin();

    void onCommit();

    void onRollback();
}
