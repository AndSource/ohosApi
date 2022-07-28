package ohos.telephony;

import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/telephony/CellularDataInfoManager.class */
public class CellularDataInfoManager {
    public static final int DATA_FLOW_TYPE_DORMANT = 4;
    public static final int DATA_FLOW_TYPE_DOWN = 1;
    public static final int DATA_FLOW_TYPE_NONE = 0;
    public static final int DATA_FLOW_TYPE_UP = 2;
    public static final int DATA_FLOW_TYPE_UPDOWN = 3;
    public static final int DATA_STATE_CONNECTED = 2;
    public static final int DATA_STATE_CONNECTING = 1;
    public static final int DATA_STATE_DISCONNECTED = 0;
    public static final int DATA_STATE_SUSPENDED = 3;
    public static final int DATA_STATE_UNKNOWN = -1;

    CellularDataInfoManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static CellularDataInfoManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int getCellularDataFlowType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCellularDataEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCellularDataRoamingEnabled(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public int getCellularDataState(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultCellularDataSlotId() {
        throw new RuntimeException("Stub!");
    }

    public void addObserver(CellularDataStateObserver observer, int mask) {
        throw new RuntimeException("Stub!");
    }

    public void removeObserver(CellularDataStateObserver observer) {
        throw new RuntimeException("Stub!");
    }
}
