package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/PickFilesParams.class */
public interface PickFilesParams {
    public static final int TYPE_OPEN_MULTIPLE_FILES = 3;
    public static final int TYPE_OPEN_NOT_EXIST = 1;
    public static final int TYPE_OPEN_SINGLE_FILE = 2;

    String[] getMimeTypes();

    String getDefaultName();

    int getType();

    CharSequence getTitle();

    boolean isLiveMedia();
}
