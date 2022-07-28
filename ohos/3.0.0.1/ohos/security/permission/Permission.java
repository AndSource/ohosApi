/*     */ package ohos.security.permission;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Permission
/*     */ {
/*     */   Permission() {
/*  36 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public static boolean canRequestPermissionFromRemote(String permission, String nodeId) {
/*  50 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public static void requestPermissionsFromRemote(String[] permissions, OnRequestPermissionsResult callback, String nodeId, String bundleName, int reasonResId) {
/*  68 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public static int verifyPermissionFromRemote(String permission, String nodeId, String appIdInfo) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static int verifySelfPermissionFromRemote(String permission, String nodeId) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static interface OnRequestPermissionsResult {
/*     */     @Deprecated
/*     */     void onResult(String param1String, String[] param1ArrayOfString, int[] param1ArrayOfint);
/*     */     
/*     */     @Deprecated
/*     */     void onCancel(String param1String, String[] param1ArrayOfString);
/*     */     
/*     */     @Deprecated
/*     */     void onTimeOut(String param1String, String[] param1ArrayOfString);
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/security/permission/Permission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */