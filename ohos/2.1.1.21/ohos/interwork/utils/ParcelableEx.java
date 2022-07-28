/*    */ package ohos.interwork.utils;
/*    */ 
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.ParcelException;
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
/*    */ public interface ParcelableEx
/*    */ {
/*    */   void marshallingEx(Parcel paramParcel) throws ParcelException;
/*    */   
/*    */   default void unmarshallingEx(Parcel in) throws ParcelException {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/interwork/utils/ParcelableEx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */