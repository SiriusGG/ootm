package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.*;

public class InsideTheDekuTree extends ExitMap {
    public InsideTheDekuTree() {
        super();
        setName(PermanentlyLoadedInformation.getInstance().getPlacesWithMap()[19]);
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideTheDekuTreeToKokiriForest(), 0);
    }

    private static class InsideTheDekuTreeToKokiriForest extends Exit {
        public InsideTheDekuTreeToKokiriForest() {
            super(ExitType.DUNGEON_EXIT);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_THE_DEKU_TREE);
        }
    }
}
