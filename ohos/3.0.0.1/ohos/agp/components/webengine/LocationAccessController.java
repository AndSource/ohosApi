/*    */ package ohos.agp.components.webengine;
/*    */ 
/*    */ import java.util.Set;
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
/*    */ public abstract class LocationAccessController
/*    */ {
/*    */   public LocationAccessController() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static LocationAccessController getInstance() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void setOriginAllow(String paramString, boolean paramBoolean);
/*    */   
/*    */   public abstract void disallowAll();
/*    */   
/*    */   public abstract void checkOriginAllowed(String paramString, AsyncCallback<Boolean> paramAsyncCallback);
/*    */   
/*    */   public abstract void getAllOrigins(AsyncCallback<Set<String>> paramAsyncCallback);
/*    */   
/*    */   public static interface Response {
/*    */     void apply(String param1String, boolean param1Boolean1, boolean param1Boolean2);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/LocationAccessController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */