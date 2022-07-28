package ohos.telephony;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/telephony/RadioInfoManager.class */
public class RadioInfoManager {
    RadioInfoManager(Context ct) {
        throw new RuntimeException("Stub!");
    }

    public static RadioInfoManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int getRadioTech(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public int getPsRadioTech(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public int getCsRadioTech(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getIsoCountryCodeForNetwork(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public NetworkState getNetworkState(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getPlmnNumeric(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getOperatorName(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRoaming(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public List<SignalInformation> getSignalInfoList(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getUniqueDeviceId(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getImei(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getImeiSv(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getTypeAllocationCode(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getMeid(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public String getManufacturerCode(int slotId) {
        throw new RuntimeException("Stub!");
    }

    public int getPrimarySlotId() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNrSupported() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNsaState() {
        throw new RuntimeException("Stub!");
    }

    public void addObserver(RadioStateObserver observer, int mask) {
        throw new RuntimeException("Stub!");
    }

    public void removeObserver(RadioStateObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public String getRadioTechName(int radioTech) {
        throw new RuntimeException("Stub!");
    }

    public int getNetworkSelectionMode(int slotId) {
        throw new RuntimeException("Stub!");
    }
}
