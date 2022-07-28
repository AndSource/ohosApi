package ohos.agp.render.render3d.components;

import ohos.agp.render.render3d.Component;
import ohos.agp.render.render3d.Entity;
import ohos.agp.render.render3d.math.Quaternion;
import ohos.agp.render.render3d.math.Vector3;
import ohos.agp.render.render3d.resources.GpuResourceHandle;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/components/SceneComponent.class */
public class SceneComponent implements Component {

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/components/SceneComponent$BackgroundType.class */
    public enum BackgroundType {
        NONE,
        IMAGE,
        CUBEMAP,
        EQUIRECTANGULAR
    }

    public SceneComponent() {
        throw new RuntimeException("Stub!");
    }

    public Vector3 getEnvironmentDiffuseColor() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvironmentDiffuseColor(Vector3 environmentDiffuseColor) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 getEnvironmentSpecularColor() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvironmentSpecularColor(Vector3 environmentSpecularColor) {
        throw new RuntimeException("Stub!");
    }

    public float getEnvironmentDiffuseIntensity() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvironmentDiffuseIntensity(float environmentDiffuseIntensity) {
        throw new RuntimeException("Stub!");
    }

    public float getEnvironmentSpecularIntensity() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvironmentSpecularIntensity(float environmentSpecularIntensity) {
        throw new RuntimeException("Stub!");
    }

    public Entity getCamera() {
        throw new RuntimeException("Stub!");
    }

    public void setCamera(Entity camera) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getRadianceCubemap() {
        throw new RuntimeException("Stub!");
    }

    public void setRadianceCubemap(GpuResourceHandle radianceCubemap) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getEnvMap() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvMap(GpuResourceHandle envMap) {
        throw new RuntimeException("Stub!");
    }

    public Quaternion getEnvironmentRotation() {
        throw new RuntimeException("Stub!");
    }

    public void setEnvironmentRotation(Quaternion environmentRotation) {
        throw new RuntimeException("Stub!");
    }

    public BackgroundType getBackgroundType() {
        throw new RuntimeException("Stub!");
    }

    public void setBackgroundType(BackgroundType backgroundType) {
        throw new RuntimeException("Stub!");
    }

    public Vector3[] getIrradianceCoefficients() {
        throw new RuntimeException("Stub!");
    }

    public void setIrradianceCoefficients(Vector3[] irradianceCoefficients) {
        throw new RuntimeException("Stub!");
    }
}
