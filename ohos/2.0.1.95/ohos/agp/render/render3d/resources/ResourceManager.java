package ohos.agp.render.render3d.resources;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;
import ohos.agp.render.render3d.SceneNode;
import ohos.agp.render.render3d.util.MeshBuilder;

public interface ResourceManager {
  List<ResourceInfo> getResources();
  
  List<ResourceInfo> getMaterials();
  
  List<ResourceInfo> getMeshes();
  
  List<ResourceInfo> getAnimations();
  
  List<ResourceInfo> getSkins();
  
  List<ResourceInfo> getImages();
  
  ResourceHandle getEmptyResourceHandle();
  
  ResourceHandle getResourceHandle(String paramString);
  
  ResourceHandle createMaterial(String paramString1, String paramString2);
  
  Optional<MaterialDesc> getMaterialDesc(ResourceHandle paramResourceHandle);
  
  void setMaterialDesc(ResourceHandle paramResourceHandle, MaterialDesc paramMaterialDesc);
  
  ResourceHandle createMesh(String paramString1, String paramString2, MeshBuilder paramMeshBuilder);
  
  Optional<MeshDesc> getMeshDesc(ResourceHandle paramResourceHandle);
  
  GpuResourceHandle getEmptyGpuResourceHandle();
  
  GpuResourceHandle createTexture(String paramString1, String paramString2);
  
  GpuResourceHandle createTexture(String paramString, int paramInt1, int paramInt2, ImageFormat paramImageFormat);
  
  void copyDataToImage(GpuResourceHandle paramGpuResourceHandle, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  GpuResourceHandle createTextureViewOes(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  GpuResourceHandle createUniformRingBuffer(String paramString, int paramInt);
  
  void updateBuffer(GpuResourceHandle paramGpuResourceHandle, ByteBuffer paramByteBuffer);
  
  int createExternalTextureOes();
  
  void deleteExternalTextureOes(int paramInt);
  
  RenderDataStorePod createRenderDataStorePod(String paramString);
  
  Optional<RenderDataStorePod> getRenderDataStorePod(String paramString);
  
  Optional<AnimationPlayback> createPlayback(ResourceHandle paramResourceHandle, SceneNode paramSceneNode);
  
  public static interface ResourceInfo {
    String getUri();
    
    String getName();
    
    ResourceHandle getHandle();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/render3d/resources/ResourceManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */