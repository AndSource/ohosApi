package ohos.agp.render.render3d;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/Task.class */
public abstract class Task {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/Task$State.class */
    public enum State {
        QUEUED,
        RUNNING,
        FINISHED
    }

    public abstract void onInitialize();

    public abstract boolean onExecute();

    public abstract void onFinish();

    public abstract void onCancel();

    public Task() {
        throw new RuntimeException("Stub!");
    }

    public final State getState() {
        throw new RuntimeException("Stub!");
    }

    public final void initialize() {
        throw new RuntimeException("Stub!");
    }
}
