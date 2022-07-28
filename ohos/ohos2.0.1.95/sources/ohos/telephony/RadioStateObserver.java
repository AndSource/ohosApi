package ohos.telephony;

import java.util.List;
import ohos.eventhandler.EventRunner;

/* loaded from: ohos2.0.1.95.jar:ohos/telephony/RadioStateObserver.class */
public class RadioStateObserver {
    public static final int OBSERVE_MASK_CELL_INFO = 4;
    public static final int OBSERVE_MASK_NETWORK_STATE = 1;
    public static final int OBSERVE_MASK_SIGNAL_INFO = 2;
    protected int slotId;

    public RadioStateObserver(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public RadioStateObserver(int slotId, EventRunner runner) {
        throw new RuntimeException("Stub!");
    }

    public void onNetworkStateUpdated(NetworkState networkState) {
        throw new RuntimeException("Stub!");
    }

    public void onSignalInfoUpdated(List<SignalInformation> signalInfos) {
        throw new RuntimeException("Stub!");
    }
}
