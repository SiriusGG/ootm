package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class DampesGrave extends ExitMap {
    public DampesGrave(final Settings settings) {
        super(settings);
        setName("Dampe's Grave");
        initMap();
        setGrottoExitsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new DampesGraveToGraveyard(), 0);
        setExit(new DampesGraveToWindmill(), 1);
    }

    private static class DampesGraveToGraveyard extends Exit {
        public DampesGraveToGraveyard() {
            super(ExitType.GROTTO_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoExit(GrottoExit.DAMPES_GRAVE);
        }
    }

    private static class DampesGraveToWindmill extends Exit {
        public DampesGraveToWindmill() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.DAMPES_GRAVE_TO_WINDMILL);
        }
    }
}
