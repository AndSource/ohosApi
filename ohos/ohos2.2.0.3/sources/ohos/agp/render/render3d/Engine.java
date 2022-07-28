package ohos.agp.render.render3d;

import java.util.Map;
import ohos.agp.components.surfaceprovider.SurfaceProvider;
import ohos.agp.render.render3d.gltf.GltfExporter;
import ohos.agp.render.render3d.gltf.GltfLoader;
import ohos.agp.render.render3d.resources.ResourceManager;
import ohos.agp.render.render3d.util.MeshBuilder;
import ohos.app.Context;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine.class */
public interface Engine {

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine$RenderBackend.class */
    public enum RenderBackend {
        OPEN_GL_ES,
        VULKAN
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine$RenderMode.class */
    public enum RenderMode {
        RENDER_IF_DIRTY,
        ALWAYS
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine$RenderNodeGraphType.class */
    public enum RenderNodeGraphType {
        LIGHT_WEIGHT_RENDERING_PIPELINE,
        LIGHT_WEIGHT_RENDERING_PIPELINE_MSAA,
        HIGH_DEFINITION_RENDERING_PIPELINE
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine$Time.class */
    public interface Time {
        long getDeltaTimeMicros();

        long getTotalTimeMicros();
    }

    boolean init(Context context, RenderBackend renderBackend, Map<String, Object> map, String str);

    void reset();

    void release();

    void resourceCleanup();

    String getVersion();

    boolean isDebugBuild();

    void setDefaultTargetBuffer(TargetBuffer targetBuffer);

    void setDefaultTargetBuffers(TargetBuffer[] targetBufferArr);

    Time getEngineTime();

    ResourceManager getResourceManager();

    Scene getScene();

    GltfLoader getGltfLoader();

    GltfExporter getGltfExporter();

    MeshBuilder createMeshBuilder(int i);

    ViewHolder createViewHolder(SurfaceProvider surfaceProvider);

    RenderNodeGraph loadRenderNodeGraph(String str);

    void setRenderMode(RenderMode renderMode);

    boolean update();

    void requestRender();

    void renderFrame(RenderNodeGraph renderNodeGraph);

    void renderFrame(RenderNodeGraphType renderNodeGraphType);

    void activateContext();

    void deactivateContext();

    boolean handleDevGuiTouchEvent(TouchEvent touchEvent);

    void requireRenderThread();

    void postInRenderThread(Runnable runnable);

    void runInRenderThread(Runnable runnable);

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/Engine$RenderNodeGraph.class */
    public interface RenderNodeGraph {
        boolean isValid();

        void release();

        static boolean isValid(RenderNodeGraph handle) {
            throw new RuntimeException("Stub!");
        }
    }
}
