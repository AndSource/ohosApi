/*      */ package ohos.global.icu.lang;
/*      */ 
/*      */ import java.util.Locale;
/*      */ import ohos.global.icu.text.BreakIterator;
/*      */ import ohos.global.icu.util.RangeValueIterator;
/*      */ import ohos.global.icu.util.ULocale;
/*      */ import ohos.global.icu.util.ValueIterator;
/*      */ import ohos.global.icu.util.VersionInfo;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class UCharacter
/*      */   implements UCharacterEnums.ECharacterCategory, UCharacterEnums.ECharacterDirection
/*      */ {
/*      */   public static final int FOLD_CASE_DEFAULT = 0;
/*      */   public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
/*      */   public static final int MAX_CODE_POINT = 1114111;
/*      */   public static final char MAX_HIGH_SURROGATE = '?';
/*      */   public static final char MAX_LOW_SURROGATE = '?';
/*      */   public static final int MAX_RADIX = 36;
/*      */   public static final char MAX_SURROGATE = '?';
/*      */   public static final int MAX_VALUE = 1114111;
/*      */   public static final int MIN_CODE_POINT = 0;
/*      */   public static final char MIN_HIGH_SURROGATE = '?';
/*      */   public static final char MIN_LOW_SURROGATE = '?';
/*      */   public static final int MIN_RADIX = 2;
/*      */   public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*      */   public static final char MIN_SURROGATE = '?';
/*      */   public static final int MIN_VALUE = 0;
/*      */   public static final double NO_NUMERIC_VALUE = -1.23456789E8D;
/*      */   public static final int REPLACEMENT_CHAR = 65533;
/*      */   public static final int SUPPLEMENTARY_MIN_VALUE = 65536;
/*      */   public static final int TITLECASE_NO_BREAK_ADJUSTMENT = 512;
/*      */   public static final int TITLECASE_NO_LOWERCASE = 256;
/*      */   
/*      */   UCharacter() {
/*  150 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int digit(int ch, int radix) {
/*  175 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int digit(int ch) {
/*  190 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getNumericValue(int ch) {
/*  206 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double getUnicodeNumericValue(int ch) {
/*  225 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getType(int ch) {
/*  242 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isDefined(int ch) {
/*  255 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isDigit(int ch) {
/*  269 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isISOControl(int ch) {
/*  281 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLetter(int ch) {
/*  290 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLetterOrDigit(int ch) {
/*  300 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isJavaIdentifierStart(int cp) {
/*  309 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isJavaIdentifierPart(int cp) {
/*  318 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLowerCase(int ch) {
/*  333 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isWhitespace(int ch) {
/*  364 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSpaceChar(int ch) {
/*  374 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isTitleCase(int ch) {
/*  389 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUnicodeIdentifierPart(int ch) {
/*  418 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUnicodeIdentifierStart(int ch) {
/*  440 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isIdentifierIgnorable(int ch) {
/*  457 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUpperCase(int ch) {
/*  476 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toLowerCase(int ch) {
/*  497 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toString(int ch) {
/*  511 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toTitleCase(int ch) {
/*  533 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toUpperCase(int ch) {
/*  554 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSupplementary(int ch) {
/*  565 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isBMP(int ch) {
/*  574 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isPrintable(int ch) {
/*  583 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isBaseForm(int ch) {
/*  593 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getDirection(int ch) {
/*  605 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isMirrored(int ch) {
/*  616 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getMirror(int ch) {
/*  632 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getBidiPairedBracket(int c) {
/*  650 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCombiningClass(int ch) {
/*  658 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLegal(int ch) {
/*  672 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLegal(String str) {
/*  687 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static VersionInfo getUnicodeVersion() {
/*  694 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getName(int ch) {
/*  707 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getName(String s, String separator) {
/*  716 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getExtendedName(int ch) {
/*  736 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getNameAlias(int ch) {
/*  749 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromName(String name) {
/*  761 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromExtendedName(String name) {
/*  782 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCharFromNameAlias(String name) {
/*  793 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPropertyName(int property, int nameChoice) {
/*  828 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getPropertyEnum(CharSequence propertyAlias) {
/*  852 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getPropertyValueName(int property, int value, int nameChoice) {
/*  902 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getPropertyValueEnum(int property, CharSequence valueAlias) {
/*  935 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCodePoint(char lead, char trail) {
/*  947 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getCodePoint(char char16) {
/*  958 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(String str) {
/*  967 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(String str) {
/*  976 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(String str, BreakIterator breakiter) {
/*  996 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(Locale locale, String str) {
/* 1006 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toUpperCase(ULocale locale, String str) {
/* 1016 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(Locale locale, String str) {
/* 1026 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toLowerCase(ULocale locale, String str) {
/* 1036 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(Locale locale, String str, BreakIterator breakiter) {
/* 1057 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(ULocale locale, String str, BreakIterator titleIter) {
/* 1078 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(ULocale locale, String str, BreakIterator titleIter, int options) {
/* 1102 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String toTitleCase(Locale locale, String str, BreakIterator titleIter, int options) {
/* 1126 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int foldCase(int ch, boolean defaultmapping) {
/* 1152 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String foldCase(String str, boolean defaultmapping) {
/* 1171 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int foldCase(int ch, int options) {
/* 1195 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String foldCase(String str, int options) {
/* 1212 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getHanNumericValue(int ch) {
/* 1234 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RangeValueIterator getTypeIterator() {
/* 1254 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ValueIterator getNameIterator() {
/* 1276 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ValueIterator getExtendedNameIterator() {
/* 1297 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static VersionInfo getAge(int ch) {
/* 1311 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean hasBinaryProperty(int ch, int property) {
/* 1338 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUAlphabetic(int ch) {
/* 1347 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isULowercase(int ch) {
/* 1356 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUUppercase(int ch) {
/* 1365 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isUWhiteSpace(int ch) {
/* 1375 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyValue(int ch, int type) {
/* 1417 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyMinValue(int type) {
/* 1437 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIntPropertyMaxValue(int type) {
/* 1464 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static char forDigit(int digit, int radix) {
/* 1470 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isValidCodePoint(int cp) {
/* 1479 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSupplementaryCodePoint(int cp) {
/* 1488 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isHighSurrogate(char ch) {
/* 1497 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isLowSurrogate(char ch) {
/* 1506 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSurrogatePair(char high, char low) {
/* 1516 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int charCount(int cp) {
/* 1527 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toCodePoint(char high, char low) {
/* 1539 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(CharSequence seq, int index) {
/* 1551 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(char[] text, int index) {
/* 1563 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointAt(char[] text, int index, int limit) {
/* 1576 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(CharSequence seq, int index) {
/* 1588 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(char[] text, int index) {
/* 1600 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointBefore(char[] text, int index, int limit) {
/* 1613 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int toChars(int cp, char[] dst, int dstIndex) {
/* 1627 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static char[] toChars(int cp) {
/* 1638 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte getDirectionality(int cp) {
/* 1655 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointCount(CharSequence text, int start, int limit) {
/* 1667 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int codePointCount(char[] text, int start, int limit) {
/* 1678 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int offsetByCodePoints(CharSequence text, int index, int codePointOffset) {
/* 1689 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int offsetByCodePoints(char[] text, int start, int count, int index, int codePointOffset) {
/* 1703 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface WordBreak
/*      */   {
/*      */     public static final int ALETTER = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CR = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DOUBLE_QUOTE = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EXTEND = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EXTENDNUMLET = 7;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_BASE = 17;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_BASE_GAZ = 18;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int E_MODIFIER = 19;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int FORMAT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLUE_AFTER_ZWJ = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HEBREW_LETTER = 14;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LF = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDLETTER = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDNUM = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIDNUMLET = 11;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEWLINE = 12;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUMERIC = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OTHER = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REGIONAL_INDICATOR = 13;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINGLE_QUOTE = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WSEGSPACE = 22;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ZWJ = 21;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface VerticalOrientation
/*      */   {
/*      */     public static final int ROTATED = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TRANSFORMED_ROTATED = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TRANSFORMED_UPRIGHT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UPRIGHT = 3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class UnicodeBlock
/*      */     extends Character.Subset
/*      */   {
/*      */     UnicodeBlock(String name, int id) {
/* 3268 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock getInstance(int id) {
/* 3279 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock of(int ch) {
/* 3288 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static UnicodeBlock forName(String blockName) {
/* 3301 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getID() {
/* 3308 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 3313 */     public static final UnicodeBlock ADLAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ADLAM_ID = 263;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3323 */     public static final UnicodeBlock AEGEAN_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AEGEAN_NUMBERS_ID = 119;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3333 */     public static final UnicodeBlock AHOM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AHOM_ID = 253;
/*      */ 
/*      */ 
/*      */     
/* 3342 */     public static final UnicodeBlock ALCHEMICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ALCHEMICAL_SYMBOLS_ID = 208;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3352 */     public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ALPHABETIC_PRESENTATION_FORMS_ID = 80;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3362 */     public static final UnicodeBlock ANATOLIAN_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANATOLIAN_HIEROGLYPHS_ID = 254;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3372 */     public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_GREEK_MUSICAL_NOTATION_ID = 126;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3383 */     public static final UnicodeBlock ANCIENT_GREEK_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_GREEK_NUMBERS_ID = 127;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3394 */     public static final UnicodeBlock ANCIENT_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ANCIENT_SYMBOLS_ID = 165;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3405 */     public static final UnicodeBlock ARABIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3410 */     public static final UnicodeBlock ARABIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_EXTENDED_A_ID = 210;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_ID = 12;
/*      */ 
/*      */ 
/*      */     
/* 3424 */     public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS_ID = 211;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3434 */     public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_PRESENTATION_FORMS_A_ID = 81;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3445 */     public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_PRESENTATION_FORMS_B_ID = 85;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3456 */     public static final UnicodeBlock ARABIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARABIC_SUPPLEMENT_ID = 128;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3467 */     public static final UnicodeBlock ARMENIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARMENIAN_ID = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3478 */     public static final UnicodeBlock ARROWS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ARROWS_ID = 46;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3488 */     public static final UnicodeBlock AVESTAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AVESTAN_ID = 188;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3498 */     public static final UnicodeBlock BALINESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BALINESE_ID = 147;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3508 */     public static final UnicodeBlock BAMUM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BAMUM_ID = 177;
/*      */ 
/*      */ 
/*      */     
/* 3517 */     public static final UnicodeBlock BAMUM_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BAMUM_SUPPLEMENT_ID = 202;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3527 */     public static final UnicodeBlock BASIC_LATIN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BASIC_LATIN_ID = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3537 */     public static final UnicodeBlock BASSA_VAH = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BASSA_VAH_ID = 221;
/*      */ 
/*      */ 
/*      */     
/* 3546 */     public static final UnicodeBlock BATAK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BATAK_ID = 199;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3556 */     public static final UnicodeBlock BENGALI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BENGALI_ID = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3566 */     public static final UnicodeBlock BHAIKSUKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BHAIKSUKI_ID = 264;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3576 */     public static final UnicodeBlock BLOCK_ELEMENTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BLOCK_ELEMENTS_ID = 53;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3587 */     public static final UnicodeBlock BOPOMOFO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3593 */     public static final UnicodeBlock BOPOMOFO_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOPOMOFO_EXTENDED_ID = 67;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOPOMOFO_ID = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3609 */     public static final UnicodeBlock BOX_DRAWING = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BOX_DRAWING_ID = 52;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3619 */     public static final UnicodeBlock BRAHMI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BRAHMI_ID = 201;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3629 */     public static final UnicodeBlock BRAILLE_PATTERNS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BRAILLE_PATTERNS_ID = 57;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3640 */     public static final UnicodeBlock BUGINESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BUGINESE_ID = 129;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3651 */     public static final UnicodeBlock BUHID = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BUHID_ID = 100;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3662 */     public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int BYZANTINE_MUSICAL_SYMBOLS_ID = 91;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3673 */     public static final UnicodeBlock CARIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CARIAN_ID = 168;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3683 */     public static final UnicodeBlock CAUCASIAN_ALBANIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CAUCASIAN_ALBANIAN_ID = 222;
/*      */ 
/*      */ 
/*      */     
/* 3692 */     public static final UnicodeBlock CHAKMA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHAKMA_ID = 212;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3702 */     public static final UnicodeBlock CHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHAM_ID = 164;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3713 */     public static final UnicodeBlock CHEROKEE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHEROKEE_ID = 32;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3723 */     public static final UnicodeBlock CHEROKEE_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHEROKEE_SUPPLEMENT_ID = 255;
/*      */ 
/*      */ 
/*      */     
/* 3732 */     public static final UnicodeBlock CHESS_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHESS_SYMBOLS_ID = 281;
/*      */ 
/*      */ 
/*      */     
/* 3741 */     public static final UnicodeBlock CHORASMIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CHORASMIAN_ID = 301;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3751 */     public static final UnicodeBlock CJK_COMPATIBILITY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3757 */     public static final UnicodeBlock CJK_COMPATIBILITY_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_FORMS_ID = 83;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_ID = 69;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3773 */     public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_IDEOGRAPHS_ID = 79;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3784 */     public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT_ID = 95;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3795 */     public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_RADICALS_SUPPLEMENT_ID = 58;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3806 */     public static final UnicodeBlock CJK_STROKES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_STROKES_ID = 130;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3817 */     public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_SYMBOLS_AND_PUNCTUATION_ID = 61;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3828 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3834 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A_ID = 70;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3845 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B_ID = 94;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3855 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C_ID = 197;
/*      */ 
/*      */ 
/*      */     
/* 3864 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D_ID = 209;
/*      */ 
/*      */ 
/*      */     
/* 3873 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E_ID = 256;
/*      */ 
/*      */ 
/*      */     
/* 3882 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_F_ID = 274;
/*      */ 
/*      */ 
/*      */     
/* 3891 */     public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_G_ID = 302;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CJK_UNIFIED_IDEOGRAPHS_ID = 71;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3906 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3911 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_EXTENDED_ID = 224;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_ID = 7;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3926 */     public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_DIACRITICAL_MARKS_SUPPLEMENT_ID = 131;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3937 */     public static final UnicodeBlock COMBINING_HALF_MARKS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_HALF_MARKS_ID = 82;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3950 */     public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMBINING_MARKS_FOR_SYMBOLS_ID = 43;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3962 */     public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMMON_INDIC_NUMBER_FORMS_ID = 178;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3972 */     public static final UnicodeBlock CONTROL_PICTURES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CONTROL_PICTURES_ID = 49;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3983 */     public static final UnicodeBlock COPTIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3988 */     public static final UnicodeBlock COPTIC_EPACT_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COPTIC_EPACT_NUMBERS_ID = 223;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COPTIC_ID = 132;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4003 */     public static final UnicodeBlock COUNTING_ROD_NUMERALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COUNTING_ROD_NUMERALS_ID = 154;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4014 */     public static final UnicodeBlock CUNEIFORM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CUNEIFORM_ID = 152;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4025 */     public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CUNEIFORM_NUMBERS_AND_PUNCTUATION_ID = 153;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4036 */     public static final UnicodeBlock CURRENCY_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CURRENCY_SYMBOLS_ID = 42;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4047 */     public static final UnicodeBlock CYPRIOT_SYLLABARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYPRIOT_SYLLABARY_ID = 123;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4058 */     public static final UnicodeBlock CYRILLIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4064 */     public static final UnicodeBlock CYRILLIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_A_ID = 158;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4075 */     public static final UnicodeBlock CYRILLIC_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_B_ID = 160;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4085 */     public static final UnicodeBlock CYRILLIC_EXTENDED_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_EXTENDED_C_ID = 265;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_ID = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4101 */     public static final UnicodeBlock CYRILLIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4108 */     public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_SUPPLEMENTARY_ID = 97;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int CYRILLIC_SUPPLEMENT_ID = 97;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4126 */     public static final UnicodeBlock DESERET = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DESERET_ID = 90;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4137 */     public static final UnicodeBlock DEVANAGARI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4142 */     public static final UnicodeBlock DEVANAGARI_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEVANAGARI_EXTENDED_ID = 179;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEVANAGARI_ID = 15;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4157 */     public static final UnicodeBlock DINGBATS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DINGBATS_ID = 56;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4167 */     public static final UnicodeBlock DIVES_AKURU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DIVES_AKURU_ID = 303;
/*      */ 
/*      */ 
/*      */     
/* 4176 */     public static final UnicodeBlock DOGRA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DOGRA_ID = 282;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4186 */     public static final UnicodeBlock DOMINO_TILES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DOMINO_TILES_ID = 171;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4196 */     public static final UnicodeBlock DUPLOYAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DUPLOYAN_ID = 225;
/*      */ 
/*      */ 
/*      */     
/* 4205 */     public static final UnicodeBlock EARLY_DYNASTIC_CUNEIFORM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EARLY_DYNASTIC_CUNEIFORM_ID = 257;
/*      */ 
/*      */ 
/*      */     
/* 4214 */     public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EGYPTIAN_HIEROGLYPHS_ID = 194;
/*      */ 
/*      */ 
/*      */     
/* 4223 */     public static final UnicodeBlock EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EGYPTIAN_HIEROGLYPH_FORMAT_CONTROLS_ID = 292;
/*      */ 
/*      */ 
/*      */     
/* 4232 */     public static final UnicodeBlock ELBASAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ELBASAN_ID = 226;
/*      */ 
/*      */ 
/*      */     
/* 4241 */     public static final UnicodeBlock ELYMAIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ELYMAIC_ID = 293;
/*      */ 
/*      */ 
/*      */     
/* 4250 */     public static final UnicodeBlock EMOTICONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EMOTICONS_ID = 206;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4260 */     public static final UnicodeBlock ENCLOSED_ALPHANUMERICS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_ALPHANUMERICS_ID = 51;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4270 */     public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_ALPHANUMERIC_SUPPLEMENT_ID = 195;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4280 */     public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_CJK_LETTERS_AND_MONTHS_ID = 68;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4290 */     public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ENCLOSED_IDEOGRAPHIC_SUPPLEMENT_ID = 196;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4300 */     public static final UnicodeBlock ETHIOPIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4306 */     public static final UnicodeBlock ETHIOPIC_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4311 */     public static final UnicodeBlock ETHIOPIC_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_EXTENDED_A_ID = 200;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_EXTENDED_ID = 133;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_ID = 31;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4331 */     public static final UnicodeBlock ETHIOPIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ETHIOPIC_SUPPLEMENT_ID = 134;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4342 */     public static final UnicodeBlock GENERAL_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GENERAL_PUNCTUATION_ID = 40;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4353 */     public static final UnicodeBlock GEOMETRIC_SHAPES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4358 */     public static final UnicodeBlock GEOMETRIC_SHAPES_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEOMETRIC_SHAPES_EXTENDED_ID = 227;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEOMETRIC_SHAPES_ID = 54;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4373 */     public static final UnicodeBlock GEORGIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4378 */     public static final UnicodeBlock GEORGIAN_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEORGIAN_EXTENDED_ID = 283;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEORGIAN_ID = 29;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4393 */     public static final UnicodeBlock GEORGIAN_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEORGIAN_SUPPLEMENT_ID = 135;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4404 */     public static final UnicodeBlock GLAGOLITIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLAGOLITIC_ID = 136;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4414 */     public static final UnicodeBlock GLAGOLITIC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GLAGOLITIC_SUPPLEMENT_ID = 266;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4424 */     public static final UnicodeBlock GOTHIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GOTHIC_ID = 89;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4434 */     public static final UnicodeBlock GRANTHA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GRANTHA_ID = 228;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4445 */     public static final UnicodeBlock GREEK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4451 */     public static final UnicodeBlock GREEK_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GREEK_EXTENDED_ID = 39;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GREEK_ID = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4468 */     public static final UnicodeBlock GUJARATI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GUJARATI_ID = 18;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4478 */     public static final UnicodeBlock GUNJALA_GONDI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GUNJALA_GONDI_ID = 284;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4488 */     public static final UnicodeBlock GURMUKHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GURMUKHI_ID = 17;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4499 */     public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HALFWIDTH_AND_FULLWIDTH_FORMS_ID = 87;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4510 */     public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_COMPATIBILITY_JAMO_ID = 65;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4521 */     public static final UnicodeBlock HANGUL_JAMO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4526 */     public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_EXTENDED_A_ID = 180;
/*      */ 
/*      */ 
/*      */     
/* 4535 */     public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_EXTENDED_B_ID = 185;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_JAMO_ID = 30;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4550 */     public static final UnicodeBlock HANGUL_SYLLABLES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANGUL_SYLLABLES_ID = 74;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4560 */     public static final UnicodeBlock HANIFI_ROHINGYA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANIFI_ROHINGYA_ID = 285;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4570 */     public static final UnicodeBlock HANUNOO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HANUNOO_ID = 99;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4580 */     public static final UnicodeBlock HATRAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HATRAN_ID = 258;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4590 */     public static final UnicodeBlock HEBREW = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HEBREW_ID = 11;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4601 */     public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIGH_PRIVATE_USE_SURROGATES_ID = 76;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4612 */     public static final UnicodeBlock HIGH_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIGH_SURROGATES_ID = 75;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4623 */     public static final UnicodeBlock HIRAGANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HIRAGANA_ID = 62;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4634 */     public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IDEOGRAPHIC_DESCRIPTION_CHARACTERS_ID = 60;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4644 */     public static final UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION_ID = 267;
/*      */ 
/*      */ 
/*      */     
/* 4653 */     public static final UnicodeBlock IMPERIAL_ARAMAIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMPERIAL_ARAMAIC_ID = 186;
/*      */ 
/*      */ 
/*      */     
/* 4662 */     public static final UnicodeBlock INDIC_SIYAQ_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INDIC_SIYAQ_NUMBERS_ID = 286;
/*      */ 
/*      */ 
/*      */     
/* 4671 */     public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INSCRIPTIONAL_PAHLAVI_ID = 190;
/*      */ 
/*      */ 
/*      */     
/* 4680 */     public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INSCRIPTIONAL_PARTHIAN_ID = 189;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4690 */     public static final UnicodeBlock INVALID_CODE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int INVALID_CODE_ID = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4701 */     public static final UnicodeBlock IPA_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IPA_EXTENSIONS_ID = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4711 */     public static final UnicodeBlock JAVANESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int JAVANESE_ID = 181;
/*      */ 
/*      */ 
/*      */     
/* 4720 */     public static final UnicodeBlock KAITHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KAITHI_ID = 193;
/*      */ 
/*      */ 
/*      */     
/* 4729 */     public static final UnicodeBlock KANA_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANA_EXTENDED_A_ID = 275;
/*      */ 
/*      */ 
/*      */     
/* 4738 */     public static final UnicodeBlock KANA_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANA_SUPPLEMENT_ID = 203;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4748 */     public static final UnicodeBlock KANBUN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANBUN_ID = 66;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4759 */     public static final UnicodeBlock KANGXI_RADICALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANGXI_RADICALS_ID = 59;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4770 */     public static final UnicodeBlock KANNADA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KANNADA_ID = 22;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4781 */     public static final UnicodeBlock KATAKANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA_ID = 63;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4792 */     public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KATAKANA_PHONETIC_EXTENSIONS_ID = 107;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4803 */     public static final UnicodeBlock KAYAH_LI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KAYAH_LI_ID = 162;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4814 */     public static final UnicodeBlock KHAROSHTHI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHAROSHTHI_ID = 137;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4824 */     public static final UnicodeBlock KHITAN_SMALL_SCRIPT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHITAN_SMALL_SCRIPT_ID = 304;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4834 */     public static final UnicodeBlock KHMER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHMER_ID = 36;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4845 */     public static final UnicodeBlock KHMER_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHMER_SYMBOLS_ID = 113;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4855 */     public static final UnicodeBlock KHOJKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHOJKI_ID = 229;
/*      */ 
/*      */ 
/*      */     
/* 4864 */     public static final UnicodeBlock KHUDAWADI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int KHUDAWADI_ID = 230;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4874 */     public static final UnicodeBlock LAO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LAO_ID = 26;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4885 */     public static final UnicodeBlock LATIN_1_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_1_SUPPLEMENT_ID = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4896 */     public static final UnicodeBlock LATIN_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4902 */     public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_ADDITIONAL_ID = 38;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_A_ID = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4918 */     public static final UnicodeBlock LATIN_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_B_ID = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4929 */     public static final UnicodeBlock LATIN_EXTENDED_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_C_ID = 148;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4940 */     public static final UnicodeBlock LATIN_EXTENDED_D = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_D_ID = 149;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4950 */     public static final UnicodeBlock LATIN_EXTENDED_E = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LATIN_EXTENDED_E_ID = 231;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4960 */     public static final UnicodeBlock LEPCHA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LEPCHA_ID = 156;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4971 */     public static final UnicodeBlock LETTERLIKE_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LETTERLIKE_SYMBOLS_ID = 44;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4982 */     public static final UnicodeBlock LIMBU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LIMBU_ID = 111;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 4992 */     public static final UnicodeBlock LINEAR_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_A_ID = 232;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5002 */     public static final UnicodeBlock LINEAR_B_IDEOGRAMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_B_IDEOGRAMS_ID = 118;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5013 */     public static final UnicodeBlock LINEAR_B_SYLLABARY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LINEAR_B_SYLLABARY_ID = 117;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5023 */     public static final UnicodeBlock LISU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LISU_ID = 176;
/*      */ 
/*      */ 
/*      */     
/* 5032 */     public static final UnicodeBlock LISU_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LISU_SUPPLEMENT_ID = 305;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5042 */     public static final UnicodeBlock LOW_SURROGATES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LOW_SURROGATES_ID = 77;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5053 */     public static final UnicodeBlock LYCIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LYCIAN_ID = 167;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5064 */     public static final UnicodeBlock LYDIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int LYDIAN_ID = 169;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5074 */     public static final UnicodeBlock MAHAJANI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAHAJANI_ID = 233;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5084 */     public static final UnicodeBlock MAHJONG_TILES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAHJONG_TILES_ID = 170;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5094 */     public static final UnicodeBlock MAKASAR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAKASAR_ID = 287;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5104 */     public static final UnicodeBlock MALAYALAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MALAYALAM_ID = 23;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5114 */     public static final UnicodeBlock MANDAIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MANDAIC_ID = 198;
/*      */ 
/*      */ 
/*      */     
/* 5123 */     public static final UnicodeBlock MANICHAEAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MANICHAEAN_ID = 234;
/*      */ 
/*      */ 
/*      */     
/* 5132 */     public static final UnicodeBlock MARCHEN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MARCHEN_ID = 268;
/*      */ 
/*      */ 
/*      */     
/* 5141 */     public static final UnicodeBlock MASARAM_GONDI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MASARAM_GONDI_ID = 276;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5151 */     public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MATHEMATICAL_ALPHANUMERIC_SYMBOLS_ID = 93;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5162 */     public static final UnicodeBlock MATHEMATICAL_OPERATORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MATHEMATICAL_OPERATORS_ID = 47;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5172 */     public static final UnicodeBlock MAYAN_NUMERALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MAYAN_NUMERALS_ID = 288;
/*      */ 
/*      */ 
/*      */     
/* 5181 */     public static final UnicodeBlock MEDEFAIDRIN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEDEFAIDRIN_ID = 289;
/*      */ 
/*      */ 
/*      */     
/* 5190 */     public static final UnicodeBlock MEETEI_MAYEK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5195 */     public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEETEI_MAYEK_EXTENSIONS_ID = 213;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEETEI_MAYEK_ID = 184;
/*      */ 
/*      */ 
/*      */     
/* 5208 */     public static final UnicodeBlock MENDE_KIKAKUI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MENDE_KIKAKUI_ID = 235;
/*      */ 
/*      */ 
/*      */     
/* 5217 */     public static final UnicodeBlock MEROITIC_CURSIVE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEROITIC_CURSIVE_ID = 214;
/*      */ 
/*      */ 
/*      */     
/* 5226 */     public static final UnicodeBlock MEROITIC_HIEROGLYPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MEROITIC_HIEROGLYPHS_ID = 215;
/*      */ 
/*      */ 
/*      */     
/* 5235 */     public static final UnicodeBlock MIAO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MIAO_ID = 216;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5245 */     public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A_ID = 102;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5256 */     public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B_ID = 105;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5267 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5273 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_AND_ARROWS_ID = 115;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5283 */     public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS_ID = 205;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_SYMBOLS_ID = 55;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5298 */     public static final UnicodeBlock MISCELLANEOUS_TECHNICAL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MISCELLANEOUS_TECHNICAL_ID = 48;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5308 */     public static final UnicodeBlock MODI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5314 */     public static final UnicodeBlock MODIFIER_TONE_LETTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MODIFIER_TONE_LETTERS_ID = 138;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MODI_ID = 236;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5329 */     public static final UnicodeBlock MONGOLIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MONGOLIAN_ID = 37;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5339 */     public static final UnicodeBlock MONGOLIAN_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MONGOLIAN_SUPPLEMENT_ID = 269;
/*      */ 
/*      */ 
/*      */     
/* 5348 */     public static final UnicodeBlock MRO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MRO_ID = 237;
/*      */ 
/*      */ 
/*      */     
/* 5357 */     public static final UnicodeBlock MULTANI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MULTANI_ID = 259;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5367 */     public static final UnicodeBlock MUSICAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MUSICAL_SYMBOLS_ID = 92;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5378 */     public static final UnicodeBlock MYANMAR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5383 */     public static final UnicodeBlock MYANMAR_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_EXTENDED_A_ID = 182;
/*      */ 
/*      */ 
/*      */     
/* 5392 */     public static final UnicodeBlock MYANMAR_EXTENDED_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_EXTENDED_B_ID = 238;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MYANMAR_ID = 28;
/*      */ 
/*      */ 
/*      */     
/* 5406 */     public static final UnicodeBlock NABATAEAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NABATAEAN_ID = 239;
/*      */ 
/*      */ 
/*      */     
/* 5415 */     public static final UnicodeBlock NANDINAGARI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NANDINAGARI_ID = 294;
/*      */ 
/*      */ 
/*      */     
/* 5424 */     public static final UnicodeBlock NEWA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEWA_ID = 270;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5434 */     public static final UnicodeBlock NEW_TAI_LUE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NEW_TAI_LUE_ID = 139;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5445 */     public static final UnicodeBlock NKO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NKO_ID = 146;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5456 */     public static final UnicodeBlock NO_BLOCK = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5462 */     public static final UnicodeBlock NUMBER_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUMBER_FORMS_ID = 45;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5472 */     public static final UnicodeBlock NUSHU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NUSHU_ID = 277;
/*      */ 
/*      */ 
/*      */     
/* 5481 */     public static final UnicodeBlock NYIAKENG_PUACHUE_HMONG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NYIAKENG_PUACHUE_HMONG_ID = 295;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5491 */     public static final UnicodeBlock OGHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OGHAM_ID = 34;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5501 */     public static final UnicodeBlock OLD_HUNGARIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_HUNGARIAN_ID = 260;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5511 */     public static final UnicodeBlock OLD_ITALIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_ITALIC_ID = 88;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5521 */     public static final UnicodeBlock OLD_NORTH_ARABIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_NORTH_ARABIAN_ID = 240;
/*      */ 
/*      */ 
/*      */     
/* 5530 */     public static final UnicodeBlock OLD_PERMIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_PERMIC_ID = 241;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5540 */     public static final UnicodeBlock OLD_PERSIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_PERSIAN_ID = 140;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5550 */     public static final UnicodeBlock OLD_SOGDIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_SOGDIAN_ID = 290;
/*      */ 
/*      */ 
/*      */     
/* 5559 */     public static final UnicodeBlock OLD_SOUTH_ARABIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_SOUTH_ARABIAN_ID = 187;
/*      */ 
/*      */ 
/*      */     
/* 5568 */     public static final UnicodeBlock OLD_TURKIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OLD_TURKIC_ID = 191;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5578 */     public static final UnicodeBlock OL_CHIKI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OL_CHIKI_ID = 157;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5589 */     public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OPTICAL_CHARACTER_RECOGNITION_ID = 50;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5600 */     public static final UnicodeBlock ORIYA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ORIYA_ID = 19;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5610 */     public static final UnicodeBlock ORNAMENTAL_DINGBATS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ORNAMENTAL_DINGBATS_ID = 242;
/*      */ 
/*      */ 
/*      */     
/* 5619 */     public static final UnicodeBlock OSAGE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OSAGE_ID = 271;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5629 */     public static final UnicodeBlock OSMANYA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OSMANYA_ID = 122;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5639 */     public static final UnicodeBlock OTTOMAN_SIYAQ_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int OTTOMAN_SIYAQ_NUMBERS_ID = 296;
/*      */ 
/*      */ 
/*      */     
/* 5648 */     public static final UnicodeBlock PAHAWH_HMONG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PAHAWH_HMONG_ID = 243;
/*      */ 
/*      */ 
/*      */     
/* 5657 */     public static final UnicodeBlock PALMYRENE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PALMYRENE_ID = 244;
/*      */ 
/*      */ 
/*      */     
/* 5666 */     public static final UnicodeBlock PAU_CIN_HAU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PAU_CIN_HAU_ID = 245;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5676 */     public static final UnicodeBlock PHAGS_PA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHAGS_PA_ID = 150;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5687 */     public static final UnicodeBlock PHAISTOS_DISC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHAISTOS_DISC_ID = 166;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5698 */     public static final UnicodeBlock PHOENICIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHOENICIAN_ID = 151;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5709 */     public static final UnicodeBlock PHONETIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHONETIC_EXTENSIONS_ID = 114;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5720 */     public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHONETIC_EXTENSIONS_SUPPLEMENT_ID = 141;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5730 */     public static final UnicodeBlock PLAYING_CARDS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PLAYING_CARDS_ID = 204;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5745 */     public static final UnicodeBlock PRIVATE_USE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5756 */     public static final UnicodeBlock PRIVATE_USE_AREA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PRIVATE_USE_AREA_ID = 78;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PRIVATE_USE_ID = 78;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5781 */     public static final UnicodeBlock PSALTER_PAHLAVI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PSALTER_PAHLAVI_ID = 246;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5791 */     public static final UnicodeBlock REJANG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int REJANG_ID = 163;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5801 */     public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int RUMI_NUMERAL_SYMBOLS_ID = 192;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5811 */     public static final UnicodeBlock RUNIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int RUNIC_ID = 35;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5821 */     public static final UnicodeBlock SAMARITAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SAMARITAN_ID = 172;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5831 */     public static final UnicodeBlock SAURASHTRA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SAURASHTRA_ID = 161;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5841 */     public static final UnicodeBlock SHARADA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHARADA_ID = 217;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5851 */     public static final UnicodeBlock SHAVIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHAVIAN_ID = 121;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5861 */     public static final UnicodeBlock SHORTHAND_FORMAT_CONTROLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SHORTHAND_FORMAT_CONTROLS_ID = 247;
/*      */ 
/*      */ 
/*      */     
/* 5870 */     public static final UnicodeBlock SIDDHAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SIDDHAM_ID = 248;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5880 */     public static final UnicodeBlock SINHALA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5885 */     public static final UnicodeBlock SINHALA_ARCHAIC_NUMBERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINHALA_ARCHAIC_NUMBERS_ID = 249;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SINHALA_ID = 24;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5900 */     public static final UnicodeBlock SMALL_FORM_VARIANTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SMALL_FORM_VARIANTS_ID = 84;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5910 */     public static final UnicodeBlock SMALL_KANA_EXTENSION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SMALL_KANA_EXTENSION_ID = 297;
/*      */ 
/*      */ 
/*      */     
/* 5919 */     public static final UnicodeBlock SOGDIAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SOGDIAN_ID = 291;
/*      */ 
/*      */ 
/*      */     
/* 5928 */     public static final UnicodeBlock SORA_SOMPENG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SORA_SOMPENG_ID = 218;
/*      */ 
/*      */ 
/*      */     
/* 5937 */     public static final UnicodeBlock SOYOMBO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SOYOMBO_ID = 278;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5947 */     public static final UnicodeBlock SPACING_MODIFIER_LETTERS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SPACING_MODIFIER_LETTERS_ID = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5958 */     public static final UnicodeBlock SPECIALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SPECIALS_ID = 86;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5969 */     public static final UnicodeBlock SUNDANESE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUNDANESE_ID = 155;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5979 */     public static final UnicodeBlock SUNDANESE_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUNDANESE_SUPPLEMENT_ID = 219;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5989 */     public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPERSCRIPTS_AND_SUBSCRIPTS_ID = 41;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6000 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_A_ID = 103;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6011 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_B_ID = 104;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6021 */     public static final UnicodeBlock SUPPLEMENTAL_ARROWS_C = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_ARROWS_C_ID = 250;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6031 */     public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_MATHEMATICAL_OPERATORS_ID = 106;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6042 */     public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_PUNCTUATION_ID = 142;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6052 */     public static final UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS_ID = 261;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6062 */     public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_A_ID = 109;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6073 */     public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_B_ID = 110;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6083 */     public static final UnicodeBlock SUTTON_SIGNWRITING = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SUTTON_SIGNWRITING_ID = 262;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6093 */     public static final UnicodeBlock SYLOTI_NAGRI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYLOTI_NAGRI_ID = 143;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6103 */     public static final UnicodeBlock SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYMBOLS_AND_PICTOGRAPHS_EXTENDED_A_ID = 298;
/*      */ 
/*      */ 
/*      */     
/* 6112 */     public static final UnicodeBlock SYMBOLS_FOR_LEGACY_COMPUTING = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYMBOLS_FOR_LEGACY_COMPUTING_ID = 306;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6122 */     public static final UnicodeBlock SYRIAC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYRIAC_ID = 13;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6132 */     public static final UnicodeBlock SYRIAC_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SYRIAC_SUPPLEMENT_ID = 279;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6142 */     public static final UnicodeBlock TAGALOG = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGALOG_ID = 98;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6153 */     public static final UnicodeBlock TAGBANWA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGBANWA_ID = 101;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6164 */     public static final UnicodeBlock TAGS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAGS_ID = 96;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6175 */     public static final UnicodeBlock TAI_LE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_LE_ID = 112;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6185 */     public static final UnicodeBlock TAI_THAM = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_THAM_ID = 174;
/*      */ 
/*      */ 
/*      */     
/* 6194 */     public static final UnicodeBlock TAI_VIET = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_VIET_ID = 183;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6204 */     public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAI_XUAN_JING_SYMBOLS_ID = 124;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6214 */     public static final UnicodeBlock TAKRI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAKRI_ID = 220;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6224 */     public static final UnicodeBlock TAMIL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAMIL_ID = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6234 */     public static final UnicodeBlock TAMIL_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TAMIL_SUPPLEMENT_ID = 299;
/*      */ 
/*      */ 
/*      */     
/* 6243 */     public static final UnicodeBlock TANGUT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6248 */     public static final UnicodeBlock TANGUT_COMPONENTS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TANGUT_COMPONENTS_ID = 273;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TANGUT_ID = 272;
/*      */ 
/*      */ 
/*      */     
/* 6261 */     public static final UnicodeBlock TANGUT_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TANGUT_SUPPLEMENT_ID = 307;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6271 */     public static final UnicodeBlock TELUGU = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TELUGU_ID = 21;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6282 */     public static final UnicodeBlock THAANA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int THAANA_ID = 14;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6293 */     public static final UnicodeBlock THAI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int THAI_ID = 25;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6304 */     public static final UnicodeBlock TIBETAN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIBETAN_ID = 27;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6315 */     public static final UnicodeBlock TIFINAGH = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIFINAGH_ID = 144;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6325 */     public static final UnicodeBlock TIRHUTA = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TIRHUTA_ID = 251;
/*      */ 
/*      */ 
/*      */     
/* 6334 */     public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int TRANSPORT_AND_MAP_SYMBOLS_ID = 207;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6344 */     public static final UnicodeBlock UGARITIC = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UGARITIC_ID = 120;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6355 */     public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6360 */     public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_ID = 173;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_ID = 33;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6375 */     public static final UnicodeBlock VAI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VAI_ID = 159;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6386 */     public static final UnicodeBlock VARIATION_SELECTORS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VARIATION_SELECTORS_ID = 108;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6397 */     public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VARIATION_SELECTORS_SUPPLEMENT_ID = 125;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6407 */     public static final UnicodeBlock VEDIC_EXTENSIONS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VEDIC_EXTENSIONS_ID = 175;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6417 */     public static final UnicodeBlock VERTICAL_FORMS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VERTICAL_FORMS_ID = 145;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6427 */     public static final UnicodeBlock WANCHO = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WANCHO_ID = 300;
/*      */ 
/*      */ 
/*      */     
/* 6436 */     public static final UnicodeBlock WARANG_CITI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WARANG_CITI_ID = 252;
/*      */ 
/*      */ 
/*      */     
/* 6445 */     public static final UnicodeBlock YEZIDI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YEZIDI_ID = 308;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6455 */     public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YIJING_HEXAGRAM_SYMBOLS_ID = 116;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6466 */     public static final UnicodeBlock YI_RADICALS = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YI_RADICALS_ID = 73;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6477 */     public static final UnicodeBlock YI_SYLLABLES = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int YI_SYLLABLES_ID = 72;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6487 */     public static final UnicodeBlock ZANABAZAR_SQUARE = null;
/*      */     public static final int ZANABAZAR_SQUARE_ID = 280;
/*      */   }
/*      */   
/*      */   public static interface SentenceBreak {
/*      */     public static final int ATERM = 1;
/*      */     public static final int CLOSE = 2;
/*      */     public static final int CR = 11;
/*      */     public static final int EXTEND = 12;
/*      */     public static final int FORMAT = 3;
/*      */     public static final int LF = 13;
/*      */     public static final int LOWER = 4;
/*      */     public static final int NUMERIC = 5;
/*      */     public static final int OLETTER = 6;
/*      */     public static final int OTHER = 0;
/*      */     public static final int SCONTINUE = 14;
/*      */     public static final int SEP = 7;
/*      */     public static final int SP = 8;
/*      */     public static final int STERM = 9;
/*      */     public static final int UPPER = 10;
/*      */   }
/*      */   
/*      */   public static interface NumericType {
/*      */     public static final int DECIMAL = 1;
/*      */     public static final int DIGIT = 2;
/*      */     public static final int NONE = 0;
/*      */     public static final int NUMERIC = 3;
/*      */   }
/*      */   
/*      */   public static interface LineBreak {
/*      */     public static final int ALPHABETIC = 2;
/*      */     public static final int AMBIGUOUS = 1;
/*      */     public static final int BREAK_AFTER = 4;
/*      */     public static final int BREAK_BEFORE = 5;
/*      */     public static final int BREAK_BOTH = 3;
/*      */     public static final int BREAK_SYMBOLS = 27;
/*      */     public static final int CARRIAGE_RETURN = 10;
/*      */     public static final int CLOSE_PARENTHESIS = 36;
/*      */     public static final int CLOSE_PUNCTUATION = 8;
/*      */     public static final int COMBINING_MARK = 9;
/*      */     public static final int COMPLEX_CONTEXT = 24;
/*      */     public static final int CONDITIONAL_JAPANESE_STARTER = 37;
/*      */     public static final int CONTINGENT_BREAK = 7;
/*      */     public static final int EXCLAMATION = 11;
/*      */     public static final int E_BASE = 40;
/*      */     public static final int E_MODIFIER = 41;
/*      */     public static final int GLUE = 12;
/*      */     public static final int H2 = 31;
/*      */     public static final int H3 = 32;
/*      */     public static final int HEBREW_LETTER = 38;
/*      */     public static final int HYPHEN = 13;
/*      */     public static final int IDEOGRAPHIC = 14;
/*      */     public static final int INFIX_NUMERIC = 16;
/*      */     public static final int INSEPARABLE = 15;
/*      */     public static final int INSEPERABLE = 15;
/*      */     public static final int JL = 33;
/*      */     public static final int JT = 34;
/*      */     public static final int JV = 35;
/*      */     public static final int LINE_FEED = 17;
/*      */     public static final int MANDATORY_BREAK = 6;
/*      */     public static final int NEXT_LINE = 29;
/*      */     public static final int NONSTARTER = 18;
/*      */     public static final int NUMERIC = 19;
/*      */     public static final int OPEN_PUNCTUATION = 20;
/*      */     public static final int POSTFIX_NUMERIC = 21;
/*      */     public static final int PREFIX_NUMERIC = 22;
/*      */     public static final int QUOTATION = 23;
/*      */     public static final int REGIONAL_INDICATOR = 39;
/*      */     public static final int SPACE = 26;
/*      */     public static final int SURROGATE = 25;
/*      */     public static final int UNKNOWN = 0;
/*      */     public static final int WORD_JOINER = 30;
/*      */     public static final int ZWJ = 42;
/*      */     public static final int ZWSPACE = 28;
/*      */   }
/*      */   
/*      */   public static interface JoiningType {
/*      */     public static final int DUAL_JOINING = 2;
/*      */     public static final int JOIN_CAUSING = 1;
/*      */     public static final int LEFT_JOINING = 3;
/*      */     public static final int NON_JOINING = 0;
/*      */     public static final int RIGHT_JOINING = 4;
/*      */     public static final int TRANSPARENT = 5;
/*      */   }
/*      */   
/*      */   public static interface JoiningGroup {
/*      */     public static final int AFRICAN_FEH = 86;
/*      */     public static final int AFRICAN_NOON = 87;
/*      */     public static final int AFRICAN_QAF = 88;
/*      */     public static final int AIN = 1;
/*      */     public static final int ALAPH = 2;
/*      */     public static final int ALEF = 3;
/*      */     public static final int BEH = 4;
/*      */     public static final int BETH = 5;
/*      */     public static final int BURUSHASKI_YEH_BARREE = 54;
/*      */     public static final int DAL = 6;
/*      */     public static final int DALATH_RISH = 7;
/*      */     public static final int E = 8;
/*      */     public static final int FARSI_YEH = 55;
/*      */     public static final int FE = 51;
/*      */     public static final int FEH = 9;
/*      */     public static final int FINAL_SEMKATH = 10;
/*      */     public static final int GAF = 11;
/*      */     public static final int GAMAL = 12;
/*      */     public static final int HAH = 13;
/*      */     public static final int HAMZA_ON_HEH_GOAL = 14;
/*      */     public static final int HANIFI_ROHINGYA_KINNA_YA = 100;
/*      */     public static final int HANIFI_ROHINGYA_PA = 101;
/*      */     public static final int HE = 15;
/*      */     public static final int HEH = 16;
/*      */     public static final int HEH_GOAL = 17;
/*      */     public static final int HETH = 18;
/*      */     public static final int KAF = 19;
/*      */     public static final int KAPH = 20;
/*      */     public static final int KHAPH = 52;
/*      */     public static final int KNOTTED_HEH = 21;
/*      */     public static final int LAM = 22;
/*      */     public static final int LAMADH = 23;
/*      */     public static final int MALAYALAM_BHA = 89;
/*      */     public static final int MALAYALAM_JA = 90;
/*      */     public static final int MALAYALAM_LLA = 91;
/*      */     public static final int MALAYALAM_LLLA = 92;
/*      */     public static final int MALAYALAM_NGA = 93;
/*      */     public static final int MALAYALAM_NNA = 94;
/*      */     public static final int MALAYALAM_NNNA = 95;
/*      */     public static final int MALAYALAM_NYA = 96;
/*      */     public static final int MALAYALAM_RA = 97;
/*      */     public static final int MALAYALAM_SSA = 98;
/*      */     public static final int MALAYALAM_TTA = 99;
/*      */     public static final int MANICHAEAN_ALEPH = 58;
/*      */     public static final int MANICHAEAN_AYIN = 59;
/*      */     public static final int MANICHAEAN_BETH = 60;
/*      */     public static final int MANICHAEAN_DALETH = 61;
/*      */     public static final int MANICHAEAN_DHAMEDH = 62;
/*      */     public static final int MANICHAEAN_FIVE = 63;
/*      */     public static final int MANICHAEAN_GIMEL = 64;
/*      */     public static final int MANICHAEAN_HETH = 65;
/*      */     public static final int MANICHAEAN_HUNDRED = 66;
/*      */     public static final int MANICHAEAN_KAPH = 67;
/*      */     public static final int MANICHAEAN_LAMEDH = 68;
/*      */     public static final int MANICHAEAN_MEM = 69;
/*      */     public static final int MANICHAEAN_NUN = 70;
/*      */     public static final int MANICHAEAN_ONE = 71;
/*      */     public static final int MANICHAEAN_PE = 72;
/*      */     public static final int MANICHAEAN_QOPH = 73;
/*      */     public static final int MANICHAEAN_RESH = 74;
/*      */     public static final int MANICHAEAN_SADHE = 75;
/*      */     public static final int MANICHAEAN_SAMEKH = 76;
/*      */     public static final int MANICHAEAN_TAW = 77;
/*      */     public static final int MANICHAEAN_TEN = 78;
/*      */     public static final int MANICHAEAN_TETH = 79;
/*      */     public static final int MANICHAEAN_THAMEDH = 80;
/*      */     public static final int MANICHAEAN_TWENTY = 81;
/*      */     public static final int MANICHAEAN_WAW = 82;
/*      */     public static final int MANICHAEAN_YODH = 83;
/*      */     public static final int MANICHAEAN_ZAYIN = 84;
/*      */     public static final int MEEM = 24;
/*      */     public static final int MIM = 25;
/*      */     public static final int NOON = 26;
/*      */     public static final int NO_JOINING_GROUP = 0;
/*      */     public static final int NUN = 27;
/*      */     public static final int NYA = 56;
/*      */     public static final int PE = 28;
/*      */     public static final int QAF = 29;
/*      */     public static final int QAPH = 30;
/*      */     public static final int REH = 31;
/*      */     public static final int REVERSED_PE = 32;
/*      */     public static final int ROHINGYA_YEH = 57;
/*      */     public static final int SAD = 33;
/*      */     public static final int SADHE = 34;
/*      */     public static final int SEEN = 35;
/*      */     public static final int SEMKATH = 36;
/*      */     public static final int SHIN = 37;
/*      */     public static final int STRAIGHT_WAW = 85;
/*      */     public static final int SWASH_KAF = 38;
/*      */     public static final int SYRIAC_WAW = 39;
/*      */     public static final int TAH = 40;
/*      */     public static final int TAW = 41;
/*      */     public static final int TEH_MARBUTA = 42;
/*      */     public static final int TEH_MARBUTA_GOAL = 14;
/*      */     public static final int TETH = 43;
/*      */     public static final int WAW = 44;
/*      */     public static final int YEH = 45;
/*      */     public static final int YEH_BARREE = 46;
/*      */     public static final int YEH_WITH_TAIL = 47;
/*      */     public static final int YUDH = 48;
/*      */     public static final int YUDH_HE = 49;
/*      */     public static final int ZAIN = 50;
/*      */     public static final int ZHAIN = 53;
/*      */   }
/*      */   
/*      */   public static interface IndicSyllabicCategory {
/*      */     public static final int AVAGRAHA = 1;
/*      */     public static final int BINDU = 2;
/*      */     public static final int BRAHMI_JOINING_NUMBER = 3;
/*      */     public static final int CANTILLATION_MARK = 4;
/*      */     public static final int CONSONANT = 5;
/*      */     public static final int CONSONANT_DEAD = 6;
/*      */     public static final int CONSONANT_FINAL = 7;
/*      */     public static final int CONSONANT_HEAD_LETTER = 8;
/*      */     public static final int CONSONANT_INITIAL_POSTFIXED = 9;
/*      */     public static final int CONSONANT_KILLER = 10;
/*      */     public static final int CONSONANT_MEDIAL = 11;
/*      */     public static final int CONSONANT_PLACEHOLDER = 12;
/*      */     public static final int CONSONANT_PRECEDING_REPHA = 13;
/*      */     public static final int CONSONANT_PREFIXED = 14;
/*      */     public static final int CONSONANT_SUBJOINED = 15;
/*      */     public static final int CONSONANT_SUCCEEDING_REPHA = 16;
/*      */     public static final int CONSONANT_WITH_STACKER = 17;
/*      */     public static final int GEMINATION_MARK = 18;
/*      */     public static final int INVISIBLE_STACKER = 19;
/*      */     public static final int JOINER = 20;
/*      */     public static final int MODIFYING_LETTER = 21;
/*      */     public static final int NON_JOINER = 22;
/*      */     public static final int NUKTA = 23;
/*      */     public static final int NUMBER = 24;
/*      */     public static final int NUMBER_JOINER = 25;
/*      */     public static final int OTHER = 0;
/*      */     public static final int PURE_KILLER = 26;
/*      */     public static final int REGISTER_SHIFTER = 27;
/*      */     public static final int SYLLABLE_MODIFIER = 28;
/*      */     public static final int TONE_LETTER = 29;
/*      */     public static final int TONE_MARK = 30;
/*      */     public static final int VIRAMA = 31;
/*      */     public static final int VISARGA = 32;
/*      */     public static final int VOWEL = 33;
/*      */     public static final int VOWEL_DEPENDENT = 34;
/*      */     public static final int VOWEL_INDEPENDENT = 35;
/*      */   }
/*      */   
/*      */   public static interface IndicPositionalCategory {
/*      */     public static final int BOTTOM = 1;
/*      */     public static final int BOTTOM_AND_LEFT = 2;
/*      */     public static final int BOTTOM_AND_RIGHT = 3;
/*      */     public static final int LEFT = 4;
/*      */     public static final int LEFT_AND_RIGHT = 5;
/*      */     public static final int NA = 0;
/*      */     public static final int OVERSTRUCK = 6;
/*      */     public static final int RIGHT = 7;
/*      */     public static final int TOP = 8;
/*      */     public static final int TOP_AND_BOTTOM = 9;
/*      */     public static final int TOP_AND_BOTTOM_AND_LEFT = 15;
/*      */     public static final int TOP_AND_BOTTOM_AND_RIGHT = 10;
/*      */     public static final int TOP_AND_LEFT = 11;
/*      */     public static final int TOP_AND_LEFT_AND_RIGHT = 12;
/*      */     public static final int TOP_AND_RIGHT = 13;
/*      */     public static final int VISUAL_ORDER_LEFT = 14;
/*      */   }
/*      */   
/*      */   public static interface HangulSyllableType {
/*      */     public static final int LEADING_JAMO = 1;
/*      */     public static final int LVT_SYLLABLE = 5;
/*      */     public static final int LV_SYLLABLE = 4;
/*      */     public static final int NOT_APPLICABLE = 0;
/*      */     public static final int TRAILING_JAMO = 3;
/*      */     public static final int VOWEL_JAMO = 2;
/*      */   }
/*      */   
/*      */   public static interface GraphemeClusterBreak {
/*      */     public static final int CONTROL = 1;
/*      */     public static final int CR = 2;
/*      */     public static final int EXTEND = 3;
/*      */     public static final int E_BASE = 13;
/*      */     public static final int E_BASE_GAZ = 14;
/*      */     public static final int E_MODIFIER = 15;
/*      */     public static final int GLUE_AFTER_ZWJ = 16;
/*      */     public static final int L = 4;
/*      */     public static final int LF = 5;
/*      */     public static final int LV = 6;
/*      */     public static final int LVT = 7;
/*      */     public static final int OTHER = 0;
/*      */     public static final int PREPEND = 11;
/*      */     public static final int REGIONAL_INDICATOR = 12;
/*      */     public static final int SPACING_MARK = 10;
/*      */     public static final int T = 8;
/*      */     public static final int V = 9;
/*      */     public static final int ZWJ = 17;
/*      */   }
/*      */   
/*      */   public static interface EastAsianWidth {
/*      */     public static final int AMBIGUOUS = 1;
/*      */     public static final int FULLWIDTH = 3;
/*      */     public static final int HALFWIDTH = 2;
/*      */     public static final int NARROW = 4;
/*      */     public static final int NEUTRAL = 0;
/*      */     public static final int WIDE = 5;
/*      */   }
/*      */   
/*      */   public static interface DecompositionType {
/*      */     public static final int CANONICAL = 1;
/*      */     public static final int CIRCLE = 3;
/*      */     public static final int COMPAT = 2;
/*      */     public static final int FINAL = 4;
/*      */     public static final int FONT = 5;
/*      */     public static final int FRACTION = 6;
/*      */     public static final int INITIAL = 7;
/*      */     public static final int ISOLATED = 8;
/*      */     public static final int MEDIAL = 9;
/*      */     public static final int NARROW = 10;
/*      */     public static final int NOBREAK = 11;
/*      */     public static final int NONE = 0;
/*      */     public static final int SMALL = 12;
/*      */     public static final int SQUARE = 13;
/*      */     public static final int SUB = 14;
/*      */     public static final int SUPER = 15;
/*      */     public static final int VERTICAL = 16;
/*      */     public static final int WIDE = 17;
/*      */   }
/*      */   
/*      */   public static interface BidiPairedBracketType {
/*      */     public static final int CLOSE = 2;
/*      */     public static final int NONE = 0;
/*      */     public static final int OPEN = 1;
/*      */   }
/*      */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/lang/UCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */