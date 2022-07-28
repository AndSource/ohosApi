package ohos.media.common;

import ohos.media.image.PixelMap;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/media/common/AVDescription.class */
public final class AVDescription implements Sequenceable {
    public static final Sequenceable.Producer<AVDescription> CREATOR = null;

    AVDescription(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public String getMediaId() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getSubTitle() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getIcon() {
        throw new RuntimeException("Stub!");
    }

    public Uri getIconUri() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getExtras() {
        throw new RuntimeException("Stub!");
    }

    public Uri getMediaUri() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/common/AVDescription$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder setMediaId(String mediaId) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTitle(CharSequence title) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSubTitle(CharSequence subTitle) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDescription(CharSequence description) {
            throw new RuntimeException("Stub!");
        }

        public Builder setIcon(PixelMap icon) {
            throw new RuntimeException("Stub!");
        }

        public Builder setIconUri(Uri iconUri) {
            throw new RuntimeException("Stub!");
        }

        public Builder setExtras(PacMap extras) {
            throw new RuntimeException("Stub!");
        }

        public Builder setIMediaUri(Uri mediaUri) {
            throw new RuntimeException("Stub!");
        }

        public AVDescription build() {
            throw new RuntimeException("Stub!");
        }
    }
}
