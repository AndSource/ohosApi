package ohos.data.orm;

import java.util.List;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;

public interface OrmContext extends AutoCloseable {
  <T extends OrmObject> boolean insert(T paramT);
  
  <T extends OrmObject> boolean update(T paramT);
  
  <T extends OrmObject> boolean delete(T paramT);
  
  <T extends OrmObject> OrmPredicates where(Class<T> paramClass);
  
  <T extends OrmObject> List<T> query(OrmPredicates paramOrmPredicates);
  
  ResultSet query(OrmPredicates paramOrmPredicates, String[] paramArrayOfString);
  
  int delete(OrmPredicates paramOrmPredicates);
  
  int update(OrmPredicates paramOrmPredicates, ValuesBucket paramValuesBucket);
  
  Long count(OrmPredicates paramOrmPredicates);
  
  Double max(OrmPredicates paramOrmPredicates, String paramString);
  
  Double min(OrmPredicates paramOrmPredicates, String paramString);
  
  Double avg(OrmPredicates paramOrmPredicates, String paramString);
  
  Double sum(OrmPredicates paramOrmPredicates, String paramString);
  
  boolean flush();
  
  void beginTransaction();
  
  void commit();
  
  boolean isInTransaction();
  
  void rollback();
  
  String getAlias();
  
  void changeEncryptKey(byte[] paramArrayOfbyte);
  
  void close();
  
  boolean backup(String paramString);
  
  boolean restore(String paramString);
  
  boolean backup(String paramString, byte[] paramArrayOfbyte);
  
  boolean restore(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  void registerStoreObserver(String paramString, OrmObjectObserver paramOrmObjectObserver);
  
  void registerContextObserver(OrmContext paramOrmContext, OrmObjectObserver paramOrmObjectObserver);
  
  void registerEntityObserver(String paramString, OrmObjectObserver paramOrmObjectObserver);
  
  void registerObjectObserver(OrmObject paramOrmObject, OrmObjectObserver paramOrmObjectObserver);
  
  void unregisterStoreObserver(String paramString, OrmObjectObserver paramOrmObjectObserver);
  
  void unregisterContextObserver(OrmContext paramOrmContext, OrmObjectObserver paramOrmObjectObserver);
  
  void unregisterEntityObserver(String paramString, OrmObjectObserver paramOrmObjectObserver);
  
  void unregisterObjectObserver(OrmObject paramOrmObject, OrmObjectObserver paramOrmObjectObserver);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/orm/OrmContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */