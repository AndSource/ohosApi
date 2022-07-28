package ohos.nfc.cardemulation;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.IntentParams;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/cardemulation/HostService.class */
public abstract class HostService extends Ability {
    public static final String META_DATA_NAME = "ohos.nfc.cardemulation.data.host_service";
    public static final String SERVICE_NAME = "ohos.nfc.cardemulation.action.HOST_SERVICE";

    public abstract byte[] handleRemoteCommand(byte[] bArr, IntentParams intentParams);

    public abstract void disabledCallback(int i);

    public HostService() {
        throw new RuntimeException("Stub!");
    }

    public final void sendResponse(byte[] response) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
