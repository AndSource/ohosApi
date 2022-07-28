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
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AVDescription getDescription() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getElementId() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 84 */   public static final Sequenceable.Producer<AVQueueElement> CREATOR = null;
/*    */   public static final long INVALID_ID = -1L;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/common/sessioncore/AVQueueElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */