package ohos.data.search;

/* loaded from: ohos2.0.1.95.jar:ohos/data/search/SearchResult.class */
public enum SearchResult {
    SUCCESS,
    SERVICE_NOT_CONNECT,
    ILLEGAL_ARGUMENT,
    PERMISSION_DENIED,
    PERMISSION_GRANTED,
    IPC_EXCEPTION,
    DB_EXCEPTION,
    FILE_RW_EXCEPTION,
    FAIL,
    INNER_ERROR,
    UNKNOWN_ERROR;

    public int getRetCode() {
        throw new RuntimeException("Stub!");
    }

    public String getRetMsg() {
        throw new RuntimeException("Stub!");
    }

    public static SearchResult getSearchResult(int code) {
        throw new RuntimeException("Stub!");
    }
}
