package ohos.utils;

/* loaded from: ohos2.1.1.21.jar:ohos/utils/IntervalTimer.class */
public abstract class IntervalTimer {
    public abstract void onInterval(long j);

    public abstract void onFinish();

    public IntervalTimer(long duration, long interval) {
        throw new RuntimeException("Stub!");
    }

    public final void schedule() {
        throw new RuntimeException("Stub!");
    }

    public final void cancel() {
        throw new RuntimeException("Stub!");
    }
}
