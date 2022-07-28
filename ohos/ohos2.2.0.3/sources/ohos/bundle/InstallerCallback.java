package ohos.bundle;

import ohos.rpc.IRemoteObject;
import ohos.rpc.MessageOption;
import ohos.rpc.MessageParcel;
import ohos.rpc.RemoteException;
import ohos.rpc.RemoteObject;

/* loaded from: ohos2.2.0.3.jar:ohos/bundle/InstallerCallback.class */
public abstract class InstallerCallback extends RemoteObject implements IInstallerCallback {
    @Override // ohos.bundle.IInstallerCallback
    public abstract void onFinished(int i, String str);

    public InstallerCallback() {
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
