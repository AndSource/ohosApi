package ohos.telephony;

import ohos.agp.components.Text;

/* loaded from: ohos2.2.0.3.jar:ohos/telephony/PhoneNumberFormattingTextObserver.class */
public class PhoneNumberFormattingTextObserver implements Text.TextObserver {
    public PhoneNumberFormattingTextObserver(String countryCode) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Text.TextObserver
    public void onTextUpdated(String phoneNumber, int start, int before, int count) {
        throw new RuntimeException("Stub!");
    }

    public String getPhoneNumberAfterFormat() {
        throw new RuntimeException("Stub!");
    }
}
