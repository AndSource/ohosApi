package ohos.data.resultset;

public interface SharedResultSet extends ResultSet {
  SharedBlock getBlock();
  
  void fillBlock(int paramInt, SharedBlock paramSharedBlock);
  
  boolean onGo(int paramInt1, int paramInt2);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/resultset/SharedResultSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */