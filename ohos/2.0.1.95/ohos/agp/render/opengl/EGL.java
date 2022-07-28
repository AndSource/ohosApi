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
/*     */   public static boolean eglChooseConfig(EGLDisplay display, int[] attributeList, EGLConfig[] configs, int configSize, int[] numConfig) {
/*  45 */     throw new RuntimeException("Stub!");
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
/*     */   public static EGLContext eglCreateContext(EGLDisplay display, EGLConfig config, EGLContext shareContext, int[] attribList) {
/*  61 */     throw new RuntimeException("Stub!");
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
/*     */   public static EGLSurface eglCreateWindowSurface(EGLDisplay display, EGLConfig config, Object surface, int[] attribList) {
/*  77 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglDestroyContext(EGLDisplay display, EGLContext context) {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglDestroySurface(EGLDisplay display, EGLSurface surface) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static EGLDisplay eglGetDisplay(long nativeDisplay) {
/* 111 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglInitialize(EGLDisplay display, int[] majorVersion, int[] minorVersion) {
/* 124 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw, EGLSurface read, EGLContext context) {
/* 138 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglTerminate(EGLDisplay display) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int eglGetError() {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static EGLContext eglGetCurrentContext() {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static EGLDisplay eglGetCurrentDisplay() {
/* 186 */     throw new RuntimeException("Stub!");
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
/*     */   public static EGLSurface eglGetCurrentSurface(int readDraw) {
/* 198 */     throw new RuntimeException("Stub!");
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
/*     */   public static EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attribList) {
/* 213 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglQuerySurface(EGLDisplay display, EGLSurface surface, int attribute, int[] value) {
/* 228 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs, int config_size, int[] num_config) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean eglReleaseThread() {
/* 253 */     throw new RuntimeException("Stub!");
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
/*     */   public static String eglQueryString(EGLDisplay display, int name) {
/* 266 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglQueryContext(EGLDisplay display, EGLContext context, int attribute, int[] value) {
/* 281 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config, int attribute, int[] value) {
/* 296 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean eglBindAPI(int api) {
/* 308 */     throw new RuntimeException("Stub!");
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
/* 382 */   public static final EGLContext EGL_NO_CONTEXT = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 389 */   public static final EGLDisplay EGL_NO_DISPLAY = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 396 */   public static final EGLSurface EGL_NO_SURFACE = null;
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


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/opengl/EGL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */