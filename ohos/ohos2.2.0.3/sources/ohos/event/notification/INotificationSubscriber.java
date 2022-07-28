package ohos.event.notification;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/INotificationSubscriber.class */
public interface INotificationSubscriber extends IRemoteBroker {
    @Deprecated
    public static final String DESCRIPTOR = "ohos.event.notification.INotificationSubscriber";
    @Deprecated
    public static final int NOTIFICATION_CONNECTED = 3;
    @Deprecated
    public static final int NOTIFICATION_DISCONNECT = 4;
    @Deprecated
    public static final int NOTIFICATION_DISTURB_MODE_CHANGE = 6;
    @Deprecated
    public static final int NOTIFICATION_POSTED = 1;
    @Deprecated
    public static final int NOTIFICATION_REMOVED = 2;
    @Deprecated
    public static final int NOTIFICATION_UPDATE = 5;

    @Deprecated
    void onNotificationPosted(NotificationRequest notificationRequest) throws RemoteException;

    @Deprecated
    void onNotificationPosted(NotificationRequest notificationRequest, NotificationSortingMap notificationSortingMap) throws RemoteException;

    @Deprecated
    void onNotificationRemoved(NotificationRequest notificationRequest) throws RemoteException;

    @Deprecated
    void onNotificationRemoved(NotificationRequest notificationRequest, NotificationSortingMap notificationSortingMap, int i) throws RemoteException;

    @Deprecated
    void onNotificationRankingUpdate(NotificationSortingMap notificationSortingMap) throws RemoteException;

    @Deprecated
    void onSubscribeConnected() throws RemoteException;

    @Deprecated
    void onSubscribeDisConnected() throws RemoteException;

    @Deprecated
    void onDisturbModeChange(int i) throws RemoteException;
}
