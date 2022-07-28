package ohos.agp.animation;

import ohos.agp.animation.Animator;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/animation/AnimatorValue.class */
public class AnimatorValue extends Animator {
    protected ValueUpdateListener mUpdateListener;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/animation/AnimatorValue$ValueUpdateListener.class */
    public interface ValueUpdateListener {
        void onUpdate(AnimatorValue animatorValue, float f);
    }

    public AnimatorValue() {
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

    public void setStateChangedListener(Animator.StateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setLoopedListener(Animator.LoopedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setValueUpdateListener(ValueUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
}
