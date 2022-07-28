package ohos.ai.cv.text;

import ohos.ai.cv.common.CvRect;
import ohos.ai.cv.common.VisionConfiguration;
import ohos.utils.PacMap;

/* loaded from: ohos2.2.0.3.jar:ohos/ai/cv/text/TextConfiguration.class */
public class TextConfiguration extends VisionConfiguration {
    public static final int AUTO = 0;
    public static final int CHINESE = 1;
    public static final int ENGLISH = 3;
    public static final int FRENCH = 7;
    public static final int GERMAN = 6;
    public static final int ITALIAN = 5;
    public static final int JAPANESE = 9;
    public static final int KOREAN = 10;
    public static final int PORTUGUESE = 4;
    public static final int RUSSIAN = 8;
    public static final int SPANISH = 2;
    public static final int TEXT_DETECT = 1;
    public static final int TEXT_LEVEL_BLOCK = 0;
    public static final int TEXT_LEVEL_CHAR = 2;
    public static final int TEXT_LEVEL_LINE = 1;
    public static final int TEXT_RECOG = 0;

    public TextConfiguration(Builder builder) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public CvRect getRoi() {
        throw new RuntimeException("Stub!");
    }

    public int getLevel() {
        throw new RuntimeException("Stub!");
    }

    public int getDetectType() {
        throw new RuntimeException("Stub!");
    }

    public int getLanguage() {
        throw new RuntimeException("Stub!");
    }

    public int getDetectMode() {
        throw new RuntimeException("Stub!");
    }

    public TextShape getTextShape() {
        throw new RuntimeException("Stub!");
    }

    public int getIsTracking() {
        throw new RuntimeException("Stub!");
    }

    public int getTrackingForceOcrFlag() {
        throw new RuntimeException("Stub!");
    }

    public int getTrackingRelease() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ai.cv.common.VisionConfiguration
    public PacMap getParam() {
        throw new RuntimeException("Stub!");
    }

    public static TextConfiguration fromPacMap(PacMap paramPacMap) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/ai/cv/text/TextConfiguration$Builder.class */
    public static class Builder extends VisionConfiguration.Builder<Builder> {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public TextConfiguration build() {
            throw new RuntimeException("Stub!");
        }

        public Builder setDetectType(int detectType) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRoi(CvRect roi) {
            throw new RuntimeException("Stub!");
        }

        public Builder setLevel(int level) {
            throw new RuntimeException("Stub!");
        }

        public Builder setLanguage(int language) {
            throw new RuntimeException("Stub!");
        }

        public Builder setDetectMode(int detectMode) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTextShape(TextShape shape) {
            throw new RuntimeException("Stub!");
        }

        public Builder setIsTracking(int tracking) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTrackingRelease(int release) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTrackingForceOcr(int forceOcr) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/ai/cv/text/TextConfiguration$TextShape.class */
    public enum TextShape {
        TEXT_SHAPE_STRAIGHT,
        TEXT_SHAPE_CURVE;

        public int getShapeType() {
            throw new RuntimeException("Stub!");
        }
    }
}
