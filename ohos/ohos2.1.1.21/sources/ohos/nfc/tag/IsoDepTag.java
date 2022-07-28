package ohos.nfc.tag;

import java.util.Optional;

/* loaded from: ohos2.1.1.21.jar:ohos/nfc/tag/IsoDepTag.class */
public class IsoDepTag extends TagManager {
    public static final String EXTRA_HILAYER_RESP = "hiresp";
    public static final String EXTRA_HIST_BYTES = "histbytes";

    public IsoDepTag(TagInfo tagInfo) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public static Optional<IsoDepTag> getInstance(TagInfo tagInfo) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getHistoricalBytes() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getHiLayerResponse() {
        throw new RuntimeException("Stub!");
    }
}
