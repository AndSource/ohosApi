/*     */ package ohos.accessibility.ability;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.aafwk.content.Intent;
/*     */ import ohos.accessibility.AccessibilityEventInfo;
/*     */ import ohos.multimodalinput.event.KeyEvent;
/*     */ import ohos.rpc.IRemoteObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AccessibleAbility
/*     */   extends Ability
/*     */ {
/*     */   public static final int GLOBAL_ACTION_BACK = 1;
/*     */   public static final int GLOBAL_ACTION_HOME = 2;
/*     */   public static final int GLOBAL_ACTION_LOCK_SCREEN = 8;
/*     */   public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
/*     */   public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
/*     */   public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
/*     */   
/*     */   public AccessibleAbility() {
/*  24 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int GLOBAL_ACTION_RECENTS = 3;
/*     */ 
/*     */   
/*     */   public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = 9;
/*     */ 
/*     */   
/*     */   public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
/*     */ 
/*     */   
/*     */   public static final int SHOW_MODE_AUTO = 0;
/*     */ 
/*     */   
/*     */   public static final int SHOW_MODE_HIDE = 1;
/*     */ 
/*     */   
/*     */   public static final int SHOW_MODE_IGNORE_HARD_KEYBOARD = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onAccessibilityEvent(AccessibilityEventInfo paramAccessibilityEventInfo);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void onInterrupt();
/*     */ 
/*     */ 
/*     */   
/*     */   public final void disableAbility() {
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
/*     */   
/*     */   protected boolean onKeyPressEvent(KeyEvent keyEvent) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final SoftKeyBoardController getSoftKeyBoardController() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final DisplayResizeController getDisplayResizeController() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final DisplayResizeController getDisplayResizeController(int displayId) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onAbilityConnected() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean onGesture(int gestureId) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean gestureSimulate(List<GesturePathDefine> gesturePathDefineList, GestureResultListener listener) {
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
/*     */   public List<AccessibilityWindow> getWindows() {
/* 138 */     throw new RuntimeException("Stub!");
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
/*     */   public Optional<AccessibilityInfo> getRootAccessibilityInfo() {
/* 150 */     throw new RuntimeException("Stub!");
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
/*     */   public Optional<AccessibilityInfo> gainFocus(int focusType) {
/* 162 */     throw new RuntimeException("Stub!");
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
/*     */   public final boolean performCommonAction(int action) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } public final IRemoteObject onConnect(Intent intent) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/accessibility/ability/AccessibleAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */