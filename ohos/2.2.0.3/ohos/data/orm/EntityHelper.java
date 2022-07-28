package ohos.data.orm;

import ohos.data.rdb.Statement;
import ohos.data.resultset.ResultSet;

public interface EntityHelper<T> {
  void bindValue(Statement paramStatement, T paramT);
  
  void bindValue(Statement paramStatement, T paramT, long paramLong);
  
  T createInstance(ResultSet paramResultSet);
  
  void setPrimaryKeyValue(T paramT, long paramLong);
  
  String getTableName();
  
  String getInsertStatement();
  
  String getUpdateStatement();
  
  String getDeleteStatement();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/orm/EntityHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */