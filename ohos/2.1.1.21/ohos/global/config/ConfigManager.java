/*    */ package ohos.global.config;
/*    */ 
/*    */ import ohos.global.resource.AccessDeniedException;
/*    */ import ohos.global.resource.NotExistException;
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
/*    */ public abstract class ConfigManager
/*    */ {
/*    */   public ConfigManager() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract boolean getBoolean(ConfigType paramConfigType) throws AccessDeniedException, NotExistException, WrongTypeException;
/*    */   
/*    */   public abstract String getString(ConfigType paramConfigType) throws AccessDeniedException, NotExistException, WrongTypeException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/global/config/ConfigManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */