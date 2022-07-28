package ohos.event.notification;

import java.util.Set;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/event/notification/NotificationSubscribeInfo.class */
public class NotificationSubscribeInfo implements Sequenceable {
    public static final Sequenceable.Producer<NotificationSubscribeInfo> PRODUCER = null;

    public NotificationSubscribeInfo() {
        throw new RuntimeException("Stub!");
    }

    public NotificationSubscribeInfo(NotificationSubscribeInfo subscribeInfo) {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getAppNames() {
        throw new RuntimeException("Stub!");
    }

    public NotificationSubscribeInfo addAppName(String appName) {
        throw new RuntimeException("Stub!");
    }

    public NotificationSubscribeInfo addAppNames(String[] appNames) {
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
