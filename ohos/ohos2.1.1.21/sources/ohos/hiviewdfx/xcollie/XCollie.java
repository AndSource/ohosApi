package ohos.hiviewdfx.xcollie;

/* loaded from: ohos2.1.1.21.jar:ohos/hiviewdfx/xcollie/XCollie.class */
public final class XCollie {
    public static final long XCOLLIE_FLAG_LOG = 1;
    public static final long XCOLLIE_FLAG_NOOP = 0;
    public static final long XCOLLIE_FLAG_RECOVERY = 2;
    public static final int XCOLLIE_INVALID_ID = -1;

    XCollie() {
        throw new RuntimeException("Stub!");
    }

    public static XCollie getInstance() {
        throw new RuntimeException("Stub!");
    }

    public int setTimeout(String timeoutName, int timeout, Runnable callback, long flag) {
        throw new RuntimeException("Stub!");
    }

    public void cancelTimeout(int id) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateTimeout(int id, long timeout) {
        throw new RuntimeException("Stub!");
    }
}
