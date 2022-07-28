package ohos.event.notification;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
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
  void onNotificationPosted(NotificationRequest paramNotificationRequest) throws RemoteException;
  
  @Deprecated
  void onNotificationPosted(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap) throws RemoteException;
  
  @Deprecated
  void onNotificationRemoved(NotificationRequest paramNotificationRequest) throws RemoteException;
  
  @Deprecated
  void onNotificationRemoved(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap, int paramInt) throws RemoteException;
  
  @Deprecated
  void onNotificationRankingUpdate(NotificationSortingMap paramNotificationSortingMap) throws RemoteException;
  
  @Deprecated
  void onSubscribeConnected() throws RemoteException;
  
  @Deprecated
  void onSubscribeDisConnected() throws RemoteException;
  
  @Deprecated
  void onDisturbModeChange(int paramInt) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/event/notification/INotificationSubscriber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */