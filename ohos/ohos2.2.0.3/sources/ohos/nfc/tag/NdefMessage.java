package ohos.nfc.tag;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/nfc/tag/NdefMessage.class */
public class NdefMessage implements Sequenceable {
    public NdefMessage(byte[] data) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public NdefMessage(MessageRecord[] records) {
        throw new RuntimeException("Stub!");
    }

    public MessageRecord[] getRecords() {
        throw new RuntimeException("Stub!");
    }

    public int getAllRecordsLength() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
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
