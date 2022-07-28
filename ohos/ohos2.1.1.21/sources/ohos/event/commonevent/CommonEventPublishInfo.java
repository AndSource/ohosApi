package ohos.event.commonevent;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/event/commonevent/CommonEventPublishInfo.class */
public final class CommonEventPublishInfo implements Sequenceable {
    public static final Sequenceable.Producer<CommonEventPublishInfo> PRODUCER = null;

    public CommonEventPublishInfo() {
        throw new RuntimeException("Stub!");
    }

    public CommonEventPublishInfo(CommonEventPublishInfo publishInfo) {
        throw new RuntimeException("Stub!");
    }

    public void setSticky(boolean sticky) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSticky() {
        throw new RuntimeException("Stub!");
    }

    public void setOrdered(boolean ordered) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOrdered() {
        throw new RuntimeException("Stub!");
    }

    public void setSubscriberPermissions(String[] subscriberPermissions) {
        throw new RuntimeException("Stub!");
    }

    public String[] getSubscriberPermissions() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
