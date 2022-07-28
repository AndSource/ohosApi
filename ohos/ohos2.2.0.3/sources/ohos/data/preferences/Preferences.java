package ohos.data.preferences;

import java.util.Map;
import java.util.Set;

/* loaded from: ohos2.2.0.3.jar:ohos/data/preferences/Preferences.class */
public interface Preferences {
    public static final int MAX_KEY_LENGTH = 80;
    public static final int MAX_VALUE_LENGTH = 8192;

    /* loaded from: ohos2.2.0.3.jar:ohos/data/preferences/Preferences$PreferencesObserver.class */
    public interface PreferencesObserver {
        void onChange(Preferences preferences, String str);
    }

    int getInt(String str, int i);

    String getString(String str, String str2);

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f);

    long getLong(String str, long j);

    Set<String> getStringSet(String str, Set<String> set);

    Map<String, ?> getAll();

    Preferences putInt(String str, int i);

    Preferences putString(String str, String str2);

    Preferences putBoolean(String str, boolean z);

    Preferences putLong(String str, long j);

    Preferences putFloat(String str, float f);

    Preferences putStringSet(String str, Set<String> set);

    Preferences delete(String str);

    Preferences clear();

    void flush();

    boolean flushSync();

    boolean hasKey(String str);

    void registerObserver(PreferencesObserver preferencesObserver);

    void unregisterObserver(PreferencesObserver preferencesObserver);
}
