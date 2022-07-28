package ohos.net;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/net/NetManager.class */
public final class NetManager {
    public static final int BACKGROUND_POLICY_ALLOWLISTED = 2;
    public static final int BACKGROUND_POLICY_DISABLE = 1;
    public static final int BACKGROUND_POLICY_ENABLED = 3;

    NetManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static NetManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean setupSpecificNet(NetSpecifier netSpecifier, NetStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean addNetStatusCallback(NetSpecifier netSpecifier, NetStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeNetStatusCallback(NetStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean addDefaultNetStatusCallback(NetStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public NetHandle getDefaultNet() {
        throw new RuntimeException("Stub!");
    }

    public NetHandle[] getAllNets() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasDefaultNet() {
        throw new RuntimeException("Stub!");
    }

    public NetCapabilities getNetCapabilities(NetHandle handle) {
        throw new RuntimeException("Stub!");
    }

    public HttpProxy getDefaultHttpProxy() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAppNet(NetHandle netHandle) {
        throw new RuntimeException("Stub!");
    }

    public NetHandle getAppNet() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDefaultNetMetered() {
        throw new RuntimeException("Stub!");
    }

    public ConnectionProperties getConnectionProperties(NetHandle handle) {
        throw new RuntimeException("Stub!");
    }

    public int getBackgroundPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean sendNetConnectState(NetHandle netHandle, boolean isConnect) {
        throw new RuntimeException("Stub!");
    }
}
