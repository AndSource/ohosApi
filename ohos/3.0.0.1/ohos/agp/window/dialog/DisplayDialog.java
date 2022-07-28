/*    */ package ohos.agp.window.dialog;
/*    */ 
/*    */ import ohos.agp.components.DirectionalLayout;
/*    */ import ohos.app.Context;
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
/*    */ public class DisplayDialog
/*    */   extends BaseDialog
/*    */ {
/*    */   public DisplayDialog(Context context) {
/* 37 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setContentComponent(DirectionalLayout component) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void showOnRemoteScreen(DialogProvider dialogProvider) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class DialogProvider
/*    */   {
/*    */     public int densityDpi;
/*    */ 
/*    */     
/*    */     public int height;
/*    */ 
/*    */     
/*    */     public String ip;
/*    */     
/*    */     public int port;
/*    */     
/*    */     public int width;
/*    */ 
/*    */     
/*    */     public DialogProvider(String ip, int port, int width, int height, int densityDpi) {
/* 75 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/window/dialog/DisplayDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */