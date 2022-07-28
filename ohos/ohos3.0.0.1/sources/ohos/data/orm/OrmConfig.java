package ohos.data.orm;

import ohos.data.DatabaseFileSecurityLevel;
import ohos.data.DatabaseFileType;

/* loaded from: ohos3.0.0.1.jar:ohos/data/orm/OrmConfig.class */
public class OrmConfig {
    public static final int MAX_ENCRYPT_KEY_SIZE = 10485760;

    OrmConfig(Builder builder) {
        throw new RuntimeException("Stub!");
    }

    public String getAlias() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getEncryptKey() {
        throw new RuntimeException("Stub!");
    }

    public DatabaseFileType getDatabaseFileType() {
        throw new RuntimeException("Stub!");
    }

    public DatabaseFileSecurityLevel getDatabaseFileSecurityLevel() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/data/orm/OrmConfig$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(OrmConfig ormConfig) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAlias(String alias) {
            throw new RuntimeException("Stub!");
        }

        public Builder setName(String name) {
            throw new RuntimeException("Stub!");
        }

        public Builder setEncryptKey(byte[] encryptKey) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDatabaseFileType(DatabaseFileType databaseFileType) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDatabaseFileSecurityLevel(DatabaseFileSecurityLevel databaseFileSecurityLevel) {
            throw new RuntimeException("Stub!");
        }

        public OrmConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
