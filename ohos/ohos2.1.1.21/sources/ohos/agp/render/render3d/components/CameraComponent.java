package ohos.agp.render.render3d.components;

import ohos.agp.render.render3d.Component;
import ohos.agp.render.render3d.math.Matrix4x4;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/components/CameraComponent.class */
public class CameraComponent implements Component {
    public static final int CAMERA_FLAG_SHADOW_BIT = 1;

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/components/CameraComponent$CameraType.class */
    public enum CameraType {
        ORTHOGRAPHIC,
        PERSPECTIVE,
        CUSTOM
    }

    public CameraComponent() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public void setName(String name) {
        throw new RuntimeException("Stub!");
    }

    public CameraType getCameraType() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraType(CameraType cameraType) {
        throw new RuntimeException("Stub!");
    }

    public int getAdditionalFlags() {
        throw new RuntimeException("Stub!");
    }

    public void setAdditionalFlags(int additionalFlags) {
        throw new RuntimeException("Stub!");
    }

    public float getPerspectiveAspectRatio() {
        throw new RuntimeException("Stub!");
    }

    public void setPerspectiveAspectRatio(float perspectiveAspectRatio) {
        throw new RuntimeException("Stub!");
    }

    public float getPerspectiveVerticalFov() {
        throw new RuntimeException("Stub!");
    }

    public void setPerspectiveVerticalFov(float perspectiveVerticalFov) {
        throw new RuntimeException("Stub!");
    }

    public float getOrthoWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setOrthoWidth(float orthoWidth) {
        throw new RuntimeException("Stub!");
    }

    public float getOrthoHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setOrthoHeight(float orthoHeight) {
        throw new RuntimeException("Stub!");
    }

    public Matrix4x4 getCustomProjection() {
        throw new RuntimeException("Stub!");
    }

    public void setCustomProjection(Matrix4x4 customProjection) {
        throw new RuntimeException("Stub!");
    }

    public float getZnear() {
        throw new RuntimeException("Stub!");
    }

    public void setZnear(float znear) {
        throw new RuntimeException("Stub!");
    }

    public float getZfar() {
        throw new RuntimeException("Stub!");
    }

    public void setZfar(float zfar) {
        throw new RuntimeException("Stub!");
    }

    public float[] getViewportParams() {
        throw new RuntimeException("Stub!");
    }

    public void setViewportParams(float[] viewportParams) {
        throw new RuntimeException("Stub!");
    }

    public int getRenderResolutionX() {
        throw new RuntimeException("Stub!");
    }

    public int getRenderResolutionY() {
        throw new RuntimeException("Stub!");
    }

    public void setRenderResolution(int renderResolutionX, int renderResolutionY) {
        throw new RuntimeException("Stub!");
    }
}
