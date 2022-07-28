package ohos.aafwk.ability.continuation;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/continuation/DeviceConnectState.class */
public enum DeviceConnectState {
    FAILURE,
    IDLE,
    CONNECTING,
    CONNECTED,
    DIS_CONNECTING;

    public int getState() {
        throw new RuntimeException("Stub!");
    }

    public static DeviceConnectState getConnectState(int state) {
        throw new RuntimeException("Stub!");
    }
}
