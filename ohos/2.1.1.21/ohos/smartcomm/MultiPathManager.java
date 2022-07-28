/*    */ package ohos.smartcomm;
/*    */ 
/*    */ import ohos.rpc.RemoteException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MultiPathManager
/*    */ {
/*    */   public static final String MULTIPATH_FLOW_SCALE = "multipath_flow_scale";
/*    */   public static final String MULTIPATH_FLOW_TYPE = "multipath_flow_type";
/*    */   public static final String MULTIPATH_IP_ADDRESS = "multipath_ip_address";
/*    */   public static final String MULTIPATH_IP_CARRIER = "multipath_ip_carrier";
/*    */   public static final String MULTIPATH_IP_DEPLOYTYPE = "multipath_ip_deploytype";
/*    */   public static final String MULTIPATH_IP_GROUP = "multipath_ip_group";
/*    */   public static final String MULTIPATH_IP_PORT = "multipath_ip_port";
/*    */   public static final String MULTIPATH_PARAM_BANDWIDTH = "multipath_param_bandwidth";
/*    */   
/*    */   MultiPathManager() {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static final String MULTIPATH_PARAM_RTT = "multipath_param_rtt"; public static final String MULTIPATH_POLICY_TYPE = "multipath_policy_type";
/*    */   public static final String MULTIPATH_SCENARIO_FLAG = "multipath_scenario_flag";
/*    */   public static final String MULTIPATH_SOURCELINK_RTT = "multipath_sourcelink_rtt";
/*    */   public static final String MULTIPATH_SWITCH_PATH = "multipath_switch_path";
/*    */   public static final String MULTIPATH_SWITCH_TIME = "multipath_switch_time";
/*    */   public static final String MULTIPATH_TARGETLINK_RTT = "multipath_targetlink_rtt";
/*    */   public static final String MULTIPATH_USER_ID = "multipath_user_id";
/*    */   
/*    */   public static MultiPathManager getInstance() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int enableMultipathFlow(String packageName, String flowParamJson, String multipathParamJson, IMultiPathCallback callback) throws RemoteException {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int disableMultipath(String packageName, String flowParamJson) throws RemoteException {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/smartcomm/MultiPathManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */