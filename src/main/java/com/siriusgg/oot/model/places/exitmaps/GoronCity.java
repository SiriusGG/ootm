package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class GoronCity extends ExitMap {
    public GoronCity() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[11]);
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(3);
        initExits();
        setExit(new GoronCityToGoronShop(), 0);
        setExit(new GoronCityToGoronGrotto(), 1);
        setExit(new GoronCityToDMT(), 2);
        setExit(new GoronCityToLostWoods(), 3);
        setExit(new GoronCityToDMC(), 4);
    }

    private static class GoronCityToGoronShop extends Exit {
        public GoronCityToGoronShop() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GC_SHOP);
        }
    }

    private static class GoronCityToGoronGrotto extends Exit {
        public GoronCityToGoronGrotto() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GC_GROTTO);
        }
    }

    private static class GoronCityToDMT extends Exit {
        public GoronCityToDMT() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_TRAIL);
        }
    }

    private static class GoronCityToLostWoods extends Exit {
        public GoronCityToLostWoods() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.LOST_WOODS);
        }
    }

    private static class GoronCityToDMC extends Exit {
        public GoronCityToDMC() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.DEATH_MOUNTAIN_CRATER);
        }
    }
}
