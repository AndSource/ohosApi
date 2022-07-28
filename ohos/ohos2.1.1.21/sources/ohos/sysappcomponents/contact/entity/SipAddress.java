package ohos.sysappcomponents.contact.entity;

import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/sysappcomponents/contact/entity/SipAddress.class */
public class SipAddress {
    public static final int CUSTOM_LABEL = 0;
    public static final int INVALID_LABEL_ID = -1;
    public static final int SIP_HOME = 0;
    public static final int SIP_OTHER = 0;
    public static final int SIP_WORK = 0;

    public SipAddress(Context context, String sipAddress, int labelId) {
        throw new RuntimeException("Stub!");
    }

    public SipAddress(String sipAddress, String customLabelName) {
        throw new RuntimeException("Stub!");
    }

    public String getSipAddress() {
        throw new RuntimeException("Stub!");
    }

    public void setSipAddress(String sipAddress) {
        throw new RuntimeException("Stub!");
    }

    public void setCustomLabelName(String labelName) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public void setLabelId(Context context, int labelId) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public String getLabelName() {
        throw new RuntimeException("Stub!");
    }
}
