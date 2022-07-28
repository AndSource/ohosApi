package ohos.media.common.sessioncore;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/media/common/sessioncore/AVPlaybackInfo.class */
public class AVPlaybackInfo implements Sequenceable {
    public static Sequenceable.Producer<AVPlaybackInfo> CREATOR;

    AVPlaybackInfo(Parcel in) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean isRemote() {
        throw new RuntimeException("Stub!");
    }

    public int getVolumeAdjustMode() {
        throw new RuntimeException("Stub!");
    }

    public int getVolumeCeiling() {
        throw new RuntimeException("Stub!");
    }

    public int getVolume() {
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
