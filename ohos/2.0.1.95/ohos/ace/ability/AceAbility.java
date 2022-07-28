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
/*     */ public class AceAbility
/*     */   extends Ability
/*     */   implements IAbilityContinuation
/*     */ {
/*     */   public AceAbility() {
/*  23 */     throw new RuntimeException("Stub!");
/*     */   } public void onStart(Intent intent) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConfigurationUpdated(Configuration newConfig) {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   } public void onStop() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   } public void onNewIntent(Intent intent) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackPressed() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   } public void onForeground(Intent intent) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public void onBackground() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public void onActive() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public void onInactive() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onStartContinuation() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public void onCompleteContinuation(int code) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onSaveData(IntentParams saveData) {
/*  54 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
/*  82 */     throw new RuntimeException("Stub!");
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
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onRestoreData(IntentParams restoreData) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 129 */     throw new RuntimeException("Stub!");
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
/* 158 */     throw new RuntimeException("Stub!");
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
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } public void onRequestPermissionsFromUserResult(int requestCode, String[] permissions, int[] grantResults) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   } protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/ace/ability/AceAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */