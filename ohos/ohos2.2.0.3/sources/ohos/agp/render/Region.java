package ohos.agp.render;

import ohos.agp.utils.Rect;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Region.class */
public class Region {
    public Region() {
        throw new RuntimeException("Stub!");
    }

    public Region(Region srcRegion) {
        throw new RuntimeException("Stub!");
    }

    public Region(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public final boolean union(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public Rect getBounds() {
        throw new RuntimeException("Stub!");
    }

    public boolean getBounds(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public Path getBoundaryPath() {
        throw new RuntimeException("Stub!");
    }

    public boolean getBoundaryPath(Path path) {
        throw new RuntimeException("Stub!");
    }

    public boolean op(Region regionA, Region regionB, Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean op(Rect rect, Region region, Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean op(Region region, Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean op(int left, int top, int right, int bottom, Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean op(Rect rect, Op op) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(Region region) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public boolean setRect(Rect r) {
        throw new RuntimeException("Stub!");
    }

    public boolean setRegion(Region region) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRect() {
        throw new RuntimeException("Stub!");
    }

    public boolean isComplex() {
        throw new RuntimeException("Stub!");
    }

    public boolean setPath(Path path, Region clip) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickContains(Rect r) {
        throw new RuntimeException("Stub!");
    }

    public void translate(int dx, int dy, Region dst) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Region$Op.class */
    public enum Op {
        DIFFERENCE,
        INTERSECT,
        UNION,
        XOR,
        REVERSE_DIFFERENCE,
        REPLACE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
