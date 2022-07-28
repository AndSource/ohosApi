package ohos.wifi;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/wifi/WifiLinkedInfo.class */
public final class WifiLinkedInfo implements Sequenceable {

    /* loaded from: ohos2.2.0.3.jar:ohos/wifi/WifiLinkedInfo$ConnState.class */
    public enum ConnState {
        SCANNING,
        CONNECTING,
        AUTHENTICATING,
        OBTAINING_IPADDR,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED,
        UNKNOWN
    }

    WifiLinkedInfo() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getBssid() {
        throw new RuntimeException("Stub!");
    }

    public int getRssi() {
        throw new RuntimeException("Stub!");
    }

    public int getFrequency() {
        throw new RuntimeException("Stub!");
    }

    public String getSsid() {
        throw new RuntimeException("Stub!");
    }

    public int getLinkSpeed() {
        throw new RuntimeException("Stub!");
    }

    public int getBand() {
        throw new RuntimeException("Stub!");
    }

    public String getMacAddress() {
        throw new RuntimeException("Stub!");
    }

    public int getIpAddress() {
        throw new RuntimeException("Stub!");
    }

    public ConnState getConnState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isHiddenSsid() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRestricted() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
