package ohos.net;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/net/NetCapabilities.class */
public final class NetCapabilities implements Sequenceable {
    public static final int BEARER_BLUETOOTH = 2;
    public static final int BEARER_CELLULAR = 0;
    public static final int BEARER_ETHERNET = 3;
    public static final int BEARER_LOWPAN = 6;
    public static final int BEARER_VPN = 4;
    public static final int BEARER_WIFI = 1;
    public static final int BEARER_WIFI_AWARE = 5;
    public static final int NET_CAPABILITY_BIP0 = 25;
    public static final int NET_CAPABILITY_BIP1 = 26;
    public static final int NET_CAPABILITY_BIP2 = 27;
    public static final int NET_CAPABILITY_BIP3 = 28;
    public static final int NET_CAPABILITY_BIP4 = 29;
    public static final int NET_CAPABILITY_BIP5 = 30;
    public static final int NET_CAPABILITY_BIP6 = 31;
    public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
    public static final int NET_CAPABILITY_CBS = 5;
    public static final int NET_CAPABILITY_DUN = 2;
    public static final int NET_CAPABILITY_EIMS = 10;
    public static final int NET_CAPABILITY_FOREGROUND = 19;
    public static final int NET_CAPABILITY_FOTA = 3;
    public static final int NET_CAPABILITY_IA = 7;
    public static final int NET_CAPABILITY_IMS = 4;
    public static final int NET_CAPABILITY_INTERNAL_DEFAULT = 32;
    public static final int NET_CAPABILITY_INTERNET = 12;
    public static final int NET_CAPABILITY_MCX = 23;
    public static final int NET_CAPABILITY_MMS = 0;
    public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
    public static final int NET_CAPABILITY_NOT_METERED = 11;
    public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
    public static final int NET_CAPABILITY_NOT_ROAMING = 18;
    public static final int NET_CAPABILITY_NOT_SUSPENDED = 21;
    public static final int NET_CAPABILITY_NOT_VPN = 15;
    public static final int NET_CAPABILITY_RCS = 8;
    public static final int NET_CAPABILITY_SUPL = 1;
    public static final int NET_CAPABILITY_TRUSTED = 14;
    public static final int NET_CAPABILITY_VALIDATED = 16;
    public static final int NET_CAPABILITY_WIFI_P2P = 6;
    public static final int NET_CAPABILITY_XCAP = 9;
    public static final long RESTRICTED_CAPABILITIES = 8390588;
    public static final int SIGNAL_STRENGTH_UNSPECIFIED = Integer.MIN_VALUE;
    public static final long UNRESTRICTED_CAPABILITIES = 4294971459L;

    public NetCapabilities() {
        throw new RuntimeException("Stub!");
    }

    public NetCapabilities(NetCapabilities nc) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasCap(int capability) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasBearer(int bearer) {
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

    public int getLinkDownstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }

    public int getLinkUpstreamBandwidthKbps() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
