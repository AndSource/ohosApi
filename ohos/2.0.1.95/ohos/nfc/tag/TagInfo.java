/*    */ package ohos.nfc.tag;
/*    */ 
/*    */ import ohos.aafwk.content.IntentParams;
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
/*    */ public class TagInfo
/*    */   implements Sequenceable
/*    */ {
/*    */   public static final String EXTRA_TAG_EXTRAS = "extra_nfc_TAG_EXTRAS";
/*    */   public static final String EXTRA_TAG_HANDLE = "extra_nfc_TAG_HANDLE";
/*    */   
/*    */   TagInfo(byte[] id, int[] profiles, IntentParams[] extras, int tagHandle) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel out) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel in) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getTagId() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int[] getTagSupportedProfiles() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isProfileSupported(int profile) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/tag/TagInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */