package ohos.utils.net;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/utils/net/Uri.class */
public abstract class Uri implements Sequenceable, Comparable<Uri> {
    public static final Uri EMPTY_URI = null;
    public static final Sequenceable.Producer<Uri> PRODUCER = null;

    public abstract boolean isHierarchical();

    public abstract String getDecodedSchemeSpecificPart();

    public abstract String getEncodedSchemeSpecificPart();

    public abstract String getDecodedAuthority();

    public abstract String getEncodedAuthority();

    public abstract String getDecodedUserInfo();

    public abstract String getEncodedUserInfo();

    public abstract String getDecodedHost();

    public abstract String getEncodedHost();

    public abstract int getPort();

    public abstract String getDecodedPath();

    public abstract String getEncodedPath();

    public abstract List<String> getDecodedPathList();

    public abstract String getDecodedQuery();

    public abstract String getEncodedQuery();

    public abstract Map<String, List<String>> getDecodedQueryParams();

    public abstract String getDecodedFragment();

    public abstract String getEncodedFragment();

    public abstract Builder makeBuilder();

    public abstract String toString();

    Uri(String schemeStr) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRelative() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAbsolute() {
        throw new RuntimeException("Stub!");
    }

    public String getScheme() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static String encode(String str) {
        throw new RuntimeException("Stub!");
    }

    public static String encode(String str, String allow) {
        throw new RuntimeException("Stub!");
    }

    public static String decode(String str) {
        throw new RuntimeException("Stub!");
    }

    public static Uri getUriFromParts(String scheme, String ssp, String fragment) {
        throw new RuntimeException("Stub!");
    }

    public static Uri getUriFromFile(File file) {
        throw new RuntimeException("Stub!");
    }

    public static Uri getUriFromFileCanonicalPath(File file) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static Uri appendEncodedPathToUri(Uri orgUri, String path) {
        throw new RuntimeException("Stub!");
    }

    public static Uri parse(String uriStr) {
        throw new RuntimeException("Stub!");
    }

    public static Uri readFromParcel(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getLastPath() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getQueryParamsByKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getFirstQueryParamByKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getQueryParamNames() {
        throw new RuntimeException("Stub!");
    }

    public boolean getBooleanQueryParam(String key, boolean defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public Uri getLowerCaseScheme() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(Uri other) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean hasFileDescriptor() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/utils/net/Uri$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder scheme(String scheme) {
            throw new RuntimeException("Stub!");
        }

        public Builder decodedOpaqueSsp(String opaqueSsp) {
            throw new RuntimeException("Stub!");
        }

        public Builder encodedOpaqueSsp(String opaqueSsp) {
            throw new RuntimeException("Stub!");
        }

        public Builder decodedAuthority(String authority) {
            throw new RuntimeException("Stub!");
        }

        public Builder encodedAuthority(String authority) {
            throw new RuntimeException("Stub!");
        }

        public Builder decodedPath(String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder encodedPath(String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder appendDecodedPath(String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder appendEncodedPath(String path) {
            throw new RuntimeException("Stub!");
        }

        public Builder decodedQuery(String query) {
            throw new RuntimeException("Stub!");
        }

        public Builder encodedQuery(String query) {
            throw new RuntimeException("Stub!");
        }

        public Builder appendDecodedQueryParam(String key, String value) {
            throw new RuntimeException("Stub!");
        }

        public Builder clearQuery() {
            throw new RuntimeException("Stub!");
        }

        public Builder decodedFragment(String fragment) {
            throw new RuntimeException("Stub!");
        }

        public Builder encodedFragment(String fragment) {
            throw new RuntimeException("Stub!");
        }

        public Uri build() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
