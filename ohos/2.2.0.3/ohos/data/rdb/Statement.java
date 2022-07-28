package ohos.data.rdb;

public interface Statement {
  void setNull(int paramInt);
  
  void setLong(int paramInt, long paramLong);
  
  void setDouble(int paramInt, double paramDouble);
  
  void setString(int paramInt, String paramString);
  
  void setBlob(int paramInt, byte[] paramArrayOfbyte);
  
  void setStrings(String[] paramArrayOfString);
  
  void setObject(int paramInt, Object paramObject);
  
  void clearValues();
  
  void execute();
  
  long executeAndGetLong();
  
  String executeAndGetString();
  
  int executeAndGetChanges();
  
  long executeAndGetLastInsertRowId();
  
  void close();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/rdb/Statement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */