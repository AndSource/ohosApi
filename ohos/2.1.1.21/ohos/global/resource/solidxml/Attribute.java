/*    */ package ohos.global.resource.solidxml;
/*    */ 
/*    */ import ohos.global.resource.ResourceManager;
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
/*    */ public abstract class Attribute
/*    */ {
/*    */   public Attribute() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getName();
/*    */   
/*    */   public abstract String getStringValue();
/*    */   
/*    */   public abstract TypedAttribute getTypedAttribute(ResourceManager paramResourceManager);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/global/resource/solidxml/Attribute.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */