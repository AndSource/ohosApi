/*     */ package ohos.hiviewdfx;
/*     */ 
/*     */ import java.util.Map;
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
/*     */ public class HiAppEvent
/*     */ {
/*     */   public static final String DISABLE = "disable";
/*     */   public static final String MAX_STORAGE = "max_storage";
/*     */   
/*     */   public HiAppEvent() {
/*  39 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public static int write(String eventName, EventType type, Object... keyValues) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public static int write(String eventName, EventType type, Map<String, Object> keyValues) {
/*  81 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean configure(String name, String value) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class Event
/*     */   {
/*     */     public static final String DISTRIBUTED_SERVICE_START = "hiappevent.distributed_service_start";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String USER_LOGIN = "hiappevent.user_login";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String USER_LOGOUT = "hiappevent.user_logout";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Event() {
/* 120 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public enum EventType
/*     */   {
/* 155 */     FAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     STATISTIC,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     SECURITY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     BEHAVIOR;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected int type() {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public class Param
/*     */   {
/*     */     public static final String DISTRIBUTED_SERVICE_INSTANCE_ID = "ds_instance_id";
/*     */     public static final String DISTRIBUTED_SERVICE_NAME = "ds_name";
/*     */     public static final String USER_ID = "user_id";
/*     */     
/*     */     Param() {
/* 197 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/hiviewdfx/HiAppEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */