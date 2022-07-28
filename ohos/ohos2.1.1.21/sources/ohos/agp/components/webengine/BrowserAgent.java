package ohos.agp.components.webengine;

import ohos.agp.components.webengine.LocationAccessController;
import ohos.app.Context;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/webengine/BrowserAgent.class */
public class BrowserAgent {
    public BrowserAgent(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void onTitleUpdated(WebView webView, String value) {
        throw new RuntimeException("Stub!");
    }

    public void onProgressUpdated(WebView webView, int newValue) {
        throw new RuntimeException("Stub!");
    }

    public boolean onJsMessageShow(WebView webView, String url, String message, boolean isAlert, JsMessageResult result) {
        throw new RuntimeException("Stub!");
    }

    public boolean onJsTextInput(WebView webView, String url, String message, String defaultInput, JsTextInputResult result) {
        throw new RuntimeException("Stub!");
    }

    public void onLocationApiAccessRequest(String origin, LocationAccessController.Response response) {
        throw new RuntimeException("Stub!");
    }

    public void onLocationApiAccessCancel() {
        throw new RuntimeException("Stub!");
    }

    public boolean onPickFiles(WebView webView, AsyncCallback<Uri[]> urisCallback, PickFilesParams params) {
        throw new RuntimeException("Stub!");
    }
}
