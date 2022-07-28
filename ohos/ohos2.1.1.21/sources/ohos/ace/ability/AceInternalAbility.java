package ohos.ace.ability;

import ohos.rpc.MessageOption;
import ohos.rpc.MessageParcel;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.1.1.21.jar:ohos/ace/ability/AceInternalAbility.class */
public class AceInternalAbility {

    /* loaded from: ohos2.1.1.21.jar:ohos/ace/ability/AceInternalAbility$AceInternalAbilityHandler.class */
    public interface AceInternalAbilityHandler {
        boolean onRemoteRequest(int i, MessageParcel messageParcel, MessageParcel messageParcel2, MessageOption messageOption) throws RemoteException;
    }

    public AceInternalAbility(String bundleName, String abilityName) {
        throw new RuntimeException("Stub!");
    }

    public AceInternalAbility(String abilityName) {
        throw new RuntimeException("Stub!");
    }

    public void setInternalAbilityHandler(AceInternalAbilityHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void setInternalAbilityHandler(AceInternalAbilityHandler handler, AceAbility ability) {
        throw new RuntimeException("Stub!");
    }
}
