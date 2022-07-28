package ohos.media.photokit.metadata;

import java.util.Set;
import ohos.aafwk.ability.DataAbilityHelper;
import ohos.app.Context;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage.class */
public final class AVStorage {
    public static final Uri MEDIA_AUTH_HEAD_URI = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$AVBaseColumns.class */
    public interface AVBaseColumns {
        public static final String DATA = "_data";
        public static final String DATE_ADDED = "date_added";
        public static final String DATE_MODIFIED = "date_modified";
        public static final String DISPLAY_NAME = "_display_name";
        public static final String DURATION = "duration";
        public static final String ID = "_id";
        public static final String MIME_TYPE = "mime_type";
        public static final String OUTPUT = "output";
        public static final String SIZE = "_size";
        public static final String TITLE = "title";
        public static final String VOLUME_NAME = "volume_name";
    }

    AVStorage() {
        throw new RuntimeException("Stub!");
    }

    public static Uri appendPendingResource(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static Uri appendRequireOriginalResource(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static String fetchVolumeName(Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static Set<String> fetchExternalVolumeNames(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static Uri fetchMediaResource(Context context, Uri documentUri) {
        throw new RuntimeException("Stub!");
    }

    public static Uri fetchDocumentResource(Context context, Uri mediaUri) {
        throw new RuntimeException("Stub!");
    }

    public static String fetchVersion(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String fetchVersion(Context context, String volumeName) {
        throw new RuntimeException("Stub!");
    }

    public static Uri fetchLoggerResource() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio.class */
    public static final class Audio {
        Audio() {
            throw new RuntimeException("Stub!");
        }

        public static String convertNameToKey(String name) {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Albums.class */
        public static final class Albums implements AVBaseColumns {
            Albums() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Artists.class */
        public static final class Artists implements AVBaseColumns {
            Artists() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }

            /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Artists$Albums.class */
            public static final class Albums {
                Albums() {
                    throw new RuntimeException("Stub!");
                }

                public static Uri fetchResource(String volumeName, long id) {
                    throw new RuntimeException("Stub!");
                }
            }
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Genres.class */
        public static final class Genres implements AVBaseColumns {
            Genres() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResourceForAudioId(String volumeName, int audioId) {
                throw new RuntimeException("Stub!");
            }

            /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Genres$Members.class */
            public static final class Members implements AVBaseColumns {
                Members() {
                    throw new RuntimeException("Stub!");
                }

                public static Uri fetchResource(String volumeName, long genreId) {
                    throw new RuntimeException("Stub!");
                }
            }
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Media.class */
        public static final class Media implements AVBaseColumns {
            public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
            public static final Uri INTERNAL_DATA_ABILITY_URI = null;

            Media() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Playlists.class */
        public static final class Playlists implements AVBaseColumns {
            public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
            public static final Uri INTERNAL_DATA_ABILITY_URI = null;

            Playlists() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }

            /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Audio$Playlists$Members.class */
            public static final class Members implements AVBaseColumns {
                Members() {
                    throw new RuntimeException("Stub!");
                }

                public static Uri fetchResource(String volumeName, long playlistId) {
                    throw new RuntimeException("Stub!");
                }

                public static boolean updatePlaylistItem(DataAbilityHelper dataAbilityHelper, long playlistId, int oldLocation, int newLocation) {
                    throw new RuntimeException("Stub!");
                }
            }
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Downloads.class */
    public static final class Downloads implements AVBaseColumns {
        public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
        public static final Uri INTERNAL_DATA_ABILITY_URI = null;

        Downloads() {
            throw new RuntimeException("Stub!");
        }

        public static Uri fetchResource(String volumeName) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Files.class */
    public static final class Files {
        Files() {
            throw new RuntimeException("Stub!");
        }

        public static Uri fetchResource(String volumeName) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Images.class */
    public static final class Images {
        Images() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Images$Media.class */
        public static final class Media implements AVBaseColumns {
            public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
            public static final Uri INTERNAL_DATA_ABILITY_URI = null;

            Media() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Video.class */
    public static final class Video {
        Video() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVStorage$Video$Media.class */
        public static final class Media implements AVBaseColumns {
            public static final Uri EXTERNAL_DATA_ABILITY_URI = null;
            public static final Uri INTERNAL_DATA_ABILITY_URI = null;

            Media() {
                throw new RuntimeException("Stub!");
            }

            public static Uri fetchResource(String volumeName) {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
