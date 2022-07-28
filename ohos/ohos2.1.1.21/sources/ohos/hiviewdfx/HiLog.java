package ohos.hiviewdfx;

/* loaded from: ohos2.1.1.21.jar:ohos/hiviewdfx/HiLog.class */
public final class HiLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int FATAL = 7;
    public static final int INFO = 4;
    public static final int LOG_APP = 0;
    public static final int WARN = 5;

    HiLog() {
        throw new RuntimeException("Stub!");
    }

    public static int debug(HiLogLabel label, String format, Object... args) {
        throw new RuntimeException("Stub!");
    }

    public static int info(HiLogLabel label, String format, Object... args) {
        throw new RuntimeException("Stub!");
    }

    public static int warn(HiLogLabel label, String format, Object... args) {
        throw new RuntimeException("Stub!");
    }

    public static int error(HiLogLabel label, String format, Object... args) {
        throw new RuntimeException("Stub!");
    }

    public static int fatal(HiLogLabel label, String format, Object... args) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isLoggable(int domain, String tag, int level) {
        throw new RuntimeException("Stub!");
    }

    public static String getStackTrace(Throwable tr) {
        throw new RuntimeException("Stub!");
    }
}
