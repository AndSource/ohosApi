package ohos.agp.render.render3d.gltf;

import java.nio.ByteBuffer;
import ohos.agp.render.render3d.Entity;
import ohos.agp.render.render3d.Task;

public interface GltfLoader {
  public static final int RESOURCE_IMPORT_BIT_ANIMATION = 64;
  
  public static final int RESOURCE_IMPORT_BIT_IMAGE = 2;
  
  public static final int RESOURCE_IMPORT_BIT_MATERIAL = 8;
  
  public static final int RESOURCE_IMPORT_BIT_MESH = 16;
  
  public static final int RESOURCE_IMPORT_BIT_SAMPLER = 1;
  
  public static final int RESOURCE_IMPORT_BIT_SKIN = 32;
  
  public static final int RESOURCE_IMPORT_BIT_TEXTURE = 4;
  
  public static final int RESOURCE_IMPORT_FLAG_BITS_ALL = 2147483647;
  
  public static final int SCENE_IMPORT_BIT_CAMERA = 4;
  
  public static final int SCENE_IMPORT_BIT_LIGHT = 16;
  
  public static final int SCENE_IMPORT_BIT_MESH = 2;
  
  public static final int SCENE_IMPORT_BIT_MORPH = 32;
  
  public static final int SCENE_IMPORT_BIT_SCENE = 1;
  
  public static final int SCENE_IMPORT_BIT_SKIN = 8;
  
  public static final int SCENE_IMPORT_FLAG_BITS_ALL = 2147483647;
  
  int getDefaultResourceImportFlags();
  
  int getDefaultSceneImportFlags();
  
  GltfData loadGltf(String paramString);
  
  GltfData loadGltf(ByteBuffer paramByteBuffer);
  
  GltfImportData importGltf(GltfData paramGltfData, int paramInt);
  
  Task importGltfAsync(GltfData paramGltfData, int paramInt, ImportListener paramImportListener);
  
  Entity importScene(int paramInt1, GltfData paramGltfData, GltfImportData paramGltfImportData, Entity paramEntity, int paramInt2);
  
  public static interface ImportListener {
    void onGltfImportFinished(String param1String, GltfImportData param1GltfImportData);
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/render3d/gltf/GltfLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */