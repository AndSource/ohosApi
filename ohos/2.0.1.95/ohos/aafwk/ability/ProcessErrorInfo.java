/*     */ package ohos.aafwk.ability;
/*     */ 
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.Sequenceable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ProcessErrorInfo
/*     */   implements Sequenceable
/*     */ {
/*     */   public static final int CRASHED = 1;
/*     */   public static final int NOT_RESPONDING = 2;
/*     */   public static final int NO_ERROR = 0;
/*     */   
/*     */   public ProcessErrorInfo() {
/*  22 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCondition() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProcessName() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPid() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getUid() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTag() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getShortMsg() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLongMsg() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStackTrace() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 108 */     throw new RuntimeException("Stub!");
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
/*     */   
/* 141 */   public static final Sequenceable.Producer<ProcessErrorInfo> PRODUCER = null;
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/aafwk/ability/ProcessErrorInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */