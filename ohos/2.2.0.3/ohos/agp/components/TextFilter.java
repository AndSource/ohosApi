/*    */ package ohos.agp.components;
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
/*    */ public abstract class TextFilter
/*    */ {
/*    */   public TextFilter() {
/* 24 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract FilterResults executeFiltering(CharSequence paramCharSequence);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract void publishFilterResults(CharSequence paramCharSequence, FilterResults paramFilterResults);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void filter(CharSequence constraint) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected static class FilterResults
/*    */   {
/*    */     public Object results;
/*    */ 
/*    */     
/*    */     public int size;
/*    */ 
/*    */ 
/*    */     
/*    */     public FilterResults() {
/* 69 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/components/TextFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */