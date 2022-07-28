package ohos.global.i18n.utils;

import java.util.ArrayList;
import java.util.List;
import ohos.global.resource.LocaleFallBackException;

/* loaded from: ohos2.0.1.95.jar:ohos/global/i18n/utils/LocalesFallback.class */
public abstract class LocalesFallback {
    public abstract ArrayList<String> findValidAndSort(String str, List<String> list) throws LocaleFallBackException;

    public LocalesFallback() {
        throw new RuntimeException("Stub!");
    }

    public static LocalesFallback getInstance() throws LocaleFallBackException {
        throw new RuntimeException("Stub!");
    }
}
