/*     */ package ohos.agp.render.opengl;
/*     */ import java.nio.IntBuffer;
/*     */ 
/*     */ public class GLES1X {
/*     */   public static final int GL_ACTIVE_TEXTURE = 34016;
/*     */   public static final int GL_ALWAYS = 519;
/*     */   public static final int GL_AMBIENT = 4608;
/*     */   public static final int GL_AMBIENT_AND_DIFFUSE = 5634;
/*     */   public static final int GL_ARRAY_BUFFER = 34962;
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
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_FOG_COLOR = 2918; public static final int GL_FOG_DENSITY = 2914; public static final int GL_FOG_END = 2916; public static final int GL_FOG_MODE = 2917; public static final int GL_FOG_START = 2915; public static final int GL_FRAMEBUFFER = 36160; public static final int GL_FRONT = 1028; public static final int GL_INVALID_VALUE = 1281; public static final int GL_LEQUAL = 515; public static final int GL_LESS = 513; public static final int GL_LIGHT_MODEL_AMBIENT = 2899; public static final int GL_LIGHT_MODEL_TWO_SIDE = 2898; public static final int GL_LINEAR = 9729; public static final int GL_LINEAR_ATTENUATION = 4616; public static final int GL_LINEAR_MIPMAP_LINEAR = 9987; public static final int GL_LINES = 1; public static final int GL_LINE_LOOP = 2; public static final int GL_LINE_STRIP = 3; public static final int GL_MAX_TEXTURE_SIZE = 3379; public static final int GL_NEAREST = 9728; public static final int GL_NICEST = 4354; public static final int GL_NO_ERROR = 0; public static final int GL_ONE = 1; public static final int GL_ONE_MINUS_SRC_ALPHA = 771; public static final int GL_POINTS = 0; public static final int GL_POSITION = 4611; public static final int GL_QUADRATIC_ATTENUATION = 4617; public static final int GL_RENDERER = 7937; public static final int GL_REPEAT = 10497; public static final int GL_REPLACE = 7681; public static final int GL_RGB = 6407; public static final int GL_RGBA = 6408; public static final int GL_SHININESS = 5633; public static final int GL_SPECULAR = 4610; public static final int GL_SPOT_CUTOFF = 4614; public static final int GL_SPOT_DIRECTION = 4612; public static final int GL_SPOT_EXPONENT = 4613; public static final int GL_SRC_ALPHA = 770; public static final int GL_STATIC_DRAW = 35044; public static final int GL_STENCIL_ATTACHMENT = 36128; public static final int GL_TEXTURE0 = 33984;
/*     */   public static final int GL_TEXTURE1 = 33985;
/*     */   
/*     */   public static void glClear(int mask) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_TEXTURE3 = 33987; public static final int GL_TEXTURE_2D = 3553; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072; public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071; public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073; public static final int GL_TEXTURE_MAG_FILTER = 10240; public static final int GL_TEXTURE_MIN_FILTER = 10241; public static final int GL_TEXTURE_WRAP_S = 10242; public static final int GL_TEXTURE_WRAP_T = 10243; public static final int GL_TRIANGLES = 4; public static final int GL_TRIANGLE_FAN = 6; public static final int GL_TRIANGLE_STRIP = 5; public static final int GL_TRUE = 1; public static final int GL_UNSIGNED_BYTE = 5121; public static final int GL_UNSIGNED_SHORT = 5123; public static final int GL_VENDOR = 7936; public static final int GL_VERSION = 7938;
/*     */   public static final int GL_ZERO = 0;
/*     */   
/*     */   public static void glClearColorx(int red, int green, int blue, int alpha) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthx(int depth) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearStencil(int s) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClientActiveTexture(int texture) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColor4x(int red, int green, int blue, int alpha) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorPointer(int size, int type, int stride, Buffer pointer) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, Buffer data) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int imageSize, Buffer data) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage2D(int target, int level, int xOffset, int yOffset, int x, int y, int width, int height) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCullFace(int mode) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthFunc(int func) {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthMask(boolean flag) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthRangex(int near, int far) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDisable(int cap) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDisableClientState(int array) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawElements(int mode, int count, int type, Buffer indices) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnable(int cap) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFinish() {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlush() {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogx(int pName, int param) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogxv(int pName, IntBuffer params) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrontFace(int mode) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrustumx(int left, int right, int bottom, int top, int near, int far) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetError() {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetIntegerv(int pName, int[] params) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenTextures(int n, int[] textures) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnableClientState(int array) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawArrays(int mode, int first, int count) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteTextures(int n, int[] textures) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glOrthof(float left, float right, float bottom, float top, float near, float far) {
/* 225 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightxv(int light, int pName, IntBuffer params) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidthx(int width) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadIdentity() {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixx(IntBuffer m) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLogicOp(int opcode) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialx(int face, int pName, int param) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialxv(int face, int pName, IntBuffer params) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMatrixMode(int mode) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixx(IntBuffer m) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultiTexCoord4x(int target, int s, int t, int r, int q) {
/* 285 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormal3x(int nx, int ny, int nz) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormalPointer(int type, int stride, Buffer pointer) {
/* 297 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar) {
/* 303 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPixelStorei(int pName, int param) {
/* 309 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPointSizex(int size) {
/* 315 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffsetx(int factor, int units) {
/* 321 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPopMatrix() {
/* 327 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPushMatrix() {
/* 333 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
/* 339 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glRotatex(int angle, int x, int y, int z) {
/* 345 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoverage(float value, boolean invert) {
/* 351 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoveragex(int value, boolean invert) {
/* 357 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScalex(int x, int y, int z) {
/* 363 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScissor(int x, int y, int width, int height) {
/* 369 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShadeModel(int mode) {
/* 375 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFunc(int func, int ref, int mask) {
/* 381 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMask(int mask) {
/* 387 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilOp(int fail, int zfail, int zpass) {
/* 393 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexCoordPointer(int size, int type, int stride, Buffer pointer) {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvx(int target, int pName, int param) {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvxv(int target, int pName, IntBuffer params) {
/* 411 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels) {
/* 417 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterx(int target, int pName, int param) {
/* 423 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int type, Buffer pixels) {
/* 429 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTranslatex(int x, int y, int z) {
/* 435 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexPointer(int size, int type, int stride, Buffer pointer) {
/* 441 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glViewport(int x, int y, int width, int height) {
/* 447 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetString(int name) {
/* 453 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexEnvxv(int target, int pName, IntBuffer params) {
/* 459 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexParameteriv(int target, int pName, IntBuffer params) {
/* 465 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTexParameterxv(int target, int pName, IntBuffer params) {
/* 471 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glHint(int target, int mode) {
/* 477 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsBuffer(int buffer) {
/* 483 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsEnabled(int cap) {
/* 489 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTexture(int texture) {
/* 495 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelx(int pName, int param) {
/* 501 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelxv(int pName, IntBuffer params) {
/* 507 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightx(int light, int pName, int param) {
/* 513 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthRangef(float near, float far) {
/* 519 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogf(int pName, float param) {
/* 525 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogfv(int pName, float[] params) {
/* 531 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFrustumf(float left, float right, float bottom, float top, float near, float far) {
/* 537 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelf(int pName, float param) {
/* 543 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelfv(int pName, float[] params) {
/* 549 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightf(int light, int pName, float param) {
/* 555 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightfv(int light, int pName, float[] params) {
/* 561 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidth(float width) {
/* 567 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixf(float[] m) {
/* 573 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialf(int face, int pName, float param) {
/* 579 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialfv(int face, int pName, float[] params) {
/* 585 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixf(float[] m) {
/* 591 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
/* 597 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glNormal3f(float nx, float ny, float nz) {
/* 603 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPointSize(float size) {
/* 609 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffset(float factor, float units) {
/* 615 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glRotatef(float angle, float x, float y, float z) {
/* 621 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScalef(float x, float y, float z) {
/* 627 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvf(int target, int pName, float param) {
/* 633 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvfv(int target, int pName, float[] params) {
/* 639 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterf(int target, int pName, float param) {
/* 645 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTranslatef(float x, float y, float z) {
/* 651 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glActiveTexture(int texture) {
/* 657 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glAlphaFuncx(int func, int ref) {
/* 663 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindTexture(int target, int texture) {
/* 669 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendFunc(int sfactor, int dfactor) {
/* 675 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glAlphaFunc(int func, float ref) {
/* 681 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearColor(float red, float green, float blue, float alpha) {
/* 687 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthf(float depth) {
/* 693 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClipPlanef(int plane, float[] equation) {
/* 699 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColor4f(float red, float green, float blue, float alpha) {
/* 705 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBuffer(int target, int buffer) {
/* 711 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferData(int target, int size, Buffer data, int usage) {
/* 717 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferSubData(int target, int offset, int size, Buffer data) {
/* 723 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int n, IntBuffer buffers) {
/* 729 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, IntBuffer buffers) {
/* 735 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameteri(int target, int pName, int param) {
/* 741 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixf(FloatBuffer matrix) {
/* 747 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixf(FloatBuffer matrix) {
/* 753 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int number, int[] buffers, int offset) {
/* 759 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int number, int[] buffers, int offset) {
/* 765 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexCoordPointer(int size, int type, int stride, int offset) {
/* 771 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexPointer(int size, int type, int stride, int offset) {
/* 777 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindFramebufferOES(int target, int frameBuffer) {
/* 783 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glCheckFramebufferStatusOES(int target) {
/* 789 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteFramebuffersOES(int number, IntBuffer frameBuffers) {
/* 795 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level) {
/* 801 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenFramebuffersOES(int number, IntBuffer frameBuffers) {
/* 807 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEGLImageTargetTexture2DOES(int target, Buffer image) {
/* 813 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFogxv(int pName, int[] params) {
/* 819 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightModelxv(int pName, int[] params) {
/* 825 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLightxv(int light, int pName, int[] params) {
/* 831 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLoadMatrixx(int[] matrix) {
/* 837 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMaterialxv(int face, int pName, int[] params) {
/* 843 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMultMatrixx(int[] matrix) {
/* 849 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexEnvxv(int target, int pName, int[] params) {
/* 855 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/opengl/GLES1X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */