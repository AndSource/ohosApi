package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
public interface ICommonEventManager extends IRemoteBroker {
  @Deprecated
  public static final int CES_PUBLISH_COMMON_EVENT = 3;
  
  @Deprecated
  public static final int CES_REGISTER_SUBSCRIBER = 1;
  
  @Deprecated
  public static final int CES_UNREGISTER_SUBSCRIBER = 2;
  
  @Deprecated
  public static final String DESCRIPTOR = "ohos.event.commonevent.ICommonEventManager";
  
  @Deprecated
  void subscribeCommonEvent(ICommonEventSubscriber paramICommonEventSubscriber, CommonEventSubscribeInfo paramCommonEventSubscribeInfo) throws RemoteException;
  
  @Deprecated
  void unsubscribeCommonEvent(ICommonEventSubscriber paramICommonEventSubscriber) throws RemoteException;
  
  @Deprecated
  void publishCommonEvent(CommonEventData paramCommonEventData, CommonEventPublishInfo paramCommonEventPublishInfo, ICommonEventSubscriber paramICommonEventSubscriber) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/event/commonevent/ICommonEventManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */