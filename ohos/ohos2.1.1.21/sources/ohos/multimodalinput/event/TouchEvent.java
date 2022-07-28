package ohos.multimodalinput.event;

/* loaded from: ohos2.1.1.21.jar:ohos/multimodalinput/event/TouchEvent.class */
public abstract class TouchEvent extends ManipulationEvent {
    public static final int CANCEL = 6;
    public static final int HOVER_POINTER_ENTER = 7;
    public static final int HOVER_POINTER_EXIT = 9;
    public static final int HOVER_POINTER_MOVE = 8;
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

    public MultimodalEvent getMultimodalEvent() {
        throw new RuntimeException("Stub!");
    }
}
