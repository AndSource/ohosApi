/*     */ package ohos.miscservices.inputmethodability;
/*     */ 
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.agp.components.ComponentContainer;
/*     */ import ohos.global.configuration.Configuration;
/*     */ import ohos.rpc.IRemoteObject;
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
/*     */ public abstract class InputMethodAbility
/*     */   extends Ability
/*     */ {
/*     */   public InputMethodAbility() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract KeyboardDelegate onCreateKeyboardInterface();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onStart(Intent intent) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } protected IRemoteObject onConnect(Intent intent) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDisconnect(Intent intent) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } protected void onStop() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } protected void onCommand(Intent intent, boolean restart, int startId) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public void onConfigurationUpdated(Configuration configuration) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   protected ComponentContainer onCreateKeyboardContainer() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onBeginInput(KeyboardController kbController, TextInputClient textInputClient) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onEndInput() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onShowKeyboard() {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */   protected void onScreenOrientationChanged(int direction) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onHideKeyboard() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/miscservices/inputmethodability/InputMethodAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */