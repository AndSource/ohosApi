package ohos.nfc.tag;

import java.io.IOException;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/tag/NdefTag.class */
public class NdefTag extends TagManager {
    public static final String NDEF_TYPE_1 = "nfcforum.type1";
    public static final String NDEF_TYPE_2 = "nfcforum.type2";
    public static final String NDEF_TYPE_3 = "nfcforum.type3";
    public static final String NDEF_TYPE_4 = "nfcforum.type4";
    public static final String NDEF_TYPE_ICODE_SLI = "nxp.icode.sli";
    public static final String NDEF_TYPE_MIFARE_CLASSIC = "nxp.mifare.classic";

    public NdefTag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public NdefMessage getNdefMessage() {
        throw new RuntimeException("Stub!");
    }

    public int getNdefMaxSize() {
        throw new RuntimeException("Stub!");
    }

    public String getTagType() {
        throw new RuntimeException("Stub!");
    }

    public NdefMessage readNdefMessage() throws IOException, IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void writeNdefMessage(NdefMessage msg) throws IOException, IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean canSetReadOnly() {
        throw new RuntimeException("Stub!");
    }

    public boolean setReadOnly() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public boolean isNdefWritable() {
        throw new RuntimeException("Stub!");
    }
}
