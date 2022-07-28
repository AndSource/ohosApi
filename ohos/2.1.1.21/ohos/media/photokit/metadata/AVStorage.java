/*     */ package ohos.media.photokit.metadata;
/*     */ 
/*     */ import java.util.Set;
/*     */ import ohos.aafwk.ability.DataAbilityHelper;
/*     */ import ohos.app.Context;
/*     */ import ohos.utils.net.Uri;
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
/*     */ public final class AVStorage
/*     */ {
/*     */   AVStorage() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri appendPendingResource(Uri uri) {
/*  38 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri appendRequireOriginalResource(Uri uri) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String fetchVolumeName(Uri uri) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Set<String> fetchExternalVolumeNames(Context context) {
/*  72 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri fetchMediaResource(Context context, Uri documentUri) {
/*  85 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri fetchDocumentResource(Context context, Uri mediaUri) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String fetchVersion(Context context) {
/* 109 */     throw new RuntimeException("Stub!");
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
/*     */   public static String fetchVersion(Context context, String volumeName) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri fetchLoggerResource() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 140 */   public static final Uri MEDIA_AUTH_HEAD_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface AVBaseColumns
/*     */   {
/*     */     public static final String DATA = "_data";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String DATE_ADDED = "date_added";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String DATE_MODIFIED = "date_modified";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String DISPLAY_NAME = "_display_name";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String DURATION = "duration";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String ID = "_id";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String MIME_TYPE = "mime_type";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String OUTPUT = "output";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String SIZE = "_size";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String TITLE = "title";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String VOLUME_NAME = "volume_name";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Audio
/*     */   {
/*     */     Audio() {
/* 226 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static String convertNameToKey(String name) {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Albums
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Albums() {
/* 246 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 257 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Artists
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Artists() {
/* 269 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 280 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Albums
/*     */       {
/*     */         Albums() {
/* 290 */           throw new RuntimeException("Stub!");
/*     */         }
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
/*     */         public static Uri fetchResource(String volumeName, long id) {
/* 303 */           throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Genres
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Genres() {
/* 317 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 328 */         throw new RuntimeException("Stub!");
/*     */       }
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
/*     */       public static Uri fetchResourceForAudioId(String volumeName, int audioId) {
/* 341 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 351 */           throw new RuntimeException("Stub!");
/*     */         }
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
/*     */         public static Uri fetchResource(String volumeName, long genreId) {
/* 364 */           throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 378 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 389 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 398 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 407 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Playlists
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Playlists() {
/* 419 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 431 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 440 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 449 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 459 */           throw new RuntimeException("Stub!");
/*     */         }
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
/*     */         public static Uri fetchResource(String volumeName, long playlistId) {
/* 472 */           throw new RuntimeException("Stub!");
/*     */         }
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
/*     */         public static boolean updatePlaylistItem(DataAbilityHelper dataAbilityHelper, long playlistId, int oldLocation, int newLocation) {
/* 485 */           throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Downloads
/*     */     implements AVBaseColumns
/*     */   {
/*     */     Downloads() {
/* 501 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static Uri fetchResource(String volumeName) {
/* 512 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 521 */     public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 530 */     public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Files
/*     */   {
/*     */     Files() {
/* 542 */       throw new RuntimeException("Stub!");
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
/*     */     public static Uri fetchResource(String volumeName) {
/* 554 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Images
/*     */   {
/*     */     Images() {
/* 566 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 576 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 587 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 596 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 605 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/*     */   public static final class Video
/*     */   {
/*     */     Video() {
/* 619 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 629 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static Uri fetchResource(String volumeName) {
/* 640 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 649 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 658 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/photokit/metadata/AVStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */