package ohos.data.orm;

import java.io.File;
import ohos.data.rdb.RdbOpenCallback;

/* loaded from: ohos2.1.1.21.jar:ohos/data/orm/OrmDatabase.class */
public abstract class OrmDatabase {
    public abstract int getVersion();

    public abstract RdbOpenCallback getHelper();

    public OrmDatabase() {
        throw new RuntimeException("Stub!");
    }

    public void corruptionHandler(File databaseFile) {
        throw new RuntimeException("Stub!");
    }
}
