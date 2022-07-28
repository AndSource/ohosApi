package ohos.media.camera.device;

import ohos.agp.graphics.Surface;
import ohos.eventhandler.EventHandler;
import ohos.media.image.common.Size;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraConfig.class */
public interface CameraConfig {

    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraConfig$Builder.class */
    public interface Builder {
        Builder addSurface(Surface surface);

        Builder removeSurface(Surface surface);

        <T> Builder addDeferredSurfaceSize(Size size, Class<T> cls);

        Builder addDeferredSurface(Surface surface);

        Builder setFrameStateCallback(FrameStateCallback frameStateCallback, EventHandler eventHandler);

        Builder setRunningMode(int i);

        CameraConfig build();
    }
}
