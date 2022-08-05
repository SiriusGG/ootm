package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;

public enum Overworld {
    KOKIRI_FOREST,
    LOST_WOODS,
    HYRULE_FIELD,
    MARKET_ENTRANCE,
    MARKET,
    TOT_ENTRANCE,
    HYRULE_CASTLE,
    LON_LON_RANCH,
    KAKARIKO_VILLAGE,
    GRAVEYARD,
    DEATH_MOUNTAIN_TRAIL,
    SACRED_FOREST_MEADOW,
    GORON_CITY,
    DEATH_MOUNTAIN_CRATER,
    ZORAS_RIVER,
    ZORAS_DOMAIN,
    LAKE_HYLIA,
    ZORAS_FOUNTAIN,
    GERUDO_VALLEY,
    GERUDOS_FORTRESS,
    HAUNTED_WASTELAND,
    DESERT_COLOSSUS;

    public String toNiceName() {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String[] names = pli.getNiceOverworlds();
        switch (this) {
            case KOKIRI_FOREST: return names[0];
            case LOST_WOODS: return names[1];
            case HYRULE_FIELD: return names[2];
            case MARKET_ENTRANCE: return names[3];
            case MARKET: return names[4];
            case TOT_ENTRANCE: return names[5];
            case HYRULE_CASTLE: return names[6];
            case LON_LON_RANCH: return names[7];
            case KAKARIKO_VILLAGE: return names[8];
            case GRAVEYARD: return names[9];
            case DEATH_MOUNTAIN_TRAIL: return names[10];
            case SACRED_FOREST_MEADOW: return names[11];
            case GORON_CITY: return names[12];
            case DEATH_MOUNTAIN_CRATER: return names[13];
            case ZORAS_RIVER: return names[14];
            case ZORAS_DOMAIN: return names[15];
            case LAKE_HYLIA: return names[16];
            case ZORAS_FOUNTAIN: return names[17];
            case GERUDO_VALLEY: return names[18];
            case GERUDOS_FORTRESS: return names[19];
            case HAUNTED_WASTELAND: return names[20];
            case DESERT_COLOSSUS: return names[21];
            default: throw new IllegalArgumentException(this.name());
        }
    }
}
