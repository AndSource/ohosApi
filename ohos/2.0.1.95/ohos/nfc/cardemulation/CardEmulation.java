/*     */ package ohos.nfc.cardemulation;
/*     */ 
/*     */ import java.util.List;
/*     */ import ohos.aafwk.ability.Ability;
/*     */ import ohos.bundle.ElementName;
/*     */ import ohos.nfc.NfcController;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class CardEmulation
/*     */ {
/*     */   public static final String CATEGORY_OTHER = "other";
/*     */   public static final String CATEGORY_PAYMENT = "payment";
/*     */   public static final int DISABLE_MODE_A_B = 0;
/*     */   public static final String ENABLED_SE_TYPE_ESE = "11";
/*     */   public static final String ENABLED_SE_TYPE_HISEE = "12";
/*     */   public static final int ENABLE_MODE_ALL = 3;
/*     */   public static final int FEATURE_ESE = 2;
/*     */   public static final int FEATURE_HCE = 0;
/*     */   public static final int FEATURE_UICC = 1;
/*     */   public static final String HISEE_READY = "true";
/*     */   
/*     */   CardEmulation(NfcController controller) {
/*  26 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String HISEE_UNREADY = "false";
/*     */   
/*     */   public static final String KEY_ENABLED_SE_TYPE = "ese_type";
/*     */   public static final String KEY_HISEE_READY = "hisee_ready";
/*     */   public static final String KEY_RSSI_SUPPORTED = "rssi_support";
/*     */   public static final int RELEASE_PRIORITY = 0;
/*     */   
/*     */   public static synchronized CardEmulation getInstance(NfcController controller) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String RSSI_QUERY_SUPPORTED = "true";
/*     */   
/*     */   public static final String RSSI_QUERY_UNSUPPORTED = "false";
/*     */   
/*     */   public static final int SELECTION_TYPE_ASK_IF_CONFLICT = 1;
/*     */   public static final int SELECTION_TYPE_PREFER_DEFAULT = 0;
/*     */   public static final int SET_PRIORITY = 1;
/*     */   
/*     */   public boolean isSupported(int feature) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListenMode(int mode) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isListenModeEnabled() {
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
/*     */   public int getSelectionType(String category) {
/*  83 */     throw new RuntimeException("Stub!");
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
/*     */   public String getNfcInfo(String key) {
/*  98 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean registerForegroundPreferred(Ability appAbility, ElementName appName) {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean unregisterForegroundPreferred(Ability appAbility) {
/* 126 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isDefaultForAid(ElementName appName, String aid) {
/* 138 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean registerAids(ElementName appName, String type, List<String> aids) {
/* 153 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean removeAids(ElementName appName, String type) {
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
/*     */   public List<String> getAids(ElementName appName, String type) {
/* 183 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isDefaultForType(ElementName appName, String type) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/cardemulation/CardEmulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */