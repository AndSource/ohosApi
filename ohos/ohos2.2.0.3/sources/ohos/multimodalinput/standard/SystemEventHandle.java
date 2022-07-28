package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/multimodalinput/standard/SystemEventHandle.class */
public interface SystemEventHandle extends StandardizedEventHandle {
    boolean onClosePage(MultimodalEvent multimodalEvent);

    boolean onMute(MultimodalEvent multimodalEvent);
}
