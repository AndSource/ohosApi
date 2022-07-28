package ohos.location;

public interface LocatorCallback {
  void onLocationReport(Location paramLocation);
  
  void onStatusChanged(int paramInt);
  
  void onErrorReport(int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/location/LocatorCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */