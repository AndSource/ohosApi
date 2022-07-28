package ohos.hiviewdfx;

import java.io.FileInputStream;
import java.util.Optional;

/* loaded from: ohos2.1.1.21.jar:ohos/hiviewdfx/FaultLogger.class */
public final class FaultLogger {
    public static final int FAULT_TYPE_APP_FREEZE = 4;
    public static final int FAULT_TYPE_CPP_CRASH = 2;
    public static final int FAULT_TYPE_JAVA_CRASH = 1;
    public static final int FAULT_TYPE_JS_CRASH = 3;
    public static final int FAULT_TYPE_NO_SPECIFIC = 0;

    public FaultLogger() {
        throw new RuntimeException("Stub!");
    }

    public static Optional<FaultLogQueryResult> querySelfFaultLog(int type, int maxNum) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/hiviewdfx/FaultLogger$FaultLogInfo.class */
    public static final class FaultLogInfo {
        public FaultLogInfo() {
            throw new RuntimeException("Stub!");
        }

        public int getPid() {
            throw new RuntimeException("Stub!");
        }

        public int getUid() {
            throw new RuntimeException("Stub!");
        }

        public int getFaultType() {
            throw new RuntimeException("Stub!");
        }

        public long getTimestamp() {
            throw new RuntimeException("Stub!");
        }

        public String getReason() {
            throw new RuntimeException("Stub!");
        }

        public String getSummary() {
            throw new RuntimeException("Stub!");
        }

        public Optional<FileInputStream> getLogFileStream() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/hiviewdfx/FaultLogger$FaultLogQueryResult.class */
    public static final class FaultLogQueryResult {
        public FaultLogQueryResult() {
            throw new RuntimeException("Stub!");
        }

        public boolean hasNext() {
            throw new RuntimeException("Stub!");
        }

        public Optional<FaultLogInfo> next() {
            throw new RuntimeException("Stub!");
        }

        public void destroy() {
            throw new RuntimeException("Stub!");
        }
    }
}
