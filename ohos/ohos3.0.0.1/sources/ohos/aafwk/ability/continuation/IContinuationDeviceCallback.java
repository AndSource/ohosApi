package ohos.aafwk.ability.continuation;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/continuation/IContinuationDeviceCallback.class */
public interface IContinuationDeviceCallback {
    @Deprecated
    void onDeviceConnectDone(String str, String str2);

    @Deprecated
    void onDeviceDisconnectDone(String str);

    default void onConnected(ContinuationDeviceInfo deviceInfo) {
        throw new RuntimeException("Stub!");
    }

    default void onDisconnected(String deviceId) {
        throw new RuntimeException("Stub!");
    }
}
