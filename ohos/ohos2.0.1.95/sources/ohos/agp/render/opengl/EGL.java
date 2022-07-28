package ohos.agp.render.opengl;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/opengl/EGL.class */
public class EGL {
    public static final int EGL_ALPHA_SIZE = 12321;
    public static final int EGL_BAD_NATIVE_WINDOW = 12299;
    public static final int EGL_BLUE_SIZE = 12322;
    public static final int EGL_BUFFER_SIZE = 12320;
    public static final int EGL_COLOR_BUFFER_TYPE = 12351;
    public static final int EGL_DEFAULT_DISPLAY = 0;
    public static final int EGL_DEPTH_SIZE = 12325;
    public static final int EGL_GREEN_SIZE = 12323;
    public static final int EGL_HEIGHT = 12374;
    public static final int EGL_LEVEL = 12329;
    public static final int EGL_NONE = 12344;
    public static final EGLContext EGL_NO_CONTEXT = null;
    public static final EGLDisplay EGL_NO_DISPLAY = null;
    public static final EGLSurface EGL_NO_SURFACE = null;
    public static final int EGL_PBUFFER_BIT = 1;
    public static final int EGL_RED_SIZE = 12324;
    public static final int EGL_RENDERABLE_TYPE = 12352;
    public static final int EGL_RGB_BUFFER = 12430;
    public static final int EGL_STENCIL_SIZE = 12326;
    public static final int EGL_SUCCESS = 12288;
    public static final int EGL_SURFACE_TYPE = 12339;
    public static final int EGL_VERSION = 12372;
    public static final int EGL_WIDTH = 12375;

    public EGL() {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglChooseConfig(EGLDisplay display, int[] attributeList, EGLConfig[] configs, int configSize, int[] numConfig) {
        throw new RuntimeException("Stub!");
    }

    public static EGLContext eglCreateContext(EGLDisplay display, EGLConfig config, EGLContext shareContext, int[] attribList) {
        throw new RuntimeException("Stub!");
    }

    public static EGLSurface eglCreateWindowSurface(EGLDisplay display, EGLConfig config, Object surface, int[] attribList) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglDestroyContext(EGLDisplay display, EGLContext context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglDestroySurface(EGLDisplay display, EGLSurface surface) {
        throw new RuntimeException("Stub!");
    }

    public static EGLDisplay eglGetDisplay(long nativeDisplay) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglInitialize(EGLDisplay display, int[] majorVersion, int[] minorVersion) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglMakeCurrent(EGLDisplay display, EGLSurface draw, EGLSurface read, EGLContext context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglSwapBuffers(EGLDisplay display, EGLSurface surface) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglTerminate(EGLDisplay display) {
        throw new RuntimeException("Stub!");
    }

    public static int eglGetError() {
        throw new RuntimeException("Stub!");
    }

    public static EGLContext eglGetCurrentContext() {
        throw new RuntimeException("Stub!");
    }

    public static EGLDisplay eglGetCurrentDisplay() {
        throw new RuntimeException("Stub!");
    }

    public static EGLSurface eglGetCurrentSurface(int readDraw) {
        throw new RuntimeException("Stub!");
    }

    public static EGLSurface eglCreatePbufferSurface(EGLDisplay display, EGLConfig config, int[] attribList) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglQuerySurface(EGLDisplay display, EGLSurface surface, int attribute, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglGetConfigs(EGLDisplay display, EGLConfig[] configs, int config_size, int[] num_config) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglReleaseThread() {
        throw new RuntimeException("Stub!");
    }

    public static String eglQueryString(EGLDisplay display, int name) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglQueryContext(EGLDisplay display, EGLContext context, int attribute, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglGetConfigAttrib(EGLDisplay display, EGLConfig config, int attribute, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static boolean eglBindAPI(int api) {
        throw new RuntimeException("Stub!");
    }
}
