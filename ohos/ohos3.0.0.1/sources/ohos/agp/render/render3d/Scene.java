package ohos.agp.render.render3d;

import java.util.Optional;
import ohos.agp.render.render3d.systems.MorphingSystem;
import ohos.agp.render.render3d.util.SceneUtil;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/Scene.class */
public interface Scene {
    Engine getEngine();

    SceneUtil getSceneUtil();

    Entity createEntity();

    void destroyEntity(Entity entity);

    SceneNode getRootNode();

    Optional<SceneNode> getNode(Entity entity);

    SceneNode createNode();

    SceneNode cloneNode(SceneNode sceneNode, boolean z);

    void destroyNode(SceneNode sceneNode);

    MorphingSystem getMorphingSystem();
}
