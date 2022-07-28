package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: ohos2.2.0.3.jar:ohos/media/camera/device/CameraInfo.class */
public interface CameraInfo {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/device/CameraInfo$DeviceLinkType.class */
    public @interface DeviceLinkType {
        public static final int DEVICE_LINK_EXTERNAL_MSDP = 2;
        public static final int DEVICE_LINK_EXTERNAL_USB = 1;
        public static final int DEVICE_LINK_NATIVE = 0;
        public static final int DEVICE_LINK_OTHERS = -1;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/device/CameraInfo$FacingType.class */
    public @interface FacingType {
        public static final int CAMERA_FACING_BACK = 1;
        public static final int CAMERA_FACING_FRONT = 0;
        public static final int CAMERA_FACING_OTHERS = -1;
    }

    String getLogicalId();

    int getFacingType();

    List<String> getPhysicalIdList();

    int getDeviceLinkType(String str);

    boolean equals(Object obj);

    int hashCode();

    String toString();
}
