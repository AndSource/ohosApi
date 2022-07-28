/*     */ package ohos.data.orm;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.Reader;
/*     */ import java.io.Writer;
/*     */ import java.sql.Clob;
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
/*     */ public class Clob
/*     */   implements Clob
/*     */ {
/*     */   public Clob(String charData) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public long length() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubString(long startPos, int length) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public Reader getCharacterStream() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public InputStream getAsciiStream() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(String stringToFind, long startPos) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(Clob clob, long startPos) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int setString(long pos, String str) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int setString(long pos, String str, int offset, int length) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OutputStream setAsciiStream(long indexToWriteAt) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Writer setCharacterStream(long indexToWriteAt) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public void truncate(long length) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public void free() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public Reader getCharacterStream(long pos, long length) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/data/orm/Clob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */