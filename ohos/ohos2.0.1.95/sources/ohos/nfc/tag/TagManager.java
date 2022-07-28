package ohos.nfc.tag;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/tag/TagManager.class */
public abstract class TagManager {
    public static final int ISO_DEP = 3;
    public static final int MIFARE_CLASSIC = 8;
    public static final int MIFARE_ULTRALIGHT = 9;
    public static final int NDEF = 6;
    public static final int NFC_A = 1;
    public static final int NFC_B = 2;

    TagManager(TagInfo tagInfo, int profile) {
        throw new RuntimeException("Stub!");
    }

    public TagInfo getTagInfo() {
        throw new RuntimeException("Stub!");
    }

    public boolean connectTag() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTagConnected() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSendDataTimeout(int timeout) {
        throw new RuntimeException("Stub!");
    }

    public int getSendDataTimeout() {
        throw new RuntimeException("Stub!");
    }

    public byte[] sendData(byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxSendLength() {
        throw new RuntimeException("Stub!");
    }

    public void checkConnected() {
        throw new RuntimeException("Stub!");
    }
}
