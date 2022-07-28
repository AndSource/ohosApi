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
/*     */ public class Clob
/*     */   implements Clob
/*     */ {
/*     */   public Clob(String charData) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public long length() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubString(long startPos, int length) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public Reader getCharacterStream() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public InputStream getAsciiStream() {
/*  57 */     throw new RuntimeException("Stub!");
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
/*  68 */     throw new RuntimeException("Stub!");
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
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int setString(long pos, String str) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int setString(long pos, String str, int offset, int len) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OutputStream setAsciiStream(long indexToWriteAt) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Writer setCharacterStream(long indexToWriteAt) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public void truncate(long length) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public void free() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public Reader getCharacterStream(long pos, long length) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/orm/Clob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */