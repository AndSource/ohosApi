/*     */ package ohos.dcall;
/*     */ 
/*     */ import ohos.eventhandler.EventRunner;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CallStateObserver
/*     */ {
/*     */   public static final int CALL_STATE_IDLE = 0;
/*     */   public static final int CALL_STATE_OFFHOOK = 2;
/*     */   public static final int CALL_STATE_RINGING = 1;
/*     */   public static final int CALL_STATE_UNKNOWN = -1;
/*     */   public static final int OBSERVE_MASK_CALL_FORWARDING_UNCONDITIONAL_INDICATOR = 2;
/*     */   public static final int OBSERVE_MASK_CALL_STATE = 4;
/*     */   public static final int OBSERVE_MASK_VOICE_MAIL_MESSAGE_INDICATOR = 1;
/*     */   
/*     */   public CallStateObserver() throws IllegalArgumentException {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CallStateObserver(int slot) throws IllegalArgumentException {
/*  56 */     throw new RuntimeException("Stub!");
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
/*     */   public CallStateObserver(int slot, EventRunner runner) throws IllegalArgumentException {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onVoiceMailMsgIndicatorUpdated(boolean isExist) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCfuIndicatorUpdated(boolean enable) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCallStateUpdated(int state, String number) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/dcall/CallStateObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */