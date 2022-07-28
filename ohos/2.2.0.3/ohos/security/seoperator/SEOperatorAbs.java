/*    */ package ohos.security.seoperator;
/*    */ 
/*    */ import java.util.Map;
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
/*    */ public abstract class SEOperatorAbs
/*    */ {
/*    */   public static final int INIT_ERROR = -100;
/*    */   
/*    */   public SEOperatorAbs() {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int checkEligibility(String paramString);
/*    */   
/*    */   public abstract int syncSeInfo(String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract int createSSD(String paramString1, String paramString2, String paramString3, String paramString4);
/*    */   
/*    */   public abstract int deleteSSD(String paramString1, String paramString2, String paramString3, String paramString4);
/*    */   
/*    */   public abstract int commonExecute(String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract String getCplc(String paramString);
/*    */   
/*    */   public abstract boolean isEnable(String paramString1, String paramString2);
/*    */   
/*    */   public abstract int setEnable(String paramString1, String paramString2, boolean paramBoolean);
/*    */   
/*    */   public abstract String[] getLastErrorInfo(String paramString);
/*    */   
/*    */   public abstract int setConfig(String paramString, Map<String, String> paramMap);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/security/seoperator/SEOperatorAbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */