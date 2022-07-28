package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/BrowsingList.class */
public interface BrowsingList {
    int getCurrentIndex();

    int getSize();

    BrowsingItem getCurrent();

    BrowsingItem getItemAt(int i);
}
