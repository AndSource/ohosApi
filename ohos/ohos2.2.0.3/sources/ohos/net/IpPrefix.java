package ohos.net;

import java.net.InetAddress;
import java.util.Optional;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/net/IpPrefix.class */
public class IpPrefix implements Sequenceable {
    IpPrefix() {
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

    public int getPrefixLength() {
        throw new RuntimeException("Stub!");
    }

    public Optional<InetAddress> getAddress() {
        throw new RuntimeException("Stub!");
    }
}
