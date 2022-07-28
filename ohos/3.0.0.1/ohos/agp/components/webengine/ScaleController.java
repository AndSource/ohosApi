package ohos.agp.components.webengine;

public interface ScaleController {
  void setScale(int paramInt);
  
  boolean scaleUp();
  
  boolean scaleDown();
  
  void setScalable(boolean paramBoolean);
  
  boolean isScalable();
  
  void setGestureScalable(boolean paramBoolean);
  
  boolean isGestureScalable();
  
  void setTextScale(int paramInt);
  
  int getTextScale();
  
  void setScaleChangeListener(ScaleChangeListener paramScaleChangeListener);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/ScaleController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */