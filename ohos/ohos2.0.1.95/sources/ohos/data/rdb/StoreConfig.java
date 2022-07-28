package ohos.data.rdb;

import ohos.data.DatabaseFileType;

/* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/StoreConfig.class */
public class StoreConfig {
    public static final int MAX_ENCRYPT_KEY_SIZE = 1024;

    StoreConfig(Builder builder) {
        throw new RuntimeException("Stub!");
    }

    public static StoreConfig newDefaultConfig(String name) {
        throw new RuntimeException("Stub!");
    }

    public static StoreConfig newMemoryConfig() {
        throw new RuntimeException("Stub!");
    }

    public static StoreConfig newReadOnlyConfig(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public StorageMode getStorageMode() {
        throw new RuntimeException("Stub!");
    }

    public JournalMode getJournalMode() {
        throw new RuntimeException("Stub!");
    }

    public SyncMode getSyncMode() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getEncryptKey() {
        throw new RuntimeException("Stub!");
    }

    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }

    public DatabaseFileType getDatabaseFileType() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/StoreConfig$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(StoreConfig storeConfig) {
            throw new RuntimeException("Stub!");
        }

        public Builder setName(String name) {
            throw new RuntimeException("Stub!");
        }

        public Builder setStorageMode(StorageMode storageMode) {
            throw new RuntimeException("Stub!");
        }

        public Builder setJournalMode(JournalMode journalMode) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSyncMode(SyncMode syncMode) {
            throw new RuntimeException("Stub!");
        }

        public Builder setEncryptKey(byte[] encryptKey) {
            throw new RuntimeException("Stub!");
        }

        public Builder setReadOnly(boolean isReadOnly) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDatabaseFileType(DatabaseFileType databaseFileType) {
            throw new RuntimeException("Stub!");
        }

        public StoreConfig build() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/StoreConfig$JournalMode.class */
    public enum JournalMode {
        MODE_DELETE,
        MODE_TRUNCATE,
        MODE_PERSIST,
        MODE_MEMORY,
        MODE_WAL,
        MODE_OFF;

        public String getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/StoreConfig$StorageMode.class */
    public enum StorageMode {
        MODE_MEMORY,
        MODE_DISK;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/data/rdb/StoreConfig$SyncMode.class */
    public enum SyncMode {
        MODE_OFF,
        MODE_NORMAL,
        MODE_FULL,
        MODE_EXTRA;

        public String getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
