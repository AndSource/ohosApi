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
/*     */ public final class ComponentTreeObserver
/*     */ {
/*     */   ComponentTreeObserver(Component component) {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeWindowFocusUpdatedListener(WindowFocusUpdatedListener listener) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addWindowBoundListener(WindowBoundListener listener) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeWindowBoundListener(WindowBoundListener listener) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addScrolledListener(ScrollChangedListener listener) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeScrolledListener(ScrollChangedListener listener) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeGlobalFocusUpdatedListener(GlobalFocusUpdatedListener listener) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addTreeLayoutChangedListener(GlobalLayoutListener listener) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeTreeLayoutChangedListener(GlobalLayoutListener listener) {
/* 117 */     throw new RuntimeException("Stub!");
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
/*     */   public static interface GlobalLayoutListener {
/*     */     void onGlobalLayoutUpdated();
/*     */   }
/*     */   
/*     */   public static interface GlobalFocusUpdatedListener {
/*     */     void onGlobalFocusUpdated(Component param1Component1, Component param1Component2);
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/components/ComponentTreeObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */