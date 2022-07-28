/*    */ package ohos.global.resource.solidxml;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.HashMap;
/*    */ import ohos.global.resource.NotExistException;
/*    */ import ohos.global.resource.Resource;
/*    */ import ohos.global.resource.ResourceManager;
/*    */ import ohos.global.resource.WrongTypeException;
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
/*    */ public abstract class Theme
/*    */ {
/*    */   public Theme() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getThemeHash();
/*    */   
/*    */   public abstract Theme getCombinedTheme(Theme paramTheme);
/*    */   
/*    */   public abstract void set(Theme paramTheme);
/*    */   
/*    */   public abstract HashMap<String, TypedAttribute> getThemeHash(String[] paramArrayOfString);
/*    */   
/*    */   public abstract String getStringValue(String paramString) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract boolean getBooleanValue(String paramString, boolean paramBoolean) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int getColorValue(String paramString) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int getIntegerValue(String paramString, int paramInt) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract float getFloatValue(String paramString, float paramFloat) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract int getPixelValue(String paramString, boolean paramBoolean) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract Resource getMediaValue(String paramString, ResourceManager paramResourceManager) throws IOException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract TypedAttribute getValue(String paramString) throws NotExistException;
/*    */   
/*    */   public abstract int size();
/*    */   
/*    */   public abstract Pattern getPatternValue(String paramString) throws IOException, NotExistException, WrongTypeException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/resource/solidxml/Theme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */