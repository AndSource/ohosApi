/*     */ package ohos.global.configuration;
/*     */ 
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Configuration
/*     */ {
/*     */   public static final int AUTO_MODE = -1;
/*     */   public static final int DARK_MODE = 0;
/*     */   public static final int DIRECTION_HORIZONTAL = 1;
/*     */   public static final int DIRECTION_UNDEFINED = -1;
/*     */   public static final int DIRECTION_VERTICAL = 0;
/*     */   public static final int LIGHT_MODE = 1;
/*     */   public static final int MCC_UNDEFINED = 0;
/*     */   public static final int MNC_UNDEFINED = 0;
/*     */   public static final float SCALE_UNDEFINED = -1.0F;
/*     */   public int colorMode;
/*     */   public int direction;
/*     */   public float fontRatio;
/*     */   public boolean isLayoutRTL;
/*     */   public int mcc;
/*     */   public int mnc;
/*     */   
/*     */   public Configuration() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Configuration(Configuration config) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocaleProfile getLocaleProfile() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLocaleProfile(LocaleProfile localeProfile) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Locale getFirstLocale() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object object) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSystemColorMode() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/global/configuration/Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */