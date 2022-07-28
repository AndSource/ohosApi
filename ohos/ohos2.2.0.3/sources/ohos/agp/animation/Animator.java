package ohos.agp.animation;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/animation/Animator.class */
public abstract class Animator {
    public static final int INFINITE = -1;
    protected LoopedListener mLoopedListener;
    protected StateChangedListener mPauseListener;
    protected StateChangedListener mStartListener;

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/animation/Animator$LoopedListener.class */
    public interface LoopedListener {
        void onRepeat(Animator animator);
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/animation/Animator$StateChangedListener.class */
    public interface StateChangedListener {
        void onStart(Animator animator);

        void onStop(Animator animator);

        void onCancel(Animator animator);

        void onEnd(Animator animator);

        void onPause(Animator animator);

        void onResume(Animator animator);
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/animation/Animator$TimelineCurve.class */
    public interface TimelineCurve {
        float getCurvedTime(float f);
    }

    public Animator() {
        throw new RuntimeException("Stub!");
    }

    public void start() {
        throw new RuntimeException("Stub!");
    }

    public void stop() {
        throw new RuntimeException("Stub!");
    }

    public void cancel() {
        throw new RuntimeException("Stub!");
    }

    public void end() {
        throw new RuntimeException("Stub!");
    }

    public void pause() {
        throw new RuntimeException("Stub!");
    }

    public void resume() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPaused() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }

    public long getDuration() {
        throw new RuntimeException("Stub!");
    }

    public long getDelay() {
        throw new RuntimeException("Stub!");
    }

    public int getLoopedCount() {
        throw new RuntimeException("Stub!");
    }

    public int getCurveType() {
        throw new RuntimeException("Stub!");
    }

    protected void setDurationInternal(long duration) {
        throw new RuntimeException("Stub!");
    }

    protected void setDelayInternal(long startDelay) {
        throw new RuntimeException("Stub!");
    }

    protected void setLoopedCountInternal(int loopedCount) {
        throw new RuntimeException("Stub!");
    }

    protected void setCurveTypeInternal(int curveType) {
        throw new RuntimeException("Stub!");
    }

    protected void setCurveInternal(TimelineCurve curve) {
        throw new RuntimeException("Stub!");
    }

    protected void setPauseListenerInternal(StateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    protected void setLoopedListenerInternal(LoopedListener listener) {
        throw new RuntimeException("Stub!");
    }

    protected void setStartListenerInternal(StateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/animation/Animator$CurveType.class */
    public static class CurveType {
        public static final int ACCELERATE = 0;
        public static final int ACCELERATE_DECELERATE = 1;
        public static final int ANTICIPATE = 2;
        public static final int ANTICIPATE_OVERSHOOT = 3;
        public static final int BOUNCE = 4;
        public static final int CUBIC_BEZIER_ACCELERATION = 16;
        public static final int CUBIC_BEZIER_DECELERATION = 15;
        public static final int CUBIC_BEZIER_EXTREME_DECELERATION = 18;
        public static final int CUBIC_BEZIER_FRICTION = 17;
        public static final int CUBIC_BEZIER_RHYTHM = 20;
        public static final int CUBIC_BEZIER_SHARP = 19;
        public static final int CUBIC_BEZIER_SMOOTH = 21;
        public static final int CUBIC_BEZIER_STANDARD = 14;
        public static final int CUBIC_HERMITE = 5;
        public static final int CUSTOMIZED = -2;
        public static final int CYCLE = 6;
        public static final int DECELERATE = 7;
        public static final int INVALID = -1;
        public static final int LINEAR = 8;
        public static final int OVERSHOOT = 9;
        public static final int PHYSICAL_FLING = 13;
        public static final int PHYSICAL_SPRING = 12;
        public static final int SMOOTH_STEP = 10;
        public static final int SPRING = 11;

        public CurveType() {
            throw new RuntimeException("Stub!");
        }

        public static boolean checkTypeValue(int type) {
            throw new RuntimeException("Stub!");
        }
    }
}
