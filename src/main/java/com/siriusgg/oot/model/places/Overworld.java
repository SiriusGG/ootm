package com.siriusgg.oot.model.places;

import com.siriusgg.oot.Constants;

public enum Overworld {
    DEATH_MOUNTAIN_CRATER,
    DEATH_MOUNTAIN_TRAIL,
    DESERT_COLOSSUS,
    GERUDOS_FORTRESS,
    GERUDO_VALLEY,
    GORON_CITY,
    GRAVEYARD,
    HAUNTED_WASTELAND,
    HYRULE_CASTLE,
    HYRULE_FIELD,
    KAKARIKO_VILLAGE,
    KOKIRI_FOREST,
    LAKE_HYLIA,
    LON_LON_RANCH,
    LOST_WOODS,
    MARKET,
    MARKET_ENTRANCE,
    SACRED_FOREST_MEADOW,
    TEMPLE_OF_TIME_ENTRANCE,
    ZORAS_DOMAIN,
    ZORAS_FOUNTAIN,
    ZORAS_RIVER;

    public String toNiceName() {
        String[] names = Constants.NICE_OVERWORLDS;
        switch (this) {
            case DEATH_MOUNTAIN_CRATER: return names[0];
            case DEATH_MOUNTAIN_TRAIL: return names[1];
            case DESERT_COLOSSUS: return names[2];
            case GERUDOS_FORTRESS: return names[3];
            case GERUDO_VALLEY: return names[4];
            case GORON_CITY: return names[5];
            case GRAVEYARD: return names[6];
            case HAUNTED_WASTELAND: return names[7];
            case HYRULE_CASTLE: return names[8];
            case HYRULE_FIELD: return names[9];
            case KAKARIKO_VILLAGE: return names[10];
            case KOKIRI_FOREST: return names[11];
            case LAKE_HYLIA: return names[12];
            case LON_LON_RANCH: return names[13];
            case LOST_WOODS: return names[14];
            case MARKET: return names[15];
            case MARKET_ENTRANCE: return names[16];
            case SACRED_FOREST_MEADOW: return names[17];
            case TEMPLE_OF_TIME_ENTRANCE: return names[18];
            case ZORAS_DOMAIN: return names[19];
            case ZORAS_FOUNTAIN: return names[20];
            case ZORAS_RIVER: return names[21];
            default: throw new IllegalArgumentException(this.name());
        }
    }
}
