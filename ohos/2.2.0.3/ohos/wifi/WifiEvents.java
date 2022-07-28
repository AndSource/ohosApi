/*    */ package ohos.wifi;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WifiEvents
/*    */ {
/*    */   public static final int BAND_INVALID = -1;
/*    */   public static final int BAND_WIDTH_160MHZ = 3;
/*    */   public static final int BAND_WIDTH_20MHZ = 0;
/*    */   public static final int BAND_WIDTH_40MHZ = 1;
/*    */   public static final int BAND_WIDTH_80MHZ = 2;
/*    */   public static final int BAND_WIDTH_80MHZ_PLUS = 4;
/*    */   public static final int BAND_WIFI_2G = 0;
/*    */   public static final int BAND_WIFI_5G = 1;
/*    */   public static final String EVENT_ACTIVE_STATE = "usual.event.wifi.POWER_STATE";
/*    */   public static final String EVENT_CONN_STATE = "usual.event.wifi.CONN_STATE";
/*    */   public static final String EVENT_HOTSPOT_STATE = "usual.event.wifi.HOTSPOT_STATE";
/*    */   public static final String EVENT_HOTSPOT_STATION_JOIN = "usual.event.wifi.WIFI_HS_STA_JOIN";
/*    */   public static final String EVENT_HOTSPOT_STATION_LEAVE = "usual.event.wifi.WIFI_HS_STA_LEAVE";
/*    */   public static final String EVENT_P2P_CONN_STATE_CHANGED = "usual.event.wifi.p2p.CONN_STATE_CHANGE";
/*    */   public static final String EVENT_P2P_CURRENT_DEVICE_STATE_CHANGED = "usual.event.wifi.p2p.CURRENT_DEVICE_CHANGE";
/*    */   public static final String EVENT_P2P_DEVICES_CHANGED = "usual.event.wifi.p2p.DEVICES_CHANGE";
/*    */   public static final String EVENT_P2P_DEVICES_DISCOVERY_STATE = "usual.event.wifi.p2p.PEER_DISCOVERY_STATE_CHANGE";
/*    */   public static final String EVENT_P2P_STATE_CHANGED = "usual.event.wifi.p2p.STATE_CHANGE";
/*    */   public static final String EVENT_RSSI_VALUE = "usual.event.wifi.RSSI_VALUE";
/*    */   public static final String EVENT_SCAN_STATE = "usual.event.wifi.SCAN_FINISHED";
/*    */   public static final String PARAM_ACTIVE_STATE = "active_state";
/*    */   
/*    */   public WifiEvents() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static final String PARAM_CONN_STATE = "conn_state";
/*    */   public static final String PARAM_HOTSPOT_STATE = "hotspot_active_state";
/*    */   public static final String PARAM_P2P_DISCOVERY = "peers_discovery";
/*    */   public static final String PARAM_P2P_STATE_CHANGED = "p2p_state";
/*    */   public static final String PARAM_RSSI_VALUE = "rssi_value";
/*    */   public static final String PARAM_SCAN_STATE = "scan_state";
/*    */   public static final int PEERS_P2P_DISCOVERY_OFF = 1;
/*    */   public static final int PEERS_P2P_DISCOVERY_ON = 2;
/*    */   public static final int STATE_ACTIVATING = 2;
/*    */   public static final int STATE_ACTIVE = 1;
/*    */   public static final int STATE_CONNECTED = 1;
/*    */   public static final int STATE_DEACTIVATING = 3;
/*    */   public static final int STATE_DISCONNECTED = 0;
/*    */   public static final int STATE_HOTSPOT_ACTIVATING = 2;
/*    */   public static final int STATE_HOTSPOT_ACTIVE = 1;
/*    */   public static final int STATE_HOTSPOT_DEACTIVATING = 3;
/*    */   public static final int STATE_HOTSPOT_INACTIVE = 0;
/*    */   public static final int STATE_INACTIVE = 0;
/*    */   public static final int STATE_P2P_OFF = 1;
/*    */   public static final int STATE_P2P_ON = 2;
/*    */   public static final int STATE_SCAN_FAIL = 0;
/*    */   public static final int STATE_SCAN_SUCCESS = 1;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/wifi/WifiEvents.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */