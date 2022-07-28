/*     */ package ohos.data.orm;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.sql.Blob;
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
/*     */ 
/*     */ public class Blob
/*     */   implements Blob
/*     */ {
/*     */   public Blob() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Blob(byte[] blob) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public long length() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBytes(long pos, int length) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public InputStream getBinaryStream() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(byte[] pattern, long start) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(Blob pattern, long start) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public int setBytes(long writeAt, byte[] bytes) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } public int setBytes(long writeAt, byte[] bytes, int offset, int length) {
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
/*     */   public OutputStream setBinaryStream(long indexToWriteAt) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void truncate(long len) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public void free() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream getBinaryStream(long pos, long length) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/orm/Blob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */