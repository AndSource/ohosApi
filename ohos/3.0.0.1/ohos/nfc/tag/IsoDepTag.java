/*    */ package ohos.nfc.tag;
/*    */ 
/*    */ import java.util.Optional;
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
/*    */ public class IsoDepTag
/*    */   extends TagManager
/*    */ {
/*    */   public static final String EXTRA_HILAYER_RESP = "hiresp";
/*    */   public static final String EXTRA_HIST_BYTES = "histbytes";
/*    */   
/*    */   public IsoDepTag(TagInfo tagInfo) {
/* 44 */     super(null, 0); throw new RuntimeException("Stub!");
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
/*    */   public static Optional<IsoDepTag> getInstance(TagInfo tagInfo) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getHistoricalBytes() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] getHiLayerResponse() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/nfc/tag/IsoDepTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */