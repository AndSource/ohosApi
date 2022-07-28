package ohos.usb;

import java.util.HashMap;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/usb/USBCore.class */
public class USBCore {
    public static final String ACTION_USB_DEVICE_ATTACHED = "ohos.usb.action.USB_DEVICE_ATTACHED";
    public static final String ACTION_USB_DEVICE_DETACHED = "ohos.usb.action.USB_DEVICE_DETACHED";
    public static final String EXTRA_DEVICE = "device";
    public static final String EXTRA_PERMISSION_GRANTED = "permission";

    public USBCore(Context context) {
        throw new RuntimeException("Stub!");
    }

    public HashMap<String, USBDevice> getDevices() {
        throw new RuntimeException("Stub!");
    }

    public USBDevicePipe connectDevice(USBDevice device) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasRight(USBDevice device) {
        throw new RuntimeException("Stub!");
    }

    public void requestRight(USBDevice device, String intentName) {
        throw new RuntimeException("Stub!");
    }

    public static String usbFunctionsToString(long functions) {
        throw new RuntimeException("Stub!");
    }

    public static long usbFunctionsFromString(String functions) {
        throw new RuntimeException("Stub!");
    }
}
