package ohos.aafwk.ability;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/RunningProcessInfo.class */
public class RunningProcessInfo {
    public static final int DATA_IN_USE = 1;
    public static final int REASON_UNKNOWN = 0;
    public static final int SERVICE_IN_USE = 2;
    public static final int WEIGHT_CACHED = 400;
    public static final int WEIGHT_CANT_SAVE_STATE = 350;
    public static final int WEIGHT_FOREGROUND = 100;
    public static final int WEIGHT_FOREGROUND_SERVICE = 125;
    public static final int WEIGHT_GONE = 1000;
    public static final int WEIGHT_PERCEPTIBLE = 230;
    public static final int WEIGHT_SERVICE = 300;
    public static final int WEIGHT_TOP_SLEEPING = 325;
    public static final int WEIGHT_VISIBLE = 200;

    public RunningProcessInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getPid() {
        throw new RuntimeException("Stub!");
    }

    public String[] getPkgList() {
        throw new RuntimeException("Stub!");
    }

    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }

    public int getUid() {
        throw new RuntimeException("Stub!");
    }

    public int getLastMemoryLevel() {
        throw new RuntimeException("Stub!");
    }

    public int getWeight() {
        throw new RuntimeException("Stub!");
    }

    public int getWeightReasonCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
