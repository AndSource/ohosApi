package ohos.data.preferences;

import java.util.Map;
import java.util.Set;

public interface Preferences {
  public static final int MAX_KEY_LENGTH = 80;
  
  public static final int MAX_VALUE_LENGTH = 8192;
  
  int getInt(String paramString, int paramInt);
  
  String getString(String paramString1, String paramString2);
  
  boolean getBoolean(String paramString, boolean paramBoolean);
  
  float getFloat(String paramString, float paramFloat);
  
  long getLong(String paramString, long paramLong);
  
  Set<String> getStringSet(String paramString, Set<String> paramSet);
  
  Map<String, ?> getAll();
  
  Preferences putInt(String paramString, int paramInt);
  
  Preferences putString(String paramString1, String paramString2);
  
  Preferences putBoolean(String paramString, boolean paramBoolean);
  
  Preferences putLong(String paramString, long paramLong);
  
  Preferences putFloat(String paramString, float paramFloat);
  
  Preferences putStringSet(String paramString, Set<String> paramSet);
  
  Preferences delete(String paramString);
  
  Preferences clear();
  
  void flush();
  
  boolean flushSync();
  
  boolean hasKey(String paramString);
  
  void registerObserver(PreferencesObserver paramPreferencesObserver);
  
  void unregisterObserver(PreferencesObserver paramPreferencesObserver);
  
  public static interface PreferencesObserver {
    void onChange(Preferences param1Preferences, String param1String);
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/data/preferences/Preferences.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */