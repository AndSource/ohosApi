/*     */ package ohos.agp.render.render3d.components;
/*     */ 
/*     */ import ohos.agp.render.render3d.Component;
/*     */ import ohos.agp.render.render3d.Entity;
/*     */ import ohos.agp.render.render3d.math.Quaternion;
/*     */ import ohos.agp.render.render3d.math.Vector3;
/*     */ import ohos.agp.render.render3d.resources.GpuResourceHandle;
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
/*     */ public class SceneComponent
/*     */   implements Component
/*     */ {
/*     */   public SceneComponent() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3 getEnvironmentDiffuseColor() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvironmentDiffuseColor(Vector3 environmentDiffuseColor) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3 getEnvironmentSpecularColor() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvironmentSpecularColor(Vector3 environmentSpecularColor) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getEnvironmentDiffuseIntensity() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvironmentDiffuseIntensity(float environmentDiffuseIntensity) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getEnvironmentSpecularIntensity() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvironmentSpecularIntensity(float environmentSpecularIntensity) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Entity getCamera() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCamera(Entity camera) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GpuResourceHandle getRadianceCubemap() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRadianceCubemap(GpuResourceHandle radianceCubemap) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GpuResourceHandle getEnvMap() {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvMap(GpuResourceHandle envMap) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Quaternion getEnvironmentRotation() {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvironmentRotation(Quaternion environmentRotation) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BackgroundType getBackgroundType() {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBackgroundType(BackgroundType backgroundType) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector3[] getIrradianceCoefficients() {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIrradianceCoefficients(Vector3[] irradianceCoefficients) {
/* 196 */     throw new RuntimeException("Stub!");
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
/*     */   public enum BackgroundType
/*     */   {
/* 209 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     IMAGE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     CUBEMAP,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     EQUIRECTANGULAR;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/render3d/components/SceneComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */