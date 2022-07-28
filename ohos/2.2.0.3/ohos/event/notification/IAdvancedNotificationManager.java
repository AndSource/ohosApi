package ohos.event.notification;

import java.util.List;
import java.util.Set;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
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
  void scheduleNotification(String paramString1, String paramString2, NotificationRequest paramNotificationRequest) throws RemoteException;
  
  @Deprecated
  void cancelAllNotifications(String paramString, int paramInt) throws RemoteException;
  
  @Deprecated
  void cancelNotification(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  void addNotificationSlot(String paramString, NotificationSlot paramNotificationSlot) throws RemoteException;
  
  @Deprecated
  void removeNotificationSlot(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  NotificationSlot getNotificationSlot(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  Set<NotificationRequest> getActiveNotifications(String paramString) throws RemoteException;
  
  @Deprecated
  int getActiveNotificationNums(String paramString) throws RemoteException;
  
  @Deprecated
  void setNotificationBadgeNum(String paramString, int paramInt) throws RemoteException;
  
  @Deprecated
  void setNotificationBadgeNum(String paramString) throws RemoteException;
  
  @Deprecated
  NotificationSortingMap getCurrentAppSorting(String paramString) throws RemoteException;
  
  @Deprecated
  void addNotificationSlotGroup(String paramString, NotificationSlotGroup paramNotificationSlotGroup) throws RemoteException;
  
  @Deprecated
  void addNotificationSlotGroups(String paramString, List<NotificationSlotGroup> paramList) throws RemoteException;
  
  @Deprecated
  NotificationSlotGroup getNotificationSlotGroup(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  boolean hasNotificationPolicyAccessPermission(String paramString) throws RemoteException;
  
  @Deprecated
  void addNotificationSlots(String paramString, List<NotificationSlot> paramList) throws RemoteException;
  
  @Deprecated
  List<NotificationSlot> getNotificationSlots(String paramString) throws RemoteException;
  
  @Deprecated
  void publishNotificationAsBundle(String paramString1, String paramString2, NotificationRequest paramNotificationRequest) throws RemoteException;
  
  @Deprecated
  void setNotificationAgent(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  String getNotificationAgent(String paramString) throws RemoteException;
  
  @Deprecated
  boolean canPublishNotificationAsBundle(String paramString1, String paramString2) throws RemoteException;
  
  @Deprecated
  List<NotificationSlotGroup> getNotificationSlotGroups(String paramString) throws RemoteException;
  
  @Deprecated
  boolean isAllowedNotify() throws RemoteException;
  
  @Deprecated
  boolean areNotificationsSuspended(String paramString) throws RemoteException;
  
  @Deprecated
  int getBundleImportance(String paramString) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/event/notification/IAdvancedNotificationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */