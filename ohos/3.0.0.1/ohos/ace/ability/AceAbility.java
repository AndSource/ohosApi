/*     */ package ohos.ace.ability;
/*     */ 
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.aafwk.ability.IAbilityContinuation;
/*     */ import ohos.aafwk.ability.assistance.AbilityAgent;
/*     */ import ohos.aafwk.ability.assistance.IAssistanceChannel;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.aafwk.content.IntentParams;
/*     */ import ohos.global.configuration.Configuration;
/*     */ import ohos.multimodalinput.event.KeyEvent;
/*     */ import ohos.multimodalinput.event.TouchEvent;
/*     */ import ohos.utils.PacMap;
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
/*     */ public class AceAbility
/*     */   extends Ability
/*     */   implements IAbilityContinuation, IAssistanceChannel
/*     */ {
/*     */   public AceAbility() {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   } public void onStart(Intent intent) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConfigurationUpdated(Configuration newConfig) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public void onSaveAbilityState(PacMap outState) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public void onRestoreAbilityState(PacMap outState) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMemoryLevel(int level) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public void onStop() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public void onNewIntent(Intent intent) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onNewWant(Intent intent) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackPressed() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public void onForeground(Intent intent) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackground() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public void onActive() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public void onInactive() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onStartContinuation() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public void onCompleteContinuation(int code) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onSaveData(IntentParams saveData) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public void onRemoteTerminated() {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean onTouchEvent(TouchEvent event) {
/* 106 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
/* 122 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onRestoreData(IntentParams restoreData) {
/* 140 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInstanceName(String name) {
/* 169 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPageParams(String url, IntentParams params) {
/* 198 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pushPage(String url, IntentParams params) {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   } public void onRequestPermissionsFromUserResult(int requestCode, String[] permissions, int[] grantResults) {
/* 226 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   } public void onConnected(AbilityAgent agent) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   } public void onConnectFailed(int errorCode) {
/* 232 */     throw new RuntimeException("Stub!");
/*     */   } public void onDisconnected(int errorCode) {
/* 234 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/ace/ability/AceAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */