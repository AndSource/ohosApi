package ohos.data.objectstore.model;

import java.util.Map;

public interface ManagedDataObject {
  void setDirtyField(String paramString, Object paramObject);
  
  Map<String, Object> getDirtyFields();
  
  void resetDirtyFields();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/objectstore/model/ManagedDataObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */