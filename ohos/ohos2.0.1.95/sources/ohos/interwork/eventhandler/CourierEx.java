package ohos.interwork.eventhandler;

import ohos.eventhandler.Courier;
import ohos.eventhandler.EventHandler;
import ohos.eventhandler.InnerEvent;
import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/interwork/eventhandler/CourierEx.class */
public final class CourierEx extends Courier {
    public static final Sequenceable.Producer<CourierEx> PRODUCER = null;

    public CourierEx(EventHandlerEx eventHandler) {
        super((EventHandler) null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.eventhandler.Courier
    public void send(InnerEvent innerEvent) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.eventhandler.Courier
    public IRemoteObject getRemoteObject() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.eventhandler.Courier, ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.eventhandler.Courier, ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
