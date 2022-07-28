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
/*    */ 
/*    */ 
/*    */ public abstract class Theme
/*    */ {
/*    */   public Theme() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getThemeHash();
/*    */   
/*    */   public abstract Theme getCombinedTheme(Theme paramTheme);
/*    */   
/*    */   public abstract void set(Theme paramTheme);
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getThemeHash(String[] paramArrayOfString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/resource/solidxml/Theme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */