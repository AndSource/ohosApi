/*     */ package ohos.multimodalinput.event;
/*     */ 
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpeechEvent
/*     */   extends MultimodalEvent
/*     */ {
/*     */   public static final int ACTION_HIT_HOTWORD = 3;
/*     */   public static final int ACTION_SWITCH_OFF = 2;
/*     */   public static final int ACTION_SWITCH_ON = 1;
/*     */   public static final int MATCH_MODE_EXACT = 1;
/*     */   public static final int MATCH_MODE_FUZZY = 2;
/*     */   public static final int SCENES_AUDIO = 2;
/*     */   public static final int SCENES_COMMON = 5;
/*     */   public static final int SCENES_PAGE = 3;
/*     */   public static final int SCENES_SWITCH = 4;
/*     */   public static final int SCENES_VIDEO = 1;
/*     */   
/*     */   SpeechEvent() {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   public static Optional<SpeechEvent> createEvent(long occurTime, int action, String value) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAction() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getScene() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getActionProperty() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMatchMode() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public int getSourceDevice() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public String getDeviceId() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public int getInputDeviceId() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public long getOccurredTime() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/multimodalinput/event/SpeechEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */