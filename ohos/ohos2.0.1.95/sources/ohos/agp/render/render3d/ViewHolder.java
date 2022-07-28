package ohos.agp.render.render3d;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/ViewHolder.class */
public interface ViewHolder {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/ViewHolder$BitmapListener.class */
    public interface BitmapListener {
        void onBitmapLoadError();
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/ViewHolder$SurfaceListener.class */
    public interface SurfaceListener {
        void onSurfaceAvailable();

        void onSurfaceSizeUpdated(int i, int i2);

        void onSurfaceDestroyed();
    }

    void setSurfaceListener(SurfaceListener surfaceListener);

    ohos.agp.components.Component getView();

    void release();

    TargetBuffer getTargetBuffer();

    void setOpaque(boolean z);
}
