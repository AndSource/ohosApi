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
/*    */ public class AVElement
/*    */   implements Sequenceable
/*    */ {
/*    */   public static final int AVELEMENT_FLAG_PLAYABLE = 2;
/*    */   public static final int AVELEMENT_FLAG_SCANNABLE = 1;
/*    */   
/*    */   public AVElement(AVDescription description, int flags) throws IllegalArgumentException {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public int getFlags() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isScannable() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isPlayable() {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AVDescription getAVDescription() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMediaId() {
/* 88 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel out) {
/* 90 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel in) {
/* 92 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/common/sessioncore/AVElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */