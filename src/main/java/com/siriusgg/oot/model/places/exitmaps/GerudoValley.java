package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;

public class GerudoValley extends ExitMap {
    public GerudoValley(final Settings settings) {
        super(settings);
        setName("Gerudo Valley");
        initMap();
        setDoorEntrancesAmount(1);
        setGrottoEntrancesAmount(2);
        setOverworldTransitionsAmount(2);
        setUnchangingTransitionsAmount(1);
        initExits();
        setExit(new GerudoValleyToCarpenterTent(), 0);
        setExit(new GerudoValleyToOctorokGrotto(), 1);
        setExit(new GerudoValleyToStormsGrotto(), 2);
        setExit(new GerudoValleyToHyruleField(), 3);
        setExit(new GerudoValleyToGerudosFortress(), 4);
        setExit(new GerudoValleyToLakeHylia(), 5);
    }

    private static class GerudoValleyToCarpenterTent extends Exit {
        public GerudoValleyToCarpenterTent() {
            super(ExitType.DOOR_ENTRANCE);
            setCanBeUsedAsChild(false);
            setCanBeUsedAsAdult(true);
            setDoorEntrance(DoorEntrance.GV_CARPENTER_TENT);
        }
    }

    private static class GerudoValleyToOctorokGrotto extends Exit {
        public GerudoValleyToOctorokGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            setCanBeUsedAsChild(false);
            setCanBeUsedAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GV_OCTOROK_GROTTO);
        }
    }

    private static class GerudoValleyToStormsGrotto extends Exit {
        public GerudoValleyToStormsGrotto() {
            super(ExitType.GROTTO_ENTRANCE);
            setCanBeUsedAsChild(false);
            setCanBeUsedAsAdult(true);
            setGrottoEntrance(GrottoEntrance.GV_STORMS_GROTTO);
        }
    }

    private static class GerudoValleyToHyruleField extends Exit {
        public GerudoValleyToHyruleField() {
            super(ExitType.OVERWORLD);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setOverworld(Overworld.HYRULE_FIELD);
        }
    }

    private static class GerudoValleyToGerudosFortress extends Exit {
        public GerudoValleyToGerudosFortress() {
            super(ExitType.OVERWORLD);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setOverworld(Overworld.GERUDOS_FORTRESS);
        }
    }

    private static class GerudoValleyToLakeHylia extends Exit {
        public GerudoValleyToLakeHylia() {
            super(ExitType.UNCHANGING);
            setCanBeUsedAsChild(true);
            setCanBeUsedAsAdult(true);
            setUnchangingTransition(UnchangingTransition.GERUDO_VALLEY_TO_LAKE_HYLIA);
        }
    }
}
