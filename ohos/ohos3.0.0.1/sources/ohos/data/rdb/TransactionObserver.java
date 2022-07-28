package ohos.data.rdb;

/* loaded from: ohos3.0.0.1.jar:ohos/data/rdb/TransactionObserver.class */
public interface TransactionObserver {
    void onBegin();

    void onCommit();

    void onRollback();
}
