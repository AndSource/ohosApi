package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ohos.agp.utils.Point;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/FaceLandmark.class */
public final class FaceLandmark {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/FaceLandmark$FaceLandmarkType.class */
    public @interface FaceLandmarkType {
        public static final int LEFT_EYE = 0;
        public static final int MOUTH_CENTER = 2;
        public static final int RIGHT_EYE = 1;
        public static final int TYPE_UNKNOWN = -1;
    }

    public FaceLandmark(int type, Point position) {
        throw new RuntimeException("Stub!");
    }

    public int getType() {
        throw new RuntimeException("Stub!");
    }

    public Point getPosition() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
