package ohos.agp.components.listcomponent;

import ohos.agp.components.Component;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ComponentOwner.class */
public abstract class ComponentOwner {
    public final Component itemComponent = null;

    public ComponentOwner(Component component) {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public final int getPositionInLayout() {
        throw new RuntimeException("Stub!");
    }

    public final int getPositionInProvider() {
        throw new RuntimeException("Stub!");
    }

    public final Provider<? extends ComponentOwner> getBindingProvider() {
        throw new RuntimeException("Stub!");
    }

    public final long getComponentId() {
        throw new RuntimeException("Stub!");
    }

    public final int getItemComponentType() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public final void setRecyclable(boolean recyclable) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isRecyclable() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ComponentOwner$ComponentOwnerCleaner.class */
    protected static class ComponentOwnerCleaner {
        ComponentOwnerCleaner(long nativePtr) {
            throw new RuntimeException("Stub!");
        }

        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
