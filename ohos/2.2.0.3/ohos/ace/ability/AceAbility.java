/*     */ package ohos.ace.ability;
/*     */ 
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.aafwk.ability.IAbilityContinuation;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.aafwk.content.IntentParams;
/*     */ import ohos.global.configuration.Configuration;
/*     */ import ohos.multimodalinput.event.KeyEvent;
/*     */ import ohos.multimodalinput.event.TouchEvent;
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
/*     */   implements IAbilityContinuation
/*     */ {
/*     */   public AceAbility() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public void onStart(Intent intent) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConfigurationUpdated(Configuration newConfig) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public void onStop() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public void onNewIntent(Intent intent) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackPressed() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public void onForeground(Intent intent) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackground() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public void onActive() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public void onInactive() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onStartContinuation() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public void onCompleteContinuation(int code) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onSaveData(IntentParams saveData) {
/*  66 */     throw new RuntimeException("Stub!");
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
/*  78 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onRestoreData(IntentParams restoreData) {
/* 112 */     throw new RuntimeException("Stub!");
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
/* 141 */     throw new RuntimeException("Stub!");
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
/* 170 */     throw new RuntimeException("Stub!");
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
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } public void onRequestPermissionsFromUserResult(int requestCode, String[] permissions, int[] grantResults) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/ace/ability/AceAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */