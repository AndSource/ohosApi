/*     */ package ohos.biometrics.authentication;
/*     */ 
/*     */ import java.security.Signature;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.Mac;
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.app.Context;
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.Sequenceable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BiometricAuthentication
/*     */ {
/*     */   public static final int BA_CHECK_AUTH_TYPE_NOT_SUPPORT = 1;
/*     */   public static final int BA_CHECK_DISTRIBUTED_AUTH_NOT_SUPPORT = 3;
/*     */   public static final int BA_CHECK_NOT_ENROLLED = 4;
/*     */   public static final int BA_CHECK_SECURE_LEVEL_NOT_SUPPORT = 2;
/*     */   public static final int BA_CHECK_SUPPORTED = 0;
/*     */   public static final int BA_CHECK_UNAVAILABLE = 5;
/*     */   public static final int BA_FAILED = -1;
/*     */   public static final int BA_SUCCESS = 0;
/*     */   public static final int INVALID_BIOMETRIC_ID = -1;
/*     */   
/*     */   BiometricAuthentication(Context context) {
/*  26 */     throw new RuntimeException("Stub!");
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
/*     */   public static BiometricAuthentication getInstance(Ability ability) throws IllegalAccessException {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   public int checkAuthenticationAvailability(AuthType type, SecureLevel level, boolean isLocalAuth) {
/*  63 */     throw new RuntimeException("Stub!");
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
/*     */   public int execAuthenticationAction(AuthType type, SecureLevel level, boolean isLocalAuth, boolean isAppAuthDialog, SystemAuthDialogInfo information) {
/*  83 */     throw new RuntimeException("Stub!");
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
/*     */   public AuthenticationTips getAuthenticationTips() {
/*  95 */     throw new RuntimeException("Stub!");
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
/*     */   public int cancelAuthenticationAction() {
/* 109 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSecureObjectSignature(Signature sign) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Signature getSecureObjectSignature() {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSecureObjectCipher(Cipher cipher) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Cipher getSecureObjectCipher() {
/* 165 */     throw new RuntimeException("Stub!");
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
/*     */   public void setSecureObjectMac(Mac mac) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mac getSecureObjectMac() {
/* 192 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AuthType
/*     */   {
/* 283 */     AUTH_TYPE_BIOMETRIC_ALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     AUTH_TYPE_BIOMETRIC_FINGERPRINT_ONLY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 293 */     AUTH_TYPE_BIOMETRIC_FACE_ONLY;
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
/*     */   public static class AuthenticationTips
/*     */   {
/*     */     public AuthenticationTips() {
/* 307 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     public int errorCode = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 321 */     public int tipEvent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 327 */     public String tipInfo = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 334 */     public int tipValue = 0;
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
/*     */   public enum SecureLevel
/*     */   {
/* 359 */     SECURE_LEVEL_S1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     SECURE_LEVEL_S2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 369 */     SECURE_LEVEL_S3,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     SECURE_LEVEL_S4;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class SystemAuthDialogInfo
/*     */     implements Sequenceable
/*     */   {
/*     */     public String authDescription;
/*     */     
/*     */     public String authTitle;
/*     */     
/*     */     public String customButtonText;
/*     */     
/*     */     public SystemAuthDialogInfo() {
/* 388 */       throw new RuntimeException("Stub!");
/*     */     } public boolean marshalling(Parcel out) {
/* 390 */       throw new RuntimeException("Stub!");
/*     */     } public boolean unmarshalling(Parcel in) {
/* 392 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/biometrics/authentication/BiometricAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */