/*     */ package ohos.nfc.tag;
/*     */ 
/*     */ import java.io.IOException;
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
/*  35 */     super(null, 0); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NdefMessage getNdefMessage() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNdefMaxSize() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTagType() {
/*  63 */     throw new RuntimeException("Stub!");
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
/*  75 */     throw new RuntimeException("Stub!");
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
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canSetReadOnly() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setReadOnly() throws IOException {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNdefWritable() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/tag/NdefTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */