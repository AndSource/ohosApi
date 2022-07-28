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
/*  28 */     throw new RuntimeException("Stub!");
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
/*  44 */     throw new RuntimeException("Stub!");
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
/*  65 */     throw new RuntimeException("Stub!");
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
/*  85 */     throw new RuntimeException("Stub!");
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
/*  97 */     throw new RuntimeException("Stub!");
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
/* 111 */     throw new RuntimeException("Stub!");
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
/* 128 */     throw new RuntimeException("Stub!");
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
/* 139 */     throw new RuntimeException("Stub!");
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
/* 156 */     throw new RuntimeException("Stub!");
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
/* 167 */     throw new RuntimeException("Stub!");
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
/* 184 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mac getSecureObjectMac() {
/* 194 */     throw new RuntimeException("Stub!");
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
/* 285 */     AUTH_TYPE_BIOMETRIC_ALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 290 */     AUTH_TYPE_BIOMETRIC_FINGERPRINT_ONLY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 295 */     AUTH_TYPE_BIOMETRIC_FACE_ONLY;
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
/* 309 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 317 */     public int errorCode = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 323 */     public int tipEvent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     public String tipInfo = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     public int tipValue = 0;
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
/* 361 */     SECURE_LEVEL_S1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     SECURE_LEVEL_S2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 371 */     SECURE_LEVEL_S3,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 376 */     SECURE_LEVEL_S4;
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
/* 390 */       throw new RuntimeException("Stub!");
/*     */     } public boolean marshalling(Parcel out) {
/* 392 */       throw new RuntimeException("Stub!");
/*     */     } public boolean unmarshalling(Parcel in) {
/* 394 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/biometrics/authentication/BiometricAuthentication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */