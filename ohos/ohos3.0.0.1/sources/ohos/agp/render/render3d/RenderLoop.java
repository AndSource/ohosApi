package ohos.agp.render.render3d;

import ohos.agp.render.render3d.Engine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/RenderLoop.class */
public class RenderLoop {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/RenderLoop$FrameListener.class */
    public interface FrameListener {
        void onFrameBegin(Engine.Time time);

        void onFrameEnd(Engine.Time time);
    }

    public RenderLoop(ViewHolder viewHolder, Engine engine) {
        throw new RuntimeException("Stub!");
    }

    public void setRenderNodeGraph(Engine.RenderNodeGraph renderNodeGraph) {
        throw new RuntimeException("Stub!");
    }

    public void setRenderNodeGraph(Engine.RenderNodeGraphType renderNodeGraphType) {
        throw new RuntimeException("Stub!");
    }

    public void startRendering() {
        throw new RuntimeException("Stub!");
    }

    public void submitTask(Task task) {
        throw new RuntimeException("Stub!");
    }

    public boolean cancelTask(Task task) {
        throw new RuntimeException("Stub!");
    }

    public void cancelAllTasks() {
        throw new RuntimeException("Stub!");
    }

    public void requestRender() {
        throw new RuntimeException("Stub!");
    }

    public void stopRendering() {
        throw new RuntimeException("Stub!");
    }

    public void pause() {
        throw new RuntimeException("Stub!");
    }

    public void resume() {
        throw new RuntimeException("Stub!");
    }

    public void setFrameListener(FrameListener frameListener) {
        throw new RuntimeException("Stub!");
    }

    public void setVsyncCount(int vsyncCount) {
        throw new RuntimeException("Stub!");
    }

    public int getVsyncCount() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }
}
