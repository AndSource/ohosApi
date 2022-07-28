/*     */ package ohos.data.resultset;
/*     */ 
/*     */ import java.util.List;
/*     */ import ohos.data.rdb.DataObserver;
/*     */ import ohos.utils.PacMap;
/*     */ import ohos.utils.net.Uri;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbsResultSet
/*     */   implements ResultSet
/*     */ {
/*     */   protected static final int DEFAULT_POS = -1;
/*     */   
/*     */   public abstract int getRowCount();
/*     */   
/*     */   public abstract String[] getAllColumnNames();
/*     */   
/*     */   public abstract byte[] getBlob(int paramInt);
/*     */   
/*     */   public abstract String getString(int paramInt);
/*     */   
/*     */   public abstract short getShort(int paramInt);
/*     */   
/*     */   public abstract int getInt(int paramInt);
/*     */   
/*     */   public AbsResultSet() {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract long getLong(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract float getFloat(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract double getDouble(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean isColumnNull(int paramInt);
/*     */ 
/*     */   
/*     */   public abstract boolean goToRow(int paramInt);
/*     */ 
/*     */   
/*     */   public int getRowIndex() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goTo(int offset) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToFirstRow() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToLastRow() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToNextRow() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToPreviousRow() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtFirstRow() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtLastRow() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStarted() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEnded() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexForName(String columnName) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnNameForIndex(int columnIndex) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtensions(PacMap extensions) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public PacMap getExtensions() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } public void setAffectedByUris(Object context, List<Uri> uris) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public List<Uri> getAffectedByUris() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public void registerObserver(DataObserver observer) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterObserver(DataObserver observer) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void notifyChange() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isClosed = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 129 */   protected int pos = -1;
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/resultset/AbsResultSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */