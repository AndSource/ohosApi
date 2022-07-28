package ohos.data.distributed.common;

/* loaded from: ohos2.1.1.21.jar:ohos/data/distributed/common/KvStoreErrorCode.class */
public enum KvStoreErrorCode {
    SUCCESS,
    INVALID_ARGUMENT,
    SERVER_UNAVAILABLE,
    STORE_NOT_OPEN,
    STORE_NOT_FOUND,
    STORE_ALREADY_SUBSCRIBE,
    STORE_NOT_SUBSCRIBE,
    KEY_NOT_FOUND,
    DB_ERROR,
    NETWORK_ERROR,
    NO_DEVICE_CONNECTED,
    PERMISSION_DENIED,
    IPC_ERROR,
    UTF_8_NOT_SUPPORT,
    DEVICE_NOT_FOUND,
    UNKNOWN_ERROR,
    NOT_SUPPORT,
    SCHEMA_MISMATCH,
    INVALID_SCHEMA,
    READ_ONLY,
    INVALID_VALUE_FIELDS,
    INVALID_FIELD_TYPE,
    CONSTRAIN_VIOLATION,
    INVALID_FORMAT,
    DEFAULT_DB_ERROR,
    INVALID_QUERY_FORMAT,
    INVALID_QUERY_FIELD,
    RECOVER_SUCCESS,
    RECOVER_FAILED,
    INVALID_VALUE_TYPE,
    EXCEED_MAX_ACCESS_RATE;

    public String getErrorMsg() {
        throw new RuntimeException("Stub!");
    }
}
