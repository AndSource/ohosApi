/*    */ package ohos.net.http;
/*    */ 
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SslError
/*    */ {
/*    */   public static final int SSL_CERT_AUTHORITY_INVALID = 3;
/*    */   public static final int SSL_CERT_DATE_INVALID = 4;
/*    */   public static final int SSL_CERT_EXPIRED = 1;
/*    */   public static final int SSL_CERT_INVALID = 5;
/*    */   public static final int SSL_CERT_NAME_INVALID = 2;
/*    */   public static final int SSL_CERT_NOT_YET_VALID = 0;
/*    */   
/*    */   public SslError(int error, X509Certificate X509certificate, String url) {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean addError(int error) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasError(int error) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public X509Certificate getCertificate() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getCriticalError() {
/* 76 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getUrl() {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 94 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/net/http/SslError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */