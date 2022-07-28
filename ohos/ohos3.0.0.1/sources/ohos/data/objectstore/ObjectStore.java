package ohos.data.objectstore;

import ohos.data.objectstore.callbacks.CreateCallback;
import ohos.data.objectstore.callbacks.DeleteCallback;

/* loaded from: ohos3.0.0.1.jar:ohos/data/objectstore/ObjectStore.class */
public interface ObjectStore {
    <T extends DataObject> void create(Class<T> cls, String str, CreateCallback<T> createCallback) throws StoreException;

    void delete(DataObject dataObject, DeleteCallback deleteCallback);

    <T extends DataObject> void watch(T t, ObjectWatcher objectWatcher);

    <T extends DataObject> void unwatch(T t, ObjectWatcher objectWatcher);

    void sync();

    <T extends DataObject> void put(T t) throws StoreException;

    <T extends DataObject> T get(Class<T> cls, String str) throws StoreException;

    String getSessionId();

    void close();
}
