package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
public interface ICommonEventSubscriber extends IRemoteBroker {
  @Deprecated
  public static final String DESCRIPTOR = "ohos.event.commonevent.ICommonEventSubscriber";
  
  @Deprecated
  public static final int RECV_COMMON_EVENT_DATA = 1;
  
  @Deprecated
  void onReceive(CommonEventData paramCommonEventData) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/event/commonevent/ICommonEventSubscriber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */