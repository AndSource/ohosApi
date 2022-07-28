package ohos.aafwk.ability;

import ohos.bundle.ElementName;
import ohos.rpc.IRemoteObject;

public interface IAbilityConnection {
  void onAbilityConnectDone(ElementName paramElementName, IRemoteObject paramIRemoteObject, int paramInt);
  
  void onAbilityDisconnectDone(ElementName paramElementName, int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/aafwk/ability/IAbilityConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */