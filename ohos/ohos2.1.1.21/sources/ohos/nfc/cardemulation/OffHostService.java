package ohos.nfc.cardemulation;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos2.1.1.21.jar:ohos/nfc/cardemulation/OffHostService.class */
public abstract class OffHostService extends Ability {
    public static final String META_DATA_NAME = "ohos.nfc.cardemulation.data.off_host_service";
    public static final String SERVICE_NAME = "ohos.nfc.cardemulation.action.OFF_HOST_SERVICE";

    @Override // ohos.aafwk.ability.Ability
    public abstract IRemoteObject onConnect(Intent intent);

    public OffHostService() {
        throw new RuntimeException("Stub!");
    }
}
