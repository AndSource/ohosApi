package ohos.media.audio;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioInterrupt.class */
public class AudioInterrupt {
    public static final int INTERRUPT_HINT_DUCK = 4;
    public static final int INTERRUPT_HINT_NONE = 0;
    public static final int INTERRUPT_HINT_PAUSE = 2;
    public static final int INTERRUPT_HINT_RESUME = 1;
    public static final int INTERRUPT_HINT_STOP = 3;
    public static final int INTERRUPT_HINT_UNDUCK = 5;
    public static final int INTERRUPT_TYPE_BEGIN = 1;
    public static final int INTERRUPT_TYPE_END = 2;

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioInterrupt$InterruptListener.class */
    public interface InterruptListener {
        void onInterrupt(int i, int i2);
    }

    public AudioInterrupt() {
        throw new RuntimeException("Stub!");
    }

    public void setInterruptListener(InterruptListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setStreamInfo(AudioStreamInfo info) {
        throw new RuntimeException("Stub!");
    }

    public InterruptListener getInterruptListener() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo getStreamInfo() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPauseWhenDucked() {
        throw new RuntimeException("Stub!");
    }

    public void setPauseWhenDucked(boolean pauseWhenDucked) {
        throw new RuntimeException("Stub!");
    }
}
