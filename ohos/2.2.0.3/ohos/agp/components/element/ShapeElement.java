/*     */ package ohos.agp.components.element;
/*     */ 
/*     */ import ohos.agp.colors.RgbColor;
/*     */ import ohos.agp.render.Arc;
/*     */ import ohos.agp.render.Path;
/*     */ import ohos.app.Context;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ShapeElement
/*     */   extends Element
/*     */ {
/*     */   public static final int ARC = 3;
/*     */   public static final int LINE = 2;
/*     */   public static final int LINEAR_GRADIENT_SHADER_TYPE = 0;
/*     */   public static final int OVAL = 1;
/*     */   public static final int PATH = 4;
/*     */   public static final int RADIAL_GRADIENT_SHADER_TYPE = 1;
/*     */   public static final int RECTANGLE = 0;
/*     */   public static final int SWEEP_GRADIENT_SHADER_TYPE = 2;
/*     */   public Path mPath;
/*     */   
/*     */   public ShapeElement() {
/*  28 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ShapeElement(Context context, int xmlId) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShape(int shape) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getShape() {
/*  55 */     throw new RuntimeException("Stub!");
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
/*     */   public void setRgbColor(RgbColor color) {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */   public void setRgbColors(RgbColor[] colors) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RgbColor[] getRgbColors() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStroke(int width, RgbColor color) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStrokeWidth() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RgbColor getStrokeColor() {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCornerRadius(float radius) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getCornerRadius() {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCornerRadiiArray(float[] radii) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float[] getCornerRadii() {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShaderType(int type) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getShaderType() {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setArc(Arc arc) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Arc getArc() {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGradientOrientation(Orientation orientation) {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Orientation getGradientOrientation() {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrientation(Orientation orientation) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Orientation getOrientation() {
/* 240 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPath(Path path) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Path getPath() {
/* 258 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDashPathEffectValues(float[] intervals, float phase) {
/* 270 */     throw new RuntimeException("Stub!");
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
/*     */   public enum Orientation
/*     */   {
/* 350 */     TOP_TO_BOTTOM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 355 */     TOP_RIGHT_TO_BOTTOM_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 360 */     RIGHT_TO_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     BOTTOM_RIGHT_TO_TOP_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     BOTTOM_TO_TOP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     BOTTOM_LEFT_TO_TOP_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     LEFT_TO_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     TOP_LEFT_TO_BOTTOM_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     TOP_START_TO_BOTTOM_END,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     START_TO_END,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     BOTTOM_START_TO_TOP_END,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     BOTTOM_END_TO_TOP_START,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     END_TO_START,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     TOP_END_TO_BOTTOM_START;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/components/element/ShapeElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */