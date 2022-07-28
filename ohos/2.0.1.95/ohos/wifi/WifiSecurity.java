/*     */ package ohos.wifi;
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
/*  19 */     throw new RuntimeException("Stub!");
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
/*  95 */     NONE,
/*     */ 
/*     */     
/*  98 */     PEAP,
/*     */ 
/*     */     
/* 101 */     TLS,
/*     */ 
/*     */     
/* 104 */     TTLS,
/*     */ 
/*     */     
/* 107 */     PWD,
/*     */ 
/*     */     
/* 110 */     SIM,
/*     */ 
/*     */     
/* 113 */     AKA,
/*     */ 
/*     */     
/* 116 */     AKA_PRIME,
/*     */ 
/*     */     
/* 119 */     UNAUTH_TLS;
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
/* 133 */     NONE,
/*     */ 
/*     */     
/* 136 */     PAP,
/*     */ 
/*     */     
/* 139 */     MSCHAP,
/*     */ 
/*     */     
/* 142 */     MSCHAPV2,
/*     */ 
/*     */     
/* 145 */     GTC,
/*     */ 
/*     */     
/* 148 */     SIM,
/*     */ 
/*     */     
/* 151 */     AKA,
/*     */ 
/*     */     
/* 154 */     AKA_PRIME;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/wifi/WifiSecurity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */