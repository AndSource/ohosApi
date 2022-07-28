/*    */ package ohos.aafwk.ability;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RunningProcessInfo
/*    */ {
/*    */   public static final int DATA_IN_USE = 1;
/*    */   public static final int REASON_UNKNOWN = 0;
/*    */   public static final int SERVICE_IN_USE = 2;
/*    */   public static final int WEIGHT_CACHED = 400;
/*    */   public static final int WEIGHT_CANT_SAVE_STATE = 350;
/*    */   public static final int WEIGHT_FOREGROUND = 100;
/*    */   public static final int WEIGHT_FOREGROUND_SERVICE = 125;
/*    */   public static final int WEIGHT_GONE = 1000;
/*    */   public static final int WEIGHT_PERCEPTIBLE = 230;
/*    */   public static final int WEIGHT_SERVICE = 300;
/*    */   public static final int WEIGHT_TOP_SLEEPING = 325;
/*    */   public static final int WEIGHT_VISIBLE = 200;
/*    */   
/*    */   public RunningProcessInfo() {
/* 26 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPid() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String[] getPkgList() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getProcessName() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getUid() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLastMemoryLevel() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getWeight() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getWeightReasonCode() {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/RunningProcessInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */