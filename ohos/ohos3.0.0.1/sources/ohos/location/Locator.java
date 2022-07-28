package ohos.location;

import ohos.app.Context;
import ohos.bundle.AbilityInfo;

/* loaded from: ohos3.0.0.1.jar:ohos/location/Locator.class */
public class Locator {
    public static final int ERROR_PERMISSION_NOT_GRANTED = 256;
    public static final int ERROR_SWITCH_UNOPEN = 257;
    public static final int LOCATION_SERVICE_SWITCH_OFF = 0;
    public static final int LOCATION_SERVICE_SWITCH_ON = 1;
    public static final int SESSION_START = 2;
    public static final int SESSION_STOP = 3;

    @Deprecated
    public Locator(AbilityInfo info) {
        throw new RuntimeException("Stub!");
    }

    public Locator(Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLocationSwitchOn() {
        throw new RuntimeException("Stub!");
    }

    public void requestEnableLocation() throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void startLocating(RequestParam request, LocatorCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void stopLocating(LocatorCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void requestOnce(RequestParam request, LocatorCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public Location getCachedLocation() throws SecurityException {
        throw new RuntimeException("Stub!");
    }

    public boolean registerSwitchCallback(SwitchCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public boolean unregisterSwitchCallback(SwitchCallback callback) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
}
