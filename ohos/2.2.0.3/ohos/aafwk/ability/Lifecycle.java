/*     */ package ohos.aafwk.ability;
/*     */ 
/*     */ import ohos.aafwk.content.Intent;
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
/*     */ public class Lifecycle
/*     */ {
/*     */   public Lifecycle() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispatchLifecycle(Event event, Intent intent) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public void addObserver(ILifecycleObserver observer) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public void removeObserver(ILifecycleObserver observer) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public Event getLifecycleState() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public enum Event
/*     */   {
/* 109 */     UNDEFINED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     ON_START,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     ON_INACTIVE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     ON_ACTIVE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     ON_BACKGROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     ON_FOREGROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     ON_STOP;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/aafwk/ability/Lifecycle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */