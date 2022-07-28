package ohos.aafwk.ability.continuation;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/continuation/IContinuationRegisterManager.class */
public interface IContinuationRegisterManager {
    void register(String str, ExtraParams extraParams, IContinuationDeviceCallback iContinuationDeviceCallback, RequestCallback requestCallback);

    void unregister(int i, RequestCallback requestCallback);

    void updateConnectStatus(int i, String str, int i2, RequestCallback requestCallback);

    void showDeviceList(int i, ExtraParams extraParams, RequestCallback requestCallback);

    void disconnect();
}
