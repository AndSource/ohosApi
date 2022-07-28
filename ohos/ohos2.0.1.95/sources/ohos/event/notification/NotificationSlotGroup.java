package ohos.event.notification;

import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/event/notification/NotificationSlotGroup.class */
public final class NotificationSlotGroup implements Sequenceable {
    public static final Sequenceable.Producer<NotificationSlotGroup> PRODUCER = null;

    public NotificationSlotGroup(String id, String name) {
        throw new RuntimeException("Stub!");
    }

    public NotificationSlotGroup() {
        throw new RuntimeException("Stub!");
    }

    public String getId() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public List<NotificationSlot> getSlots() {
        throw new RuntimeException("Stub!");
    }

    public void setDescription(String desc) {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDisabled() {
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
