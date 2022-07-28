/*     */ package ohos.event.notification;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class NotificationConstant
/*     */ {
/*     */   public static final int APP_CANCEL_ALL_REASON_DELETE = 9;
/*     */   public static final int APP_CANCEL_REASON_DELETE = 8;
/*     */   public static final int APP_CANCEL_REASON_OTHER = 10;
/*     */   public static final int CANCEL_ALL_REASON_DELETE = 3;
/*     */   public static final int CANCEL_REASON_DELETE = 2;
/*     */   public static final int CLICK_REASON_DELETE = 1;
/*     */   public static final int ERROR_REASON_DELETE = 4;
/*     */   public static final String EXTRA_INPUTS_SOURCE = "notification_user_input_source";
/*     */   public static final int PACKAGE_BANNED_REASON_DELETE = 7;
/*     */   public static final int PACKAGE_CHANGED_REASON_DELETE = 5;
/*     */   public static final int USER_STOPPED_REASON_DELETE = 6;
/*     */   
/*     */   NotificationConstant() {
/*  25 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum DisturbMode
/*     */   {
/* 105 */     ALLOW_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     ALLOW_ALL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     ALLOW_PRIORITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     ALLOW_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     ALLOW_ALARMS;
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
/*     */   public enum InputEditType
/*     */   {
/* 144 */     EDIT_AUTO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     EDIT_DISABLED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     EDIT_ENABLED;
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
/*     */   public enum InputsSource
/*     */   {
/* 170 */     FREE_FORM_INPUT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     OPTION;
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
/*     */   public enum SemanticActionButton
/*     */   {
/* 192 */     NONE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     REPLY_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     READ_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     UNREAD_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 212 */     DELETE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     ARCHIVE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     MUTE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     UNMUTE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     THUMBS_UP_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     THUMBS_DOWN_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     CALL_ACTION_BUTTON;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/event/notification/NotificationConstant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */