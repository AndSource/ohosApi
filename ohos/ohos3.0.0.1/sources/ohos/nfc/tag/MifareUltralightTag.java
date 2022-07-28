package ohos.nfc.tag;

import java.io.IOException;

/* loaded from: ohos3.0.0.1.jar:ohos/nfc/tag/MifareUltralightTag.class */
public class MifareUltralightTag extends TagManager {
    public static final int MIFARE_ULTRALIGHT = 1;
    public static final int MIFARE_ULTRALIGHT_C = 2;
    public static final int MIFARE_UNKNOWN = -1;

    MifareUltralightTag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public static MifareUltralightTag getInstance(TagInfo tagInfo) {
        throw new RuntimeException("Stub!");
    }

    public int getMifareType() {
        throw new RuntimeException("Stub!");
    }

    public byte[] readFourPages(int pageOffset) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void writeOnePage(int pageOffset, byte[] data) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
