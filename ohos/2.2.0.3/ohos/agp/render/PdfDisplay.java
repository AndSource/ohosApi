/*    */ package ohos.agp.render;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import ohos.media.image.PixelMap;
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
/*    */ public class PdfDisplay
/*    */   implements AutoCloseable
/*    */ {
/*    */   public PdfDisplay(FileInputStream fileInputStream) throws IOException {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Page openPage(int index) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPageCount() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public void close() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class Page
/*    */     implements AutoCloseable
/*    */   {
/*    */     Page(int index) {
/* 61 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public int getIndex() {
/* 70 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public int getWidth() {
/* 79 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public int getHeight() {
/* 88 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void show(PixelMap destPixelMap) {
/* 97 */       throw new RuntimeException("Stub!");
/*    */     } public void close() {
/* 99 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/PdfDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */