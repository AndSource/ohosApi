package ohos.agp.window.service;

import ohos.agp.utils.Point;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/window/service/Display.class */
public class Display {
    public static final int STATE_DOZE = 3;
    public static final int STATE_DOZE_SUSPEND = 4;
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 2;
    public static final int STATE_ON_SUSPEND = 6;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_VR = 5;

    public Display() {
        throw new RuntimeException("Stub!");
    }

    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }

    public String getDisplayName() {
        throw new RuntimeException("Stub!");
    }

    public int getRotation() {
        throw new RuntimeException("Stub!");
    }

    public DisplayAttributes getAttributes() {
        throw new RuntimeException("Stub!");
    }

    public DisplayAttributes getRealAttributes() {
        throw new RuntimeException("Stub!");
    }

    public void getCurrentSizeRange(Point outSmallestSize, Point outLargestSize) {
        throw new RuntimeException("Stub!");
    }

    public void getSize(Point outSize) {
        throw new RuntimeException("Stub!");
    }

    public void getRealSize(Point outSize) {
        throw new RuntimeException("Stub!");
    }

    public float getRefreshRate() {
        throw new RuntimeException("Stub!");
    }

    public int getDisplayState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAlive() {
        throw new RuntimeException("Stub!");
    }
}
