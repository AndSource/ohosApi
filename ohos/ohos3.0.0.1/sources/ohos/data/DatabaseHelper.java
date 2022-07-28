package ohos.data;

import ohos.app.Context;
import ohos.data.orm.OrmConfig;
import ohos.data.orm.OrmContext;
import ohos.data.orm.OrmDatabase;
import ohos.data.orm.OrmMigration;
import ohos.data.preferences.Preferences;
import ohos.data.rdb.RdbOpenCallback;
import ohos.data.rdb.RdbStore;
import ohos.data.rdb.StoreConfig;
import ohos.data.resultset.ResultSetHook;

/* loaded from: ohos3.0.0.1.jar:ohos/data/DatabaseHelper.class */
public class DatabaseHelper {
    public DatabaseHelper(Context context) {
        throw new RuntimeException("Stub!");
    }

    public RdbStore getRdbStore(StoreConfig config, int version, RdbOpenCallback openCallback) {
        throw new RuntimeException("Stub!");
    }

    public RdbStore getRdbStore(StoreConfig config, int version, RdbOpenCallback openCallback, ResultSetHook resultSetHook) {
        throw new RuntimeException("Stub!");
    }

    public <T extends OrmDatabase> OrmContext getOrmContext(String alias, String name, Class<T> ormDatabase, OrmMigration... migrations) {
        throw new RuntimeException("Stub!");
    }

    public <T extends OrmDatabase> OrmContext getOrmContext(OrmConfig ormConfig, Class<T> ormDatabase, OrmMigration... migrations) {
        throw new RuntimeException("Stub!");
    }

    public OrmContext getOrmContext(String alias) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteRdbStore(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteRdbStore(DatabaseFileConfig fileConfig) {
        throw new RuntimeException("Stub!");
    }

    public static int releaseRdbMemory() {
        throw new RuntimeException("Stub!");
    }

    public Preferences getPreferences(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean deletePreferences(String name) {
        throw new RuntimeException("Stub!");
    }

    public void removePreferencesFromCache(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean movePreferences(Context sourceContext, String sourceName, String targetName) {
        throw new RuntimeException("Stub!");
    }

    public boolean moveDatabase(Context srcContext, String srcName, String destName) {
        throw new RuntimeException("Stub!");
    }
}
