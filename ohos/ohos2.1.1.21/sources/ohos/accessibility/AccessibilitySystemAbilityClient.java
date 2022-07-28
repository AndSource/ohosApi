package ohos.accessibility;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/accessibility/AccessibilitySystemAbilityClient.class */
public class AccessibilitySystemAbilityClient {
    public static final int CONTENT_CONTROLS = 4;
    public static final int CONTENT_ICONS = 1;
    public static final int CONTENT_TEXT = 2;

    AccessibilitySystemAbilityClient() {
        throw new RuntimeException("Stub!");
    }

    public static AccessibilitySystemAbilityClient getInstance(Context abilityContext) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendEvent(int eventType, int viewId) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendEvent(AccessibilityEventInfo eventInfo) {
        throw new RuntimeException("Stub!");
    }

    public List<AccessibilityAbilityInfo> getAbilityList(int accessibilityAbilityTypes, int stateType) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean subscribeStateObserver(AccessibilityStateObserver observer, int eventType) {
        throw new RuntimeException("Stub!");
    }

    public boolean unSubscribeStateObserver(AccessibilityStateObserver observer, int eventType) {
        throw new RuntimeException("Stub!");
    }

    public boolean unsubscribeStateObserver(AccessibilityStateObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAccessibilityCaptionEnabled() {
        throw new RuntimeException("Stub!");
    }

    public CaptionProperties getAccessibilityCaptionProperties() {
        throw new RuntimeException("Stub!");
    }

    public int getSuggestedInterval(int timeout, int contentType) {
        throw new RuntimeException("Stub!");
    }
}
