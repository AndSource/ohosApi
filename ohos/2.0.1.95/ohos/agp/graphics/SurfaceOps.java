package ohos.agp.graphics;

import ohos.agp.render.Canvas;
import ohos.agp.utils.Rect;

public interface SurfaceOps {
  void addCallback(Callback paramCallback);
  
  void removeCallback(Callback paramCallback);
  
  void setFormat(int paramInt);
  
  Canvas lockCanvas();
  
  void unlockCanvasAndPost(Canvas paramCanvas);
  
  Surface getSurface();
  
  void setFixedSize(int paramInt1, int paramInt2);
  
  void setKeepScreenOn(boolean paramBoolean);
  
  Rect getSurfaceDimension();
  
  public static interface Callback {
    void surfaceCreated(SurfaceOps param1SurfaceOps);
    
    void surfaceChanged(SurfaceOps param1SurfaceOps, int param1Int1, int param1Int2, int param1Int3);
    
    void surfaceDestroyed(SurfaceOps param1SurfaceOps);
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/graphics/SurfaceOps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */