package ohos.bundle;

import java.util.List;
import java.util.Map;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/bundle/FormInfo.class */
public class FormInfo implements Sequenceable {
    public static final Sequenceable.Producer<FormInfo> PRODUCER = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/bundle/FormInfo$FormType.class */
    public enum FormType {
        JAVA,
        JS
    }

    public FormInfo() {
        throw new RuntimeException("Stub!");
    }

    public FormInfo(FormInfo source) {
        throw new RuntimeException("Stub!");
    }

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public String getOriginalBundleName() {
        throw new RuntimeException("Stub!");
    }

    public String getModuleName() {
        throw new RuntimeException("Stub!");
    }

    public String getAbilityName() {
        throw new RuntimeException("Stub!");
    }

    public String getFormName() {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public boolean getFormVisibleNotify() {
        throw new RuntimeException("Stub!");
    }

    public FormType getType() {
        throw new RuntimeException("Stub!");
    }

    public String getColorMode() {
        throw new RuntimeException("Stub!");
    }

    public String getJsComponentName() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getDeepLink() {
        throw new RuntimeException("Stub!");
    }

    public String getFormConfigAbility() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDefaultForm() {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultDimension() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getSupportDimensions() {
        throw new RuntimeException("Stub!");
    }

    public Map<String, String> getCustomizeDatas() {
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

    /* loaded from: ohos2.2.0.3.jar:ohos/bundle/FormInfo$CustomizeData.class */
    public class CustomizeData {
        public CustomizeData() {
            throw new RuntimeException("Stub!");
        }
    }
}
