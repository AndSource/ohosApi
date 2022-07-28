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
/*  27 */     throw new RuntimeException("Stub!");
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
/*  43 */     throw new RuntimeException("Stub!");
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
/*  64 */     throw new RuntimeException("Stub!");
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
/*  84 */     throw new RuntimeException("Stub!");
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
/*  96 */     throw new RuntimeException("Stub!");
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
/* 110 */     throw new RuntimeException("Stub!");
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
/* 127 */     throw new RuntimeException("Stub!");
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
/* 138 */     throw new RuntimeException("Stub!");
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
/* 155 */     throw new RuntimeException("Stub!");
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
/* 166 */     throw new RuntimeException("Stub!");
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
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mac getSecureObjectMac() {
/* 193 */     throw new RuntimeException("Stub!");
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
/* 284 */     AUTH_TYPE_BIOMETRIC_ALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     AUTH_TYPE_BIOMETRIC_FINGERPRINT_ONLY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 294 */     AUTH_TYPE_BIOMETRIC_FACE_ONLY;
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
/* 308 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 316 */     public int errorCode = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 322 */     public int tipEvent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 328 */     public String tipInfo = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 335 */     public int tipValue = 0;
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
/* 360 */     SECURE_LEVEL_S1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     SECURE_LEVEL_S2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     SECURE_LEVEL_S3,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     SECURE_LEVEL_S4;
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
/* 389 */       throw new RuntimeException("Stub!");
/*     */     } public boolean marshalling(Parcel out) {
/* 391 */       throw new RuntimeException("Stub!");
/*     */     } public boolean unmarshalling(Parcel in) {
/* 393 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/biometrics/authentication/BiometricAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */