package ohos.telephony;

import ohos.eventhandler.EventRunner;

/* loaded from: ohos2.1.1.21.jar:ohos/telephony/CellularDataStateObserver.class */
public class CellularDataStateObserver {
    public static final int OBSERVE_MASK_DATA_CONNECTION_STATE = 1;
    public static final int OBSERVE_MASK_DATA_FLOW = 2;

    public CellularDataStateObserver(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public CellularDataStateObserver(int slotId, EventRunner runner) {
        throw new RuntimeException("Stub!");
    }

    public void onCellularDataFlow(int direction) {
        throw new RuntimeException("Stub!");
    }

    public void onCellularDataConnectStateUpdated(int state, int networkType) {
        throw new RuntimeException("Stub!");
    }
}
