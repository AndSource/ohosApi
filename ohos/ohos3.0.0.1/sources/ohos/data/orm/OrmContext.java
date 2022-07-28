package ohos.data.orm;

import java.util.List;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;

/* loaded from: ohos3.0.0.1.jar:ohos/data/orm/OrmContext.class */
public interface OrmContext extends AutoCloseable {
    <T extends OrmObject> boolean insert(T t);

    <T extends OrmObject> boolean update(T t);

    <T extends OrmObject> boolean delete(T t);

    <T extends OrmObject> OrmPredicates where(Class<T> cls);

    <T extends OrmObject> List<T> query(OrmPredicates ormPredicates);

    ResultSet query(OrmPredicates ormPredicates, String[] strArr);

    int delete(OrmPredicates ormPredicates);

    int update(OrmPredicates ormPredicates, ValuesBucket valuesBucket);

    Long count(OrmPredicates ormPredicates);

    Double max(OrmPredicates ormPredicates, String str);

    Double min(OrmPredicates ormPredicates, String str);

    Double avg(OrmPredicates ormPredicates, String str);

    Double sum(OrmPredicates ormPredicates, String str);

    boolean flush();

    void beginTransaction();

    void commit();

    boolean isInTransaction();

    void rollback();

    String getAlias();

    void changeEncryptKey(byte[] bArr);

    @Override // java.lang.AutoCloseable
    void close();

    boolean backup(String str);

    boolean restore(String str);

    boolean backup(String str, byte[] bArr);

    boolean restore(String str, byte[] bArr, byte[] bArr2);

    void registerStoreObserver(String str, OrmObjectObserver ormObjectObserver);

    void registerContextObserver(OrmContext ormContext, OrmObjectObserver ormObjectObserver);

    void registerEntityObserver(String str, OrmObjectObserver ormObjectObserver);

    void registerObjectObserver(OrmObject ormObject, OrmObjectObserver ormObjectObserver);

    void unregisterStoreObserver(String str, OrmObjectObserver ormObjectObserver);

    void unregisterContextObserver(OrmContext ormContext, OrmObjectObserver ormObjectObserver);

    void unregisterEntityObserver(String str, OrmObjectObserver ormObjectObserver);

    void unregisterObjectObserver(OrmObject ormObject, OrmObjectObserver ormObjectObserver);
}
