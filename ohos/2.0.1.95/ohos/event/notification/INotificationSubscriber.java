package ohos.event.notification;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

public interface INotificationSubscriber extends IRemoteBroker {
  public static final String DESCRIPTOR = "ohos.event.notification.INotificationSubscriber";
  
  public static final int NOTIFICATION_CONNECTED = 3;
  
  public static final int NOTIFICATION_DISCONNECT = 4;
  
  public static final int NOTIFICATION_DISTURB_MODE_CHANGE = 6;
  
  public static final int NOTIFICATION_POSTED = 1;
  
  public static final int NOTIFICATION_REMOVED = 2;
  
  public static final int NOTIFICATION_UPDATE = 5;
  
  void onNotificationPosted(NotificationRequest paramNotificationRequest) throws RemoteException;
  
  void onNotificationPosted(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap) throws RemoteException;
  
  void onNotificationRemoved(NotificationRequest paramNotificationRequest) throws RemoteException;
  
  void onNotificationRemoved(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap, int paramInt) throws RemoteException;
  
  void onNotificationRankingUpdate(NotificationSortingMap paramNotificationSortingMap) throws RemoteException;
  
  void onSubscribeConnected() throws RemoteException;
  
  void onSubscribeDisConnected() throws RemoteException;
  
  void onDisturbModeChange(int paramInt) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/event/notification/INotificationSubscriber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */