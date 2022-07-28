package ohos.agp.render.render3d.util;

import java.util.List;
import ohos.agp.render.render3d.Entity;
import ohos.agp.render.render3d.SceneNode;
import ohos.agp.render.render3d.math.Quaternion;
import ohos.agp.render.render3d.math.Vector2;
import ohos.agp.render.render3d.math.Vector3;
import ohos.agp.render.render3d.resources.ResourceHandle;

public interface SceneUtil {
  ResourceHandle generateCubeMesh(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2, float paramFloat3);
  
  ResourceHandle generatePlaneMesh(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2);
  
  ResourceHandle generateSphereMesh(String paramString, ResourceHandle paramResourceHandle, float paramFloat, int paramInt1, int paramInt2);
  
  ResourceHandle generateConeMesh(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2, int paramInt);
  
  Entity generateCube(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2, float paramFloat3);
  
  Entity generatePlane(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2);
  
  Entity generateSphere(String paramString, ResourceHandle paramResourceHandle, float paramFloat, int paramInt1, int paramInt2);
  
  Entity generateCone(String paramString, ResourceHandle paramResourceHandle, float paramFloat1, float paramFloat2, int paramInt);
  
  Vector3 screenToWorld(Entity paramEntity, Vector3 paramVector3);
  
  Vector3 worldToScreen(Entity paramEntity, Vector3 paramVector3);
  
  List<RayCastResult> rayCast(Vector3 paramVector31, Vector3 paramVector32);
  
  List<RayCastResult> rayCastFromCamera(Entity paramEntity, Vector2 paramVector2);
  
  BoundingBox getBoundsUsingTransform(Entity paramEntity, boolean paramBoolean);
  
  BoundingBox getBoundsUsingWorldMatrix(Entity paramEntity, boolean paramBoolean);
  
  Entity createPerspectiveCamera(Vector3 paramVector3, Quaternion paramQuaternion, float paramFloat1, float paramFloat2, float paramFloat3);
  
  void updateCameraViewport(Entity paramEntity, int paramInt1, int paramInt2, boolean paramBoolean, float paramFloat);
  
  void updateCameraViewport(Entity paramEntity, int paramInt1, int paramInt2);
  
  Entity createLightDirectional(Quaternion paramQuaternion, boolean paramBoolean, Vector3 paramVector3, float paramFloat);
  
  Entity createLightSpot(Vector3 paramVector31, Quaternion paramQuaternion, boolean paramBoolean, Vector3 paramVector32, float paramFloat);
  
  Entity createLightPoint(Vector3 paramVector31, boolean paramBoolean, Vector3 paramVector32, float paramFloat);
  
  public static interface RayCastResult {
    SceneNode getNode();
    
    float getDistance();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/render3d/util/SceneUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */