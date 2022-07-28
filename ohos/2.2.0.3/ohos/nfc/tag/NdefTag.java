/*     */ package ohos.nfc.tag;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NdefTag
/*     */   extends TagManager
/*     */ {
/*     */   public static final String NDEF_TYPE_1 = "nfcforum.type1";
/*     */   public static final String NDEF_TYPE_2 = "nfcforum.type2";
/*     */   public static final String NDEF_TYPE_3 = "nfcforum.type3";
/*     */   public static final String NDEF_TYPE_4 = "nfcforum.type4";
/*     */   public static final String NDEF_TYPE_ICODE_SLI = "nxp.icode.sli";
/*     */   public static final String NDEF_TYPE_MIFARE_CLASSIC = "nxp.mifare.classic";
/*     */   
/*     */   public NdefTag(TagInfo tagInfo) {
/*  46 */     super(null, 0); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Optional<NdefTag> getInstance(TagInfo tagInfo) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NdefMessage getNdefMessage() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNdefMaxSize() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTagType() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NdefMessage readNdefMessage() throws IOException, IllegalArgumentException {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeNdefMessage(NdefMessage msg) throws IOException, IllegalArgumentException {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSetReadOnly() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setReadOnly() throws IOException {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNdefWritable() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/nfc/tag/NdefTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */