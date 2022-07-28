package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/standard/SystemEventHandle.class */
public interface SystemEventHandle extends StandardizedEventHandle {
    boolean onClosePage(MultimodalEvent multimodalEvent);

    boolean onMute(MultimodalEvent multimodalEvent);
}
