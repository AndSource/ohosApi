package ohos.agp.render.render3d.gltf;

import java.util.List;
import ohos.agp.render.render3d.resources.GpuResourceHandle;
import ohos.agp.render.render3d.resources.ResourceHandle;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/gltf/GltfImportData.class */
public interface GltfImportData {
    boolean isValid();

    String getError();

    void release();

    List<GpuResourceHandle> getSamplers();

    List<GpuResourceHandle> getTextures();

    List<ResourceHandle> getImages();

    List<ResourceHandle> getMaterials();

    List<ResourceHandle> getMeshes();

    List<ResourceHandle> getSkins();

    List<ResourceHandle> getAnimations();
}
