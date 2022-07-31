package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownPerspectiveException;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;

public class SpiritTemple extends ExitMap {
    public SpiritTemple() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[31]);
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
            setBothSidePositions(new Position(25.59, 87.96));
            setBothTopPositions(new Position(19.45, 80.21));
        }
    }

    private static class SpiritTempleLeftHandToDesertColossus extends Exit {
        public SpiritTempleLeftHandToDesertColossus() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_LEFT_HAND_TO_COLOSSUS);
            setBothSidePositions(new Position(66.21, 86.11));
            setBothTopPositions(new Position(83.95, 93.4));
        }
    }

    private static class SpiritTempleRightHandToDesertColossus extends Exit {
        public SpiritTempleRightHandToDesertColossus() {
            super(ExitType.UNCHANGING);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setUnchangingTransition(UnchangingTransition.SPIRIT_TEMPLE_RIGHT_HAND_TO_COLOSSUS);
            setBothSidePositions(new Position(10.81, 52.25));
            setBothTopPositions(new Position(63.55, 93.4));
        }
    }

    @Override
    public int getPreferredButtonWidth() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }

    @Override
    public int getPreferredButtonHeight() throws UnknownPerspectiveException {
        if (Settings.getInstance().getPerspective() == Perspective.SIDE) {
            return 40;
        } else if (Settings.getInstance().getPerspective() == Perspective.TOP) {
            return 40;
        } else {
            throw new UnknownPerspectiveException(Settings.getInstance().getPerspective());
        }
    }
}
