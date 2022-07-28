package ohos.bundle;

import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

public interface IInstallerCallback extends IRemoteBroker {
  void onFinished(int paramInt, String paramString) throws RemoteException;
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bundle/IInstallerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */