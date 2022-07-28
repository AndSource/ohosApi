/*    */ package ohos.agp.components;
/*    */ 
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
/*    */ public abstract class AbsComponentSaveState
/*    */   implements Sequenceable
/*    */ {
/*    */   protected AbsComponentSaveState(Sequenceable superState) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected AbsComponentSaveState(Parcel in) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected AbsComponentSaveState(Parcel in, ClassLoader classLoader) {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final Sequenceable getSuperState() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel parcel) {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel parcel) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 78 */   public static final AbsComponentSaveState EMPTY_STATE = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 86 */   public static final Sequenceable.Producer<AbsComponentSaveState> PRODUCER = null;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/AbsComponentSaveState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */