package ohos.net;

import java.net.InetAddress;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/net/RouteInfo.class */
public final class RouteInfo implements Sequenceable {
    public RouteInfo() {
        throw new RuntimeException("Stub!");
    }

    public RouteInfo(IpPrefix destination, InetAddress gateway, String iface, int type) {
        throw new RuntimeException("Stub!");
    }

    public String getInterface() {
        throw new RuntimeException("Stub!");
    }

    public IpPrefix getDestination() {
        throw new RuntimeException("Stub!");
    }

    public InetAddress getGateway() {
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

    public boolean isDefaultRoute() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasGateway() {
        throw new RuntimeException("Stub!");
    }

    public boolean matches(InetAddress destination) {
        throw new RuntimeException("Stub!");
    }
}
