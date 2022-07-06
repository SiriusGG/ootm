package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class ZorasFountain extends ExitMap {
    public ZorasFountain(final Settings settings) {
        super(settings);
        setName("Zora's Fountain");
        initMap();
        setDoorEntrancesAmount(1);
        setDungeonEntrancesAmount(2);
        setOverworldTransitionsAmount(1);
        initExits();
        setExit(new ZorasFountainToGreatFairy(), 0);
        setExit(new ZorasFountainToInsideJabuJabusBelly(), 1);
        setExit(new ZorasFountainToIceCavern(), 2);
        setExit(new ZorasFountainToZorasDomain(), 3);
    }

    private static class ZorasFountainToGreatFairy extends Exit {
        public ZorasFountainToGreatFairy() {
            super(ExitType.DOOR_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDoorEntrance(DoorEntrance.ZF_GREAT_FAIRY_FOUNTAIN);
        }
    }

    private static class ZorasFountainToInsideJabuJabusBelly extends Exit {
        public ZorasFountainToInsideJabuJabusBelly() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(false);
            setDungeonEntrance(DungeonEntrance.INSIDE_JABU_JABUS_BELLY);
        }
    }

    private static class ZorasFountainToIceCavern extends Exit {
        public ZorasFountainToIceCavern() {
            super(ExitType.DUNGEON_ENTRANCE);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setDungeonEntrance(DungeonEntrance.ICE_CAVERN);
        }
    }

    private static class ZorasFountainToZorasDomain extends Exit {
        public ZorasFountainToZorasDomain() {
            super(ExitType.OVERWORLD);
            intendedAccessibleAsChild(true);
            intendedAccessibleAsAdult(true);
            setOverworld(Overworld.ZORAS_DOMAIN);
        }
    }
}
