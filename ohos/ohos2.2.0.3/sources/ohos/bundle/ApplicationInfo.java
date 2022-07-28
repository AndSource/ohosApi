package ohos.bundle;

import java.io.PrintWriter;
import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/bundle/ApplicationInfo.class */
public class ApplicationInfo implements Sequenceable {
    public static final Sequenceable.Producer<ApplicationInfo> PRODUCER = null;
    public boolean debug = false;
    public boolean enabled = true;
    public String name = "";
    public boolean systemApp = false;

    public ApplicationInfo() {
        throw new RuntimeException("Stub!");
    }

    public ApplicationInfo(ApplicationInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getIcon() {
        throw new RuntimeException("Stub!");
    }

    public String getLabel() {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public String getProcess() {
        throw new RuntimeException("Stub!");
    }

    public int getSupportedModes() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getModuleSourceDirs() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPermissions() {
        throw new RuntimeException("Stub!");
    }

    public List<ModuleInfo> getModuleInfos() {
        throw new RuntimeException("Stub!");
    }

    public boolean getSystemApp() {
        throw new RuntimeException("Stub!");
    }

    public int getIconId() {
        throw new RuntimeException("Stub!");
    }

    public int getLabelId() {
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

    public int getFlags() {
        throw new RuntimeException("Stub!");
    }

    public void setFlags(int flags) {
        throw new RuntimeException("Stub!");
    }

    public String getEntryDir() {
        throw new RuntimeException("Stub!");
    }
}
