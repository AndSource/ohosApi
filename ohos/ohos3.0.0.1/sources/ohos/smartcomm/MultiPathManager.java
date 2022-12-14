package ohos.smartcomm;

import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/smartcomm/MultiPathManager.class */
public class MultiPathManager {
    public static final String MULTIPATH_FLOW_SCALE = "multipath_flow_scale";
    public static final String MULTIPATH_FLOW_TYPE = "multipath_flow_type";
    public static final String MULTIPATH_IP_ADDRESS = "multipath_ip_address";
    public static final String MULTIPATH_IP_CARRIER = "multipath_ip_carrier";
    public static final String MULTIPATH_IP_DEPLOYTYPE = "multipath_ip_deploytype";
    public static final String MULTIPATH_IP_GROUP = "multipath_ip_group";
    public static final String MULTIPATH_IP_PORT = "multipath_ip_port";
    public static final String MULTIPATH_PARAM_BANDWIDTH = "multipath_param_bandwidth";
    public static final String MULTIPATH_PARAM_RTT = "multipath_param_rtt";
    public static final String MULTIPATH_POLICY_TYPE = "multipath_policy_type";
    public static final String MULTIPATH_SCENARIO_FLAG = "multipath_scenario_flag";
    public static final String MULTIPATH_SOURCELINK_RTT = "multipath_sourcelink_rtt";
    public static final String MULTIPATH_SWITCH_PATH = "multipath_switch_path";
    public static final String MULTIPATH_SWITCH_TIME = "multipath_switch_time";
    public static final String MULTIPATH_TARGETLINK_RTT = "multipath_targetlink_rtt";
    public static final String MULTIPATH_USER_ID = "multipath_user_id";

    MultiPathManager() {
        throw new RuntimeException("Stub!");
    }

    public static MultiPathManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int enableMultipathFlow(String packageName, String flowParamJson, String multipathParamJson, IMultiPathCallback callback) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int disableMultipath(String packageName, String flowParamJson) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
