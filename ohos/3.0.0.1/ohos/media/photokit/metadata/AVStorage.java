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
/*  35 */     throw new RuntimeException("Stub!");
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
/*  46 */     throw new RuntimeException("Stub!");
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
/*  58 */     throw new RuntimeException("Stub!");
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
/*  69 */     throw new RuntimeException("Stub!");
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
/*  80 */     throw new RuntimeException("Stub!");
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
/*  93 */     throw new RuntimeException("Stub!");
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
/* 106 */     throw new RuntimeException("Stub!");
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
/* 117 */     throw new RuntimeException("Stub!");
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
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri fetchLoggerResource() {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 148 */   public static final Uri MEDIA_AUTH_HEAD_URI = null;
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
/* 234 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static String convertNameToKey(String name) {
/* 244 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Albums
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Albums() {
/* 254 */         throw new RuntimeException("Stub!");
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
/* 265 */         throw new RuntimeException("Stub!");
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
/* 277 */         throw new RuntimeException("Stub!");
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
/* 288 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Albums
/*     */       {
/*     */         Albums() {
/* 298 */           throw new RuntimeException("Stub!");
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
/* 311 */           throw new RuntimeException("Stub!");
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
/* 325 */         throw new RuntimeException("Stub!");
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
/* 336 */         throw new RuntimeException("Stub!");
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
/* 349 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 359 */           throw new RuntimeException("Stub!");
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
/* 372 */           throw new RuntimeException("Stub!");
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
/* 386 */         throw new RuntimeException("Stub!");
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
/*     */       
/*     */       public static Uri fetchResource(String volumeName, long id) {
/* 400 */         throw new RuntimeException("Stub!");
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
/* 411 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 420 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 429 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 441 */         throw new RuntimeException("Stub!");
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
/* 453 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 462 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 471 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final class Members
/*     */         implements AVStorage.AVBaseColumns
/*     */       {
/*     */         Members() {
/* 481 */           throw new RuntimeException("Stub!");
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
/* 494 */           throw new RuntimeException("Stub!");
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
/* 507 */           throw new RuntimeException("Stub!");
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
/* 523 */       throw new RuntimeException("Stub!");
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
/* 534 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 543 */     public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 552 */     public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 564 */       throw new RuntimeException("Stub!");
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
/* 575 */       throw new RuntimeException("Stub!");
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
/* 587 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 597 */         throw new RuntimeException("Stub!");
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
/* 608 */         throw new RuntimeException("Stub!");
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
/*     */       
/*     */       public static Uri fetchResource(String volumeName, long id) {
/* 622 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 631 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 640 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
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
/* 654 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Media
/*     */       implements AVStorage.AVBaseColumns
/*     */     {
/*     */       Media() {
/* 664 */         throw new RuntimeException("Stub!");
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
/* 675 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 684 */       public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 693 */       public static final Uri INTERNAL_DATA_ABILITY_URI = null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/photokit/metadata/AVStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */