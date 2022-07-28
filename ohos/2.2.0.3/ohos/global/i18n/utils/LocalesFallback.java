/*    */ package ohos.global.i18n.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import ohos.global.resource.LocaleFallBackException;
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
/*    */ public abstract class LocalesFallback
/*    */ {
/*    */   public LocalesFallback() {
/* 21 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static LocalesFallback getInstance() throws LocaleFallBackException {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract ArrayList<String> findValidAndSort(String paramString, List<String> paramList) throws LocaleFallBackException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/i18n/utils/LocalesFallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */