package ohos.miscservices.wallpaper;

import java.io.FileDescriptor;
import java.io.InputStream;
import ohos.agp.components.element.Element;
import ohos.agp.utils.Rect;
import ohos.app.Context;
import ohos.media.image.PixelMap;

/* loaded from: ohos2.0.1.95.jar:ohos/miscservices/wallpaper/WallpaperController.class */
public class WallpaperController {
    public static final int WALLPAPER_LOCK = 2;
    public static final int WALLPAPER_SYSTEM = 1;

    WallpaperController(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static WallpaperController getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void registerColorsChangedListener(IWallpaperColorsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterColorsChangedListener(IWallpaperColorsChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public int getMinHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }

    public boolean isChangePermitted() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOperationAllowed() {
        throw new RuntimeException("Stub!");
    }

    public int getId(int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public void setWallpaper(PixelMap pixelMap, int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public void setWallpaper(InputStream inputStream, int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor getFile(int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public void reset(int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public void setPadding(Rect padding) {
        throw new RuntimeException("Stub!");
    }

    public WallpaperColorsCollection getColors(int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public Element getDefaultElement(int outWidth, int outHeight, boolean scaleToFit, float horizontalAlignment, float verticalAlignment, int wallpaperType) {
        throw new RuntimeException("Stub!");
    }

    public Element getElement() {
        throw new RuntimeException("Stub!");
    }
}
