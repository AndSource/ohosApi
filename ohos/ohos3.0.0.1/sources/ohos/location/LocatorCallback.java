package ohos.location;

/* loaded from: ohos3.0.0.1.jar:ohos/location/LocatorCallback.class */
public interface LocatorCallback {
    void onLocationReport(Location location);

    void onStatusChanged(int i);

    void onErrorReport(int i);
}
