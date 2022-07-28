package ohos.hiviewdfx;

import java.io.IOException;
import java.util.Map;

/* loaded from: ohos2.0.1.95.jar:ohos/hiviewdfx/Debug.class */
public final class Debug {
    public static final int SHOW_CLASSLOADER = 2;
    public static final int SHOW_FULL_DETAIL = 1;
    public static final int SHOW_INITIALIZED = 4;
    public static final int TRACE_COUNT_ALLOCS = 0;

    /* loaded from: ohos2.0.1.95.jar:ohos/hiviewdfx/Debug$IpcType.class */
    public enum IpcType {
        LOCAL,
        REMOTE,
        DESTRUCTION
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/hiviewdfx/Debug$MemType.class */
    public enum MemType {
        RUNTIME,
        HEAP,
        OTHER
    }

    public Debug() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPss(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPrivateDirtySum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPssSum() {
        throw new RuntimeException("Stub!");
    }

    public static void getNativeHeapInfo(HeapInfo heapinfo) {
        throw new RuntimeException("Stub!");
    }

    public static long getCpuTime() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappablePss(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappablePssSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessRss(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessRssSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPrivateDirty(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSharedDirty(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSharedDirtySum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPrivateClean(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessPrivateCleanSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSharedClean(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSharedCleanSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappedOut(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappedOutSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappedOutPss(MemType memType) {
        throw new RuntimeException("Stub!");
    }

    public static int getProcessSwappedOutPssSum() {
        throw new RuntimeException("Stub!");
    }

    public static int getIpcCount(IpcType ipcType) {
        throw new RuntimeException("Stub!");
    }

    public static int getIpcSentCount() {
        throw new RuntimeException("Stub!");
    }

    public static int getIpcReceivedCount() {
        throw new RuntimeException("Stub!");
    }

    public static String getMemoryStatistic(String StatisticName) {
        throw new RuntimeException("Stub!");
    }

    public static Map<String, String> getMemoryStatistics() {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceBegin() {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceBegin(String traceName) {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceBegin(String traceName, int bufferSize) {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceBegin(String traceName, int bufferSize, int flags) {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceSamplingBegin(String traceName, int bufferSize, int intervalUs) {
        throw new RuntimeException("Stub!");
    }

    public static void functionTraceEnd() {
        throw new RuntimeException("Stub!");
    }

    public static void dumpHeapFile(String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static String getRuntimeStatistic(String statisticName) {
        throw new RuntimeException("Stub!");
    }

    public static Map<String, String> getRuntimeStatistics() {
        throw new RuntimeException("Stub!");
    }

    public static void conectToDebugger() {
        throw new RuntimeException("Stub!");
    }

    public static boolean getDebuggerConnectStatus() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isConectingToDebugger() {
        throw new RuntimeException("Stub!");
    }

    public static int getCountofLoadClasses() {
        throw new RuntimeException("Stub!");
    }

    public static void dumpLoadClasses(int flags) {
        throw new RuntimeException("Stub!");
    }

    public static void emulatorTraceBegin() {
        throw new RuntimeException("Stub!");
    }

    public static void emulatorTraceEnd() {
        throw new RuntimeException("Stub!");
    }

    public static void emulatorTraceEnable() {
        throw new RuntimeException("Stub!");
    }

    public static void attachAgent(String library, String options, ClassLoader classLoader) throws IOException {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/hiviewdfx/Debug$HeapInfo.class */
    public static class HeapInfo {
        public long nativeHeapAllocatedSize;
        public long nativeHeapFreeSize;
        public long nativeHeapSize;

        public HeapInfo() {
            throw new RuntimeException("Stub!");
        }
    }
}
