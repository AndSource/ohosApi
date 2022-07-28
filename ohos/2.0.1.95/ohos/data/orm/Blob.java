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
/*     */ public class Blob
/*     */   implements Blob
/*     */ {
/*     */   public Blob() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Blob(byte[] blob) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public long length() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBytes(long pos, int length) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public InputStream getBinaryStream() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(byte[] pattern, long start) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long position(Blob pattern, long start) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public int setBytes(long writeAt, byte[] bytes) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public int setBytes(long writeAt, byte[] bytes, int offset, int length) {
/*  77 */     throw new RuntimeException("Stub!");
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
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public void truncate(long len) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public void free() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream getBinaryStream(long pos, long length) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/orm/Blob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */