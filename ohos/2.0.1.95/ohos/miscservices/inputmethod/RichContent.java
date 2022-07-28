/*    */ package ohos.miscservices.inputmethod;
/*    */ 
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
/*    */ import ohos.utils.net.Uri;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RichContent
/*    */   implements Sequenceable
/*    */ {
/*    */   public RichContent(Uri contentUri, Uri linkUri, String[] mimeTypes, String contentDescription) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Uri getDataUri() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Uri getLinkUri() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String[] getMimeTypes() {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDataDetail() {
/* 84 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel out) {
/* 86 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel in) {
/* 88 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 95 */   public static final Sequenceable.Producer<RichContent> PRODUCER = null;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/miscservices/inputmethod/RichContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */