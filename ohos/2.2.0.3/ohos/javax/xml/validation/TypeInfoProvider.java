/*    */ package ohos.javax.xml.validation;
/*    */ 
/*    */ import ohos.org.w3c.dom.TypeInfo;
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
/*    */ public abstract class TypeInfoProvider
/*    */ {
/*    */   protected TypeInfoProvider() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract TypeInfo getElementTypeInfo();
/*    */   
/*    */   public abstract TypeInfo getAttributeTypeInfo(int paramInt);
/*    */   
/*    */   public abstract boolean isIdAttribute(int paramInt);
/*    */   
/*    */   public abstract boolean isSpecified(int paramInt);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/javax/xml/validation/TypeInfoProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */