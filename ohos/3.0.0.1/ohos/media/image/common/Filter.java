/*    */ package ohos.media.image.common;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import ohos.media.image.ImageSource;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Filter
/*    */ {
/*    */   public Filter() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Filter restore();
/*    */   
/*    */   public abstract long applyToSource(ImageSource paramImageSource) throws IOException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/image/common/Filter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */