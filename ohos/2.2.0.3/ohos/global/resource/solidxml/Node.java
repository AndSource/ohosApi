/*    */ package ohos.global.resource.solidxml;
/*    */ 
/*    */ import java.util.List;
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
/*    */ public abstract class Node
/*    */ {
/*    */   public Node() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getName();
/*    */   
/*    */   public abstract String getStringValue();
/*    */   
/*    */   public abstract Node getChild();
/*    */   
/*    */   public abstract Node getSibling();
/*    */   
/*    */   public abstract List<Attribute> getAttributes();
/*    */   
/*    */   @Deprecated
/*    */   public abstract List<TypedAttribute> getTypedAttribute(ResourceManager paramResourceManager);
/*    */   
/*    */   public abstract List<TypedAttribute> getTypedAttributes(ResourceManager paramResourceManager);
/*    */   
/*    */   public abstract List<TypedAttribute> getTypedAttributes(Pattern paramPattern);
/*    */   
/*    */   public abstract List<TypedAttribute> getTypedAttributes(Pattern paramPattern, String[] paramArrayOfString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/resource/solidxml/Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */