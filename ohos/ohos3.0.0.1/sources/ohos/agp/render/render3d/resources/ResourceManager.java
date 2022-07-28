package ohos.agp.render.render3d.resources;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;
import ohos.agp.render.render3d.SceneNode;
import ohos.agp.render.render3d.util.MeshBuilder;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/ResourceManager.class */
public interface ResourceManager {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/ResourceManager$ResourceInfo.class */
    public interface ResourceInfo {
        String getUri();

        String getName();

        ResourceHandle getHandle();
    }

    List<ResourceInfo> getResources();

    List<ResourceInfo> getMaterials();

    List<ResourceInfo> getMeshes();

    List<ResourceInfo> getAnimations();

    List<ResourceInfo> getSkins();

    List<ResourceInfo> getImages();

    ResourceHandle getEmptyResourceHandle();

    ResourceHandle getResourceHandle(String str);

    ResourceHandle createMaterial(String str, String str2);

    Optional<MaterialDesc> getMaterialDesc(ResourceHandle resourceHandle);

    void setMaterialDesc(ResourceHandle resourceHandle, MaterialDesc materialDesc);

    ResourceHandle createMesh(String str, String str2, MeshBuilder meshBuilder);

    Optional<MeshDesc> getMeshDesc(ResourceHandle resourceHandle);

    GpuResourceHandle getEmptyGpuResourceHandle();

    GpuResourceHandle createTexture(String str, String str2);

    GpuResourceHandle createTexture(String str, int i, int i2, ImageFormat imageFormat);

    void copyDataToImage(GpuResourceHandle gpuResourceHandle, ByteBuffer byteBuffer, int i, int i2);

    GpuResourceHandle createTextureViewOes(String str, int i, int i2, int i3);

    GpuResourceHandle createUniformRingBuffer(String str, int i);

    void updateBuffer(GpuResourceHandle gpuResourceHandle, ByteBuffer byteBuffer);

    int createExternalTextureOes();

    void deleteExternalTextureOes(int i);

    RenderDataStorePod createRenderDataStorePod(String str);

    Optional<RenderDataStorePod> getRenderDataStorePod(String str);

    Optional<AnimationPlayback> createPlayback(ResourceHandle resourceHandle, SceneNode sceneNode);
}
