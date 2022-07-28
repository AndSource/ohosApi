/*     */ package ohos.media.tubecore;
/*     */ 
/*     */ import java.util.Optional;
/*     */ import ohos.app.Context;
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
/*     */ public class AVTubeManager
/*     */ {
/*     */   AVTubeManager(Context context) {
/*  22 */     throw new RuntimeException("Stub!");
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
/*     */   public static AVTubeManager getInstance(Context context) {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AVTube defaultTube() {
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
/*     */   public Optional<AVTube> getTubeByIndex(int index) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int tubeNumber() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<AVTube> tubeInUse(int usageScenes) {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */   public void useTube(AVTube tube, int usageScenes) {
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
/*     */ 
/*     */   
/*     */   public void addTubeObserver(TubeObserver observer, int usageScenes, int flags) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeTubeObserver(TubeObserver observer) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<AVTube.SetInfo> createTubeSet(String name) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<AVTube.SetInfo> createTubeSet(int nameResId) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<AVTubeEx> createAVTubeEx(AVTube.SetInfo setInfo) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void insertAVTubeEx(AVTubeEx avTubeEx) {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static interface TubeObserver {
/*     */     void onTubeEnterWorkingState(AVTubeManager param1AVTubeManager, AVTube param1AVTube, int param1Int);
/*     */     void onTubeExitWorkingState(AVTubeManager param1AVTubeManager, AVTube param1AVTube, int param1Int);
/*     */     void onTubeInsert(AVTubeManager param1AVTubeManager, AVTube param1AVTube);
/*     */     void onTubeDelete(AVTubeManager param1AVTubeManager, AVTube param1AVTube);
/*     */     void onTubeUpdate(AVTubeManager param1AVTubeManager, AVTube param1AVTube); }
/*     */   public void deleteAVTubeEx(AVTubeEx avTubeEx) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ObserverFlag
/*     */   {
/*     */     ObserverFlag() {
/* 170 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int IGNORE_FILTER = 2;
/*     */     public static final int NO_FLAG = 0;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/tubecore/AVTubeManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */