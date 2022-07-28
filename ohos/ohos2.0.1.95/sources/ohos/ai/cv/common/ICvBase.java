package ohos.ai.cv.common;

import ohos.ai.engine.pluginservice.ILoadPluginCallback;

/* loaded from: ohos2.0.1.95.jar:ohos/ai/cv/common/ICvBase.class */
public interface ICvBase {
    int prepare();

    int getAvailability();

    void loadPlugin(ILoadPluginCallback iLoadPluginCallback);

    int release();
}
