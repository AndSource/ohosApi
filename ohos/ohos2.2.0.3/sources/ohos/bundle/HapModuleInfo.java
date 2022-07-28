package ohos.bundle;

import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/bundle/HapModuleInfo.class */
public class HapModuleInfo implements Sequenceable {
    public static final int AUTO_MODE = -1;
    public static final int DARK_MODE = 0;
    public static final int LIGHT_MODE = 1;
    public static final Sequenceable.Producer<HapModuleInfo> PRODUCER = null;

    public HapModuleInfo() {
        throw new RuntimeException("Stub!");
    }

    public HapModuleInfo(HapModuleInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public String getIconPath() {
        throw new RuntimeException("Stub!");
    }

    public String getLabel() {
        throw new RuntimeException("Stub!");
    }

    public String getBackgroundImg() {
        throw new RuntimeException("Stub!");
    }

    public int getSupportedModes() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getReqCapabilities() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getDeviceTypes() {
        throw new RuntimeException("Stub!");
    }

    public List<AbilityInfo> getAbilityInfos() {
        throw new RuntimeException("Stub!");
    }

    public String getModuleName() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public AbilityInfo getMainAbility() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInstallationFreeSupported() {
        throw new RuntimeException("Stub!");
    }
}
