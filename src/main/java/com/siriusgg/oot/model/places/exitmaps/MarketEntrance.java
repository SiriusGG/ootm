package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class MarketEntrance extends ExitMap {
    public MarketEntrance() {
        super();
        setPlace(PlaceWithMap.MARKET_ENTRANCE);
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[28]);
        initMap();
        setDoorEntrancesAmount(1);
        setOverworldTransitionsAmount(2);
        initExits();
        setExit(new MarketEntranceToGuardHouse(this), 0);
        setExit(new MarketEntranceToHyruleField(this), 1);
        setExit(new MarketEntranceToMarket(this), 2);
    }

    private static class MarketEntranceToGuardHouse extends Exit {
        public MarketEntranceToGuardHouse(final ExitMap exitMap) {
            super(exitMap, ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.MARKET_GUARD_HOUSE);
            setBothSidePositions(new Position(56.51, 29.75));
            setBothTopPositions(new Position(56.51, 29.75));
        }
    }

    private static class MarketEntranceToHyruleField extends Exit {
        public MarketEntranceToHyruleField(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
            setBothSidePositions(new Position(84.81, 25.69));
            setBothTopPositions(new Position(84.81, 25.69));
        }
    }

    private static class MarketEntranceToMarket extends Exit {
        public MarketEntranceToMarket(final ExitMap exitMap) {
            super(exitMap, ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.MARKET);
            setBothSidePositions(new Position(19.27, 84.72));
            setBothTopPositions(new Position(19.27, 84.72));
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
