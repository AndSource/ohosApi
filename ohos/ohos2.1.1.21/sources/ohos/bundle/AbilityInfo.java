package ohos.bundle;

import java.io.PrintWriter;
import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/AbilityInfo.class */
public class AbilityInfo implements Sequenceable {
    public static final Sequenceable.Producer<AbilityInfo> PRODUCER = null;
    public String bundleName = "";
    public String className = "";
    public boolean enabled = true;
    public String label = "";

    /* loaded from: ohos2.1.1.21.jar:ohos/bundle/AbilityInfo$AbilitySubType.class */
    public enum AbilitySubType {
        UNSPECIFIED,
        CA
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/bundle/AbilityInfo$AbilityType.class */
    public enum AbilityType {
        UNKNOWN,
        PAGE,
        SERVICE,
        DATA,
        WEB
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/bundle/AbilityInfo$DisplayOrientation.class */
    public enum DisplayOrientation {
        UNSPECIFIED,
        LANDSCAPE,
        PORTRAIT,
        FOLLOWRECENT
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/bundle/AbilityInfo$LaunchMode.class */
    public enum LaunchMode {
        SINGLETON,
        STANDARD
    }

    public AbilityInfo() {
        throw new RuntimeException("Stub!");
    }

    public AbilityInfo(AbilityInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getLabel() {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public String getIconPath() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }

    public AbilityType getType() {
        throw new RuntimeException("Stub!");
    }

    public DisplayOrientation getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public LaunchMode getLaunchMode() {
        throw new RuntimeException("Stub!");
    }

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public String getClassName() {
        throw new RuntimeException("Stub!");
    }

    public String getOriginalClassName() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPermissions() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getDeviceTypes() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getDeviceCapabilities() {
        throw new RuntimeException("Stub!");
    }

    public String getURI() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDifferentName() {
        throw new RuntimeException("Stub!");
    }

    public String getModuleName() {
        throw new RuntimeException("Stub!");
    }

    public String getProcess() {
        throw new RuntimeException("Stub!");
    }

    public String getTargetAbility() {
        throw new RuntimeException("Stub!");
    }

    public boolean getFormEnabled() {
        throw new RuntimeException("Stub!");
    }

    public int getBackgroundModes() {
        throw new RuntimeException("Stub!");
    }

    public ApplicationInfo getApplicationInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getFormEntity() {
        throw new RuntimeException("Stub!");
    }

    public int getMinFormHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultFormHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getMinFormWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultFormWidth() {
        throw new RuntimeException("Stub!");
    }

    public String getReadPermission() {
        throw new RuntimeException("Stub!");
    }

    public String getWritePermission() {
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

    public void dump(String prefix, PrintWriter writer) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
