/*     */ package ohos.sysappcomponents.calendar;
/*     */ 
/*     */ import java.security.InvalidParameterException;
/*     */ import ohos.aafwk.ability.DataAbilityHelper;
/*     */ import ohos.aafwk.ability.DataAbilityRemoteException;
/*     */ import ohos.app.Context;
/*     */ import ohos.data.dataability.DataAbilityPredicates;
/*     */ import ohos.data.rdb.ValuesBucket;
/*     */ import ohos.sysappcomponents.calendar.entity.CalendarEntity;
/*     */ import ohos.sysappcomponents.calendar.support.TableSupport;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CalendarDataHelper
/*     */ {
/*     */   CalendarDataHelper(DataAbilityHelper dataAbilityHelper, TableSupport tableSupport) {
/*  21 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CalendarDataHelper creator(Context context, Class<? extends CalendarEntity> entityClass) throws InvalidParameterException {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CalendarCollection query(DataAbilityPredicates predicates, String[] columns) throws DataAbilityRemoteException {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public CalendarCollection query(int id, String[] columns) throws DataAbilityRemoteException {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean insert(ValuesBucket valuesBucket) throws DataAbilityRemoteException {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public boolean update(ValuesBucket valuesBucket, DataAbilityPredicates predicates) throws DataAbilityRemoteException {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int delete(DataAbilityPredicates predicates) throws DataAbilityRemoteException {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean delete(CalendarEntity entity) throws DataAbilityRemoteException {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean delete(int id) throws DataAbilityRemoteException {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean release() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InstancesDataHelper getInstanceDataHelper() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class InstancesDataHelper
/*     */   {
/*     */     InstancesDataHelper() {
/* 151 */       throw new RuntimeException("Stub!");
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
/*     */     public CalendarCollection query(DataAbilityPredicates predicates, String[] columns, long begin, long end) throws DataAbilityRemoteException {
/* 167 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean release() {
/* 175 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/sysappcomponents/calendar/CalendarDataHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */