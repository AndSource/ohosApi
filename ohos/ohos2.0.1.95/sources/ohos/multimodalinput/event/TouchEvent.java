package ohos.multimodalinput.event;

/* loaded from: ohos2.0.1.95.jar:ohos/multimodalinput/event/TouchEvent.class */
public abstract class TouchEvent extends ManipulationEvent {
    public static final int CANCEL = 6;
    public static final int NONE = 0;
    public static final int OTHER_POINT_DOWN = 4;
    public static final int OTHER_POINT_UP = 5;
    public static final int POINT_MOVE = 3;
    public static final int PRIMARY_POINT_DOWN = 1;
    public static final int PRIMARY_POINT_UP = 2;

    public abstract int getAction();

    public abstract int getIndex();

    public TouchEvent() {
        throw new RuntimeException("Stub!");
    }
}
