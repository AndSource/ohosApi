package ohos.bundle;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.2.0.3.jar:ohos/bundle/IInstallerCallback.class */
public interface IInstallerCallback extends IRemoteBroker {
    void onFinished(int i, String str) throws RemoteException;
}
