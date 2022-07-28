/*    */ package ohos.multimodalinput.event;
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
/*    */ public abstract class KeyBoardEvent
/*    */   extends KeyEvent
/*    */ {
/*    */   public KeyBoardEvent() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void enableIme() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void disableIme() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isHandledByIme() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract boolean isNoncharacterKeyPressed(int paramInt);
/*    */   
/*    */   public abstract boolean isNoncharacterKeyPressed(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract boolean isNoncharacterKeyPressed(int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public abstract int getUnicode();
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/multimodalinput/event/KeyBoardEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */