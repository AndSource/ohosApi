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
/*     */ public final class AVStorage
/*     */ {
/*     */   AVStorage() {
/*  25 */     throw new RuntimeException("Stub!");
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
/*  36 */     throw new RuntimeException("Stub!");
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
/*  48 */     throw new RuntimeException("Stub!");
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
/*  59 */     throw new RuntimeException("Stub!");
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
/*  70 */     throw new RuntimeException("Stub!");
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
/*  83 */     throw new RuntimeException("Stub!");
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
/*  96 */     throw new RuntimeException("Stub!");
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
/* 107 */     throw new RuntimeException("Stub!");
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
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri fetchLoggerResource() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 138 */   public static final Uri MEDIA_AUTH_HEAD_URI = null;
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
/* 224 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static String convertNameToKey(String name) {
/* 234 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Albums
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Albums() {
/* 244 */         throw new RuntimeException("Stub!");
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
/* 255 */         throw new RuntimeException("Stub!");
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
/* 267 */         throw new RuntimeException("Stub!");
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
/* 278 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Albums
/*     */       {
/*     */         Albums() {
/* 288 */           throw new RuntimeException("Stub!");
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
/* 301 */           throw new RuntimeException("Stub!");
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
/* 315 */         throw new RuntimeException("Stub!");
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
/* 326 */         throw new RuntimeException("Stub!");
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
/* 339 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 349 */           throw new RuntimeException("Stub!");
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
/* 362 */           throw new RuntimeException("Stub!");
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
/* 376 */         throw new RuntimeException("Stub!");
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
/* 387 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 396 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 405 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 417 */         throw new RuntimeException("Stub!");
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
/* 429 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 438 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 447 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 457 */           throw new RuntimeException("Stub!");
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
/* 470 */           throw new RuntimeException("Stub!");
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
/* 483 */           throw new RuntimeException("Stub!");
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
/* 499 */       throw new RuntimeException("Stub!");
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
/* 510 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 519 */     public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 528 */     public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 540 */       throw new RuntimeException("Stub!");
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
/* 552 */       throw new RuntimeException("Stub!");
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
/* 564 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 574 */         throw new RuntimeException("Stub!");
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
/* 585 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 594 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 603 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 617 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 627 */         throw new RuntimeException("Stub!");
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
/* 638 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 647 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 656 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/photokit/metadata/AVStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */