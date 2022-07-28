package ohos.media.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import ohos.media.image.PixelMap;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/media/common/AVMetadata.class */
public final class AVMetadata implements Sequenceable {
    public static final Sequenceable.Producer<AVMetadata> CREATOR = null;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos3.0.0.1.jar:ohos/media/common/AVMetadata$AVLongKey.class */
    public @interface AVLongKey {
        public static final String DISC = "ohos.av.metadata.DISC_NUMBER";
        public static final String DURATION = "ohos.av.metadata.DURATION";
        public static final String TOTAL_TRACKS = "ohos.av.metadata.NUM_TRACKS";
        public static final String TRACK = "ohos.av.metadata.TRACK_NUMBER";
        public static final String YEAR = "ohos.av.metadata.YEAR";
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos3.0.0.1.jar:ohos/media/common/AVMetadata$AVPixelMapKey.class */
    public @interface AVPixelMapKey {
        public static final String ICON = "ohos.av.metadata.DISPLAY_ICON";
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos3.0.0.1.jar:ohos/media/common/AVMetadata$AVTextKey.class */
    public @interface AVTextKey {
        public static final String ALBUM = "ohos.av.metadata.ALBUM";
        public static final String ALBUM_ARTIST = "ohos.av.metadata.ALBUM_ARTIST";
        public static final String ARTIST = "ohos.av.metadata.ARTIST";
        public static final String AUTHOR = "ohos.av.metadata.AUTHOR";
        public static final String COMPILATION = "ohos.av.metadata.COMPILATION";
        public static final String COMPOSER = "ohos.av.metadata.COMPOSER";
        public static final String DATE = "ohos.av.metadata.DATE";
        public static final String GENRE = "ohos.av.metadata.GENRE";
        public static final String ICON_URI = "ohos.av.metadata.DISPLAY_ICON_URI";
        public static final String META_ID = "ohos.av.metadata.MEDIA_ID";
        public static final String META_URI = "ohos.av.metadata.MEDIA_URI";
        public static final String SUBTITLE = "ohos.av.metadata.DISPLAY_SUBTITLE";
        public static final String TITLE = "ohos.av.metadata.TITLE";
        public static final String WRITER = "ohos.av.metadata.WRITER";
    }

    AVMetadata(PacMap pacMap) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getText(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getString(String key) {
        throw new RuntimeException("Stub!");
    }

    public long getLong(String key) {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getKeysSet() {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getPixelMap(String key) {
        throw new RuntimeException("Stub!");
    }

    public AVDescription getAVDescription() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/common/AVMetadata$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(AVMetadata source) {
            throw new RuntimeException("Stub!");
        }

        public Builder setText(String key, CharSequence value) {
            throw new RuntimeException("Stub!");
        }

        public Builder setString(String key, String value) {
            throw new RuntimeException("Stub!");
        }

        public Builder setLong(String key, long value) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPixelMap(String key, PixelMap value) {
            throw new RuntimeException("Stub!");
        }

        public AVMetadata build() {
            throw new RuntimeException("Stub!");
        }
    }
}
