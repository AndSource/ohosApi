/*    */ package ohos.agp.render.render3d.resources;
/*    */ 
/*    */ import ohos.agp.render.render3d.Engine;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface GpuResourceHandle
/*    */ {
/*    */   Engine getEngine();
/*    */   
/*    */   void release();
/*    */   
/*    */   boolean isValid();
/*    */   
/*    */   static boolean isValid(GpuResourceHandle handle) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/render3d/resources/GpuResourceHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */