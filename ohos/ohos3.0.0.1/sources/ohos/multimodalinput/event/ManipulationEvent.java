package ohos.multimodalinput.event;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/event/ManipulationEvent.class */
public abstract class ManipulationEvent extends MultimodalEvent {
    public static final int PHASE_CANCEL = 4;
    public static final int PHASE_COMPLETED = 3;
    public static final int PHASE_MOVE = 2;
    public static final int PHASE_NONE = 0;
    public static final int PHASE_START = 1;

    public abstract long getStartTime();

    public abstract int getPhase();

    public abstract MmiPoint getPointerPosition(int i);

    public abstract void setScreenOffset(float f, float f2);

    public abstract MmiPoint getPointerScreenPosition(int i);

    public abstract int getPointerCount();

    public abstract int getPointerId(int i);

    public abstract float getForce(int i);

    public abstract float getRadius(int i);

    public ManipulationEvent() {
        throw new RuntimeException("Stub!");
    }
}
