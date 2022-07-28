/*     */ package ohos.nfc.tag;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MifareClassicTag
/*     */   extends TagManager
/*     */ {
/*     */   public static final int BLOCK_BYTES = 16;
/*     */   public static final int MIFARE_CLASSIC = 0;
/*     */   public static final int MIFARE_PLUS = 1;
/*     */   public static final int MIFARE_PRO = 2;
/*     */   public static final int MIFARE_UNKNOWN = -1;
/*     */   public static final int TAG_ROM_1K = 1024;
/*     */   public static final int TAG_ROM_2K = 2048;
/*     */   public static final int TAG_ROM_4K = 4096;
/*     */   public static final int TAG_ROM_MINI = 320;
/*     */   public static final byte USE_KEY_A = 96;
/*     */   public static final byte USE_KEY_B = 97;
/*     */   
/*     */   MifareClassicTag(TagInfo tagInfo) {
/*  24 */     super(null, 0); throw new RuntimeException("Stub!");
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
/*     */   public static MifareClassicTag getInstance(TagInfo tagInfo) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMifareType() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTagSize() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSectorsNum() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBlocksNum() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBlocksNumForSector(int sectorId) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSectorId(int blockId) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFirstBlockId(int sectorId) {
/* 106 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean authenSectorUseKey(int sectorId, byte[] key, byte keyType) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] readBlock(int blockId) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeBlock(int blockId, byte[] data) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void incBlock(int blockId, int value) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void decBlock(int blockId, int value) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void restoreBlock(int blockId) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/tag/MifareClassicTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */