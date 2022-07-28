package ohos.ai.engine.pluginservice;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

public interface ILoadPluginCallback extends IRemoteBroker {
  void onResult(int paramInt) throws RemoteException;
  
  void onProgress(int paramInt) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ai/engine/pluginservice/ILoadPluginCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */