/*     */ package ohos.global.icu.text;
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
/*     */ public final class Edits
/*     */ {
/*     */   public Edits() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addUnchanged(int unchangedLength) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addReplace(int oldLength, int newLength) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int lengthDelta() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasChanges() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int numberOfChanges() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator getCoarseChangesIterator() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator getCoarseIterator() {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator getFineChangesIterator() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator getFineIterator() {
/* 143 */     throw new RuntimeException("Stub!");
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
/*     */   public Edits mergeAndAppend(Edits ab, Edits bc) {
/* 169 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Iterator
/*     */   {
/*     */     Iterator(char[] a, int len, boolean oc, boolean crs) {
/* 193 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean next() {
/* 200 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public boolean findSourceIndex(int i) {
/* 218 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public boolean findDestinationIndex(int i) {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public int destinationIndexFromSourceIndex(int i) {
/* 257 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public int sourceIndexFromDestinationIndex(int i) {
/* 278 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasChange() {
/* 287 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int oldLength() {
/* 295 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int newLength() {
/* 306 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int sourceIndex() {
/* 315 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public int replacementIndex() {
/* 332 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int destinationIndex() {
/* 341 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 349 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/Edits.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */