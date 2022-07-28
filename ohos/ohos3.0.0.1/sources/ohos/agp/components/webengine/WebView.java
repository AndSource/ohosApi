package ohos.agp.components.webengine;

import ohos.agp.colors.RgbColor;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.app.Context;
import ohos.media.image.PixelMap;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/WebView.class */
public class WebView extends Component {
    public WebView(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public WebView(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setKeyEventListener(Component.KeyEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public Component.KeyEventListener getKeyEventListener() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setTouchEventListener(Component.TouchEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public Component.TouchEventListener getTouchEventListener() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setFocusChangedListener(Component.FocusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setWebViewBackground(RgbColor rgbColor) {
        throw new RuntimeException("Stub!");
    }

    public void load(String url) {
        throw new RuntimeException("Stub!");
    }

    public void load(String data, String mimeType, boolean isBase64Encoded) {
        throw new RuntimeException("Stub!");
    }

    public void load(String data, String mimeType, String encodingName, String baseUrl, String virtualUrl) {
        throw new RuntimeException("Stub!");
    }

    public void reload() {
        throw new RuntimeException("Stub!");
    }

    public String getFirstRequestUrl() {
        throw new RuntimeException("Stub!");
    }

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public void onInactive() {
        throw new RuntimeException("Stub!");
    }

    public void onActive() {
        throw new RuntimeException("Stub!");
    }

    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    public void executeJs(String jsContent, AsyncCallback<String> callback) {
        throw new RuntimeException("Stub!");
    }

    public void addJsCallback(String name, JsCallback jsCallBack) {
        throw new RuntimeException("Stub!");
    }

    public void removeJsCallback(String name) {
        throw new RuntimeException("Stub!");
    }

    public void stopLoading() {
        throw new RuntimeException("Stub!");
    }

    public int getProgress() {
        throw new RuntimeException("Stub!");
    }

    public void post(String url, byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public void doFling(int horizonalVelocity, int verticalVelocity) {
        throw new RuntimeException("Stub!");
    }

    public int getWebPageHeight() {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getFavicon() {
        throw new RuntimeException("Stub!");
    }

    public String getCurrentUrl() {
        throw new RuntimeException("Stub!");
    }

    public boolean pageDown(boolean isToBottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean pageUp(boolean isToTop) {
        throw new RuntimeException("Stub!");
    }

    public void clearMemoryCache() {
        throw new RuntimeException("Stub!");
    }

    public void clearAllCache() {
        throw new RuntimeException("Stub!");
    }

    public void notifyJsOnline(boolean isOnline) {
        throw new RuntimeException("Stub!");
    }

    public boolean canScroll(int direction, int distance) {
        throw new RuntimeException("Stub!");
    }

    public void inactivateGlobalTimers() {
        throw new RuntimeException("Stub!");
    }

    public void activateGlobalTimers() {
        throw new RuntimeException("Stub!");
    }

    public WebConfig getWebConfig() {
        throw new RuntimeException("Stub!");
    }

    public Navigator getNavigator() {
        throw new RuntimeException("Stub!");
    }

    public ScaleController getScaleController() {
        throw new RuntimeException("Stub!");
    }

    public FontConfig getFontConfig() {
        throw new RuntimeException("Stub!");
    }

    public void setWebAgent(WebAgent webAgent) {
        throw new RuntimeException("Stub!");
    }

    public void setBrowserAgent(BrowserAgent browserAgent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setVisibility(int visibility) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public boolean requestFocus() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public boolean executeLongClick() {
        throw new RuntimeException("Stub!");
    }
}
