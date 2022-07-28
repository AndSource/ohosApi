/*     */ package ohos.global.icu.text;
/*     */ 
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class IDNA
/*     */ {
/*     */   public static final int CHECK_BIDI = 4;
/*     */   public static final int CHECK_CONTEXTJ = 8;
/*     */   public static final int CHECK_CONTEXTO = 64;
/*     */   public static final int DEFAULT = 0;
/*     */   public static final int NONTRANSITIONAL_TO_ASCII = 16;
/*     */   public static final int NONTRANSITIONAL_TO_UNICODE = 32;
/*     */   public static final int USE_STD3_RULES = 2;
/*     */   
/*     */   @Deprecated
/*     */   IDNA() {
/*  63 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static IDNA getUTS46Instance(int options) {
/*  92 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract StringBuilder labelToASCII(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract StringBuilder labelToUnicode(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract StringBuilder nameToASCII(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract StringBuilder nameToUnicode(CharSequence paramCharSequence, StringBuilder paramStringBuilder, Info paramInfo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Error
/*     */   {
/* 226 */     EMPTY_LABEL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     LABEL_TOO_LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     DOMAIN_NAME_TOO_LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     LEADING_HYPHEN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     TRAILING_HYPHEN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     HYPHEN_3_4,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 260 */     LEADING_COMBINING_MARK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     DISALLOWED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     PUNYCODE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     LABEL_HAS_DOT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     INVALID_ACE_LABEL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     BIDI,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 296 */     CONTEXTJ,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 303 */     CONTEXTO_PUNCTUATION,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     CONTEXTO_DIGITS;
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
/*     */   public static final class Info
/*     */   {
/*     */     public Info() {
/* 324 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasErrors() {
/* 331 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Set<IDNA.Error> getErrors() {
/* 338 */       throw new RuntimeException("Stub!");
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
/*     */     public boolean isTransitionalDifferent() {
/* 353 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/IDNA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */