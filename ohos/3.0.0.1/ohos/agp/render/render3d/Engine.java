/*     */ package ohos.agp.render.render3d;
/*     */ 
/*     */ import java.util.Map;
/*     */ import ohos.agp.components.surfaceprovider.SurfaceProvider;
/*     */ import ohos.agp.render.render3d.gltf.GltfExporter;
/*     */ import ohos.agp.render.render3d.gltf.GltfLoader;
/*     */ import ohos.agp.render.render3d.resources.ResourceManager;
/*     */ import ohos.agp.render.render3d.util.MeshBuilder;
/*     */ import ohos.app.Context;
/*     */ import ohos.multimodalinput.event.TouchEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface Engine
/*     */ {
/*     */   boolean init(Context paramContext, RenderBackend paramRenderBackend, Map<String, Object> paramMap, String paramString);
/*     */   
/*     */   void reset();
/*     */   
/*     */   void release();
/*     */   
/*     */   void resourceCleanup();
/*     */   
/*     */   String getVersion();
/*     */   
/*     */   boolean isDebugBuild();
/*     */   
/*     */   void setDefaultTargetBuffer(TargetBuffer paramTargetBuffer);
/*     */   
/*     */   void setDefaultTargetBuffers(TargetBuffer[] paramArrayOfTargetBuffer);
/*     */   
/*     */   Time getEngineTime();
/*     */   
/*     */   ResourceManager getResourceManager();
/*     */   
/*     */   Scene getScene();
/*     */   
/*     */   GltfLoader getGltfLoader();
/*     */   
/*     */   GltfExporter getGltfExporter();
/*     */   
/*     */   MeshBuilder createMeshBuilder(int paramInt);
/*     */   
/*     */   ViewHolder createViewHolder(SurfaceProvider paramSurfaceProvider);
/*     */   
/*     */   RenderNodeGraph loadRenderNodeGraph(String paramString);
/*     */   
/*     */   void setRenderMode(RenderMode paramRenderMode);
/*     */   
/*     */   boolean update();
/*     */   
/*     */   void requestRender();
/*     */   
/*     */   void renderFrame(RenderNodeGraph paramRenderNodeGraph);
/*     */   
/*     */   void renderFrame(RenderNodeGraphType paramRenderNodeGraphType);
/*     */   
/*     */   void activateContext();
/*     */   
/*     */   void deactivateContext();
/*     */   
/*     */   boolean handleDevGuiTouchEvent(TouchEvent paramTouchEvent);
/*     */   
/*     */   void requireRenderThread();
/*     */   
/*     */   void postInRenderThread(Runnable paramRunnable);
/*     */   
/*     */   void runInRenderThread(Runnable paramRunnable);
/*     */   
/*     */   public enum RenderBackend
/*     */   {
/* 291 */     OPEN_GL_ES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 296 */     VULKAN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum RenderMode
/*     */   {
/* 316 */     RENDER_IF_DIRTY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 322 */     ALWAYS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface RenderNodeGraph
/*     */   {
/*     */     static boolean isValid(RenderNodeGraph handle) {
/* 341 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     boolean isValid();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void release();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum RenderNodeGraphType
/*     */   {
/* 373 */     LIGHT_WEIGHT_RENDERING_PIPELINE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     LIGHT_WEIGHT_RENDERING_PIPELINE_MSAA,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     HIGH_DEFINITION_RENDERING_PIPELINE;
/*     */   }
/*     */   
/*     */   public static interface Time {
/*     */     long getDeltaTimeMicros();
/*     */     
/*     */     long getTotalTimeMicros();
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/render3d/Engine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */