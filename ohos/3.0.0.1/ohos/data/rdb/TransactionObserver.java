package ohos.data.rdb;

public interface TransactionObserver {
  void onBegin();
  
  void onCommit();
  
  void onRollback();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/rdb/TransactionObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */