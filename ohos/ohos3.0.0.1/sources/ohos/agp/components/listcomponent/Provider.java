package ohos.agp.components.listcomponent;

import java.util.List;
import ohos.agp.components.Component;
import ohos.agp.components.ListComponent;
import ohos.agp.components.listcomponent.ComponentOwner;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/Provider.class */
public abstract class Provider<E extends ComponentOwner> {
    public static final long INVALID_ID = -1;
    protected long mNativePtr = 0;

    public abstract E onCreateComponentOwner(ListComponent listComponent, int i);

    public abstract int getItemNumber();

    public abstract void onBindComponentOwner(E e, int i);

    public Provider() {
        throw new RuntimeException("Stub!");
    }

    public final E getComponentOwner(long componentOwnerPtr) {
        throw new RuntimeException("Stub!");
    }

    public final Component getItemComponent(long componentPtr) {
        throw new RuntimeException("Stub!");
    }

    public void onBindComponentOwner(E owner, int position, List<Object> crabs) {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public void setHasUniqueIdentifier(boolean hasUniqueIdentifier) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasUniqueIdentifier() {
        throw new RuntimeException("Stub!");
    }

    public int getItemComponentType(int position) {
        throw new RuntimeException("Stub!");
    }

    public long getComponentId(int position) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyDataCollectionChanged() {
        throw new RuntimeException("Stub!");
    }

    public final void notifyUpdatedAt(int position) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyUpdatedAt(int position, Object crab) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyRangeUpdated(int positionStart, int itemCount) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyRangeUpdated(int positionStart, int itemCount, Object crab) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyInsertedAt(int position) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyRangeInserted(int positionStart, int itemCount) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyRemovedAt(int position) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyRangeRemoved(int positionStart, int itemCount) {
        throw new RuntimeException("Stub!");
    }

    public final void notifyPositionMoved(int fromPosition, int toPosition) {
        throw new RuntimeException("Stub!");
    }

    public void onComponentOwnerToCachePool(E owner) {
        throw new RuntimeException("Stub!");
    }

    public void onComponentBoundToWindow(E owner) {
        throw new RuntimeException("Stub!");
    }

    public void onComponentUnboundFromWindow(E owner) {
        throw new RuntimeException("Stub!");
    }

    public void onBoundToListComponent(ListComponent listContainer) {
        throw new RuntimeException("Stub!");
    }

    public void onUnboundFromListComponent(ListComponent listContainer) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasObserversRegistered() {
        throw new RuntimeException("Stub!");
    }

    public void registerDataObserver(ProviderSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterDataObserver(ProviderSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }
}
