package ohos.data.objectstore.callbacks;

import ohos.data.objectstore.DataObject;

/* loaded from: ohos3.0.0.1.jar:ohos/data/objectstore/callbacks/CreateCallback.class */
public interface CreateCallback<T extends DataObject> {
    void onFinished(int i, String str, T t);
}
