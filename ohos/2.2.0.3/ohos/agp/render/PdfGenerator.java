/*     */ package ohos.agp.render;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import ohos.agp.utils.Rect;
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
/*     */ public class PdfGenerator
/*     */ {
/*     */   public PdfGenerator() {
/*  28 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PdfPage beginDrawing(PageInfo pageInfo) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void endDrawing(PdfPage pdfPage) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeTo(OutputStream stream) throws IOException {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class PageInfo
/*     */   {
/*     */     PageInfo() {
/*  77 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getPageWidth() {
/*  86 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getPageHeight() {
/*  95 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Rect getRect() {
/* 104 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getPageIndex() {
/* 112 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public static final class Builder
/*     */     {
/*     */       public Builder(int width, int height, int number) {
/* 131 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public PdfGenerator.PageInfo create() {
/* 140 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder setRect(Rect contentRect) {
/* 150 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class PdfPage
/*     */   {
/*     */     PdfPage(PdfGenerator.PageInfo pageInfo, Canvas canvas) {
/* 164 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Canvas getCanvas() {
/* 173 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public PdfGenerator.PageInfo getPageInfo() {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/PdfGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */