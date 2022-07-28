/*    */ package ohos.thermallistener;
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
/*    */ public interface ThermalConnection
/*    */ {
/*    */   void thermalStatusChanged(ThermalSeverityLevel paramThermalSeverityLevel);
/*    */   
/*    */   default void thermalServiceDied() {
/* 47 */     throw new RuntimeException("Stub!");
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
/*    */   public enum ThermalSeverityLevel
/*    */   {
/* 60 */     COOL,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 65 */     WARM,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 70 */     HOT,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 76 */     OVERHEATED,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 81 */     WARNING,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 87 */     EMERGENCY;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/thermallistener/ThermalConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */