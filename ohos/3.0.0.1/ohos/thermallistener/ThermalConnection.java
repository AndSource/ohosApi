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
/* 57 */     throw new RuntimeException("Stub!");
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
/* 70 */     COOL,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     WARM,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 80 */     HOT,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 86 */     OVERHEATED,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 91 */     WARNING,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 97 */     EMERGENCY;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/thermallistener/ThermalConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */