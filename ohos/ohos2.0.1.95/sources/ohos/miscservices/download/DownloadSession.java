package ohos.miscservices.download;

import java.io.FileNotFoundException;
import ohos.app.Context;
import ohos.rpc.MessageParcel;
import ohos.utils.net.Uri;

/* loaded from: ohos2.0.1.95.jar:ohos/miscservices/download/DownloadSession.class */
public class DownloadSession {
    public static final int ERROR_CANNOT_RESUME = 506;
    public static final int ERROR_DEVICE_NOT_FOUND = 502;
    public static final int ERROR_FILE_ALREADY_EXISTS = 507;
    public static final int ERROR_FILE_ERROR = 508;
    public static final int ERROR_HTTP_DATA_ERROR = 501;
    public static final int ERROR_INSUFFICIENT_SPACE = 504;
    public static final int ERROR_TOO_MANY_REDIRECTS = 505;
    public static final int ERROR_UNHANDLED_HTTP_CODE = 503;
    public static final int ERROR_UNKNOWN = 509;
    public static final int PAUSED_QUEUED_FOR_WIFI = 303;
    public static final int PAUSED_UNKNOWN = 304;
    public static final int PAUSED_WAITING_FOR_NETWORK = 302;
    public static final int PAUSED_WAITING_TO_RETRY = 301;
    public static final int SESSION_FAILED = 16;
    public static final int SESSION_PAUSED = 4;
    public static final int SESSION_PENDING = 1;
    public static final int SESSION_RUNNING = 2;
    public static final int SESSION_SUCCESSFUL = 8;

    public DownloadSession(Context context, DownloadConfig config) {
        throw new RuntimeException("Stub!");
    }

    public DownloadSession(Context context, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public boolean attach(long id) {
        throw new RuntimeException("Stub!");
    }

    public long start() {
        throw new RuntimeException("Stub!");
    }

    public boolean remove() {
        throw new RuntimeException("Stub!");
    }

    public boolean pause() {
        throw new RuntimeException("Stub!");
    }

    public boolean resume() {
        throw new RuntimeException("Stub!");
    }

    public DownloadInfo query() {
        throw new RuntimeException("Stub!");
    }

    public boolean addListener(IDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeListener(IDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }

    public MessageParcel openDownloadedFile() throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public String queryMimeType() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/miscservices/download/DownloadSession$DownloadInfo.class */
    public static class DownloadInfo {
        public DownloadInfo() {
            throw new RuntimeException("Stub!");
        }

        public Uri getPath() {
            throw new RuntimeException("Stub!");
        }

        public Uri getTargetUri() {
            throw new RuntimeException("Stub!");
        }

        public int getStatus() {
            throw new RuntimeException("Stub!");
        }

        public int getFailedReason() {
            throw new RuntimeException("Stub!");
        }

        public int getPausedReason() {
            throw new RuntimeException("Stub!");
        }

        public long getDownloadId() {
            throw new RuntimeException("Stub!");
        }

        public long getDownloadedBytes() {
            throw new RuntimeException("Stub!");
        }

        public long getTotalBytes() {
            throw new RuntimeException("Stub!");
        }

        public String getDescription() {
            throw new RuntimeException("Stub!");
        }

        public String getFileName() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
