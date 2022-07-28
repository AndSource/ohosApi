package ohos.ai.engine.pluginservice;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/engine/pluginservice/ILoadPluginCallback.class */
public interface ILoadPluginCallback extends IRemoteBroker {
    void onResult(int i) throws RemoteException;

    void onProgress(int i) throws RemoteException;
}
