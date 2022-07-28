package ohos.event.commonevent;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.0.1.95.jar:ohos/event/commonevent/ICommonEventSubscriber.class */
public interface ICommonEventSubscriber extends IRemoteBroker {
    public static final String DESCRIPTOR = "ohos.event.commonevent.ICommonEventSubscriber";
    public static final int RECV_COMMON_EVENT_DATA = 1;

    void onReceive(CommonEventData commonEventData) throws RemoteException;
}
