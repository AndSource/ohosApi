package ohos.ai.asr;

import ohos.utils.PacMap;

public interface AsrListener {
  void onInit(PacMap paramPacMap);
  
  void onBeginningOfSpeech();
  
  void onRmsChanged(float paramFloat);
  
  void onBufferReceived(byte[] paramArrayOfbyte);
  
  void onEndOfSpeech();
  
  void onError(int paramInt);
  
  void onResults(PacMap paramPacMap);
  
  void onIntermediateResults(PacMap paramPacMap);
  
  void onEnd();
  
  void onEvent(int paramInt, PacMap paramPacMap);
  
  void onAudioStart();
  
  void onAudioEnd();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/ai/asr/AsrListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */