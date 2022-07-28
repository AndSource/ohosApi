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
/* 34 */     super(null, 0); throw new RuntimeException("Stub!");
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
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMifareType() {
/* 57 */     throw new RuntimeException("Stub!");
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
/* 68 */     throw new RuntimeException("Stub!");
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
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/nfc/tag/MifareUltralightTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */