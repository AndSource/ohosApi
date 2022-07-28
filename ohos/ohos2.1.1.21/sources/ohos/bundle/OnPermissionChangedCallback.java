package ohos.bundle;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.IRemoteObject;
import ohos.rpc.MessageOption;
import ohos.rpc.MessageParcel;
import ohos.rpc.RemoteException;
import ohos.rpc.RemoteObject;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/OnPermissionChangedCallback.class */
public abstract class OnPermissionChangedCallback extends RemoteObject implements IRemoteBroker {
    public abstract void onChanged(int i);

    public OnPermissionChangedCallback() {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.RemoteObject
    public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteBroker
    public IRemoteObject asObject() {
        throw new RuntimeException("Stub!");
    }
}
