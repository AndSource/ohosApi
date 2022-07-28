package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/event/commonevent/ICommonEventSubscriber.class */
public interface ICommonEventSubscriber extends IRemoteBroker {
    @Deprecated
    public static final String DESCRIPTOR = "ohos.event.commonevent.ICommonEventSubscriber";
    @Deprecated
    public static final int RECV_COMMON_EVENT_DATA = 1;

    @Deprecated
    void onReceive(CommonEventData commonEventData) throws RemoteException;
}
