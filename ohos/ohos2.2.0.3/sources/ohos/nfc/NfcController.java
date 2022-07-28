package ohos.nfc;

import java.util.List;
import ohos.aafwk.ability.Ability;
import ohos.app.Context;
import ohos.event.intentagent.IntentAgent;
import ohos.interwork.utils.PacMapEx;
import ohos.nfc.tag.TagInfo;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.IRemoteObject;
import ohos.rpc.MessageOption;
import ohos.rpc.MessageParcel;
import ohos.rpc.RemoteException;
import ohos.rpc.RemoteObject;

/* loaded from: ohos2.2.0.3.jar:ohos/nfc/NfcController.class */
public final class NfcController {
    public static final String EXTRA_NFC_STATE = "extra_nfc_state";
    public static final String EXTRA_NFC_TRANSACTION = "extra_nfc_transaction";
    public static final String EXTRA_TAG_INFO = "extra_nfc_TAG_INFO";
    public static final String FIELD_OFF_DETECTED = "usual.event.nfc.action.RF_FIELD_OFF_DETECTED";
    public static final String FIELD_ON_DETECTED = "usual.event.nfc.action.RF_FIELD_ON_DETECTED";
    public static final String STATE_CHANGED = "usual.event.nfc.action.ADAPTER_STATE_CHANGED";
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 3;
    public static final int STATE_TURNING_OFF = 4;
    public static final int STATE_TURNING_ON = 2;

    /* loaded from: ohos2.2.0.3.jar:ohos/nfc/NfcController$ReaderModeCallback.class */
    public interface ReaderModeCallback extends IRemoteBroker {
        public static final int TRANSACTION_ON_CALLBACK = 1;

        void onTagDiscovered(TagInfo tagInfo);
    }

    NfcController(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized NfcController getInstance(Context context) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean openNfc() throws NfcPermissionException {
        throw new RuntimeException("Stub!");
    }

    public boolean closeNfc() throws NfcPermissionException {
        throw new RuntimeException("Stub!");
    }

    public boolean isNfcOpen() {
        throw new RuntimeException("Stub!");
    }

    public int getNfcState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNfcAvailable() {
        throw new RuntimeException("Stub!");
    }

    public void setReaderMode(Ability ability, ReaderModeCallback callback, int flags, PacMapEx pacMapEx) {
        throw new RuntimeException("Stub!");
    }

    public void unsetReaderMode(Ability ability) {
        throw new RuntimeException("Stub!");
    }

    public void registerForegroundDispatch(Ability ability, IntentAgent intent, List<String> filters, String[][] profiles) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterForegroundDispatch(Ability ability) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/nfc/NfcController$ReaderModeCallbackStub.class */
    public class ReaderModeCallbackStub extends RemoteObject implements ReaderModeCallback {
        public ReaderModeCallbackStub(ReaderModeCallback callback) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.rpc.RemoteObject
        public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.rpc.IRemoteBroker
        public IRemoteObject asObject() {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.nfc.NfcController.ReaderModeCallback
        public void onTagDiscovered(TagInfo tagInfo) {
            throw new RuntimeException("Stub!");
        }
    }
}
