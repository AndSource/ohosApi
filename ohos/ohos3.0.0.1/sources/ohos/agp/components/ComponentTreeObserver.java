package ohos.agp.components;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver.class */
public final class ComponentTreeObserver {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver$GlobalFocusUpdatedListener.class */
    public interface GlobalFocusUpdatedListener {
        void onGlobalFocusUpdated(Component component, Component component2);
    }

    @Deprecated
    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver$GlobalLayoutListener.class */
    public interface GlobalLayoutListener {
        @Deprecated
        void onGlobalLayoutUpdated();
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver$ScrollChangedListener.class */
    public interface ScrollChangedListener {
        void onScrolled();
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver$WindowBoundListener.class */
    public interface WindowBoundListener {
        void onWindowBound();

        void onWindowUnbound();
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ComponentTreeObserver$WindowFocusUpdatedListener.class */
    public interface WindowFocusUpdatedListener {
        void onWindowFocusUpdated(boolean z);
    }

    ComponentTreeObserver(Component component) {
        throw new RuntimeException("Stub!");
    }

    public void addWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addWindowBoundListener(WindowBoundListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeWindowBoundListener(WindowBoundListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addScrolledListener(ScrollChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeScrolledListener(ScrollChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void addTreeLayoutChangedListener(GlobalLayoutListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void removeTreeLayoutChangedListener(GlobalLayoutListener listener) {
        throw new RuntimeException("Stub!");
    }
}
