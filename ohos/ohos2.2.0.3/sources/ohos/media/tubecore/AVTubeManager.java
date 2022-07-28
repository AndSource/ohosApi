package ohos.media.tubecore;

import java.util.Optional;
import ohos.app.Context;
import ohos.media.tubecore.AVTube;

/* loaded from: ohos2.2.0.3.jar:ohos/media/tubecore/AVTubeManager.class */
public class AVTubeManager {

    /* loaded from: ohos2.2.0.3.jar:ohos/media/tubecore/AVTubeManager$TubeObserver.class */
    public interface TubeObserver {
        void onTubeEnterWorkingState(AVTubeManager aVTubeManager, AVTube aVTube, int i);

        void onTubeExitWorkingState(AVTubeManager aVTubeManager, AVTube aVTube, int i);

        void onTubeInsert(AVTubeManager aVTubeManager, AVTube aVTube);

        void onTubeDelete(AVTubeManager aVTubeManager, AVTube aVTube);

        void onTubeUpdate(AVTubeManager aVTubeManager, AVTube aVTube);
    }

    AVTubeManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static AVTubeManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public AVTube defaultTube() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AVTube> getTubeByIndex(int index) {
        throw new RuntimeException("Stub!");
    }

    public int tubeNumber() {
        throw new RuntimeException("Stub!");
    }

    public Optional<AVTube> tubeInUse(int usageScenes) {
        throw new RuntimeException("Stub!");
    }

    public void useTube(AVTube tube, int usageScenes) {
        throw new RuntimeException("Stub!");
    }

    public void addTubeObserver(TubeObserver observer, int usageScenes, int flags) {
        throw new RuntimeException("Stub!");
    }

    public void removeTubeObserver(TubeObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AVTube.SetInfo> createTubeSet(String name) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AVTube.SetInfo> createTubeSet(int nameResId) {
        throw new RuntimeException("Stub!");
    }

    public Optional<AVTubeEx> createAVTubeEx(AVTube.SetInfo setInfo) {
        throw new RuntimeException("Stub!");
    }

    public void insertAVTubeEx(AVTubeEx avTubeEx) {
        throw new RuntimeException("Stub!");
    }

    public void deleteAVTubeEx(AVTubeEx avTubeEx) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/tubecore/AVTubeManager$ObserverFlag.class */
    public static class ObserverFlag {
        public static final int IGNORE_FILTER = 2;
        public static final int NO_FLAG = 0;

        ObserverFlag() {
            throw new RuntimeException("Stub!");
        }
    }
}
