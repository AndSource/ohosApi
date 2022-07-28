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
/*     */ public class Lifecycle
/*     */ {
/*     */   public Lifecycle() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispatchLifecycle(Event event, Intent intent) {
/*  44 */     throw new RuntimeException("Stub!");
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
/*  58 */     throw new RuntimeException("Stub!");
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
/*  73 */     throw new RuntimeException("Stub!");
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
/*  86 */     throw new RuntimeException("Stub!");
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
/*     */   public enum Event
/*     */   {
/* 105 */     UNDEFINED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     ON_START,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     ON_INACTIVE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     ON_ACTIVE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     ON_BACKGROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     ON_FOREGROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     ON_STOP;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/aafwk/ability/Lifecycle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */