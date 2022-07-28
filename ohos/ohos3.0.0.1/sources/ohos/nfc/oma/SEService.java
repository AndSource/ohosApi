package ohos.nfc.oma;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/nfc/oma/SEService.class */
public final class SEService {

    /* loaded from: ohos3.0.0.1.jar:ohos/nfc/oma/SEService$OnCallback.class */
    public interface OnCallback {
        void serviceConnected();
    }

    public SEService(Context context, OnCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }

    public void shutdown() {
        throw new RuntimeException("Stub!");
    }

    public Reader[] getReaders() {
        throw new RuntimeException("Stub!");
    }

    public String getVersion() {
        throw new RuntimeException("Stub!");
    }
}
