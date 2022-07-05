package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.DungeonExit;
import com.siriusgg.oot.model.places.ExitType;
import com.siriusgg.oot.model.places.UnchangingTransition;

public class SpiritTemple extends ExitMap {
    public SpiritTemple(final Settings settings) {
        super(settings);
        setName("Spirit Temple");
        initMap();
        setDungeonExitsAmount(1);
        setUnchangingTransitionsAmount(2);
        initExits();
        setExit(new SpiritTempleToDesertColossus(), 0);
        setExit(new SpiritTempleLeftHandToDesertColossus(), 1);
        setExit(new SpiritTempleRightHandToDesertColossus(), 2);
    }

    private static class SpiritTempleToDesertColossus extends Exit {
        public SpiritTempleToDesertColossus() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.SPIRIT_TEMPLE);
        }
    }

    private static class SpiritTempleLeftHandToDesertColossus extends Exit {
        public SpiritTempleLeftHandToDesertColossus() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_LEFT_HAND_TO_COLOSSUS);
        }
    }

    private static class SpiritTempleRightHandToDesertColossus extends Exit {
        public SpiritTempleRightHandToDesertColossus() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_RIGHT_HAND_TO_COLOSSUS);
        }
    }
}
