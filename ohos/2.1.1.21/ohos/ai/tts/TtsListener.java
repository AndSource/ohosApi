package ohos.ai.tts;

import ohos.utils.PacMap;

public interface TtsListener {
  void onStart(String paramString);
  
  void onProgress(String paramString, byte[] paramArrayOfbyte, int paramInt);
  
  void onFinish(String paramString);
  
  void onError(String paramString1, String paramString2);
  
  void onEvent(int paramInt, PacMap paramPacMap);
  
  void onSpeechStart(String paramString);
  
  void onSpeechProgressChanged(String paramString, int paramInt);
  
  void onSpeechFinish(String paramString);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ai/tts/TtsListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */