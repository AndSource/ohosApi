package ohos.media.camera.device;

import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.eventhandler.EventHandler;
import ohos.media.image.common.Size;

/* loaded from: ohos3.0.0.1.jar:ohos/media/camera/device/CameraConfig.class */
public interface CameraConfig {

    /* loaded from: ohos3.0.0.1.jar:ohos/media/camera/device/CameraConfig$Builder.class */
    public interface Builder {
        Builder addSurface(Surface surface);

        Builder removeSurface(Surface surface);

        List<Surface> getSurfaces();

        <T> Builder addDeferredSurfaceSize(Size size, Class<T> cls);

        Builder addDeferredSurface(Surface surface);

        Builder setFrameStateCallback(FrameStateCallback frameStateCallback, EventHandler eventHandler);

        Builder setRunningMode(int i);

        CameraConfig build();
    }

    List<Surface> getSurfaces();

    boolean equals(Object obj);
}
