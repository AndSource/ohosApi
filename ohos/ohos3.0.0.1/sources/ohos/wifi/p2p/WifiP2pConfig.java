package ohos.wifi.p2p;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/wifi/p2p/WifiP2pConfig.class */
public final class WifiP2pConfig implements Sequenceable {
    public static final int GO_BAND_2G = 1;
    public static final int GO_BAND_5G = 2;
    public static final int GO_BAND_AUTO = 0;

    public WifiP2pConfig(String groupName, String passphrase) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceAddress() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceAddress(String deviceAddress) {
        throw new RuntimeException("Stub!");
    }

    public String getGroupName() {
        throw new RuntimeException("Stub!");
    }

    public void setGroupName(String groupName) {
        throw new RuntimeException("Stub!");
    }

    public String getPassphrase() {
        throw new RuntimeException("Stub!");
    }

    public void setPassphrase(String passphrase) {
        throw new RuntimeException("Stub!");
    }

    public int getGroupOwnerBand() {
        throw new RuntimeException("Stub!");
    }

    public void setGroupOwnerBand(int groupOwnerBand) {
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
}
