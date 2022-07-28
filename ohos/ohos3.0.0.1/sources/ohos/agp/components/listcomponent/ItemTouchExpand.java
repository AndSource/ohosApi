package ohos.agp.components.listcomponent;

import ohos.agp.components.ListComponent;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemTouchExpand.class */
public class ItemTouchExpand extends ListAdornment {
    public static final int DOWN = 2;
    public static final int DRAG_ANIMATION_TYPE = 8;
    public static final int END = 32;
    public static final int ITEM_TOUCH_DRAG_STATE = 2;
    public static final int ITEM_TOUCH_IDLE_STATE = 0;
    public static final int ITEM_TOUCH_SWIPE_STATE = 1;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;
    public static final int SWIPE_CANCEL_ANIMATION_TYPE = 4;
    public static final int SWIPE_SUCCESS_ANIMATION_TYPE = 2;
    public static final int UP = 1;

    public ItemTouchExpand(ItemTouchExpandCallback callback) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.listcomponent.ListAdornment
    protected void createNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public void boundToListComponent(ListComponent listComponent) {
        throw new RuntimeException("Stub!");
    }

    public void setSwipeEscapeSpeed(float swipeSpeed) {
        throw new RuntimeException("Stub!");
    }

    public float getSwipeEscapeSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void beginDrag(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public void beginSwipe(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public void startMoveItem(int fromPos, int toPos) {
        throw new RuntimeException("Stub!");
    }
}
