/*     */ package ohos.wifi;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class WifiSecurity
/*     */ {
/*     */   public static final int EAP = 3;
/*     */   public static final int EAP_SUITE_B = 5;
/*     */   public static final int INVALID = -1;
/*     */   public static final int OPEN = 0;
/*     */   public static final int OWE = 6;
/*     */   public static final int PSK = 2;
/*     */   public static final int SAE = 4;
/*     */   public static final int WEP = 1;
/*     */   
/*     */   public WifiSecurity() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum EapMethod
/*     */   {
/* 106 */     NONE,
/*     */ 
/*     */     
/* 109 */     PEAP,
/*     */ 
/*     */     
/* 112 */     TLS,
/*     */ 
/*     */     
/* 115 */     TTLS,
/*     */ 
/*     */     
/* 118 */     PWD,
/*     */ 
/*     */     
/* 121 */     SIM,
/*     */ 
/*     */     
/* 124 */     AKA,
/*     */ 
/*     */     
/* 127 */     AKA_PRIME,
/*     */ 
/*     */     
/* 130 */     UNAUTH_TLS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Phase2Method
/*     */   {
/* 144 */     NONE,
/*     */ 
/*     */     
/* 147 */     PAP,
/*     */ 
/*     */     
/* 150 */     MSCHAP,
/*     */ 
/*     */     
/* 153 */     MSCHAPV2,
/*     */ 
/*     */     
/* 156 */     GTC,
/*     */ 
/*     */     
/* 159 */     SIM,
/*     */ 
/*     */     
/* 162 */     AKA,
/*     */ 
/*     */     
/* 165 */     AKA_PRIME;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/wifi/WifiSecurity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */