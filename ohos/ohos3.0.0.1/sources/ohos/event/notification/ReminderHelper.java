package ohos.event.notification;

import java.util.List;
import ohos.event.notification.ReminderManager;
import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/event/notification/ReminderHelper.class */
public class ReminderHelper {
    ReminderHelper() {
        throw new RuntimeException("Stub!");
    }

    public static int publishReminder(ReminderRequest reminderReq) throws ReminderManager.AppLimitExceedsException, ReminderManager.SysLimitExceedsException, RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void addNotificationSlot(NotificationSlot slot) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void cancelReminder(int reminderId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void removeNotificationSlot(String slotId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static List<ReminderRequest> getValidReminders() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void cancelAllReminders() throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
