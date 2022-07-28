package ohos.wifi;

import java.util.List;
import java.util.Optional;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/wifi/WifiDevice.class */
public final class WifiDevice {
    WifiDevice(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static WifiDevice getInstance(Context context) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiActive() {
        throw new RuntimeException("Stub!");
    }

    public boolean scan() {
        throw new RuntimeException("Stub!");
    }

    public List<WifiScanInfo> getScanInfoList() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }

    public Optional<WifiLinkedInfo> getLinkedInfo() {
        throw new RuntimeException("Stub!");
    }

    public Optional<IpInfo> getIpInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getSignalLevel(int rssi, int band) {
        throw new RuntimeException("Stub!");
    }

    public String getCountryCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFeatureSupported(long featureId) {
        throw new RuntimeException("Stub!");
    }
}
