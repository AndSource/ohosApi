package ohos.agp.components.listcomponent;

import ohos.agp.components.Component;
import ohos.agp.components.ListComponent;
import ohos.agp.render.Canvas;
import ohos.agp.utils.Rect;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ListAdornment.class */
public abstract class ListAdornment {
    protected long mNativePtr = 0;

    public ListAdornment() {
        throw new RuntimeException("Stub!");
    }

    public long getNativePtr() {
        throw new RuntimeException("Stub!");
    }

    protected void createNativePtr() {
        throw new RuntimeException("Stub!");
    }

    public void beforeDrawCallback(Canvas canvas, ListComponent parent, ListState uiState) {
        throw new RuntimeException("Stub!");
    }

    public void afterDrawCallback(Canvas canvas, ListComponent parent, ListState uiState) {
        throw new RuntimeException("Stub!");
    }

    public void getItemDeltas(Rect rect, Component component, ListComponent parent, ListState uiState) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/listcomponent/ListAdornment$ListAdornmentCleaner.class */
    protected static class ListAdornmentCleaner {
        ListAdornmentCleaner(long nativePtr) {
            throw new RuntimeException("Stub!");
        }

        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
