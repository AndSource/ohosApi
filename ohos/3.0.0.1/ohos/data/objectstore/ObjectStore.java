package ohos.data.objectstore;

import ohos.data.objectstore.callbacks.CreateCallback;
import ohos.data.objectstore.callbacks.DeleteCallback;

public interface ObjectStore {
  <T extends DataObject> void create(Class<T> paramClass, String paramString, CreateCallback<T> paramCreateCallback) throws StoreException;
  
  void delete(DataObject paramDataObject, DeleteCallback paramDeleteCallback);
  
  <T extends DataObject> void watch(T paramT, ObjectWatcher paramObjectWatcher);
  
  <T extends DataObject> void unwatch(T paramT, ObjectWatcher paramObjectWatcher);
  
  void sync();
  
  <T extends DataObject> void put(T paramT) throws StoreException;
  
  <T extends DataObject> T get(Class<T> paramClass, String paramString) throws StoreException;
  
  String getSessionId();
  
  void close();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/objectstore/ObjectStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */