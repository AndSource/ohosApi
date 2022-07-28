/*    */ package ohos.global.resource.solidxml;
/*    */ 
/*    */ import java.util.HashMap;
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
/*    */ public abstract class Pattern
/*    */ {
/*    */   public Pattern() {
/* 25 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getPatternHash();
/*    */   
/*    */   public abstract Pattern getCombinedPattern(Pattern paramPattern);
/*    */   
/*    */   public abstract void set(Pattern paramPattern);
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getPatternHash(String[] paramArrayOfString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/resource/solidxml/Pattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */