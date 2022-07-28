package ohos.agp.components;

import java.util.Collection;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.app.Context;
import ohos.event.intentagent.IntentAgent;
import ohos.media.image.PixelMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/ComponentProvider.class */
public class ComponentProvider implements Sequenceable {
    public static final int APPLY_TYPE_ACTIONS_ONLY = 2;
    public static final int APPLY_TYPE_LAYOUT_AND_ACTIONS = 1;

    public ComponentProvider() {
        throw new RuntimeException("Stub!");
    }

    public ComponentProvider(int layoutId, Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean setApplyType(int applyType) {
        throw new RuntimeException("Stub!");
    }

    public int getApplyType() {
        throw new RuntimeException("Stub!");
    }

    public void setDefaultBundleName(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public String getDefaultBundleName() {
        throw new RuntimeException("Stub!");
    }

    public boolean isValidComponentId(int componentId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public void inflateLayout(Context context) {
        throw new RuntimeException("Stub!");
    }

    public ComponentContainer getAllComponents() {
        throw new RuntimeException("Stub!");
    }

    public void applyAction(ComponentContainer root) {
        throw new RuntimeException("Stub!");
    }

    public Collection<Action> getActions() {
        throw new RuntimeException("Stub!");
    }

    public int getLayoutId() {
        throw new RuntimeException("Stub!");
    }

    public void mergeActions(Collection<Action> actions) {
        throw new RuntimeException("Stub!");
    }

    public Action setTextSize(int componentId, int size) {
        throw new RuntimeException("Stub!");
    }

    public Action setTextSize(int componentId, int size, Text.TextSizeType textSizeType) {
        throw new RuntimeException("Stub!");
    }

    public Action setTextColor(int componentId, Color color) {
        throw new RuntimeException("Stub!");
    }

    public Action setTextAlignment(int componentId, int textAlignment) {
        throw new RuntimeException("Stub!");
    }

    public Action setComponentContainerLayoutConfig(int componentId, ComponentContainer.LayoutConfig params) {
        throw new RuntimeException("Stub!");
    }

    public Action setVisibility(int componentId, int visibility) {
        throw new RuntimeException("Stub!");
    }

    public Action setProgressBar(int componentId, int max, int progress, boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }

    public Action setPadding(int componentId, int top, int bottom, int left, int right) {
        throw new RuntimeException("Stub!");
    }

    public Action setText(int componentId, String text) {
        throw new RuntimeException("Stub!");
    }

    public Action setAccessibilityDescription(int viewId, String description) {
        throw new RuntimeException("Stub!");
    }

    public void mergeAction(Action action) {
        throw new RuntimeException("Stub!");
    }

    public void resetActions() {
        throw new RuntimeException("Stub!");
    }

    public Action setInt(int viewId, String methodName, int value) {
        throw new RuntimeException("Stub!");
    }

    public Action setString(int componentId, String methodName, String value) {
        throw new RuntimeException("Stub!");
    }

    public Action setFloat(int componentId, String methodName, float value) {
        throw new RuntimeException("Stub!");
    }

    public Action setDouble(int componentId, String methodName, double value) {
        throw new RuntimeException("Stub!");
    }

    public Action setLong(int componentId, String methodName, long value) {
        throw new RuntimeException("Stub!");
    }

    public Action setBoolean(int componentId, String methodName, boolean value) {
        throw new RuntimeException("Stub!");
    }

    public Action setPixelMap(int componentId, String methodName, PixelMap value) {
        throw new RuntimeException("Stub!");
    }

    public Action setImagePixelMap(int componentId, PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public Action setImageContent(int componentId, int resId) {
        throw new RuntimeException("Stub!");
    }

    public Action setBackgroundPixelMap(int componentId, PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public Action setIntentAgent(int viewId, IntentAgent intent) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/ComponentProvider$Action.class */
    public static abstract class Action implements Sequenceable {
        public static final int MERGE_REPLACE = 0;
        public int viewId;

        public abstract void apply(ComponentContainer componentContainer) throws ComponentProviderException;

        public abstract int getActionTag();

        public Action() {
            throw new RuntimeException("Stub!");
        }

        public int mergeOperation() {
            throw new RuntimeException("Stub!");
        }

        public String getActionKey() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/ComponentProvider$ComponentProviderException.class */
    public static class ComponentProviderException extends RuntimeException {
        public ComponentProviderException(String message) {
            throw new RuntimeException("Stub!");
        }

        public ComponentProviderException(Throwable th) {
            throw new RuntimeException("Stub!");
        }
    }
}
