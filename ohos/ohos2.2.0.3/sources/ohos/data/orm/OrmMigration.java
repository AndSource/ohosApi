package ohos.data.orm;

import ohos.data.rdb.RdbStore;

/* loaded from: ohos2.2.0.3.jar:ohos/data/orm/OrmMigration.class */
public abstract class OrmMigration {
    public abstract void onMigrate(RdbStore rdbStore);

    public OrmMigration(int beginVersion, int endVersion) {
        throw new RuntimeException("Stub!");
    }

    public int getBeginVersion() {
        throw new RuntimeException("Stub!");
    }

    public int getEndVersion() {
        throw new RuntimeException("Stub!");
    }
}
