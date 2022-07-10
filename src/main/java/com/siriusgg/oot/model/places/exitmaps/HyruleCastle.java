package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.places.*;

public class HyruleCastle extends ExitMap {
    public HyruleCastle() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[14]);
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new HCToHCGreatFairy(), 0);
        setExit(new OGCToOGCGreatFairy(), 1);
        setExit(new OGCToInsideGanonsCastle(), 2);
        setExit(new HCToStormsGrotto(), 3);
        setExit(new HCToMarket(), 4);
        setExit(new HCToCastleGarden(), 5);
    }

    private static class HCToHCGreatFairy extends Exit {
        public HCToHCGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.HC_GREAT_FAIRY_FOUNTAIN);
        }
    }

    private static class OGCToOGCGreatFairy extends Exit {
        public OGCToOGCGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.OGC_GREAT_FAIRY_FOUNTAIN);
        }
    }

    private static class OGCToInsideGanonsCastle extends Exit {
        public OGCToInsideGanonsCastle() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.INSIDE_GANONS_CASTLE);
        }
    }

    private static class HCToStormsGrotto extends Exit {
        public HCToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setGrottoEntrance(GrottoEntrance.HC_STORMS_GROTTO);
        }
    }

    private static class HCToMarket extends Exit {
        public HCToMarket() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
        }
    }

    private static class HCToCastleGarden extends Exit {
        public HCToCastleGarden() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setUnchangingTransition(UnchangingTransition.HYRULE_CASTLE_TO_CASTLE_GARDEN);
        }
    }
}
