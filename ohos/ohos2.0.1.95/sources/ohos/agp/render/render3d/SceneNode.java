package ohos.agp.render.render3d;

import java.util.List;
import java.util.Optional;
import ohos.agp.render.render3d.math.Quaternion;
import ohos.agp.render.render3d.math.Vector3;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/SceneNode.class */
public interface SceneNode {
    String getName();

    void setName(String str);

    Scene getScene();

    Optional<SceneNode> getParent();

    void setParent(SceneNode sceneNode);

    Vector3 getPosition();

    void setPosition(Vector3 vector3);

    Quaternion getRotation();

    void setRotation(Quaternion quaternion);

    Vector3 getScale();

    void setScale(Vector3 vector3);

    void setEnabled(boolean z);

    boolean isEnabled();

    void setExported(boolean z);

    boolean isExported();

    List<SceneNode> getChildren();

    boolean isAncestorOf(SceneNode sceneNode);

    Optional<SceneNode> getChild(String str);

    Optional<SceneNode> lookupNodeByPath(String str);

    Optional<SceneNode> lookupNodeByName(String str);

    Optional<SceneNode> lookupNodeByComponent(Class<? extends Component> cls);

    List<SceneNode> lookupNodesByComponent(Class<? extends Component> cls);

    Entity getEntity();
}
