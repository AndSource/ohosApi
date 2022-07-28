package ohos.miscservices.timeutility;

import ohos.aafwk.content.Intent;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/miscservices/timeutility/Timer.class */
public class Timer {
    public static final int ABILITY_TYPE_COMMON_EVENT = 2;
    public static final int ABILITY_TYPE_PAGE = 1;
    public static final int ABILITY_TYPE_SERVICE = 3;
    public static final int TIMER_TYPE_EXACT = 4;
    public static final int TIMER_TYPE_IDLE = 8;
    public static final int TIMER_TYPE_REALTIME = 1;
    public static final int TIMER_TYPE_WAKEUP = 2;

    /* loaded from: ohos2.1.1.21.jar:ohos/miscservices/timeutility/Timer$ITimerListener.class */
    public interface ITimerListener {
        void onTrigger();
    }

    public Timer() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/miscservices/timeutility/Timer$OneShotTimer.class */
    public static class OneShotTimer {
        OneShotTimer(Context context) {
            throw new RuntimeException("Stub!");
        }

        public static OneShotTimer getTimer(Context context, TimerIntent operation) {
            throw new RuntimeException("Stub!");
        }

        public static OneShotTimer getTimer(Context context, ITimerListener listener) {
            throw new RuntimeException("Stub!");
        }

        public void start(int type, long triggerTime) {
            throw new RuntimeException("Stub!");
        }

        public void stop() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/miscservices/timeutility/Timer$RepeatTimer.class */
    public static class RepeatTimer {
        RepeatTimer(Context context) {
            throw new RuntimeException("Stub!");
        }

        public static RepeatTimer getTimer(Context context, TimerIntent operation) {
            throw new RuntimeException("Stub!");
        }

        public void start(int type, long triggerTime, long interval) {
            throw new RuntimeException("Stub!");
        }

        public void stop() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/miscservices/timeutility/Timer$TimerIntent.class */
    public static class TimerIntent {
        public TimerIntent(Intent intent, int abilityType) {
            throw new RuntimeException("Stub!");
        }

        public Intent getIntent() {
            throw new RuntimeException("Stub!");
        }

        public int getAbilityType() {
            throw new RuntimeException("Stub!");
        }

        public boolean isValid() {
            throw new RuntimeException("Stub!");
        }
    }
}
