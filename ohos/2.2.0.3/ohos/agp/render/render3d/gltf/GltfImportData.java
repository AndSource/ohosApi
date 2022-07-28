package ohos.agp.render.render3d.gltf;

import java.util.List;
import ohos.agp.render.render3d.resources.GpuResourceHandle;
import ohos.agp.render.render3d.resources.ResourceHandle;

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


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/gltf/GltfImportData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */