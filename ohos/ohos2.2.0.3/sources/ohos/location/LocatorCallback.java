package ohos.location;

/* loaded from: ohos2.2.0.3.jar:ohos/location/LocatorCallback.class */
public interface LocatorCallback {
    void onLocationReport(Location location);

    void onStatusChanged(int i);

    void onErrorReport(int i);
}
