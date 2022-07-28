package ohos.nfc.cardemulation;

import java.util.List;
import ohos.aafwk.ability.Ability;
import ohos.bundle.ElementName;
import ohos.nfc.NfcController;

/* loaded from: ohos2.2.0.3.jar:ohos/nfc/cardemulation/CardEmulation.class */
public final class CardEmulation {
    public static final String CATEGORY_OTHER = "other";
    public static final String CATEGORY_PAYMENT = "payment";
    public static final int DISABLE_MODE_A_B = 0;
    public static final String ENABLED_SE_TYPE_ESE = "11";
    public static final String ENABLED_SE_TYPE_HISEE = "12";
    public static final int ENABLE_MODE_ALL = 3;
    public static final int FEATURE_ESE = 2;
    public static final int FEATURE_HCE = 0;
    public static final int FEATURE_UICC = 1;
    public static final String HISEE_READY = "true";
    public static final String HISEE_UNREADY = "false";
    public static final String KEY_ENABLED_SE_TYPE = "ese_type";
    public static final String KEY_HISEE_READY = "hisee_ready";
    public static final String KEY_RSSI_SUPPORTED = "rssi_support";
    public static final int RELEASE_PRIORITY = 0;
    public static final String RSSI_QUERY_SUPPORTED = "true";
    public static final String RSSI_QUERY_UNSUPPORTED = "false";
    public static final int SELECTION_TYPE_ASK_IF_CONFLICT = 1;
    public static final int SELECTION_TYPE_PREFER_DEFAULT = 0;
    public static final int SET_PRIORITY = 1;

    CardEmulation(NfcController controller) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized CardEmulation getInstance(NfcController controller) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSupported(int feature) {
        throw new RuntimeException("Stub!");
    }

    public void setListenMode(int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean isListenModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectionType(String category) {
        throw new RuntimeException("Stub!");
    }

    public String getNfcInfo(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerForegroundPreferred(Ability appAbility, ElementName appName) {
        throw new RuntimeException("Stub!");
    }

    public boolean unregisterForegroundPreferred(Ability appAbility) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDefaultForAid(ElementName appName, String aid) {
        throw new RuntimeException("Stub!");
    }

    public boolean registerAids(ElementName appName, String type, List<String> aids) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAids(ElementName appName, String type) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getAids(ElementName appName, String type) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDefaultForType(ElementName appName, String type) {
        throw new RuntimeException("Stub!");
    }
}
