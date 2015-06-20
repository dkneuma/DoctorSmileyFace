package edu.indwes.cis.danielneumann.doctorsmileyface;

import android.support.wearable.watchface.CanvasWatchFaceService;

/**
 * Created by daniel.neumann on 6/20/15.
 */
public class WatchFaceSurface extends CanvasWatchFaceService {
    private class WatchFaceEngine extends Engine {

    }

    @Override
    public Engine onCreateEngine() {
        return new WatchFaceEngine();
    }

}
