package ohos.miscservices.download;

import ohos.app.Context;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/miscservices/download/DownloadConfig.class */
public class DownloadConfig implements Sequenceable {
    public static final int NETWORK_MOBILE = 1;
    public static final int NETWORK_WIFI = 2;

    DownloadConfig(Builder builder) {
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

    /* loaded from: ohos2.1.1.21.jar:ohos/miscservices/download/DownloadConfig$Builder.class */
    public static class Builder {
        public Builder(Context context, Uri uri) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPath(String dir, String subPath) {
            throw new RuntimeException("Stub!");
        }

        public Builder addHttpheader(String header, String content) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDescription(String description) {
            throw new RuntimeException("Stub!");
        }

        public Builder setNetworkRestriction(int flag) {
            throw new RuntimeException("Stub!");
        }

        public Builder enableRoaming(boolean flag) {
            throw new RuntimeException("Stub!");
        }

        public Builder enableMetered(boolean flag) {
            throw new RuntimeException("Stub!");
        }

        public DownloadConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
