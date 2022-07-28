/*    */ package ohos.agp.render.opengl;
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
/*    */ 
/*    */ public abstract class EGLObjectHandle
/*    */ {
/*    */   protected EGLObjectHandle(long handle) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getNativeHandle() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object object) {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 70 */   public int dafaultCodeKey = 31;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 76 */   public int defaultCodeBit = 32;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 82 */   public int defaultResult = 17;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/opengl/EGLObjectHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */