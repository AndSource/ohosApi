/*    */ package ohos.event.notification;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class NotificationSubscriber
/*    */ {
/*    */   public NotificationSubscriber() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onConsumed(NotificationRequest paramNotificationRequest);
/*    */   
/*    */   public abstract void onConsumed(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap);
/*    */   
/*    */   public abstract void onCanceled(NotificationRequest paramNotificationRequest, NotificationSortingMap paramNotificationSortingMap, int paramInt);
/*    */   
/*    */   public abstract void onCanceled(NotificationRequest paramNotificationRequest);
/*    */   
/*    */   public abstract void onUpdate(NotificationSortingMap paramNotificationSortingMap);
/*    */   
/*    */   public abstract void onConnected();
/*    */   
/*    */   public abstract void onDisConnect();
/*    */   
/*    */   public abstract void onDied();
/*    */   
/*    */   public abstract void onDisturbModeChanged(int paramInt);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/event/notification/NotificationSubscriber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */