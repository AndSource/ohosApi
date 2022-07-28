/*    */ package ohos.nfc.tag;
/*    */ 
/*    */ import ohos.interwork.utils.PacMapEx;
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
/*    */ public class TagInfo
/*    */   implements Sequenceable
/*    */ {
/*    */   public static final String EXTRA_TAG_EXTRAS = "extra_nfc_TAG_EXTRAS";
/*    */   public static final String EXTRA_TAG_HANDLE = "extra_nfc_TAG_HANDLE";
/*    */   
/*    */   TagInfo(byte[] id, int[] profiles, PacMapEx[] extras, int tagHandle) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel out) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel in) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getTagId() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int[] getTagSupportedProfiles() {
/* 65 */     throw new RuntimeException("Stub!");
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
/* 76 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/nfc/tag/TagInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */