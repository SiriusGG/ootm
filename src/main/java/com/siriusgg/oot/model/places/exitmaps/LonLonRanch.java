package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class LonLonRanch extends ExitMap {
    public LonLonRanch() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[25]);
        initMap();
        setDoorEntrancesAmount(3);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new LonLonRanchToTalonsHouse(), 0);
        setExit(new LonLonRanchToStable(), 1);
        setExit(new LonLonRanchToTower(), 2);
        setExit(new LonLonRanchToGrotto(), 3);
        setExit(new LonLonRanchToHyruleField(), 4);
    }

    private static class LonLonRanchToTalonsHouse extends Exit {
        public LonLonRanchToTalonsHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_TALONS_HOUSE);
        }
    }

    private static class LonLonRanchToStable extends Exit {
        public LonLonRanchToStable() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_STABLES);
        }
    }

    private static class LonLonRanchToTower extends Exit {
        public LonLonRanchToTower() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.LLR_TOWER);
        }
    }

    private static class LonLonRanchToGrotto extends Exit {
        public LonLonRanchToGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setGrottoEntrance(GrottoEntrance.LLR_GROTTO);
        }
    }

    private static class LonLonRanchToHyruleField extends Exit {
        public LonLonRanchToHyruleField() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }
}
