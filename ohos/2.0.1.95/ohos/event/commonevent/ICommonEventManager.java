package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

public interface ICommonEventManager extends IRemoteBroker {
  public static final int CES_PUBLISH_COMMON_EVENT = 3;
  
  public static final int CES_REGISTER_SUBSCRIBER = 1;
  
  public static final int CES_UNREGISTER_SUBSCRIBER = 2;
  
  public static final String DESCRIPTOR = "ohos.event.commonevent.ICommonEventManager";
  
  void subscribeCommonEvent(ICommonEventSubscriber paramICommonEventSubscriber, CommonEventSubscribeInfo paramCommonEventSubscribeInfo) throws RemoteException;
  
  void unsubscribeCommonEvent(ICommonEventSubscriber paramICommonEventSubscriber) throws RemoteException;
  
  void publishCommonEvent(CommonEventData paramCommonEventData, CommonEventPublishInfo paramCommonEventPublishInfo, ICommonEventSubscriber paramICommonEventSubscriber) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/event/commonevent/ICommonEventManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */