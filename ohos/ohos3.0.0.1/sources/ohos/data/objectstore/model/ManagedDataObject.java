package ohos.data.objectstore.model;

import java.util.Map;

/* loaded from: ohos3.0.0.1.jar:ohos/data/objectstore/model/ManagedDataObject.class */
public interface ManagedDataObject {
    void setDirtyField(String str, Object obj);

    Map<String, Object> getDirtyFields();

    void resetDirtyFields();
}
