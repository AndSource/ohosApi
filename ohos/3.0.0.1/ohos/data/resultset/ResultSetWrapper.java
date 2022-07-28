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
/*     */ 
/*     */ 
/*     */ public class ResultSetWrapper
/*     */   implements ResultSet
/*     */ {
/*     */   protected ResultSet mResultSet;
/*     */   
/*     */   public ResultSetWrapper(ResultSet inputResultSet) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet getResultSet() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getAllColumnNames() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexForName(String columnName) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnNameForIndex(int columnIndex) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public int getRowCount() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public int getRowIndex() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goTo(int offset) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToRow(int rowIndex) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToFirstRow() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToLastRow() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToNextRow() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public boolean goToPreviousRow() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEnded() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStarted() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtFirstRow() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAtLastRow() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int columnIndex) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int columnIndex) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int columnIndex) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int columnIndex) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int columnIndex) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int columnIndex) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int columnIndex) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isColumnNull(int columnIndex) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtensions(PacMap extensions) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public PacMap getExtensions() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public void setAffectedByUris(Object context, List<Uri> uris) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public List<Uri> getAffectedByUris() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public void registerObserver(DataObserver observer) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterObserver(DataObserver observer) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/resultset/ResultSetWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */