package ohos.aafwk.ability;

import ohos.bundle.ElementName;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/IAbilityConnection.class */
public interface IAbilityConnection {
    void onAbilityConnectDone(ElementName elementName, IRemoteObject iRemoteObject, int i);

    void onAbilityDisconnectDone(ElementName elementName, int i);
}
