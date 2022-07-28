package ohos.event.notification;

import java.util.List;
import java.util.Set;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

public interface IAdvancedNotificationManager extends IRemoteBroker {
  public static final int ANS_ABORT_ALL = 2;
  
  public static final int ANS_ABORT_ONE = 3;
  
  public static final int ANS_ADD_SLOTS = 23;
  
  public static final int ANS_CAN_PUBLISH_NOTIFICATION_AS_BUNDLE = 33;
  
  public static final int ANS_CREATE_SLOT = 6;
  
  public static final int ANS_CREATE_SLOTGROUP = 19;
  
  public static final int ANS_CREATE_SLOTGROUPS = 25;
  
  public static final int ANS_DELETE_SLOT = 7;
  
  public static final int ANS_DELETE_SLOTGROUP = 20;
  
  public static final int ANS_GET_ACTIVE_NOTIFICATION = 9;
  
  public static final int ANS_GET_ACTIVE_NOTIFICATION_NUM = 11;
  
  public static final int ANS_GET_NOTIFICATION_AGENT = 32;
  
  public static final int ANS_GET_SLOT = 8;
  
  public static final int ANS_GET_SLOTGROUP = 21;
  
  public static final int ANS_GET_SLOTGROUPS = 26;
  
  public static final int ANS_GET_SLOTS = 24;
  
  public static final int ANS_GET_SORTING = 18;
  
  public static final int ANS_INQUIRY_BUNDLE_IMPORTANCE = 29;
  
  public static final int ANS_INQUIRY_IS_SUSPENDED = 28;
  
  public static final int ANS_NOTIFICATIONS_ALLOWED = 27;
  
  public static final int ANS_NOTIFICATION_POLICY_ACCESS_PERMISSION = 22;
  
  public static final int ANS_PUBLISH_NOTIFICATION_AS_BUNDLE = 30;
  
  public static final int ANS_SCHEDULE_NOTIFICATION = 1;
  
  public static final int ANS_SET_NOTIFICATION_AGENT = 31;
  
  public static final int ANS_SET_NOTIFICATION_BADGE_NUM1 = 12;
  
  public static final int ANS_SET_NOTIFICATION_BADGE_NUM2 = 13;
  
  public static final String DESCRIPTOR = "ohos.event.notification.IAdvancedNotificationManager";
  
  void scheduleNotification(String paramString1, String paramString2, NotificationRequest paramNotificationRequest) throws RemoteException;
  
  void cancelAllNotifications(String paramString, int paramInt) throws RemoteException;
  
  void cancelNotification(String paramString1, String paramString2) throws RemoteException;
  
  void addNotificationSlot(String paramString, NotificationSlot paramNotificationSlot) throws RemoteException;
  
  void removeNotificationSlot(String paramString1, String paramString2) throws RemoteException;
  
  NotificationSlot getNotificationSlot(String paramString1, String paramString2) throws RemoteException;
  
  Set<NotificationRequest> getActiveNotifications(String paramString) throws RemoteException;
  
  int getActiveNotificationNums(String paramString) throws RemoteException;
  
  void setNotificationBadgeNum(String paramString, int paramInt) throws RemoteException;
  
  void setNotificationBadgeNum(String paramString) throws RemoteException;
  
  NotificationSortingMap getCurrentAppSorting(String paramString) throws RemoteException;
  
  void addNotificationSlotGroup(String paramString, NotificationSlotGroup paramNotificationSlotGroup) throws RemoteException;
  
  void addNotificationSlotGroups(String paramString, List<NotificationSlotGroup> paramList) throws RemoteException;
  
  NotificationSlotGroup getNotificationSlotGroup(String paramString1, String paramString2) throws RemoteException;
  
  boolean hasNotificationPolicyAccessPermission(String paramString) throws RemoteException;
  
  void addNotificationSlots(String paramString, List<NotificationSlot> paramList) throws RemoteException;
  
  List<NotificationSlot> getNotificationSlots(String paramString) throws RemoteException;
  
  void publishNotificationAsBundle(String paramString1, String paramString2, NotificationRequest paramNotificationRequest) throws RemoteException;
  
  void setNotificationAgent(String paramString1, String paramString2) throws RemoteException;
  
  String getNotificationAgent(String paramString) throws RemoteException;
  
  boolean canPublishNotificationAsBundle(String paramString1, String paramString2) throws RemoteException;
  
  List<NotificationSlotGroup> getNotificationSlotGroups(String paramString) throws RemoteException;
  
  boolean isAllowedNotify() throws RemoteException;
  
  boolean areNotificationsSuspended(String paramString) throws RemoteException;
  
  int getBundleImportance(String paramString) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/event/notification/IAdvancedNotificationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */