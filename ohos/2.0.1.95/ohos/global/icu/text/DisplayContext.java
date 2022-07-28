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
/*     */ public enum DisplayContext
/*     */ {
/*  27 */   STANDARD_NAMES,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   DIALECT_NAMES,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   CAPITALIZATION_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   CAPITALIZATION_FOR_UI_LIST_OR_MENU,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   CAPITALIZATION_FOR_STANDALONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   LENGTH_FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   LENGTH_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  90 */   SUBSTITUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   NO_SUBSTITUTE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Type type() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int value() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Type
/*     */   {
/* 121 */     DIALECT_HANDLING,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     CAPITALIZATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     DISPLAY_LENGTH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     SUBSTITUTE_HANDLING;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/DisplayContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */