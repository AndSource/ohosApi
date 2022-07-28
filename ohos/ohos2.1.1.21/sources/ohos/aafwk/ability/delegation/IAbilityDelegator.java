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

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/delegation/IAbilityDelegator.class */
public interface IAbilityDelegator {
    public static final int ACTIVE = 2;
    public static final int BACKGROUND = 3;
    public static final int INACTIVE = 1;
    public static final int INITIAL = 0;
    public static final int UNDEFINED = -1;

    Optional<Ability> waitAbilityMonitor(IAbilityMonitor iAbilityMonitor);

    Optional<Ability> waitAbilityMonitor(IAbilityMonitor iAbilityMonitor, long j);

    Optional<Ability> startAbilitySync(Intent intent);

    boolean runOnUIThreadSync(Runnable runnable);

    Optional<Ability> startAbilitySync(Intent intent, long j);

    boolean stopAbility(Ability ability);

    boolean triggerTouchEvent(Ability ability, TouchEvent touchEvent);

    boolean triggerClickEvent(Ability ability, Component component);

    boolean triggerKeyEvent(Ability ability, KeyEvent keyEvent);

    IAbilityMonitor addAbilityMonitor(String str);

    int getMonitorsNum();

    void clearAllMonitors();

    int getAbilityState(Ability ability);

    void removeAbilityMonitor(IAbilityMonitor iAbilityMonitor);

    void print(String str);

    void println(String str);

    Ability getCurrentTopAbility();

    boolean doAbilitySliceStop(Ability ability);

    boolean doAbilitySliceStart(Ability ability, AbilitySlice abilitySlice);

    int getAbilitySliceState(AbilitySlice abilitySlice);

    List<AbilitySlice> getAllAbilitySlice(Ability ability);

    AbilitySlice getCurrentAbilitySlice(Ability ability);

    Context getAppContext();

    String getThreadName();

    boolean isAbilityHasSlice(Ability ability);

    boolean isSliceStackEmpty(Ability ability);

    int getSliceStackSize(Ability ability);

    void invokeAbilityOnStart(Ability ability);

    void invokeAbilityOnPostStart(Ability ability);

    void invokeAbilityOnInactive(Ability ability);

    void invokeAbilityOnActive(Ability ability);

    void invokeAbilityOnPostActive(Ability ability);

    void invokeAbilityOnBackground(Ability ability);

    void invokeAbilityOnForeground(Ability ability);

    void invokeAbilityOnStop(Ability ability);
}
