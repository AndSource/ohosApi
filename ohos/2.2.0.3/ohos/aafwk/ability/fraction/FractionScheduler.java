/*    */ package ohos.aafwk.ability.fraction;
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
/*    */ public abstract class FractionScheduler
/*    */ {
/*    */   public FractionScheduler() {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract FractionScheduler add(int paramInt, Fraction paramFraction);
/*    */   
/*    */   public abstract FractionScheduler add(int paramInt, Fraction paramFraction, String paramString);
/*    */   
/*    */   public abstract FractionScheduler replace(int paramInt, Fraction paramFraction);
/*    */   
/*    */   public abstract FractionScheduler remove(Fraction paramFraction);
/*    */   
/*    */   public abstract FractionScheduler hide(Fraction paramFraction);
/*    */   
/*    */   public abstract FractionScheduler show(Fraction paramFraction);
/*    */   
/*    */   public abstract int submit();
/*    */   
/*    */   public abstract FractionScheduler pushIntoStack(String paramString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/aafwk/ability/fraction/FractionScheduler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */