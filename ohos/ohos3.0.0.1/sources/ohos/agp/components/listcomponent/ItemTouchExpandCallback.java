package ohos.agp.components.listcomponent;

import java.util.List;
import ohos.agp.components.ListComponent;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemTouchExpandCallback.class */
public abstract class ItemTouchExpandCallback {
    public abstract boolean onMove(ListComponent listComponent, ComponentOwner componentOwner, ComponentOwner componentOwner2);

    public abstract void onSwipeDetected(ComponentOwner componentOwner, int i);

    public ItemTouchExpandCallback(int dragDirs, int swipeDirs) {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public void setLongPressDragAllowed(boolean longPressDragEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean getLongPressDragAllowed() {
        throw new RuntimeException("Stub!");
    }

    public void setItemComponentSwipeAllowed(boolean componentSwipeEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean getComponentSwipeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean canPutOnTop(ListComponent listComponent, ComponentOwner current, ComponentOwner target) {
        throw new RuntimeException("Stub!");
    }

    public void setSwipeLimit(ComponentOwner componentOwner, float swipeLimit) {
        throw new RuntimeException("Stub!");
    }

    public float getSwipeLimit(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public void setMoveLimit(ComponentOwner componentOwner, float moveLimit) {
        throw new RuntimeException("Stub!");
    }

    public float getMoveLimit(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner selectDropObjective(ComponentOwner selected, List<ComponentOwner> dropTargets, int curX, int curY) {
        throw new RuntimeException("Stub!");
    }

    public void onSelectedItemUpdated(ComponentOwner componentOwner, int actionState) {
        throw new RuntimeException("Stub!");
    }

    public void setAssumedSwipeDirections(int assumedSwipeDirections) {
        throw new RuntimeException("Stub!");
    }

    public void setAssumedDragDirections(int assumedDragDirections) {
        throw new RuntimeException("Stub!");
    }

    public int getAssumedSwipeDirections(ListComponent listContainer, ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public int getAssumedDragDirections(ListComponent listContainer, ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public void setMarginOfOverlapRegion(int marginOfBoundingBox) {
        throw new RuntimeException("Stub!");
    }

    public int getMarginOfOverlapRegion() {
        throw new RuntimeException("Stub!");
    }

    public long getAnimationTimePeriod(ListComponent listContainer, int animationType, float xCoordinateOffset, float yCoordinateOffset) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemTouchExpandCallback$ItemTouchExpandCallbackCleaner.class */
    protected static class ItemTouchExpandCallbackCleaner {
        ItemTouchExpandCallbackCleaner(long nativePtr) {
            throw new RuntimeException("Stub!");
        }

        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
