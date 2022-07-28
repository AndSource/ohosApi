package ohos.bluetooth.ble;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/BleAdvertiseCallback.class */
public abstract class BleAdvertiseCallback {
    public static final int RESULT_FAIL_ALREADY_STARTED = 3;
    public static final int RESULT_FAIL_DATA_ILLEGAL = 1;
    public static final int RESULT_FAIL_ERROR = 4;
    public static final int RESULT_FAIL_FEATURE_UNSUPPORTED = 5;
    public static final int RESULT_FAIL_TOO_MANY_ADVERTISERS = 2;
    public static final int RESULT_SUCC = 0;

    public BleAdvertiseCallback() {
        throw new RuntimeException("Stub!");
    }

    public void startResultEvent(int result) {
        throw new RuntimeException("Stub!");
    }
}
