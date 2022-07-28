package ohos.net;

import java.net.InetAddress;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/net/LinkAddress.class */
public class LinkAddress implements Sequenceable {
    public LinkAddress(InetAddress address, int prefixLength, int flags, int scope) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    public InetAddress getAddress() {
        throw new RuntimeException("Stub!");
    }

    public int getPrefixLength() {
        throw new RuntimeException("Stub!");
    }

    public int getFlags() {
        throw new RuntimeException("Stub!");
    }

    public int getScope() {
        throw new RuntimeException("Stub!");
    }
}
