/*     */ package ohos.agp.render.opengl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EGL
/*     */ {
/*     */   public static final int EGL_ALPHA_SIZE = 12321;
/*     */   public static final int EGL_BAD_NATIVE_WINDOW = 12299;
/*     */   public static final int EGL_BLUE_SIZE = 12322;
/*     */   public static final int EGL_BUFFER_SIZE = 12320;
/*     */   public static final int EGL_COLOR_BUFFER_TYPE = 12351;
/*     */   public static final int EGL_DEFAULT_DISPLAY = 0;
/*     */   public static final int EGL_DEPTH_SIZE = 12325;
/*     */   public static final int EGL_GREEN_SIZE = 12323;
/*     */   public static final int EGL_HEIGHT = 12374;
/*     */   public static final int EGL_LEVEL = 12329;
/*     */   public static final int EGL_NONE = 12344;
/*     */   
/*     */   public EGL() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglChooseConfig(EGLDisplay display, int[] attributeList, EGLConfig[] configs, int configSize, int[] numConfig) {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLContext eglCreateContext(EGLDisplay display, EGLConfig config, EGLContext shareContext, int[] attribList) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLSurface eglCreateWindowSurface(EGLDisplay display, EGLConfig config, Object surface, int[] attribList) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglDestroyContext(EGLDisplay display, EGLContext context) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglDestroySurface(EGLDisplay display, EGLSurface surface) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLDisplay eglGetDisplay(long nativeDisplay) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglInitialize(EGLDisplay display, int[] majorVersion, int[] minorVersion) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw, EGLSurface read, EGLContext context) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglTerminate(EGLDisplay display) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public static int eglGetError() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLContext eglGetCurrentContext() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLDisplay eglGetCurrentDisplay() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLSurface eglGetCurrentSurface(int readDraw) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public static EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attribList) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean eglQuerySurface(EGLDisplay display, EGLSurface surface, int attribute, int[] value) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs, int config_size, int[] num_config) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglReleaseThread() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String eglQueryString(EGLDisplay display, int name) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglQueryContext(EGLDisplay display, EGLContext context, int attribute, int[] value) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config, int attribute, int[] value) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglBindAPI(int api) {
/*  95 */     throw new RuntimeException("Stub!");
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
/* 120 */   public static final EGLContext EGL_NO_CONTEXT = null;
/*     */ 
/*     */   
/* 123 */   public static final EGLDisplay EGL_NO_DISPLAY = null;
/*     */ 
/*     */   
/* 126 */   public static final EGLSurface EGL_NO_SURFACE = null;
/*     */   public static final int EGL_PBUFFER_BIT = 1;
/*     */   public static final int EGL_RED_SIZE = 12324;
/*     */   public static final int EGL_RENDERABLE_TYPE = 12352;
/*     */   public static final int EGL_RGB_BUFFER = 12430;
/*     */   public static final int EGL_STENCIL_SIZE = 12326;
/*     */   public static final int EGL_SUCCESS = 12288;
/*     */   public static final int EGL_SURFACE_TYPE = 12339;
/*     */   public static final int EGL_VERSION = 12372;
/*     */   public static final int EGL_WIDTH = 12375;
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/opengl/EGL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */