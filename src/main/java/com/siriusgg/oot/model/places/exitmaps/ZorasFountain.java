package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class ZorasFountain extends ExitMap {
    public ZorasFountain() {
        super();
        setPlace(PlaceWithMap.ZORAS_FOUNTAIN);
        setName(PermanentlyLoadedInformation.getInstance().getNicePlacesWithMap()[38]);
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(2);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new ZorasFountainToGreatFairy(this), 0);
        setExit(new ZorasFountainToInsideJabuJabusBelly(this), 1);
        setExit(new ZorasFountainToIceCavern(this), 2);
        setExit(new ZorasFountainToZorasDomain(this), 3);
    }

    private static class ZorasFountainToGreatFairy extends Exit {
        public ZorasFountainToGreatFairy(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.ZF_GREAT_FAIRY_FOUNTAIN);
            setChildSidePosition(new Position(94.66, 66.12));
            setAdultSidePosition(new Position(82.81, 65.85));
            setBothTopPositions(new Position(63.91, 91.09));
        }
    }

    private static class ZorasFountainToInsideJabuJabusBelly extends Exit {
        public ZorasFountainToInsideJabuJabusBelly(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDungeonEntrance(DungeonEntrance.INSIDE_JABU_JABUS_BELLY);
            setChildSidePosition(new Position(29.23, 51.83));
            setAdultSidePosition(new Position(25.0, 53.89));
            setBothTopPositions(new Position(30.09, 43.75));
        }
    }

    private static class ZorasFountainToIceCavern extends Exit {
        public ZorasFountainToIceCavern(final ExitMap exitMap) {
            super(exitMap, ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.ICE_CAVERN);
            setChildSidePosition(new Position(21.03, 23.64));
            setAdultSidePosition(new Position(18.23, 24.21));
            setBothTopPositions(new Position(52.6, 15.51));
        }
    }

    private static class ZorasFountainToZorasDomain extends Exit {
        public ZorasFountainToZorasDomain(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_DOMAIN);
            setChildSidePosition(new Position(31.12, 74.34));
            setAdultSidePosition(new Position(26.04, 73.34));
            setBothTopPositions(new Position(12.25, 60.3));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 60;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 50;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
