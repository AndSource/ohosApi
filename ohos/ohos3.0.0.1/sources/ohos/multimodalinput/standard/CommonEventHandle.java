package ohos.multimodalinput.standard;

import ohos.multimodalinput.event.MultimodalEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/standard/CommonEventHandle.class */
public interface CommonEventHandle extends StandardizedEventHandle {
    boolean onShowMenu(MultimodalEvent multimodalEvent);

    boolean onSend(MultimodalEvent multimodalEvent);

    boolean onCopy(MultimodalEvent multimodalEvent);

    boolean onPaste(MultimodalEvent multimodalEvent);

    boolean onCut(MultimodalEvent multimodalEvent);

    boolean onUndo(MultimodalEvent multimodalEvent);

    boolean onRefresh(MultimodalEvent multimodalEvent);

    boolean onStartDrag(MultimodalEvent multimodalEvent);

    boolean onCancel(MultimodalEvent multimodalEvent);

    boolean onEnter(MultimodalEvent multimodalEvent);

    boolean onPrevious(MultimodalEvent multimodalEvent);

    boolean onNext(MultimodalEvent multimodalEvent);

    boolean onBack(MultimodalEvent multimodalEvent);

    boolean onPrint(MultimodalEvent multimodalEvent);
}
