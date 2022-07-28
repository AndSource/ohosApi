package ohos.nfc.tag;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/tag/IsoDepTag.class */
public class IsoDepTag extends TagManager {
    public static final String EXTRA_HILAYER_RESP = "hiresp";
    public static final String EXTRA_HIST_BYTES = "histbytes";

    public IsoDepTag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public byte[] getHistoricalBytes() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getHiLayerResponse() {
        throw new RuntimeException("Stub!");
    }
}
