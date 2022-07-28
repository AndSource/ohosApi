package ohos.agp.render.render3d.gltf;

import java.util.List;

public interface GltfData {
  public static final int INVALID_INDEX = -1;
  
  boolean isValid();
  
  String getError();
  
  void releaseBuffers();
  
  void release();
  
  int getSceneCount();
  
  int getDefaultSceneIndex();
  
  int getThumbnailCount();
  
  List<String> getExternalUris();
  
  String getGltfUri();
  
  String getBaseUri();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/gltf/GltfData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */