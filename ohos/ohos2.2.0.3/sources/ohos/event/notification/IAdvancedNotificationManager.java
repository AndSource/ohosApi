package ohos.event.notification;

import java.util.List;
import java.util.Set;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/IAdvancedNotificationManager.class */
public interface IAdvancedNotificationManager extends IRemoteBroker {
    @Deprecated
    public static final int ANS_ABORT_ALL = 2;
    @Deprecated
    public static final int ANS_ABORT_ONE = 3;
    @Deprecated
    public static final int ANS_ADD_SLOTS = 23;
    @Deprecated
    public static final int ANS_CAN_PUBLISH_NOTIFICATION_AS_BUNDLE = 33;
    @Deprecated
    public static final int ANS_CREATE_SLOT = 6;
    @Deprecated
    public static final int ANS_CREATE_SLOTGROUP = 19;
    @Deprecated
    public static final int ANS_CREATE_SLOTGROUPS = 25;
    @Deprecated
    public static final int ANS_DELETE_SLOT = 7;
    @Deprecated
    public static final int ANS_DELETE_SLOTGROUP = 20;
    @Deprecated
    public static final int ANS_GET_ACTIVE_NOTIFICATION = 9;
    @Deprecated
    public static final int ANS_GET_ACTIVE_NOTIFICATION_NUM = 11;
    @Deprecated
    public static final int ANS_GET_NOTIFICATION_AGENT = 32;
    @Deprecated
    public static final int ANS_GET_SLOT = 8;
    @Deprecated
    public static final int ANS_GET_SLOTGROUP = 21;
    @Deprecated
    public static final int ANS_GET_SLOTGROUPS = 26;
    @Deprecated
    public static final int ANS_GET_SLOTS = 24;
    @Deprecated
    public static final int ANS_GET_SORTING = 18;
    @Deprecated
    public static final int ANS_INQUIRY_BUNDLE_IMPORTANCE = 29;
    @Deprecated
    public static final int ANS_INQUIRY_IS_SUSPENDED = 28;
    @Deprecated
    public static final int ANS_NOTIFICATIONS_ALLOWED = 27;
    @Deprecated
    public static final int ANS_NOTIFICATION_POLICY_ACCESS_PERMISSION = 22;
    @Deprecated
    public static final int ANS_PUBLISH_NOTIFICATION_AS_BUNDLE = 30;
    @Deprecated
    public static final int ANS_SCHEDULE_NOTIFICATION = 1;
    @Deprecated
    public static final int ANS_SET_NOTIFICATION_AGENT = 31;
    @Deprecated
    public static final int ANS_SET_NOTIFICATION_BADGE_NUM1 = 12;
    @Deprecated
    public static final int ANS_SET_NOTIFICATION_BADGE_NUM2 = 13;
    @Deprecated
    public static final String DESCRIPTOR = "ohos.event.notification.IAdvancedNotificationManager";

    @Deprecated
    void scheduleNotification(String str, String str2, NotificationRequest notificationRequest) throws RemoteException;

    @Deprecated
    void cancelAllNotifications(String str, int i) throws RemoteException;

    @Deprecated
    void cancelNotification(String str, String str2) throws RemoteException;

    @Deprecated
    void addNotificationSlot(String str, NotificationSlot notificationSlot) throws RemoteException;

    @Deprecated
    void removeNotificationSlot(String str, String str2) throws RemoteException;

    @Deprecated
    NotificationSlot getNotificationSlot(String str, String str2) throws RemoteException;

    @Deprecated
    Set<NotificationRequest> getActiveNotifications(String str) throws RemoteException;

    @Deprecated
    int getActiveNotificationNums(String str) throws RemoteException;

    @Deprecated
    void setNotificationBadgeNum(String str, int i) throws RemoteException;

    @Deprecated
    void setNotificationBadgeNum(String str) throws RemoteException;

    @Deprecated
    NotificationSortingMap getCurrentAppSorting(String str) throws RemoteException;

    @Deprecated
    void addNotificationSlotGroup(String str, NotificationSlotGroup notificationSlotGroup) throws RemoteException;

    @Deprecated
    void addNotificationSlotGroups(String str, List<NotificationSlotGroup> list) throws RemoteException;

    @Deprecated
    NotificationSlotGroup getNotificationSlotGroup(String str, String str2) throws RemoteException;

    @Deprecated
    boolean hasNotificationPolicyAccessPermission(String str) throws RemoteException;

    @Deprecated
    void addNotificationSlots(String str, List<NotificationSlot> list) throws RemoteException;

    @Deprecated
    List<NotificationSlot> getNotificationSlots(String str) throws RemoteException;

    @Deprecated
    void publishNotificationAsBundle(String str, String str2, NotificationRequest notificationRequest) throws RemoteException;

    @Deprecated
    void setNotificationAgent(String str, String str2) throws RemoteException;

    @Deprecated
    String getNotificationAgent(String str) throws RemoteException;

    @Deprecated
    boolean canPublishNotificationAsBundle(String str, String str2) throws RemoteException;

    @Deprecated
    List<NotificationSlotGroup> getNotificationSlotGroups(String str) throws RemoteException;

    @Deprecated
    boolean isAllowedNotify() throws RemoteException;

    @Deprecated
    boolean areNotificationsSuspended(String str) throws RemoteException;

    @Deprecated
    int getBundleImportance(String str) throws RemoteException;
}
