package ohos.media.camera.device;

import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.agp.utils.Rect;
import ohos.location.Location;
import ohos.media.camera.params.ParameterKey;

/* loaded from: ohos3.0.0.1.jar:ohos/media/camera/device/FrameConfig.class */
public interface FrameConfig {

    /* loaded from: ohos3.0.0.1.jar:ohos/media/camera/device/FrameConfig$Builder.class */
    public interface Builder {
        Builder addSurface(Surface surface);

        Builder removeSurface(Surface surface);

        Builder setFaceDetection(int i, boolean z);

        Builder setAfMode(int i, Rect rect);

        Builder setAfTrigger(int i);

        Builder setAeMode(int i, Rect rect);

        Builder setAeTrigger(int i);

        Builder setAwbMode(int i, Rect rect);

        Builder setZoom(float f);

        Builder setFlashMode(int i);

        Builder setMark(Object obj);

        Builder setLocation(Location location);

        Builder setImageRotation(int i);

        <T> Builder setParameter(ParameterKey.Key<T> key, T t);

        Surface getCoordinateSurface();

        int getFrameConfigType();

        List<Surface> getSurfaces();

        Builder setCoordinateSurface(Surface surface);

        int getAfMode();

        Rect getAfRect();

        int getAfTrigger();

        int getAeMode();

        Rect getAeRect();

        int getAeTrigger();

        int getAwbMode();

        float getZoomValue();

        int getFlashMode();

        int getFaceDetectionType();

        Location getLocation();

        int getImageRotation();

        <T> T get(ParameterKey.Key<T> key);

        List<ParameterKey.Key<?>> getKeys();

        FrameConfig build();
    }

    int getFrameConfigType();

    List<Surface> getSurfaces();

    Surface getCoordinateSurface();

    int getAfMode();

    Rect getAfRect();

    int getAfTrigger();

    int getAeMode();

    Rect getAeRect();

    int getAeTrigger();

    int getAwbMode();

    float getZoomValue();

    int getFlashMode();

    int getFaceDetectionType();

    Location getLocation();

    int getImageRotation();

    <T> T get(ParameterKey.Key<T> key);

    List<ParameterKey.Key<?>> getKeys();

    Object getMark();

    boolean equals(Object obj);
}
