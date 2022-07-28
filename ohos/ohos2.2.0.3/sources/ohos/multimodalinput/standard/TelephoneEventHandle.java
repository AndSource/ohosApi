package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/multimodalinput/standard/TelephoneEventHandle.class */
public interface TelephoneEventHandle extends StandardizedEventHandle {
    boolean onAnswer(MultimodalEvent multimodalEvent);

    boolean onRefuse(MultimodalEvent multimodalEvent);

    boolean onHangup(MultimodalEvent multimodalEvent);

    boolean onTelephoneControl(MultimodalEvent multimodalEvent);
}
