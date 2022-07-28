/*    */ package ohos.hiviewdfx;
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
/*    */ public final class HiTrace
/*    */ {
/*    */   public static final int HITRACE_FLAG_DEFAULT = 0;
/*    */   public static final int HITRACE_FLAG_DONOT_CREATE_SPAN = 2;
/*    */   public static final int HITRACE_FLAG_DONOT_ENABLE_LOG = 16;
/*    */   public static final int HITRACE_FLAG_INCLUDE_ASYNC = 1;
/*    */   public static final int HITRACE_FLAG_NO_BE_INFO = 8;
/*    */   public static final int HITRACE_FLAG_TP_INFO = 4;
/*    */   
/*    */   HiTrace() {
/* 42 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */   
/*    */   public static HiTraceId begin(String name, int flags) {
/* 62 */     throw new RuntimeException("Stub!");
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
/*    */   public static void end(HiTraceId hiTraceId) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/hiviewdfx/HiTrace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */