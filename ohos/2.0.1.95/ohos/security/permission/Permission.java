/*    */ package ohos.security.permission;
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
/*    */ 
/*    */ 
/*    */ public class Permission
/*    */ {
/*    */   Permission() {
/* 22 */     throw new RuntimeException("Stub!");
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
/*    */   public static boolean canRequestPermissionFromRemote(String permission, String nodeId) {
/* 34 */     throw new RuntimeException("Stub!");
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
/*    */   public static void requestPermissionsFromRemote(String[] permissions, OnRequestPermissionsResult callback, String nodeId, String bundleName, int reasonResId) {
/* 49 */     throw new RuntimeException("Stub!");
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
/*    */   public static int verifyPermissionFromRemote(String permission, String nodeId, String appIdInfo) {
/* 64 */     throw new RuntimeException("Stub!");
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
/*    */   public static int verifySelfPermissionFromRemote(String permission, String nodeId) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface OnRequestPermissionsResult {
/*    */     void onResult(String param1String, String[] param1ArrayOfString, int[] param1ArrayOfint);
/*    */     
/*    */     void onCancel(String param1String, String[] param1ArrayOfString);
/*    */     
/*    */     void onTimeOut(String param1String, String[] param1ArrayOfString);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/security/permission/Permission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */