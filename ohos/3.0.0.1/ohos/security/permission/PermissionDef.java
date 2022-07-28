/*    */ package ohos.security.permission;
/*    */ 
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
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
/*    */ public class PermissionDef
/*    */   implements Sequenceable
/*    */ {
/*    */   public static final int FLAG_DISCARDED = 1;
/*    */   public static final int PRIVILEGED = 8;
/*    */   public static final int RESTRICTED = 2;
/*    */   public static final int SIGNATURE = 1;
/*    */   public static final int SYSTEM = 4;
/*    */   public static final int SYSTEM_GRANT = 0;
/*    */   public static final int USER_GRANT = 1;
/*    */   public int availableScope;
/*    */   public int descriptionRes;
/*    */   public int grantMode;
/*    */   public String group;
/*    */   public int labelRes;
/*    */   public String name;
/*    */   public int permissionFlags;
/*    */   public String reminderDesc;
/*    */   public int reminderIcon;
/*    */   public int usageInfo;
/*    */   
/*    */   public PermissionDef() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PermissionDef(PermissionDef orig) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/security/permission/PermissionDef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */