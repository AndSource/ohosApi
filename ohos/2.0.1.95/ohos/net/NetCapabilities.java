/*    */ package ohos.net;
/*    */ import ohos.utils.Parcel;
/*    */ 
/*    */ public final class NetCapabilities implements Sequenceable {
/*    */   public static final int BEARER_BLUETOOTH = 2;
/*    */   public static final int BEARER_CELLULAR = 0;
/*    */   public static final int BEARER_ETHERNET = 3;
/*    */   public static final int BEARER_LOWPAN = 6;
/*    */   public static final int BEARER_VPN = 4;
/*    */   public static final int BEARER_WIFI = 1;
/*    */   public static final int BEARER_WIFI_AWARE = 5;
/*    */   public static final int NET_CAPABILITY_BIP0 = 25;
/*    */   public static final int NET_CAPABILITY_BIP1 = 26;
/*    */   public static final int NET_CAPABILITY_BIP2 = 27;
/*    */   public static final int NET_CAPABILITY_BIP3 = 28;
/*    */   public static final int NET_CAPABILITY_BIP4 = 29;
/*    */   public static final int NET_CAPABILITY_BIP5 = 30;
/*    */   public static final int NET_CAPABILITY_BIP6 = 31;
/*    */   public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
/*    */   public static final int NET_CAPABILITY_CBS = 5;
/*    */   public static final int NET_CAPABILITY_DUN = 2;
/*    */   public static final int NET_CAPABILITY_EIMS = 10;
/*    */   public static final int NET_CAPABILITY_FOREGROUND = 19;
/*    */   public static final int NET_CAPABILITY_FOTA = 3;
/*    */   
/*    */   public NetCapabilities() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static final int NET_CAPABILITY_IA = 7; public static final int NET_CAPABILITY_IMS = 4; public static final int NET_CAPABILITY_INTERNAL_DEFAULT = 32; public static final int NET_CAPABILITY_INTERNET = 12; public static final int NET_CAPABILITY_MCX = 23; public static final int NET_CAPABILITY_MMS = 0;
/*    */   public static final int NET_CAPABILITY_NOT_CONGESTED = 20;
/*    */   public static final int NET_CAPABILITY_NOT_METERED = 11;
/*    */   public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
/*    */   public static final int NET_CAPABILITY_NOT_ROAMING = 18;
/*    */   
/*    */   public NetCapabilities(NetCapabilities nc) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public static final int NET_CAPABILITY_NOT_SUSPENDED = 21; public static final int NET_CAPABILITY_NOT_VPN = 15; public static final int NET_CAPABILITY_RCS = 8; public static final int NET_CAPABILITY_SUPL = 1; public static final int NET_CAPABILITY_TRUSTED = 14; public static final int NET_CAPABILITY_VALIDATED = 16; public static final int NET_CAPABILITY_WIFI_P2P = 6; public static final int NET_CAPABILITY_XCAP = 9; public static final long RESTRICTED_CAPABILITIES = 8390588L; public static final int SIGNAL_STRENGTH_UNSPECIFIED = -2147483648; public static final long UNRESTRICTED_CAPABILITIES = 4294971459L; public boolean equals(Object obj) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasCap(int capability) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasBearer(int bearer) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel dest) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel data) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLinkDownstreamBandwidthKbps() {
/* 74 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLinkUpstreamBandwidthKbps() {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/net/NetCapabilities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */