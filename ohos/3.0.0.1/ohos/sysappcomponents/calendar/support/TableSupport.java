/*    */ package ohos.sysappcomponents.calendar.support;
/*    */ 
/*    */ import ohos.data.dataability.DataAbilityPredicates;
/*    */ import ohos.data.rdb.ValuesBucket;
/*    */ import ohos.sysappcomponents.calendar.entity.CalendarEntity;
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
/*    */ public abstract class TableSupport
/*    */ {
/*    */   TableSupport(Class<? extends CalendarEntity> entityClass, Uri dataAbilityUri) {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Uri getUri() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Uri getSyncUri(String accName, String accType) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract Rule getRule();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract ValuesBucket getValueBucket(CalendarEntity paramCalendarEntity);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract DataAbilityPredicates getPredicate(int paramInt);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract void initColumnMap();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public DataAbilityPredicates getPredicate(CalendarEntity entity) {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/sysappcomponents/calendar/support/TableSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */