/*    */ package ohos.aafwk.ability;
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
/*    */ public abstract class OnClickListener
/*    */   extends ViewListener
/*    */ {
/*    */   public OnClickListener() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public void onTouchEvent(AbilityForm form, ViewsStatus viewsStatus) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onClick(int paramInt, AbilityForm paramAbilityForm, ViewsStatus paramViewsStatus);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/OnClickListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */