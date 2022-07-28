package ohos.data.rdb;

/* loaded from: ohos2.1.1.21.jar:ohos/data/rdb/TransactionObserver.class */
public interface TransactionObserver {
    void onBegin();

    void onCommit();

    void onRollback();
}
