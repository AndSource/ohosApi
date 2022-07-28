package ohos.agp.graphics;

import ohos.agp.render.Canvas;
import ohos.agp.utils.Rect;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/graphics/SurfaceOps.class */
public interface SurfaceOps {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/graphics/SurfaceOps$Callback.class */
    public interface Callback {
        void surfaceCreated(SurfaceOps surfaceOps);

        void surfaceChanged(SurfaceOps surfaceOps, int i, int i2, int i3);

        void surfaceDestroyed(SurfaceOps surfaceOps);
    }

    void addCallback(Callback callback);

    void removeCallback(Callback callback);

    void setFormat(int i);

    Canvas lockCanvas();

    void unlockCanvasAndPost(Canvas canvas);

    Surface getSurface();

    void setFixedSize(int i, int i2);

    void setKeepScreenOn(boolean z);

    Rect getSurfaceDimension();
}
