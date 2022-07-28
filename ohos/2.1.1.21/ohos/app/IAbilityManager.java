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

public interface IAbilityManager {
  public static final int DEFAULT_DENSITY = 160;
  
  public static final int DEFAULT_HEAPSIZE = 16;
  
  public static final int DEFAULT_ICONSIZE = 48;
  
  public static final int LOCK_MISSION_MODE_LOCKED = 1;
  
  public static final int LOCK_MISSION_MODE_NULL = 0;
  
  public static final int LOCK_MISSION_MODE_PINNED = 2;
  
  MemoryInfo[] getProcessMemoryInfo(int[] paramArrayOfint);
  
  List<ProcessErrorInfo> getProcessesErrorInfo();
  
  List<RunningProcessInfo> getAllRunningProcesses();
  
  int getAppLargeMemory();
  
  int getAppMemory();
  
  void getSystemMemoryInfo(SystemMemoryInfo paramSystemMemoryInfo);
  
  void getMyProcessMemoryInfo(RunningProcessInfo paramRunningProcessInfo);
  
  boolean isLowRamDevice();
  
  boolean clearUpApplicationData();
  
  void killProcessesByBundleName(String paramString);
  
  DeviceConfigInfo getDeviceConfigInfo();
  
  int getHomeScreenIconDensity();
  
  int getHomeScreenIconSize();
  
  boolean isUserKingKong();
  
  boolean canAbilityStartOnDisplay(Context paramContext, int paramInt, Intent paramIntent);
  
  int getMissionLockModeState();
  
  void updateDeviceLocale(LocaleProfile paramLocaleProfile);
  
  List<AbilityMissionInfo> queryRunningAbilityMissionInfo(int paramInt);
  
  List<AbilityMissionInfo> queryRecentAbilityMissionInfo(int paramInt1, int paramInt2);
  
  boolean isBackgroundRunningRestricted();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/app/IAbilityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */