package ohos.ai.cv.sr;

import ohos.ai.cv.common.VisionConfiguration;
import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/sr/SisrConfiguration.class */
public class SisrConfiguration extends VisionConfiguration {
    public static final int SISR_QUALITY_HIGH = 30;
    public static final int SISR_QUALITY_LOW = 10;
    public static final int SISR_QUALITY_MEDIUM = 20;
    public static final float SISR_SCALE_1X = 1.0f;
    public static final float SISR_SCALE_3X = 3.0f;
    protected int quality = 30;
    protected float scale = 1.0f;

    SisrConfiguration(Builder builder) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ai.cv.common.VisionConfiguration
    public PacMap getParam() {
        throw new RuntimeException("Stub!");
    }

    public float getScale() {
        throw new RuntimeException("Stub!");
    }

    public void setScale(float scale) {
        throw new RuntimeException("Stub!");
    }

    public void setScale() {
        throw new RuntimeException("Stub!");
    }

    public int getQuality() {
        throw new RuntimeException("Stub!");
    }

    public void setQuality(int quality) {
        throw new RuntimeException("Stub!");
    }

    public void setQuality() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/ai/cv/sr/SisrConfiguration$Builder.class */
    public static class Builder extends VisionConfiguration.Builder<Builder> {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public SisrConfiguration build() {
            throw new RuntimeException("Stub!");
        }
    }
}
