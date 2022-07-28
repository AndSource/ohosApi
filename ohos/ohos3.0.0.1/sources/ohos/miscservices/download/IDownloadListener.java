package ohos.miscservices.download;

/* loaded from: ohos3.0.0.1.jar:ohos/miscservices/download/IDownloadListener.class */
public interface IDownloadListener {
    default void onRemoved() {
        throw new RuntimeException("Stub!");
    }

    default void onCompleted() {
        throw new RuntimeException("Stub!");
    }

    default void onFailed(int errorCode) {
        throw new RuntimeException("Stub!");
    }

    default void onPaused() {
        throw new RuntimeException("Stub!");
    }

    default void onProgress(long receivedSize, long totalSize) {
        throw new RuntimeException("Stub!");
    }
}
