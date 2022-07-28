package ohos.location;

/* loaded from: ohos2.0.1.95.jar:ohos/location/LocatorCallback.class */
public interface LocatorCallback {
    void onLocationReport(Location location);

    void onStatusChanged(int i);

    void onErrorReport(int i);
}
