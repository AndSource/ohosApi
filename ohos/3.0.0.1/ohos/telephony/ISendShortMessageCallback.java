package ohos.telephony;

public interface ISendShortMessageCallback {
  public static final int SEND_SMS_FAILURE_RADIO_OFF = 2;
  
  public static final int SEND_SMS_FAILURE_SERVICE_UNAVAILABLE = 3;
  
  public static final int SEND_SMS_FAILURE_UNKNOWN = 1;
  
  public static final int SEND_SMS_SUCCESS = 0;
  
  void sendShortMessageResult(int paramInt, String paramString, boolean paramBoolean);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/telephony/ISendShortMessageCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */