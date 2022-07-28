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
/*     */ 
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
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Configuration(Configuration config) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocaleProfile getLocaleProfile() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLocaleProfile(LocaleProfile localeProfile) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Locale getFirstLocale() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object object) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSystemColorMode() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/configuration/Configuration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */