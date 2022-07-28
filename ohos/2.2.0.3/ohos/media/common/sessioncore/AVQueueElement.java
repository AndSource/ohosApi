/*    */ package ohos.media.common.sessioncore;
/*    */ 
/*    */ import ohos.media.common.AVDescription;
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
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
/*    */ 
/*    */ public final class AVQueueElement
/*    */   implements Sequenceable
/*    */ {
/*    */   public AVQueueElement(AVDescription description, long elementId) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AVDescription getDescription() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getElementId() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 76 */   public static final Sequenceable.Producer<AVQueueElement> CREATOR = null;
/*    */   public static final long INVALID_ID = -1L;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/common/sessioncore/AVQueueElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */