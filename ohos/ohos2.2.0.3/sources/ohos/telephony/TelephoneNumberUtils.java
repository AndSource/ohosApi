package ohos.telephony;

/* loaded from: ohos2.2.0.3.jar:ohos/telephony/TelephoneNumberUtils.class */
public class TelephoneNumberUtils {
    public static final int BCD_EXT_TYPE_CALLED_PARTY = 2;
    public static final int BCD_EXT_TYPE_EF_ADN = 1;
    public static final int INTERNATIONAL_TON_VALUE = 9;
    public static final char PAUSE = ',';
    public static final int UNKNOWN_TON_VALUE = 8;
    public static final char WAIT = ';';
    public static final char WILD = 'N';

    public TelephoneNumberUtils() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public static boolean isDialTwelveKey(char input) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDialableDtmfKey(char input) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDialableKey(char input) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isUriPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isInternationalPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isLatinDigit(char input) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isNotSeparator(char input) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isReallyDialableKey(char input) {
        throw new RuntimeException("Stub!");
    }

    public static String convertCalledPartyBCDToStringWithTOA(byte[] data, int offset, int calledPartyBCDNumberLength, int bcdExtendedType) {
        throw new RuntimeException("Stub!");
    }

    public static String convertCalledPartyBCDToStringWithoutTOA(byte[] data, int offset, int calledPartyBCDNumberLength, int bcdExtendedType) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isEmergencyPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isLocalEmergencyPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String formatPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String formatPhoneNumber(String phoneNumber, String defaultCountryCode) {
        throw new RuntimeException("Stub!");
    }

    public static String formatPhoneNumber(String phoneNumber, String phoneNumberE164, String defaultCountryCode) {
        throw new RuntimeException("Stub!");
    }

    public static String formatPhoneNumberToE164(String phoneNumber, String defaultCountryCode) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isVoiceMailNumber(String phoneNumber, int slotId) {
        throw new RuntimeException("Stub!");
    }

    public static String removeSeparators(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isSuitableSmsAddress(String address) {
        throw new RuntimeException("Stub!");
    }

    public static String normalizePhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static boolean comparePhoneNumbers(String phoneNumberA, String phoneNumberB) {
        throw new RuntimeException("Stub!");
    }

    public static String changeKeypadLettersToDigits(String data) {
        throw new RuntimeException("Stub!");
    }

    public static String extractNetworkAddressPortion(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String extractNetworkAddressPortionPlus(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String extractPostDialPortion(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String convertPhoneNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }

    public static String getCountryIsoFromDbNumber(String phoneNumber) {
        throw new RuntimeException("Stub!");
    }
}
