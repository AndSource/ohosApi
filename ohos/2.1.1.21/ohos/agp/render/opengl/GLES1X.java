/*     */ package ohos.agp.render.opengl;public class GLES1X { public static final int GL_ACTIVE_TEXTURE = 34016; public static final int GL_ALWAYS = 519; public static final int GL_AMBIENT = 4608; public static final int GL_AMBIENT_AND_DIFFUSE = 5634; public static final int GL_ARRAY_BUFFER = 34962;
/*     */   public static final int GL_BACK = 1029;
/*     */   public static final int GL_BLEND = 3042;
/*     */   public static final int GL_CCW = 2305;
/*     */   public static final int GL_CLAMP_TO_EDGE = 33071;
/*     */   public static final int GL_COLOR_ATTACHMENT0 = 36064;
/*     */   public static final int GL_COLOR_BUFFER_BIT = 16384;
/*     */   public static final int GL_CONSTANT_ATTENUATION = 4615;
/*     */   public static final int GL_CULL_FACE = 2884;
/*     */   public static final int GL_CW = 2304;
/*     */   public static final int GL_DEPTH_ATTACHMENT = 36096;
/*     */   public static final int GL_DEPTH_BUFFER_BIT = 256;
/*     */   public static final int GL_DEPTH_TEST = 2929;
/*     */   public static final int GL_DIFFUSE = 4609;
/*     */   public static final int GL_EMISSION = 5632;
/*     */   public static final int GL_FLOAT = 5126;
/*     */   
/*     */   public GLES1X() {
/*  19 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_FOG_COLOR = 2918; public static final int GL_FOG_DENSITY = 2914; public static final int GL_FOG_END = 2916; public static final int GL_FOG_MODE = 2917; public static final int GL_FOG_START = 2915; public static final int GL_FRAMEBUFFER = 36160; public static final int GL_FRONT = 1028; public static final int GL_INVALID_VALUE = 1281; public static final int GL_LEQUAL = 515; public static final int GL_LESS = 513; public static final int GL_LIGHT_MODEL_AMBIENT = 2899; public static final int GL_LIGHT_MODEL_TWO_SIDE = 2898; public static final int GL_LINEAR = 9729; public static final int GL_LINEAR_ATTENUATION = 4616; public static final int GL_LINEAR_MIPMAP_LINEAR = 9987; public static final int GL_LINES = 1; public static final int GL_LINE_LOOP = 2; public static final int GL_LINE_STRIP = 3; public static final int GL_MAX_TEXTURE_SIZE = 3379; public static final int GL_NEAREST = 9728; public static final int GL_NICEST = 4354; public static final int GL_NO_ERROR = 0; public static final int GL_ONE = 1; public static final int GL_ONE_MINUS_SRC_ALPHA = 771; public static final int GL_POINTS = 0; public static final int GL_POSITION = 4611; public static final int GL_QUADRATIC_ATTENUATION = 4617; public static final int GL_RENDERER = 7937; public static final int GL_REPEAT = 10497; public static final int GL_REPLACE = 7681; public static final int GL_RGB = 6407; public static final int GL_RGBA = 6408; public static final int GL_SHININESS = 5633; public static final int GL_SPECULAR = 4610; public static final int GL_SPOT_CUTOFF = 4614; public static final int GL_SPOT_DIRECTION = 4612; public static final int GL_SPOT_EXPONENT = 4613; public static final int GL_SRC_ALPHA = 770; public static final int GL_STATIC_DRAW = 35044; public static final int GL_STENCIL_ATTACHMENT = 36128; public static final int GL_TEXTURE0 = 33984;
/*     */   public static final int GL_TEXTURE1 = 33985;
/*     */   
/*     */   public static void glClear(int mask) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_TEXTURE3 = 33987; public static final int GL_TEXTURE_2D = 3553; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073; public static final int GL_TEXTURE_MAG_FILTER = 10240; public static final int GL_TEXTURE_MIN_FILTER = 10241; public static final int GL_TEXTURE_WRAP_S = 10242; public static final int GL_TEXTURE_WRAP_T = 10243; public static final int GL_TRIANGLES = 4; public static final int GL_TRIANGLE_FAN = 6; public static final int GL_TRIANGLE_STRIP = 5; public static final int GL_TRUE = 1; public static final int GL_UNSIGNED_BYTE = 5121; public static final int GL_UNSIGNED_SHORT = 5123; public static final int GL_VENDOR = 7936; public static final int GL_VERSION = 7938;
/*     */   public static final int GL_ZERO = 0;
/*     */   
/*     */   public static void glClearColorx(int red, int green, int blue, int alpha) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthx(int depth) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearStencil(int s) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClientActiveTexture(int texture) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColor4x(int red, int green, int blue, int alpha) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorPointer(int size, int type, int stride, Buffer pointer) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, Buffer data) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int imageSize, Buffer data) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage2D(int target, int level, int xOffset, int yOffset, int x, int y, int width, int height) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCullFace(int mode) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthFunc(int func) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthMask(boolean flag) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthRangex(int near, int far) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDisable(int cap) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDisableClientState(int array) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawElements(int mode, int count, int type, Buffer indices) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnable(int cap) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFinish() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlush() {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogx(int pName, int param) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogxv(int pName, IntBuffer params) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrontFace(int mode) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrustumx(int left, int right, int bottom, int top, int near, int far) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetError() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetIntegerv(int pName, int[] params) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenTextures(int n, int[] textures) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnableClientState(int array) {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawArrays(int mode, int first, int count) {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteTextures(int n, int[] textures) {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glOrthof(float left, float right, float bottom, float top, float near, float far) {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightxv(int light, int pName, IntBuffer params) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidthx(int width) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadIdentity() {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixx(IntBuffer m) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLogicOp(int opcode) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialx(int face, int pName, int param) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialxv(int face, int pName, IntBuffer params) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMatrixMode(int mode) {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixx(IntBuffer m) {
/* 271 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultiTexCoord4x(int target, int s, int t, int r, int q) {
/* 277 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormal3x(int nx, int ny, int nz) {
/* 283 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormalPointer(int type, int stride, Buffer pointer) {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar) {
/* 295 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPixelStorei(int pName, int param) {
/* 301 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPointSizex(int size) {
/* 307 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffsetx(int factor, int units) {
/* 313 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPopMatrix() {
/* 319 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPushMatrix() {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
/* 331 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glRotatex(int angle, int x, int y, int z) {
/* 337 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoverage(float value, boolean invert) {
/* 343 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoveragex(int value, boolean invert) {
/* 349 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScalex(int x, int y, int z) {
/* 355 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScissor(int x, int y, int width, int height) {
/* 361 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShadeModel(int mode) {
/* 367 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFunc(int func, int ref, int mask) {
/* 373 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMask(int mask) {
/* 379 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilOp(int fail, int zfail, int zpass) {
/* 385 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexCoordPointer(int size, int type, int stride, Buffer pointer) {
/* 391 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvx(int target, int pName, int param) {
/* 397 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvxv(int target, int pName, IntBuffer params) {
/* 403 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels) {
/* 409 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterx(int target, int pName, int param) {
/* 415 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int type, Buffer pixels) {
/* 421 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTranslatex(int x, int y, int z) {
/* 427 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexPointer(int size, int type, int stride, Buffer pointer) {
/* 433 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glViewport(int x, int y, int width, int height) {
/* 439 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetString(int name) {
/* 445 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexEnvxv(int target, int pName, IntBuffer params) {
/* 451 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexParameteriv(int target, int pName, IntBuffer params) {
/* 457 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexParameterxv(int target, int pName, IntBuffer params) {
/* 463 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glHint(int target, int mode) {
/* 469 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsBuffer(int buffer) {
/* 475 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsEnabled(int cap) {
/* 481 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTexture(int texture) {
/* 487 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelx(int pName, int param) {
/* 493 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelxv(int pName, IntBuffer params) {
/* 499 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightx(int light, int pName, int param) {
/* 505 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthRangef(float near, float far) {
/* 511 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogf(int pName, float param) {
/* 517 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogfv(int pName, float[] params) {
/* 523 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrustumf(float left, float right, float bottom, float top, float near, float far) {
/* 529 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelf(int pName, float param) {
/* 535 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelfv(int pName, float[] params) {
/* 541 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightf(int light, int pName, float param) {
/* 547 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightfv(int light, int pName, float[] params) {
/* 553 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidth(float width) {
/* 559 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixf(float[] m) {
/* 565 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialf(int face, int pName, float param) {
/* 571 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialfv(int face, int pName, float[] params) {
/* 577 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixf(float[] m) {
/* 583 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
/* 589 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormal3f(float nx, float ny, float nz) {
/* 595 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPointSize(float size) {
/* 601 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffset(float factor, float units) {
/* 607 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glRotatef(float angle, float x, float y, float z) {
/* 613 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScalef(float x, float y, float z) {
/* 619 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvf(int target, int pName, float param) {
/* 625 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvfv(int target, int pName, float[] params) {
/* 631 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterf(int target, int pName, float param) {
/* 637 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTranslatef(float x, float y, float z) {
/* 643 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glActiveTexture(int texture) {
/* 649 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glAlphaFuncx(int func, int ref) {
/* 655 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindTexture(int target, int texture) {
/* 661 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendFunc(int sfactor, int dfactor) {
/* 667 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glAlphaFunc(int func, float ref) {
/* 673 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearColor(float red, float green, float blue, float alpha) {
/* 679 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthf(float depth) {
/* 685 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClipPlanef(int plane, float[] equation) {
/* 691 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColor4f(float red, float green, float blue, float alpha) {
/* 697 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBuffer(int target, int buffer) {
/* 703 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferData(int target, int size, Buffer data, int usage) {
/* 709 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferSubData(int target, int offset, int size, Buffer data) {
/* 715 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int n, IntBuffer buffers) {
/* 721 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, IntBuffer buffers) {
/* 727 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameteri(int target, int pName, int param) {
/* 733 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixf(FloatBuffer matrix) {
/* 739 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixf(FloatBuffer matrix) {
/* 745 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int number, int[] buffers, int offset) {
/* 751 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int number, int[] buffers, int offset) {
/* 757 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexCoordPointer(int size, int type, int stride, int offset) {
/* 763 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexPointer(int size, int type, int stride, int offset) {
/* 769 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindFramebufferOES(int target, int frameBuffer) {
/* 775 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glCheckFramebufferStatusOES(int target) {
/* 781 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteFramebuffersOES(int number, IntBuffer frameBuffers) {
/* 787 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level) {
/* 793 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenFramebuffersOES(int number, IntBuffer frameBuffers) {
/* 799 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEGLImageTargetTexture2DOES(int target, Buffer image) {
/* 805 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogxv(int pName, int[] params) {
/* 811 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelxv(int pName, int[] params) {
/* 817 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightxv(int light, int pName, int[] params) {
/* 823 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixx(int[] matrix) {
/* 829 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialxv(int face, int pName, int[] params) {
/* 835 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixx(int[] matrix) {
/* 841 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvxv(int target, int pName, int[] params) {
/* 847 */     throw new RuntimeException("Stub!");
/*     */   } }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/opengl/GLES1X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */