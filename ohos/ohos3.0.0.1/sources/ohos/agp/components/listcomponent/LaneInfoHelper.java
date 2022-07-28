package ohos.agp.components.listcomponent;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/LaneInfoHelper.class */
public abstract class LaneInfoHelper {
    protected long mNativePtr = 0;

    public abstract int getLaneCountAt(int i);

    public LaneInfoHelper() {
        throw new RuntimeException("Stub!");
    }

    public int getLaneIndex(int position, int laneCount) {
        throw new RuntimeException("Stub!");
    }

    public int getLaneSetIndex(int providerPosition, int laneCount) {
        throw new RuntimeException("Stub!");
    }

    public void setLaneIndexCacheAllowed(boolean cacheLaneIndices) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLaneIndexCacheAllowed() {
        throw new RuntimeException("Stub!");
    }

    public void setLaneGroupIndexCacheAllowed(boolean cacheLaneGroupIndices) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLaneSetIndexCacheAllowed() {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/LaneInfoHelper$LaneInfoHelperCleaner.class */
    protected static class LaneInfoHelperCleaner {
        LaneInfoHelperCleaner(long nativePtr) {
            throw new RuntimeException("Stub!");
        }

        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
