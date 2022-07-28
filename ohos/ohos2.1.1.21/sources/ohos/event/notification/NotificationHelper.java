package ohos.event.notification;

import java.util.List;
import java.util.Set;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.1.1.21.jar:ohos/event/notification/NotificationHelper.class */
public class NotificationHelper {
    NotificationHelper() {
        throw new RuntimeException("Stub!");
    }

    public static void publishNotification(NotificationRequest request) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void publishNotification(String label, NotificationRequest request) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void publishNotification(NotificationRequest request, String deviceId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void cancelNotification(int notificationId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void cancelAllNotifications() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void addNotificationSlot(NotificationSlot slot) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void removeNotificationSlot(String slotId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static NotificationSlot getNotificationSlot(String slotId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static Set<NotificationRequest> getActiveNotifications() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static int getActiveNotificationNums() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void setNotificationBadgeNum(int num) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void setNotificationBadgeNum() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static NotificationSortingMap getCurrentAppSorting() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void addNotificationSlotGroup(NotificationSlotGroup slotGroup) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void addNotificationSlotGroups(List<NotificationSlotGroup> slotGroups) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void removeNotificationSlotGroup(String slotGroupId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static NotificationSlotGroup getNotificationSlotGroup(String slotGroupId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static boolean hasNotificationPolicyAccessPermission() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void addNotificationSlots(List<NotificationSlot> slots) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static List<NotificationSlot> getNotificationSlots() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void publishNotificationAsBundle(String representativeBundle, NotificationRequest request) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void setNotificationAgent(String agent) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static String getNotificationAgent() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static boolean canPublishNotificationAsBundle(String representativeBundle) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static List<NotificationSlotGroup> getNotificationSlotGroups() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static boolean isAllowedNotify() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static boolean areNotificationsSuspended() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static int getBundleImportance() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void cancelNotification(String label, int notificationId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
