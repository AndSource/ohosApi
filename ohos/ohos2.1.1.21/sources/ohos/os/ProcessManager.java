package ohos.os;

/* loaded from: ohos2.1.1.21.jar:ohos/os/ProcessManager.class */
public class ProcessManager {
    public ProcessManager() {
        throw new RuntimeException("Stub!");
    }

    public static final long getStartUptime() {
        throw new RuntimeException("Stub!");
    }

    public static final long getStartRealtime() {
        throw new RuntimeException("Stub!");
    }

    public static final long getPastCpuTime() {
        throw new RuntimeException("Stub!");
    }

    public static final int[] getAvailableCores() {
        throw new RuntimeException("Stub!");
    }

    public static final int getPid() {
        throw new RuntimeException("Stub!");
    }

    public static final int getTid() {
        throw new RuntimeException("Stub!");
    }

    public static final int getUid() {
        throw new RuntimeException("Stub!");
    }

    public static final int getUidByName(String name) {
        throw new RuntimeException("Stub!");
    }

    public static final int getGidByName(String name) {
        throw new RuntimeException("Stub!");
    }

    public static final int getThreadPriority(int tid) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public static final boolean is64Bit() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isAppUid(int uid) {
        throw new RuntimeException("Stub!");
    }

    public static final boolean isIsolatedProcess() {
        throw new RuntimeException("Stub!");
    }

    public static final void setThreadPriority(int priority) throws IllegalArgumentException, SecurityException {
        throw new RuntimeException("Stub!");
    }

    public static final void setThreadPriority(int tid, int priority) throws IllegalArgumentException, SecurityException {
        throw new RuntimeException("Stub!");
    }

    public static final void sendSignal(int pid, int signal) {
        throw new RuntimeException("Stub!");
    }

    public static final void kill(int pid) {
        throw new RuntimeException("Stub!");
    }
}
