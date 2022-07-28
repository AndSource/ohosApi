package ohos.agp.render.render3d;

import java.util.Optional;
import ohos.agp.render.render3d.systems.MorphingSystem;
import ohos.agp.render.render3d.util.SceneUtil;

public interface Scene {
  Engine getEngine();
  
  SceneUtil getSceneUtil();
  
  Entity createEntity();
  
  void destroyEntity(Entity paramEntity);
  
  SceneNode getRootNode();
  
  Optional<SceneNode> getNode(Entity paramEntity);
  
  SceneNode createNode();
  
  SceneNode cloneNode(SceneNode paramSceneNode, boolean paramBoolean);
  
  void destroyNode(SceneNode paramSceneNode);
  
  MorphingSystem getMorphingSystem();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/Scene.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */