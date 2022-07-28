/*     */ package ohos.miscservices.inputmethod;
/*     */ 
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.Sequenceable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EditorAttribute
/*     */   implements Sequenceable
/*     */ {
/*     */   public static final int ENTER_KEY_TYPE_DONE = 4;
/*     */   public static final int ENTER_KEY_TYPE_GO = 2;
/*     */   public static final int ENTER_KEY_TYPE_NEXT = 5;
/*     */   public static final int ENTER_KEY_TYPE_PREVIOUS = 6;
/*     */   public static final int ENTER_KEY_TYPE_SEARCH = 1;
/*     */   
/*     */   public EditorAttribute() {
/*  18 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int ENTER_KEY_TYPE_SEND = 3; public static final int ENTER_KEY_TYPE_UNSPECIFIED = 0; public static final int OPTION_ASCII = 32; public static final int OPTION_AUTO_CAP_CHARACTERS = 2; public static final int OPTION_AUTO_CAP_SENTENCES = 8; public static final int OPTION_AUTO_CAP_WORDS = 4; public static final int OPTION_MULTI_LINE = 1;
/*     */   public static final int OPTION_NONE = 0;
/*     */   public static final int OPTION_NO_FULLSCREEN = 16;
/*     */   public static final int PATTERN_DATETIME = 4;
/*     */   public static final int PATTERN_EMAIL = 6;
/*     */   
/*     */   public int getInputPattern() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final int PATTERN_NULL = 0;
/*     */   
/*     */   public static final int PATTERN_NUMBER = 2;
/*     */   
/*     */   public static final int PATTERN_PASSWORD = 7;
/*     */   
/*     */   public static final int PATTERN_PHONE = 3;
/*     */   
/*     */   public static final int PATTERN_TEXT = 1;
/*     */   
/*     */   public static final int PATTERN_URI = 5;
/*     */   
/*     */   public void setInputPattern(int pattern) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEnterKeyType() {
/*  53 */     throw new RuntimeException("Stub!");
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
/*     */   public void setEnterKeyType(int type) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputOption(int option) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInputOption() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/miscservices/inputmethod/EditorAttribute.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */