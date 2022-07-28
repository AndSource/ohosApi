package ohos.data.objectstore;

/* loaded from: ohos3.0.0.1.jar:ohos/data/objectstore/ObjectWatcher.class */
public interface ObjectWatcher {
    void onChanged(String str);

    void onDeleted(String str);
}
