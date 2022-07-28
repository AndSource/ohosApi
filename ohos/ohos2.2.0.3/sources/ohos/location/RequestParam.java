package ohos.location;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/location/RequestParam.class */
public class RequestParam implements Sequenceable {
    public static final int PRIORITY_ACCURACY = 513;
    public static final int PRIORITY_FAST_FIRST_FIX = 515;
    public static final int PRIORITY_LOW_POWER = 514;
    public static final int PRIORITY_UNSET = 512;
    public static final int SCENE_CAR_HAILING = 771;
    public static final int SCENE_DAILY_LIFE_SERVICE = 772;
    public static final int SCENE_NAVIGATION = 769;
    public static final int SCENE_NO_POWER = 773;
    public static final int SCENE_TRAJECTORY_TRACKING = 770;
    public static final int SCENE_UNSET = 768;

    public RequestParam(int scenario) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public RequestParam(int priority, int timeInterval, int distanceInterval) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public int getScenario() {
        throw new RuntimeException("Stub!");
    }

    public void setScenario(int scenario) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public int getPriorityLevel() {
        throw new RuntimeException("Stub!");
    }

    public void setPriorityLevel(int value) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public int getTimeInterval() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeInterval(int value) {
        throw new RuntimeException("Stub!");
    }

    public int getDistanceInterval() {
        throw new RuntimeException("Stub!");
    }

    public void setDistanceInterval(int value) {
        throw new RuntimeException("Stub!");
    }

    public float getMaxAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxAccuracy(float value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
