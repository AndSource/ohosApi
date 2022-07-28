package ohos.net;

import java.net.InetAddress;
import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/net/ConnectionProperties.class */
public class ConnectionProperties implements Sequenceable {
    public ConnectionProperties() {
        throw new RuntimeException("Stub!");
    }

    public ConnectionProperties(ConnectionProperties source) {
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

    public List<InetAddress> getDnsServers() {
        throw new RuntimeException("Stub!");
    }

    public String getDomains() {
        throw new RuntimeException("Stub!");
    }

    public HttpProxy getHttpProxy() {
        throw new RuntimeException("Stub!");
    }

    public String getInterfaceName() {
        throw new RuntimeException("Stub!");
    }

    public List<LinkAddress> getLinkAddresses() {
        throw new RuntimeException("Stub!");
    }

    public int getMtu() {
        throw new RuntimeException("Stub!");
    }

    public String getPrivateDnsServerName() {
        throw new RuntimeException("Stub!");
    }

    public List<RouteInfo> getRoutes() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPrivateDnsActive() {
        throw new RuntimeException("Stub!");
    }
}
