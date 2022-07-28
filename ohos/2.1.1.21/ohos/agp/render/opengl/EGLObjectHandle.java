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
/*    */ public abstract class EGLObjectHandle
/*    */ {
/*    */   protected EGLObjectHandle(long handle) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getNativeHandle() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object object) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 62 */   public int dafaultCodeKey = 31;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 68 */   public int defaultCodeBit = 32;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 74 */   public int defaultResult = 17;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/opengl/EGLObjectHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */