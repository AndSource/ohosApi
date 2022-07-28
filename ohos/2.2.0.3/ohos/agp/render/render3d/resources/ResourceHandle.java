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
/*    */ public interface ResourceHandle
/*    */ {
/*    */   Engine getEngine();
/*    */   
/*    */   void release();
/*    */   
/*    */   boolean isValid();
/*    */   
/*    */   static boolean isValid(ResourceHandle handle) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/resources/ResourceHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */