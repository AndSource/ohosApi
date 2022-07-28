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
/*  33 */     throw new RuntimeException("Stub!");
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
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goTo(int offset) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToFirstRow() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToLastRow() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToNextRow() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToPreviousRow() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtFirstRow() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtLastRow() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStarted() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEnded() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexForName(String columnName) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnNameForIndex(int columnIndex) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtensions(PacMap extensions) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } public PacMap getExtensions() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public void setAffectedByUris(Object context, List<Uri> uris) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public List<Uri> getAffectedByUris() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public void registerObserver(DataObserver observer) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterObserver(DataObserver observer) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void notifyChange() {
/* 113 */     throw new RuntimeException("Stub!");
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
/* 131 */   protected int pos = -1;
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/resultset/AbsResultSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */