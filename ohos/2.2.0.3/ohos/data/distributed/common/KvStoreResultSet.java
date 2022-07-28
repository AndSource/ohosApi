package ohos.data.distributed.common;

public interface KvStoreResultSet {
  int getRowCount();
  
  int getRowIndex();
  
  boolean goToFirstRow();
  
  boolean goToLastRow();
  
  boolean goToNextRow();
  
  boolean goToPreviousRow();
  
  boolean skipRow(int paramInt);
  
  boolean goToRow(int paramInt);
  
  boolean isAtFirstRow();
  
  boolean isAtLastRow();
  
  boolean isStarted();
  
  boolean isEnded();
  
  Entry getEntry();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/distributed/common/KvStoreResultSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */