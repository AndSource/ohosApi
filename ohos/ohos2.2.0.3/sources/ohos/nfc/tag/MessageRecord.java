package ohos.nfc.tag;

import java.util.Optional;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/nfc/tag/MessageRecord.class */
public class MessageRecord implements Sequenceable {
    public MessageRecord(short tnf, byte[] type, byte[] id, byte[] payload) {
        throw new RuntimeException("Stub!");
    }

    public short getTnf() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getType() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getId() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getPayload() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public static MessageRecord buildApplicationRecord(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static MessageRecord buildMime(String mimeType, byte[] mimeData) {
        throw new RuntimeException("Stub!");
    }

    public static MessageRecord buildExternal(String domain, String type, byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public static MessageRecord buildTextRecord(String languageCode, String text) {
        throw new RuntimeException("Stub!");
    }

    public Optional<Uri> buildUri() {
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
