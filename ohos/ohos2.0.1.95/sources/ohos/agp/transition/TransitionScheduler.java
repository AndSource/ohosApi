package ohos.agp.transition;

import ohos.agp.components.ComponentContainer;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/transition/TransitionScheduler.class */
public class TransitionScheduler {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/transition/TransitionScheduler$ITransitionEndListener.class */
    public interface ITransitionEndListener {
        void onTransitionEnd();
    }

    public TransitionScheduler() {
        throw new RuntimeException("Stub!");
    }

    public void setTransition(Transition transition) {
        throw new RuntimeException("Stub!");
    }

    public void startTransition(TransitionComponents components) {
        throw new RuntimeException("Stub!");
    }

    public void startNewRootTransition(ComponentContainer oldRoot, ComponentContainer newRoot) {
        throw new RuntimeException("Stub!");
    }

    public void setTransitionEndListener(ITransitionEndListener listener) {
        throw new RuntimeException("Stub!");
    }
}
