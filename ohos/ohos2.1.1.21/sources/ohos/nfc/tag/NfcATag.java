package ohos.nfc.tag;

/* loaded from: ohos2.1.1.21.jar:ohos/nfc/tag/NfcATag.class */
public class NfcATag extends TagManager {
    public static final String EXTRA_ATQA = "atqa";
    public static final String EXTRA_SAK = "sak";

    NfcATag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public static NfcATag getInstance(TagInfo tagInfo) {
        throw new RuntimeException("Stub!");
    }

    public short getSak() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getAtqa() {
        throw new RuntimeException("Stub!");
    }
}
