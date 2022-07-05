package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class InsideTheDekuTree extends ExitMap {
    public InsideTheDekuTree(final Settings settings) {
        super(settings);
        setName("Inside the Deku Tree");
        initMap();
        setDungeonExitsAmount(1);
        initExits();
        setExit(new InsideTheDekuTreeToKokiriForest(), 0);
    }

    private static class InsideTheDekuTreeToKokiriForest extends Exit {
        public InsideTheDekuTreeToKokiriForest() {
            super(ExitType.DUNGEON_EXIT);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setDungeonExit(DungeonExit.INSIDE_THE_DEKU_TREE);
        }
    }
}
