package ohos.agp.render.render3d;

import ohos.agp.components.Component;

public interface ViewHolder {
  void setSurfaceListener(SurfaceListener paramSurfaceListener);
  
  Component getView();
  
  void release();
  
  TargetBuffer getTargetBuffer();
  
  void setOpaque(boolean paramBoolean);
  
  public static interface SurfaceListener {
    void onSurfaceAvailable();
    
    void onSurfaceSizeUpdated(int param1Int1, int param1Int2);
    
    void onSurfaceDestroyed();
  }
  
  public static interface BitmapListener {
    void onBitmapLoadError();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/render3d/ViewHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */