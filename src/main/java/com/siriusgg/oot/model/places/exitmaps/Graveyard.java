package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class Graveyard extends ExitMap {
    public Graveyard(final Settings settings) {
        super(settings);
        setName("Graveyard");
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(1);
        setGrottoEntrancesAmount(4);
        setOverworldTransitionsAmount(1);
        initExits();
    }

    private static class GraveyardToDampesHouse extends Exit {
        public GraveyardToDampesHouse() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.GRAVEYARD_DAMPES_HOUSE);
        }
    }

    private static class GraveyardToShadowTemple extends Exit {
        public GraveyardToShadowTemple() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.SHADOW_TEMPLE);
        }
    }
}
