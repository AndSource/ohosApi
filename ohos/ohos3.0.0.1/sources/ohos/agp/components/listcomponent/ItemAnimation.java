package ohos.agp.components.listcomponent;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemAnimation.class */
public abstract class ItemAnimation {
    protected static final int ANIMATION_CLASS_TYPE_BASEITEMANIMATION = 1;
    protected static final int ANIMATION_CLASS_TYPE_DEFAULTITEMANIMATION = 2;
    protected static final int ANIMATION_CLASS_TYPE_ITEMANIMATION = 0;
    protected long mNativePtr = 0;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemAnimation$ItemAnimationFinishedListener.class */
    public interface ItemAnimationFinishedListener {
        void onAnimationsEnd();
    }

    public abstract void finishAnimation(ComponentOwner componentOwner);

    public abstract void finishAnimations();

    public abstract boolean isRunning();

    public ItemAnimation() {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    protected void createNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public long getMoveAnimationTime() {
        throw new RuntimeException("Stub!");
    }

    public void setMoveAnimationTime(long moveAnimationTime) {
        throw new RuntimeException("Stub!");
    }

    public long getAddAnimationTime() {
        throw new RuntimeException("Stub!");
    }

    public void setAddAnimationTime(long addAnimationTime) {
        throw new RuntimeException("Stub!");
    }

    public long getRemoveAnimationTime() {
        throw new RuntimeException("Stub!");
    }

    public void setRemoveAnimationTime(long removeAnimationTime) {
        throw new RuntimeException("Stub!");
    }

    public long getChangeAnimationTime() {
        throw new RuntimeException("Stub!");
    }

    public void setChangeAnimationTime(long changeAnimationTime) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isRunning(ItemAnimationFinishedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void onAnimationStarted(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    public void onAnimationFinished(ComponentOwner componentOwner) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ItemAnimation$ItemAnimationCleaner.class */
    protected static class ItemAnimationCleaner {
        ItemAnimationCleaner(long nativePtr) {
            throw new RuntimeException("Stub!");
        }

        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
