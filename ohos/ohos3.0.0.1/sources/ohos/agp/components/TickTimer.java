package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/TickTimer.class */
public class TickTimer extends Text {
    protected TickListener mTickListener;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/TickTimer$TickListener.class */
    public interface TickListener {
        void onTickTimerUpdate(TickTimer tickTimer);
    }

    public TickTimer(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TickTimer(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TickTimer(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setBaseTime(long base) {
        throw new RuntimeException("Stub!");
    }

    public long getBaseTime() {
        throw new RuntimeException("Stub!");
    }

    public void setCountDown(boolean countDown) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCountDown() {
        throw new RuntimeException("Stub!");
    }

    public void setFormat(String format) {
        throw new RuntimeException("Stub!");
    }

    public String getFormat() {
        throw new RuntimeException("Stub!");
    }

    public void start() {
        throw new RuntimeException("Stub!");
    }

    public void stop() {
        throw new RuntimeException("Stub!");
    }

    public void setTickListener(TickListener listener) {
        throw new RuntimeException("Stub!");
    }
}
