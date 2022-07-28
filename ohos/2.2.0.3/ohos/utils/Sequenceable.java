/*    */ package ohos.utils;
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
/*    */ public interface Sequenceable
/*    */ {
/*    */   default boolean hasFileDescriptor() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   boolean marshalling(Parcel paramParcel);
/*    */   
/*    */   boolean unmarshalling(Parcel paramParcel);
/*    */   
/*    */   public static interface Producer<T> {
/*    */     T createFromParcel(Parcel param1Parcel);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/utils/Sequenceable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */