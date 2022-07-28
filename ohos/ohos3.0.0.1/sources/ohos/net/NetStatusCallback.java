package ohos.net;

/* loaded from: ohos3.0.0.1.jar:ohos/net/NetStatusCallback.class */
public class NetStatusCallback {
    public NetSpecifier networkRequest;

    public NetStatusCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onAvailable(NetHandle handle) {
        throw new RuntimeException("Stub!");
    }

    public void onBlockedStatusChanged(NetHandle handle, boolean blocked) {
        throw new RuntimeException("Stub!");
    }

    public void onLosing(NetHandle handle, long maxMsToLive) {
        throw new RuntimeException("Stub!");
    }

    public void onLost(NetHandle handle) {
        throw new RuntimeException("Stub!");
    }

    public void onUnavailable() {
        throw new RuntimeException("Stub!");
    }

    public void onCapabilitiesChanged(NetHandle handle, NetCapabilities networkCapabilities) {
        throw new RuntimeException("Stub!");
    }

    public void onConnectionPropertiesChanged(NetHandle handle, ConnectionProperties connectionProperties) {
        throw new RuntimeException("Stub!");
    }
}
