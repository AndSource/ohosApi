package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/standard/TelephoneEventHandle.class */
public interface TelephoneEventHandle extends StandardizedEventHandle {
    boolean onAnswer(MultimodalEvent multimodalEvent);

    boolean onRefuse(MultimodalEvent multimodalEvent);

    boolean onHangup(MultimodalEvent multimodalEvent);

    boolean onTelephoneControl(MultimodalEvent multimodalEvent);
}
