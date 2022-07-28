package ohos.agp.components;

import ohos.agp.database.DataSetSubscriber;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/PageSliderProvider.class */
public abstract class PageSliderProvider {
    public static final int POSITION_INVALID = -2;
    public static final int POSITION_REMAIN = -1;

    public abstract int getCount();

    public abstract Object createPageInContainer(ComponentContainer componentContainer, int i);

    public abstract void destroyPageFromContainer(ComponentContainer componentContainer, int i, Object obj);

    public abstract boolean isPageMatchToObject(Component component, Object obj);

    public PageSliderProvider() {
        throw new RuntimeException("Stub!");
    }

    public void startUpdate(ComponentContainer container) {
        throw new RuntimeException("Stub!");
    }

    public void onUpdateFinished(ComponentContainer container) {
        throw new RuntimeException("Stub!");
    }

    public int getPageIndex(Object object) {
        throw new RuntimeException("Stub!");
    }

    public void notifyDataChanged() {
        throw new RuntimeException("Stub!");
    }

    public final void addDataSubscriber(DataSetSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public final void removeDataSubscriber(DataSetSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public String getPageTitle(int position) {
        throw new RuntimeException("Stub!");
    }
}
