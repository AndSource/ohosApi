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
/*     */ public class ResultSetWrapper
/*     */   implements ResultSet
/*     */ {
/*     */   protected ResultSet mResultSet;
/*     */   
/*     */   public ResultSetWrapper(ResultSet inputResultSet) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet getResultSet() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getAllColumnNames() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexForName(String columnName) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnNameForIndex(int columnIndex) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public int getRowCount() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public int getRowIndex() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goTo(int offset) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToRow(int rowIndex) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToFirstRow() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToLastRow() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToNextRow() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToPreviousRow() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEnded() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStarted() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtFirstRow() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtLastRow() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int columnIndex) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int columnIndex) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int columnIndex) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int columnIndex) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int columnIndex) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int columnIndex) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int columnIndex) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isColumnNull(int columnIndex) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtensions(PacMap extensions) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public PacMap getExtensions() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public void setAffectedByUris(Object context, List<Uri> uris) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public List<Uri> getAffectedByUris() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public void registerObserver(DataObserver observer) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterObserver(DataObserver observer) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/resultset/ResultSetWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */