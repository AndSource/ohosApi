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
/*     */ public abstract class InputMethodAbility
/*     */   extends Ability
/*     */ {
/*     */   public InputMethodAbility() {
/*  34 */     throw new RuntimeException("Stub!");
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
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } protected IRemoteObject onConnect(Intent intent) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDisconnect(Intent intent) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } protected void onStop() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } protected void onCommand(Intent intent, boolean restart, int startId) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void onConfigurationUpdated(Configuration configuration) {
/*  59 */     throw new RuntimeException("Stub!");
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
/*  71 */     throw new RuntimeException("Stub!");
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
/*  89 */     throw new RuntimeException("Stub!");
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
/* 100 */     throw new RuntimeException("Stub!");
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
/* 111 */     throw new RuntimeException("Stub!");
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
/* 125 */     throw new RuntimeException("Stub!");
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
/* 136 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/miscservices/inputmethodability/InputMethodAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */