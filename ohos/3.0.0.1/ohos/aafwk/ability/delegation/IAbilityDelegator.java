package ohos.aafwk.ability.delegation;

import java.util.List;
import java.util.Optional;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.app.Context;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.TouchEvent;

public interface IAbilityDelegator {
  public static final int ACTIVE = 2;
  
  public static final int BACKGROUND = 3;
  
  public static final int INACTIVE = 1;
  
  public static final int INITIAL = 0;
  
  public static final int UNDEFINED = -1;
  
  Optional<Ability> waitAbilityMonitor(IAbilityMonitor paramIAbilityMonitor);
  
  Optional<Ability> waitAbilityMonitor(IAbilityMonitor paramIAbilityMonitor, long paramLong);
  
  Optional<Ability> startAbilitySync(Intent paramIntent);
  
  boolean runOnUIThreadSync(Runnable paramRunnable);
  
  Optional<Ability> startAbilitySync(Intent paramIntent, long paramLong);
  
  boolean stopAbility(Ability paramAbility);
  
  boolean triggerTouchEvent(Ability paramAbility, TouchEvent paramTouchEvent);
  
  boolean triggerClickEvent(Ability paramAbility, Component paramComponent);
  
  boolean triggerKeyEvent(Ability paramAbility, KeyEvent paramKeyEvent);
  
  IAbilityMonitor addAbilityMonitor(String paramString);
  
  int getMonitorsNum();
  
  void clearAllMonitors();
  
  int getAbilityState(Ability paramAbility);
  
  void removeAbilityMonitor(IAbilityMonitor paramIAbilityMonitor);
  
  void print(String paramString);
  
  void println(String paramString);
  
  Ability getCurrentTopAbility();
  
  boolean doAbilitySliceStop(Ability paramAbility);
  
  boolean doAbilitySliceStart(Ability paramAbility, AbilitySlice paramAbilitySlice);
  
  int getAbilitySliceState(AbilitySlice paramAbilitySlice);
  
  List<AbilitySlice> getAllAbilitySlice(Ability paramAbility);
  
  AbilitySlice getCurrentAbilitySlice(Ability paramAbility);
  
  Context getAppContext();
  
  String getThreadName();
  
  boolean isAbilityHasSlice(Ability paramAbility);
  
  boolean isSliceStackEmpty(Ability paramAbility);
  
  int getSliceStackSize(Ability paramAbility);
  
  void invokeAbilityOnStart(Ability paramAbility);
  
  void invokeAbilityOnPostStart(Ability paramAbility);
  
  void invokeAbilityOnInactive(Ability paramAbility);
  
  void invokeAbilityOnActive(Ability paramAbility);
  
  void invokeAbilityOnPostActive(Ability paramAbility);
  
  void invokeAbilityOnBackground(Ability paramAbility);
  
  void invokeAbilityOnForeground(Ability paramAbility);
  
  void invokeAbilityOnStop(Ability paramAbility);
  
  ShellCmdResult executeShellCommand(String paramString, long paramLong);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/delegation/IAbilityDelegator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */