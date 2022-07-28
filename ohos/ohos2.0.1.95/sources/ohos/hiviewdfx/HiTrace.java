package ohos.hiviewdfx;

/* loaded from: ohos2.0.1.95.jar:ohos/hiviewdfx/HiTrace.class */
public final class HiTrace {
    public static final int HITRACE_FLAG_DEFAULT = 0;
    public static final int HITRACE_FLAG_DONOT_CREATE_SPAN = 2;
    public static final int HITRACE_FLAG_DONOT_ENABLE_LOG = 16;
    public static final int HITRACE_FLAG_INCLUDE_ASYNC = 1;
    public static final int HITRACE_FLAG_NO_BE_INFO = 8;
    public static final int HITRACE_FLAG_TP_INFO = 4;

    HiTrace() {
        throw new RuntimeException("Stub!");
    }

    public static HiTraceId begin(String name, int flags) {
        throw new RuntimeException("Stub!");
    }

    public static void end(HiTraceId hiTraceId) {
        throw new RuntimeException("Stub!");
    }
}
