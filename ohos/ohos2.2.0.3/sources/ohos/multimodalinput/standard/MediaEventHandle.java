package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/multimodalinput/standard/MediaEventHandle.class */
public interface MediaEventHandle extends StandardizedEventHandle {
    boolean onPlay(MultimodalEvent multimodalEvent);

    boolean onPause(MultimodalEvent multimodalEvent);

    boolean onMediaControl(MultimodalEvent multimodalEvent);
}
