package ohos.agp.render.render3d.components;

import ohos.agp.render.render3d.Component;
import ohos.agp.render.render3d.math.Vector3;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/components/LightComponent.class */
public class LightComponent implements Component {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/components/LightComponent$LightType.class */
    public enum LightType {
        INVALID,
        DIRECTIONAL,
        POINT,
        SPOT
    }

    public LightComponent() {
        throw new RuntimeException("Stub!");
    }

    public LightType getLightType() {
        throw new RuntimeException("Stub!");
    }

    public void setLightType(LightType lightType) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 getColor() {
        throw new RuntimeException("Stub!");
    }

    public void setColor(Vector3 color) {
        throw new RuntimeException("Stub!");
    }

    public float getIntensity() {
        throw new RuntimeException("Stub!");
    }

    public void setIntensity(float intensity) {
        throw new RuntimeException("Stub!");
    }

    public float getRange() {
        throw new RuntimeException("Stub!");
    }

    public void setRange(float range) {
        throw new RuntimeException("Stub!");
    }

    public float getSpotInnerAngle() {
        throw new RuntimeException("Stub!");
    }

    public void setSpotInnerAngle(float spotInnerAngle) {
        throw new RuntimeException("Stub!");
    }

    public float getSpotOuterAngle() {
        throw new RuntimeException("Stub!");
    }

    public void setSpotOuterAngle(float spotOuterAngle) {
        throw new RuntimeException("Stub!");
    }

    public boolean isShadowEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setShadowEnabled(boolean isShadowEnabled) {
        throw new RuntimeException("Stub!");
    }
}
