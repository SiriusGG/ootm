package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class HauntedWasteland extends ExitMap {
    public HauntedWasteland(final Settings settings) {
        super(settings);
        setName("Haunted Wasteland");
        initMap();
        setOverworldTransitionsAmount(2);
        setAccessibility(false, true);
        initExits();
        setExit(new HauntedWastelandToGerudosFortress(), 0);
        setExit(new HauntedWastelandToDesertColossus(), 1);
    }

    private static class HauntedWastelandToGerudosFortress extends Exit {
        public HauntedWastelandToGerudosFortress() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.GERUDOS_FORTRESS);
        }
    }

    private static class HauntedWastelandToDesertColossus extends Exit {
        public HauntedWastelandToDesertColossus() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DESERT_COLOSSUS);
        }
    }
}
