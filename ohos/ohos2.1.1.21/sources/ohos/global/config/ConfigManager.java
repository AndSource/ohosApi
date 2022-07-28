package ohos.global.config;

import ohos.global.resource.AccessDeniedException;
import ohos.global.resource.NotExistException;
import ohos.global.resource.WrongTypeException;

/* loaded from: ohos2.1.1.21.jar:ohos/global/config/ConfigManager.class */
public abstract class ConfigManager {
    public abstract boolean getBoolean(ConfigType configType) throws AccessDeniedException, NotExistException, WrongTypeException;

    public abstract String getString(ConfigType configType) throws AccessDeniedException, NotExistException, WrongTypeException;

    public ConfigManager() {
        throw new RuntimeException("Stub!");
    }
}
