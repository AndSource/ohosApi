package ohos.agp.animation;

import java.util.ArrayList;
import ohos.agp.animation.Animator;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/animation/AnimatorGroup.class */
public class AnimatorGroup extends Animator {
    protected Builder mBuilder;

    public AnimatorGroup() {
        throw new RuntimeException("Stub!");
    }

    public void runParallel(Animator... items) {
        throw new RuntimeException("Stub!");
    }

    public void runSerially(Animator... items) {
        throw new RuntimeException("Stub!");
    }

    public int getRoundCount() {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<Animator> getAnimatorsAt(int round) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public Builder build() {
        throw new RuntimeException("Stub!");
    }

    public void setDuration(long duration) {
        throw new RuntimeException("Stub!");
    }

    public void setDelay(long startDelay) {
        throw new RuntimeException("Stub!");
    }

    public void setLoopedCount(int loopedCount) {
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

    public void setCurve(Animator.TimelineCurve curve) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/animation/AnimatorGroup$Builder.class */
    public class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder addAnimators(Animator... items) {
            throw new RuntimeException("Stub!");
        }
    }
}
