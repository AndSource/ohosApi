package ohos.app;

import ohos.eventhandler.EventHandler;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/app/GeneralReceiver.class */
public class GeneralReceiver implements Sequenceable {
    public static final Sequenceable.Producer<GeneralReceiver> PRODUCER = null;

    public GeneralReceiver() {
        throw new RuntimeException("Stub!");
    }

    public GeneralReceiver(EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void sendResult(int resultCode, PacMap resultData) {
        throw new RuntimeException("Stub!");
    }

    protected void onReceive(int code, PacMap data) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
