/*     */ package ohos.security.seckeychain;
/*     */ 
/*     */ import java.security.Principal;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.cert.X509Certificate;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.app.AbilityContext;
/*     */ import ohos.utils.net.Uri;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SecKeyChain
/*     */ {
/*     */   public static final String SPEC_ALIAS = "name";
/*     */   public static final String SPEC_CERTIFICATE = "CERT";
/*     */   public static final String SPEC_PKCS12 = "PKCS12";
/*     */   
/*     */   public SecKeyChain() {
/*  32 */     throw new RuntimeException("Stub!");
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
/*     */   public static void selectSecPrivateKey(AbilityContext ability, String[] secKeyTypes, Principal[] issuers, String host, int port, SecKeyAliasCallback callback, String secKeyAlias) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   public static void selectSecPrivateKey(AbilityContext ability, String[] secKeyTypes, Principal[] issuers, Uri uri, SecKeyAliasCallback callback, String secKeyAlias) {
/*  87 */     throw new RuntimeException("Stub!");
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
/*     */   public static Intent getInstallationIntent() {
/*  99 */     throw new RuntimeException("Stub!");
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
/*     */   public static X509Certificate[] getSecCertificateChain(AbilityContext context, String secKeyAlias) throws InterruptedException, SecKeyChainException {
/* 117 */     throw new RuntimeException("Stub!");
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
/*     */   public static PrivateKey getSecPrivateKey(AbilityContext context, String secKeyAlias) throws InterruptedException, SecKeyChainException {
/* 134 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean isSupported(String secKeyAlgorithm) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/security/seckeychain/SecKeyChain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */