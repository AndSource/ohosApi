package ohos.agp.animation;

import ohos.agp.animation.Animator;
import ohos.agp.animation.util.Keyframe;
import ohos.agp.animation.util.TypeEstimator;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/animation/AnimatorValue.class */
public class AnimatorValue extends Animator {
    protected ValueUpdateListener mUpdateListener;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/animation/AnimatorValue$ValueUpdateListener.class */
    public interface ValueUpdateListener {
        void onUpdate(AnimatorValue animatorValue, float f);
    }

    public AnimatorValue() {
        throw new RuntimeException("Stub!");
    }

    public static AnimatorValue ofInt(int... values) {
        throw new RuntimeException("Stub!");
    }

    public static AnimatorValue ofFloat(float... values) {
        throw new RuntimeException("Stub!");
    }

    public static AnimatorValue ofObject(TypeEstimator estimator, Object... values) {
        throw new RuntimeException("Stub!");
    }

    public static AnimatorValue ofKeyframe(TypeEstimator estimator, Keyframe... values) {
        throw new RuntimeException("Stub!");
    }

    public void setDuration(long duration) {
        throw new RuntimeException("Stub!");
    }

    public void setLoopedCount(int loopedCount) {
        throw new RuntimeException("Stub!");
    }

    public void setDelay(long startDelay) {
        throw new RuntimeException("Stub!");
    }

    public void setCurveType(int curveType) {
        throw new RuntimeException("Stub!");
    }

    public void setCurve(Animator.TimelineCurve curve) {
        throw new RuntimeException("Stub!");
    }

    public void setStateChangedListener(Animator.StateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setLoopedListener(Animator.LoopedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setValueUpdateListener(ValueUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean setEstimator(TypeEstimator estimator) {
        throw new RuntimeException("Stub!");
    }

    public Object estimateFrameValue(float progress) {
        throw new RuntimeException("Stub!");
    }
}
