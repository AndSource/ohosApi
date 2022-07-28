/*    */ package ohos.nfc.tag;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public class MifareUltralightTag
/*    */   extends TagManager
/*    */ {
/*    */   public static final int MIFARE_ULTRALIGHT = 1;
/*    */   public static final int MIFARE_ULTRALIGHT_C = 2;
/*    */   public static final int MIFARE_UNKNOWN = -1;
/*    */   
/*    */   MifareUltralightTag(TagInfo tagInfo) {
/* 24 */     super(null, 0); throw new RuntimeException("Stub!");
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
/*    */   public static MifareUltralightTag getInstance(TagInfo tagInfo) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMifareType() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] readFourPages(int pageOffset) throws IOException {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeOnePage(int pageOffset, byte[] data) throws IOException {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/tag/MifareUltralightTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */