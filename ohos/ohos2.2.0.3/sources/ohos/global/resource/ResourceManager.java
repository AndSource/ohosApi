package ohos.global.resource;

import java.io.IOException;
import java.util.List;
import ohos.global.config.ConfigManager;
import ohos.global.configuration.Configuration;
import ohos.global.configuration.DeviceCapability;
import ohos.global.resource.solidxml.Pattern;
import ohos.global.resource.solidxml.SolidXml;
import ohos.global.resource.solidxml.Theme;
import ohos.global.resource.solidxml.TypedAttribute;

/* loaded from: ohos2.2.0.3.jar:ohos/global/resource/ResourceManager.class */
public abstract class ResourceManager {
    public abstract Resource getResource(int i) throws IOException, NotExistException;

    public abstract String getIdentifier(int i) throws IOException, NotExistException;

    public abstract Element getElement(int i) throws IOException, NotExistException, WrongTypeException;

    @Deprecated
    public abstract Theme getTheme(int i) throws IOException, NotExistException, WrongTypeException;

    public abstract SolidXml getSolidXml(int i) throws IOException, NotExistException, WrongTypeException;

    public abstract RawFileEntry getRawFileEntry(String str);

    public abstract ConfigManager getConfigManager();

    public abstract String getMediaPath(int i) throws IOException, NotExistException, WrongTypeException;

    public abstract Configuration getConfiguration();

    public abstract DeviceCapability getDeviceCapability();

    public abstract void updateConfiguration(Configuration configuration, DeviceCapability deviceCapability);

    public abstract Pattern createPattern(List<TypedAttribute.AttrData> list);

    public abstract Theme createTheme(List<TypedAttribute.AttrData> list);

    public ResourceManager() {
        throw new RuntimeException("Stub!");
    }
}
