package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class MarketEntrance extends ExitMap {
    public MarketEntrance() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[28]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new MarketEntranceToGuardHouse(), 0);
        setExit(new MarketEntranceToHyruleField(), 1);
        setExit(new MarketEntranceToMarket(), 2);
    }

    private static class MarketEntranceToGuardHouse extends Exit {
        public MarketEntranceToGuardHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.MARKET_GUARD_HOUSE);
        }
    }

    private static class MarketEntranceToHyruleField extends Exit {
        public MarketEntranceToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class MarketEntranceToMarket extends Exit {
        public MarketEntranceToMarket() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
        }
    }
}
