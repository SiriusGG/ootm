package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ToTEntrance extends ExitMap {
    public ToTEntrance(final Settings settings) {
        super(settings);
        setName("Temple of Time Entrance");
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new ToTEntranceToTempleOfTime(), 0);
        setExit(new ToTEntranceToMarket(), 1);
    }

    private static class ToTEntranceToTempleOfTime extends Exit {
        public ToTEntranceToTempleOfTime() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.TEMPLE_OF_TIME);
        }
    }

    private static class ToTEntranceToMarket extends Exit {
        public ToTEntranceToMarket() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
        }
    }
}
