package ohos.nfc.tag;

import ohos.aafwk.content.IntentParams;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/nfc/tag/TagInfo.class */
public class TagInfo implements Sequenceable {
    public static final String EXTRA_TAG_EXTRAS = "extra_nfc_TAG_EXTRAS";
    public static final String EXTRA_TAG_HANDLE = "extra_nfc_TAG_HANDLE";

    TagInfo(byte[] id, int[] profiles, IntentParams[] extras, int tagHandle) {
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

    public byte[] getTagId() {
        throw new RuntimeException("Stub!");
    }

    public int[] getTagSupportedProfiles() {
        throw new RuntimeException("Stub!");
    }

    public boolean isProfileSupported(int profile) {
        throw new RuntimeException("Stub!");
    }
}
