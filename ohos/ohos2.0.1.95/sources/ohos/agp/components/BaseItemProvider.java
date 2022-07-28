package ohos.agp.components;

import ohos.agp.database.DataSetSubscriber;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/BaseItemProvider.class */
public abstract class BaseItemProvider {
    public abstract int getCount();

    public abstract Object getItem(int i);

    public abstract long getItemId(int i);

    public abstract Component getComponent(int i, Component component, ComponentContainer componentContainer);

    public BaseItemProvider() {
        throw new RuntimeException("Stub!");
    }

    public int getItemComponentType(int position) {
        throw new RuntimeException("Stub!");
    }

    public int getComponentTypeCount() {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataChanged() {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataInvalidated() {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemChanged(int position) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemInserted(int position) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemRemoved(int position) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemRangeChanged(int startPos, int countItems) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemRangeInserted(int startPos, int countItems) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataSetItemRangeRemoved(int startPos, int countItems) {
        throw new RuntimeException("Stub!");
    }

    public final void addDataSubscriber(DataSetSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public final void removeDataSubscriber(DataSetSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public void setFilter(TextFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public TextFilter getFilter() {
        throw new RuntimeException("Stub!");
    }
}
