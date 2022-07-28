/*     */ package ohos.agp.components;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ComponentTreeObserver
/*     */ {
/*     */   ComponentTreeObserver(Component component) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addWindowBoundListener(WindowBoundListener listener) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeWindowBoundListener(WindowBoundListener listener) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addScrolledListener(ScrollChangedListener listener) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeScrolledListener(ScrollChangedListener listener) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void addTreeLayoutChangedListener(GlobalLayoutListener listener) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void removeTreeLayoutChangedListener(GlobalLayoutListener listener) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface WindowFocusUpdatedListener {
/*     */     void onWindowFocusUpdated(boolean param1Boolean);
/*     */   }
/*     */   
/*     */   public static interface WindowBoundListener {
/*     */     void onWindowBound();
/*     */     
/*     */     void onWindowUnbound();
/*     */   }
/*     */   
/*     */   public static interface ScrollChangedListener {
/*     */     void onScrolled();
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static interface GlobalLayoutListener {
/*     */     @Deprecated
/*     */     void onGlobalLayoutUpdated();
/*     */   }
/*     */   
/*     */   public static interface GlobalFocusUpdatedListener {
/*     */     void onGlobalFocusUpdated(Component param1Component1, Component param1Component2);
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/ComponentTreeObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */