package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/event/commonevent/ICommonEventManager.class */
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
    void subscribeCommonEvent(ICommonEventSubscriber iCommonEventSubscriber, CommonEventSubscribeInfo commonEventSubscribeInfo) throws RemoteException;

    @Deprecated
    void unsubscribeCommonEvent(ICommonEventSubscriber iCommonEventSubscriber) throws RemoteException;

    @Deprecated
    void publishCommonEvent(CommonEventData commonEventData, CommonEventPublishInfo commonEventPublishInfo, ICommonEventSubscriber iCommonEventSubscriber) throws RemoteException;
}
