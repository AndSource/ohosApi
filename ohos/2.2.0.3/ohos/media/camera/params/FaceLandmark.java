/*    */ package ohos.media.camera.params;
/*    */ 
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import ohos.agp.utils.Point;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FaceLandmark
/*    */ {
/*    */   public FaceLandmark(int type, Point position) {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getType() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Point getPosition() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public boolean equals(Object obj) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   } public int hashCode() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface FaceLandmarkType {
/*    */     public static final int LEFT_EYE = 0;
/*    */     public static final int MOUTH_CENTER = 2;
/*    */     public static final int RIGHT_EYE = 1;
/*    */     public static final int TYPE_UNKNOWN = -1;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/params/FaceLandmark.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */