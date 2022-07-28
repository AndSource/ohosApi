package ohos.powermanager;

/* loaded from: ohos2.2.0.3.jar:ohos/powermanager/PowerManager.class */
public class PowerManager {

    /* loaded from: ohos2.2.0.3.jar:ohos/powermanager/PowerManager$PowerState.class */
    public enum PowerState {
        NONE,
        AWAKE,
        INACTIVE,
        SLEEP
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/powermanager/PowerManager$RunningLockType.class */
    public enum RunningLockType {
        BACKGROUND,
        PROXIMITY_SCREEN_CONTROL
    }

    public PowerManager() {
        throw new RuntimeException("Stub!");
    }

    public void rebootDevice(String reason) {
        throw new RuntimeException("Stub!");
    }

    public DevicePowerStatusInfo getCurrentPowerStatusInfo() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRunningLockTypeSupported(RunningLockType type) {
        throw new RuntimeException("Stub!");
    }

    public RunningLock createRunningLock(String name, RunningLockType type) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScreenOn() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/powermanager/PowerManager$RunningLock.class */
    public final class RunningLock {
        RunningLock(String name, RunningLockType type) {
            throw new RuntimeException("Stub!");
        }

        public void lock(long timeOutMs) {
            throw new RuntimeException("Stub!");
        }

        public void unLock() {
            throw new RuntimeException("Stub!");
        }

        public boolean isUsed() {
            throw new RuntimeException("Stub!");
        }
    }
}
