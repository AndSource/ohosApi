package ohos.bundle;

import java.util.List;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/BundleInfo.class */
public class BundleInfo implements Sequenceable {
    public static final Sequenceable.Producer<BundleInfo> PRODUCER = null;
    public List<AbilityInfo> abilityInfos;
    public ApplicationInfo appInfo;
    public List<ReqPermissionDetail> reqPermissionDetails;
    public List<String> reqPermissions;
    public String appId = "";
    public boolean debug = false;
    public String jointUserId = "";
    public String name = "";
    public String originalName = "";
    public String type = "normal";
    public int uid = -1;

    public BundleInfo() {
        throw new RuntimeException("Stub!");
    }

    public BundleInfo(BundleInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getType() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPermissions() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getHapModuleNames() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getModuleNames() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getModulePublicDirs() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getModuleDirs() {
        throw new RuntimeException("Stub!");
    }

    public String getVendor() {
        throw new RuntimeException("Stub!");
    }

    public int getVersionCode() {
        throw new RuntimeException("Stub!");
    }

    public String getVersionName() {
        throw new RuntimeException("Stub!");
    }

    public int getMinSdkVersion() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxSdkVersion() {
        throw new RuntimeException("Stub!");
    }

    public int getCompatibleVersion() {
        throw new RuntimeException("Stub!");
    }

    public int getMinCompatibleVersionCode() {
        throw new RuntimeException("Stub!");
    }

    public int getTargetVersion() {
        throw new RuntimeException("Stub!");
    }

    public ApplicationInfo getAppInfo() {
        throw new RuntimeException("Stub!");
    }

    public List<AbilityInfo> getAbilityInfos() {
        throw new RuntimeException("Stub!");
    }

    public String getAppId() {
        throw new RuntimeException("Stub!");
    }

    public int getUid() {
        throw new RuntimeException("Stub!");
    }

    public String getJointUserId() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDifferentName() {
        throw new RuntimeException("Stub!");
    }

    public String getCpuAbi() {
        throw new RuntimeException("Stub!");
    }

    public boolean getCompressNativeLibs() {
        throw new RuntimeException("Stub!");
    }

    public String getEntryModuleName() {
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

    public List<String> getReqPermissions() {
        throw new RuntimeException("Stub!");
    }

    public List<ReqPermissionDetail> getReqPermissionDetail() {
        throw new RuntimeException("Stub!");
    }

    public Boolean isSilentInstallation() {
        throw new RuntimeException("Stub!");
    }

    public long getInstallTime() {
        throw new RuntimeException("Stub!");
    }

    public long getUpdateTime() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/bundle/BundleInfo$ReqPermissionDetail.class */
    public class ReqPermissionDetail {
        public ReqPermissionDetail(String name, String reason) {
            throw new RuntimeException("Stub!");
        }

        public String getName() {
            throw new RuntimeException("Stub!");
        }

        public String getReason() {
            throw new RuntimeException("Stub!");
        }

        public int getReasonId() {
            throw new RuntimeException("Stub!");
        }

        public UsedScene getUsedScene() {
            throw new RuntimeException("Stub!");
        }

        public void setUsedScene(UsedScene usedScene) {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos3.0.0.1.jar:ohos/bundle/BundleInfo$ReqPermissionDetail$UsedScene.class */
        public class UsedScene {
            public UsedScene(String when, String[] abilities) {
                throw new RuntimeException("Stub!");
            }

            public String[] getAbilities() {
                throw new RuntimeException("Stub!");
            }

            public String getWhen() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
