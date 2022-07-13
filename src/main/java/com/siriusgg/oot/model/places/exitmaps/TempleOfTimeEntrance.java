package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class TempleOfTimeEntrance extends ExitMap {
    public TempleOfTimeEntrance() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[33]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new TempleOfTimeEntranceToTempleOfTime(), 0);
        setExit(new TempleOfTimeEntranceToMarket(), 1);
    }

    private static class TempleOfTimeEntranceToTempleOfTime extends Exit {
        public TempleOfTimeEntranceToTempleOfTime() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.TEMPLE_OF_TIME);
        }
    }

    private static class TempleOfTimeEntranceToMarket extends Exit {
        public TempleOfTimeEntranceToMarket() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
        }
    }
}
