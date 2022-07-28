/*     */ package ohos.data.resultset;
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
/*     */ 
/*     */ public abstract class AbsSharedResultSet
/*     */   extends AbsResultSet
/*     */   implements SharedResultSet
/*     */ {
/*     */   protected SharedBlock sharedBlock;
/*     */   
/*     */   public AbsSharedResultSet(String name) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int columnIndex) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int columnIndex) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int columnIndex) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int columnIndex) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int columnIndex) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int columnIndex) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int columnIndex) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isColumnNull(int columnIndex) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkState(int columnIndex) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onGo(int oldRowIndex, int newRowIndex) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public void fillBlock(int startRowIndex, SharedBlock block) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SharedBlock getBlock() {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   public void setBlock(SharedBlock block) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasBlock() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void closeBlock() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void clearBlock() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean goToRow(int rowIndex) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/data/resultset/AbsSharedResultSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */