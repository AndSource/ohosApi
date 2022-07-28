package ohos.bundle;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/IInstallerCallback.class */
public interface IInstallerCallback extends IRemoteBroker {
    void onFinished(int i, String str) throws RemoteException;
}
