package ohos.media.common;

import ohos.media.audio.AudioStreamInfo;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/media/common/AudioStreamProperty.class */
public class AudioStreamProperty implements Sequenceable {
    public static final Sequenceable.Producer<AudioStreamProperty> CREATOR = null;

    AudioStreamProperty() {
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

    /* loaded from: ohos3.0.0.1.jar:ohos/media/common/AudioStreamProperty$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(AudioStreamProperty asp) {
            throw new RuntimeException("Stub!");
        }

        public AudioStreamProperty build() {
            throw new RuntimeException("Stub!");
        }

        public Builder withStreamUsage(AudioStreamInfo.StreamUsage usage) {
            throw new RuntimeException("Stub!");
        }

        public Builder withContentType(AudioStreamInfo.ContentType contentType) {
            throw new RuntimeException("Stub!");
        }

        public Builder withStreamFlags(AudioStreamInfo.AudioStreamFlag... flags) {
            throw new RuntimeException("Stub!");
        }

        public Builder isTactileChannelClosed(boolean closed) {
            throw new RuntimeException("Stub!");
        }
    }
}
