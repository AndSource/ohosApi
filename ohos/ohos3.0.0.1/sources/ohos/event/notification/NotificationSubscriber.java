package ohos.event.notification;

/* loaded from: ohos3.0.0.1.jar:ohos/event/notification/NotificationSubscriber.class */
public abstract class NotificationSubscriber {
    public abstract void onConsumed(NotificationRequest notificationRequest);

    public abstract void onConsumed(NotificationRequest notificationRequest, NotificationSortingMap notificationSortingMap);

    public abstract void onCanceled(NotificationRequest notificationRequest, NotificationSortingMap notificationSortingMap, int i);

    public abstract void onCanceled(NotificationRequest notificationRequest);

    public abstract void onUpdate(NotificationSortingMap notificationSortingMap);

    public abstract void onConnected();

    public abstract void onDisConnect();

    public abstract void onDied();

    public abstract void onDisturbModeChanged(int i);

    public NotificationSubscriber() {
        throw new RuntimeException("Stub!");
    }
}
