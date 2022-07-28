/*     */ package ohos.media.sessioncore;
/*     */ 
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.media.common.sessioncore.AVBrowserResult;
/*     */ import ohos.media.common.sessioncore.AVBrowserRoot;
/*     */ import ohos.media.common.sessioncore.AVCallerUserInfo;
/*     */ import ohos.media.common.sessioncore.AVToken;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AVBrowserService
/*     */   extends Ability
/*     */ {
/*     */   public static final String SERVICE_ACTION = "action.media.browse.AVBrowserService";
/*     */   
/*     */   public AVBrowserService() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } protected void onStart(Intent intent) {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public abstract AVBrowserRoot onGetRoot(String paramString, int paramInt, PacMap paramPacMap);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onLoadAVElementList(String paramString, AVBrowserResult paramAVBrowserResult);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onLoadAVElementList(String paramString, AVBrowserResult paramAVBrowserResult, PacMap paramPacMap);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onLoadAVElement(String paramString, AVBrowserResult paramAVBrowserResult);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AVToken getAVToken() {
/* 123 */     throw new RuntimeException("Stub!");
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
/*     */   public void setAVToken(AVToken token) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final PacMap getBrowserOptions() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final AVCallerUserInfo getCallerUserInfo() {
/* 157 */     throw new RuntimeException("Stub!");
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
/*     */   public void notifyAVElementListUpdated(String parentMediaId) {
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
/*     */   public void notifyAVElementListUpdated(String parentMediaId, PacMap options) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/sessioncore/AVBrowserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */