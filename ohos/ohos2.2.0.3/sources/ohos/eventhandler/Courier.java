package ohos.eventhandler;

import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/eventhandler/Courier.class */
public class Courier implements Sequenceable {
    public static final Sequenceable.Producer<Courier> PRODUCER = null;

    public Courier(EventHandler eventHandler) {
        throw new RuntimeException("Stub!");
    }

    public Courier(IRemoteObject remote) {
        throw new RuntimeException("Stub!");
    }

    public void send(InnerEvent innerEvent) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public IRemoteObject getRemoteObject() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
