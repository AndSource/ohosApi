package ohos.app;

import java.util.List;
import ohos.aafwk.ability.AbilityMissionInfo;
import ohos.aafwk.ability.DeviceConfigInfo;
import ohos.aafwk.ability.MemoryInfo;
import ohos.aafwk.ability.ProcessErrorInfo;
import ohos.aafwk.ability.RunningProcessInfo;
import ohos.aafwk.ability.SystemMemoryInfo;
import ohos.aafwk.content.Intent;
import ohos.global.configuration.LocaleProfile;

/* loaded from: ohos2.2.0.3.jar:ohos/app/IAbilityManager.class */
public interface IAbilityManager {
    public static final int DEFAULT_DENSITY = 160;
    public static final int DEFAULT_HEAPSIZE = 16;
    public static final int DEFAULT_ICONSIZE = 48;
    public static final int LOCK_MISSION_MODE_LOCKED = 1;
    public static final int LOCK_MISSION_MODE_NULL = 0;
    public static final int LOCK_MISSION_MODE_PINNED = 2;

    MemoryInfo[] getProcessMemoryInfo(int[] iArr);

    List<ProcessErrorInfo> getProcessesErrorInfo();

    List<RunningProcessInfo> getAllRunningProcesses();

    int getAppLargeMemory();

    int getAppMemory();

    void getSystemMemoryInfo(SystemMemoryInfo systemMemoryInfo);

    void getMyProcessMemoryInfo(RunningProcessInfo runningProcessInfo);

    boolean isLowRamDevice();

    boolean clearUpApplicationData();

    void killProcessesByBundleName(String str);

    DeviceConfigInfo getDeviceConfigInfo();

    int getHomeScreenIconDensity();

    int getHomeScreenIconSize();

    boolean isUserKingKong();

    boolean canAbilityStartOnDisplay(Context context, int i, Intent intent);

    int getMissionLockModeState();

    void updateDeviceLocale(LocaleProfile localeProfile);

    List<AbilityMissionInfo> queryRunningAbilityMissionInfo(int i);

    List<AbilityMissionInfo> queryRecentAbilityMissionInfo(int i, int i2);

    boolean isBackgroundRunningRestricted();
}
