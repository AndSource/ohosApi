/*     */ package ohos.event.notification;
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
/*  23 */     throw new RuntimeException("Stub!");
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
/*     */   public enum DisturbMode
/*     */   {
/* 102 */     ALLOW_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     ALLOW_ALL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     ALLOW_PRIORITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     ALLOW_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     ALLOW_ALARMS;
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
/*     */   public enum InputEditType
/*     */   {
/* 140 */     EDIT_AUTO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     EDIT_DISABLED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     EDIT_ENABLED;
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
/*     */   public enum InputsSource
/*     */   {
/* 165 */     FREE_FORM_INPUT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     OPTION;
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
/*     */   public enum SemanticActionButton
/*     */   {
/* 186 */     NONE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     REPLY_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     READ_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     UNREAD_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     DELETE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     ARCHIVE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     MUTE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     UNMUTE_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     THUMBS_UP_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     THUMBS_DOWN_ACTION_BUTTON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 236 */     CALL_ACTION_BUTTON;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/event/notification/NotificationConstant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */