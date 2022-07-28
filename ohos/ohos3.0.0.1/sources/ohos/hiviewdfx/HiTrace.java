package ohos.hiviewdfx;

/* loaded from: ohos3.0.0.1.jar:ohos/hiviewdfx/HiTrace.class */
public final class HiTrace {
    public static final int HITRACE_FLAG_DEFAULT = 0;
    public static final int HITRACE_FLAG_DONOT_CREATE_SPAN = 2;
    public static final int HITRACE_FLAG_DONOT_ENABLE_LOG = 16;
    public static final int HITRACE_FLAG_INCLUDE_ASYNC = 1;
    public static final int HITRACE_FLAG_NO_BE_INFO = 8;
    public static final int HITRACE_FLAG_TP_INFO = 4;
    public static final int HITRACE_SLICE_CLIENT = 0;
    public static final int HITRACE_SLICE_GENERAL = 4;
    public static final int HITRACE_SLICE_SERVER = 3;

    HiTrace() {
        throw new RuntimeException("Stub!");
    }

    public static HiTraceId begin(String name, int flags) {
        throw new RuntimeException("Stub!");
    }

    public static void end(HiTraceId hiTraceId) {
        throw new RuntimeException("Stub!");
    }

    public static HiTraceId getId() {
        throw new RuntimeException("Stub!");
    }

    public static void setId(HiTraceId id) {
        throw new RuntimeException("Stub!");
    }

    public static void clearId() {
        throw new RuntimeException("Stub!");
    }

    public static HiTraceId createSpan() {
        throw new RuntimeException("Stub!");
    }

    public static void beginSlice(HiTraceId traceId, String name, String args) {
        throw new RuntimeException("Stub!");
    }

    public static void beginSlice(HiTraceId traceId, int type, String name, String args) {
        throw new RuntimeException("Stub!");
    }

    public static void endSlice() {
        throw new RuntimeException("Stub!");
    }

    public static void traceValue(HiTraceId traceId, String name, long value) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isTraceEnabled() {
        throw new RuntimeException("Stub!");
    }
}
