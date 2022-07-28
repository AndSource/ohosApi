package ohos.agp.render.render3d;

import java.util.List;
import java.util.Optional;
import ohos.agp.render.render3d.math.Quaternion;
import ohos.agp.render.render3d.math.Vector3;

public interface SceneNode {
  String getName();
  
  void setName(String paramString);
  
  Scene getScene();
  
  Optional<SceneNode> getParent();
  
  void setParent(SceneNode paramSceneNode);
  
  Vector3 getPosition();
  
  void setPosition(Vector3 paramVector3);
  
  Quaternion getRotation();
  
  void setRotation(Quaternion paramQuaternion);
  
  Vector3 getScale();
  
  void setScale(Vector3 paramVector3);
  
  void setEnabled(boolean paramBoolean);
  
  boolean isEnabled();
  
  void setExported(boolean paramBoolean);
  
  boolean isExported();
  
  List<SceneNode> getChildren();
  
  boolean isAncestorOf(SceneNode paramSceneNode);
  
  Optional<SceneNode> getChild(String paramString);
  
  Optional<SceneNode> lookupNodeByPath(String paramString);
  
  Optional<SceneNode> lookupNodeByName(String paramString);
  
  Optional<SceneNode> lookupNodeByComponent(Class<? extends Component> paramClass);
  
  List<SceneNode> lookupNodesByComponent(Class<? extends Component> paramClass);
  
  Entity getEntity();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/render3d/SceneNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */