package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class HyruleCastle extends ExitMap {
    public HyruleCastle() {
        super();
        setPlace(PlaceWithMap.HYRULE_CASTLE);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[14]);
        initMap();
        setDoorEntrancesAmount(2);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(1);
        setOverworldTransitionsAmount(1);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new HCToHCGreatFairy(this), 0);
        setExit(new OGCToOGCGreatFairy(this), 1);
        setExit(new OGCToInsideGanonsCastle(this), 2);
        setExit(new HCToStormsGrotto(this), 3);
        setExit(new HCToMarket(this), 4);
        setExit(new HCToCastleGarden(this), 5);
    }

    private static class HCToHCGreatFairy extends Exit {
        public HCToHCGreatFairy(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDoorEntrance(DoorEntrance.HC_GREAT_FAIRY_FOUNTAIN);
            setChildSidePosition(new Position(78.42, 92.82));
            setChildTopPosition(new Position(81.32, 47.34));
        }
    }

    private static class OGCToOGCGreatFairy extends Exit {
        public OGCToOGCGreatFairy(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.OGC_GREAT_FAIRY_FOUNTAIN);
            setAdultSidePosition(new Position(94.31, 81.83));
            setAdultTopPosition(new Position(91.61, 33.45));
        }
    }

    private static class OGCToInsideGanonsCastle extends Exit {
        public OGCToInsideGanonsCastle(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(false);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.INSIDE_GANONS_CASTLE);
            setAdultSidePosition(new Position(53.19, 53.94));
            setAdultTopPosition(new Position(40.05, 33.68));
        }
    }

    private static class HCToStormsGrotto extends Exit {
        public HCToStormsGrotto(final ExitMap exitMap) {
            super(exitMap, ExitType.GROTTO_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setGrottoEntrance(GrottoEntrance.HC_STORMS_GROTTO);
            setChildSidePosition(new Position(78.19, 64.47));
            setChildTopPosition(new Position(52.73, 21.18));
        }
    }

    private static class HCToMarket extends Exit {
        public HCToMarket(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
            setChildSidePosition(new Position(17.96, 92.71));
            setChildTopPosition(new Position(32.27, 84.72));
            setAdultSidePosition(new Position(8.66, 91.09));
            setAdultTopPosition(new Position(45.2, 92.48));
        }
    }

    private static class HCToCastleGarden extends Exit {
        public HCToCastleGarden(final ExitMap exitMap) {
            super(exitMap, ExitType.UNCHANGING);
            setDestinationString("Castle Garden");
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setUnchangingTransition(UnchangingTransition.HYRULE_CASTLE_TO_CASTLE_GARDEN);
            setChildSidePosition(new Position(85.81, 54.4));
            setChildTopPosition(new Position(45.49, 6.02));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 60;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
