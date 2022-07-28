package ohos.media.common.sessioncore;

import ohos.media.common.AVDescription;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVElement.class */
public class AVElement implements Sequenceable {
    public static final int AVELEMENT_FLAG_PLAYABLE = 2;
    public static final int AVELEMENT_FLAG_SCANNABLE = 1;

    public AVElement(AVDescription description, int flags) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public int getFlags() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScannable() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPlayable() {
        throw new RuntimeException("Stub!");
    }

    public AVDescription getAVDescription() {
        throw new RuntimeException("Stub!");
    }

    public String getMediaId() {
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
