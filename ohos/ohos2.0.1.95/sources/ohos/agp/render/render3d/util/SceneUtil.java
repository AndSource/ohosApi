package ohos.agp.render.render3d.util;

import java.util.List;
import ohos.agp.render.render3d.Entity;
import ohos.agp.render.render3d.SceneNode;
import ohos.agp.render.render3d.math.Quaternion;
import ohos.agp.render.render3d.math.Vector2;
import ohos.agp.render.render3d.math.Vector3;
import ohos.agp.render.render3d.resources.ResourceHandle;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/util/SceneUtil.class */
public interface SceneUtil {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/util/SceneUtil$RayCastResult.class */
    public interface RayCastResult {
        SceneNode getNode();

        float getDistance();
    }

    ResourceHandle generateCubeMesh(String str, ResourceHandle resourceHandle, float f, float f2, float f3);

    ResourceHandle generatePlaneMesh(String str, ResourceHandle resourceHandle, float f, float f2);

    ResourceHandle generateSphereMesh(String str, ResourceHandle resourceHandle, float f, int i, int i2);

    ResourceHandle generateConeMesh(String str, ResourceHandle resourceHandle, float f, float f2, int i);

    Entity generateCube(String str, ResourceHandle resourceHandle, float f, float f2, float f3);

    Entity generatePlane(String str, ResourceHandle resourceHandle, float f, float f2);

    Entity generateSphere(String str, ResourceHandle resourceHandle, float f, int i, int i2);

    Entity generateCone(String str, ResourceHandle resourceHandle, float f, float f2, int i);

    Vector3 screenToWorld(Entity entity, Vector3 vector3);

    Vector3 worldToScreen(Entity entity, Vector3 vector3);

    List<RayCastResult> rayCast(Vector3 vector3, Vector3 vector32);

    List<RayCastResult> rayCastFromCamera(Entity entity, Vector2 vector2);

    BoundingBox getBoundsUsingTransform(Entity entity, boolean z);

    BoundingBox getBoundsUsingWorldMatrix(Entity entity, boolean z);

    Entity createPerspectiveCamera(Vector3 vector3, Quaternion quaternion, float f, float f2, float f3);

    void updateCameraViewport(Entity entity, int i, int i2, boolean z, float f);

    void updateCameraViewport(Entity entity, int i, int i2);

    Entity createLightDirectional(Quaternion quaternion, boolean z, Vector3 vector3, float f);

    Entity createLightSpot(Vector3 vector3, Quaternion quaternion, boolean z, Vector3 vector32, float f);

    Entity createLightPoint(Vector3 vector3, boolean z, Vector3 vector32, float f);
}
