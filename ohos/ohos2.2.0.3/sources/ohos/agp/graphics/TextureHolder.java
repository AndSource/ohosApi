package ohos.agp.graphics;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/graphics/TextureHolder.class */
public class TextureHolder {

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/graphics/TextureHolder$OnNewFrameCallback.class */
    public interface OnNewFrameCallback {
        void onNewFrame(TextureHolder textureHolder);
    }

    public TextureHolder(int texName) {
        throw new RuntimeException("Stub!");
    }

    public void bindToGPUContext(int texName) {
        throw new RuntimeException("Stub!");
    }

    public void unbindFromGPUContext() {
        throw new RuntimeException("Stub!");
    }

    public void freeTextureImage() {
        throw new RuntimeException("Stub!");
    }

    public void refreshTextureImage() {
        throw new RuntimeException("Stub!");
    }

    public void setBufferDimension(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public boolean getMatrixForTransform(float[] matrix) {
        throw new RuntimeException("Stub!");
    }

    public void setOnNewFrameCallback(OnNewFrameCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void abandon() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAbandoned() {
        throw new RuntimeException("Stub!");
    }

    public long getLastRefreshTextureImageTime() {
        throw new RuntimeException("Stub!");
    }
}
