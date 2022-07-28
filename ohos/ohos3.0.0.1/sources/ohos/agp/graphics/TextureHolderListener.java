package ohos.agp.graphics;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/graphics/TextureHolderListener.class */
public interface TextureHolderListener {
    void onTextureHolderAvailable(TextureHolder textureHolder, int i, int i2);

    void onTextureHolderSizeChanged(TextureHolder textureHolder, int i, int i2);

    void onTextureHolderDestroyed(TextureHolder textureHolder);

    void onTextureHolderUpdated(TextureHolder textureHolder);
}
