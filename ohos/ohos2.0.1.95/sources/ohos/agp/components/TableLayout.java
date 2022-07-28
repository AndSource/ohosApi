package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TableLayout.class */
public class TableLayout extends ComponentContainer {
    public static final int ALIGN_CONTENTS = 1;
    public static final int ALIGN_EDGES = 0;
    public static final int DEFAULT = Integer.MIN_VALUE;

    public TableLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TableLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TableLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setColumnCount(int columnCount) {
        throw new RuntimeException("Stub!");
    }

    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }

    public void setRowCount(int rowCount) {
        throw new RuntimeException("Stub!");
    }

    public int getRowCount() {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setAlignmentType(int alignmentType) {
        throw new RuntimeException("Stub!");
    }

    public int getAlignmentType() {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(float weight) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start, float weight) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start, int size) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start, int size, float weight) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start, int size, int alignment) {
        throw new RuntimeException("Stub!");
    }

    public static Specification specification(int start, int size, int alignment, float weight) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TableLayout$CellSpan.class */
    public static final class CellSpan {
        public final int max = 0;
        public final int min = 0;

        public CellSpan(int min, int max) {
            throw new RuntimeException("Stub!");
        }

        protected int size() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TableLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public Specification columnSpec;
        public Specification rowSpec;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Specification rowSpec, Specification columnSpec) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(ComponentContainer.LayoutConfig params) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TableLayout$Specification.class */
    public static class Specification {
        public final int alignment = 0;
        public final CellSpan span = null;
        public final boolean startDefined = false;
        public final float weight = 0.0f;

        Specification(boolean startDefined, CellSpan span, int alignment, float weight) {
            throw new RuntimeException("Stub!");
        }

        public int getMinSpan() {
            throw new RuntimeException("Stub!");
        }

        public int getMaxSpan() {
            throw new RuntimeException("Stub!");
        }
    }
}
