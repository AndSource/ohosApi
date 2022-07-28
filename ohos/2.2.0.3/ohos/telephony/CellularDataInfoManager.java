/*     */ package ohos.telephony;
/*     */ 
/*     */ import ohos.app.Context;
/*     */ 
/*     */ 
/*     */ public class CellularDataInfoManager
/*     */ {
/*     */   public static final int DATA_FLOW_TYPE_DORMANT = 4;
/*     */   public static final int DATA_FLOW_TYPE_DOWN = 1;
/*     */   public static final int DATA_FLOW_TYPE_NONE = 0;
/*     */   public static final int DATA_FLOW_TYPE_UP = 2;
/*     */   public static final int DATA_FLOW_TYPE_UPDOWN = 3;
/*     */   public static final int DATA_STATE_CONNECTED = 2;
/*     */   public static final int DATA_STATE_CONNECTING = 1;
/*     */   public static final int DATA_STATE_DISCONNECTED = 0;
/*     */   public static final int DATA_STATE_SUSPENDED = 3;
/*     */   public static final int DATA_STATE_UNKNOWN = -1;
/*     */   
/*     */   CellularDataInfoManager(Context context) {
/*  20 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CellularDataInfoManager getInstance(Context context) {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCellularDataFlowType() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCellularDataEnabled() {
/*  51 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isCellularDataRoamingEnabled(int slotId) {
/*  64 */     throw new RuntimeException("Stub!");
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
/*     */   public int getCellularDataState(int slotId) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDefaultCellularDataSlotId() {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public void addObserver(CellularDataStateObserver observer, int mask) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeObserver(CellularDataStateObserver observer) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/telephony/CellularDataInfoManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */