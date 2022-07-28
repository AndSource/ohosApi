package ohos.net;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/net/NetSpecifier.class */
public final class NetSpecifier implements Sequenceable {
    NetSpecifier() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel dest) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel data) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/net/NetSpecifier$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public NetSpecifier build() {
            throw new RuntimeException("Stub!");
        }

        public Builder clearCapabilities() {
            throw new RuntimeException("Stub!");
        }

        public Builder addCapability(int capability) {
            throw new RuntimeException("Stub!");
        }

        public Builder removeCapability(int capability) {
            throw new RuntimeException("Stub!");
        }

        public Builder addBearer(int bearer) {
            throw new RuntimeException("Stub!");
        }

        public Builder removeBearer(int bearer) {
            throw new RuntimeException("Stub!");
        }

        public Builder setBearerPrivateIdentifier(String bearerPrivateIdentifier) {
            throw new RuntimeException("Stub!");
        }
    }
}
