package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownPlaceWithMapException;
import com.siriusgg.oot.model.PermanentlyLoadedInformation;

public enum PlaceWithMap {
    BOTTOM_OF_THE_WELL,
    DAMPES_GRAVE,
    DEATH_MOUNTAIN_CRATER,
    DEATH_MOUNTAIN_TAIL,
    DESERT_COLOSSUS,
    DODONGOS_CAVERN,
    FIRE_TEMPLE,
    FOREST_TEMPLE,
    GERUDOS_FORTRESS,
    GERUDO_TRAINING_GROUND,
    GERUDO_VALLEY,
    GORON_CITY,
    GRAVEYARD,
    HAUNTED_WASTELAND,
    HYRULE_CASTLE,
    HYRULE_FIELD,
    ICE_CAVERN,
    INSIDE_GANONS_CASTLE,
    INSIDE_JABU_JABUS_BELLY,
    INSIDE_THE_DEKU_TREE,
    KAKARIKO_MAGIC_POTION_SHOP,
    KAKARIKO_VILLAGE,
    KOKIRI_FOREST,
    LAKE_HYLIA,
    LINKS_HOUSE,
    LON_LON_RANCH,
    LOST_WOODS,
    MARKET,
    MARKET_ENTRANCE,
    SACRED_FOREST_MEADOW,
    SHADOW_TEMPLE,
    SPIRIT_TEMPLE,
    TEMPLE_OF_TIME,
    TEMPLE_OF_TIME_ENTRANCE,
    THIEVES_HIDEOUT,
    WATER_TEMPLE,
    WINDMILL,
    ZORAS_DOMAIN,
    ZORAS_FOUNTAIN,
    ZORAS_RIVER,
    // Zoom areas
    THIEVES_HIDEOUT_OUTSIDE;

    public String getName() throws UnknownPlaceWithMapException {
        String[] placesWithMap = PermanentlyLoadedInformation.getInstance().getPlacesWithMap();
        switch (this) {
            case BOTTOM_OF_THE_WELL:
                return placesWithMap[0];
            case DAMPES_GRAVE:
                return placesWithMap[1];
            case DEATH_MOUNTAIN_CRATER:
                return placesWithMap[2];
            case DEATH_MOUNTAIN_TAIL:
                return placesWithMap[3];
            case DESERT_COLOSSUS:
                return placesWithMap[4];
            case DODONGOS_CAVERN:
                return placesWithMap[5];
            case FIRE_TEMPLE:
                return placesWithMap[6];
            case FOREST_TEMPLE:
                return placesWithMap[7];
            case GERUDOS_FORTRESS:
                return placesWithMap[8];
            case GERUDO_TRAINING_GROUND:
                return placesWithMap[9];
            case GERUDO_VALLEY:
                return placesWithMap[10];
            case GORON_CITY:
                return placesWithMap[11];
            case GRAVEYARD:
                return placesWithMap[12];
            case HAUNTED_WASTELAND:
                return placesWithMap[13];
            case HYRULE_CASTLE:
                return placesWithMap[14];
            case HYRULE_FIELD:
                return placesWithMap[15];
            case ICE_CAVERN:
                return placesWithMap[16];
            case INSIDE_GANONS_CASTLE:
                return placesWithMap[17];
            case INSIDE_JABU_JABUS_BELLY:
                return placesWithMap[18];
            case INSIDE_THE_DEKU_TREE:
                return placesWithMap[19];
            case KAKARIKO_MAGIC_POTION_SHOP:
                return placesWithMap[20];
            case KAKARIKO_VILLAGE:
                return placesWithMap[21];
            case KOKIRI_FOREST:
                return placesWithMap[22];
            case LAKE_HYLIA:
                return placesWithMap[23];
            case LINKS_HOUSE:
                return placesWithMap[24];
            case LON_LON_RANCH:
                return placesWithMap[25];
            case LOST_WOODS:
                return placesWithMap[26];
            case MARKET:
                return placesWithMap[27];
            case MARKET_ENTRANCE:
                return placesWithMap[28];
            case SACRED_FOREST_MEADOW:
                return placesWithMap[29];
            case SHADOW_TEMPLE:
                return placesWithMap[30];
            case SPIRIT_TEMPLE:
                return placesWithMap[31];
            case TEMPLE_OF_TIME:
                return placesWithMap[32];
            case TEMPLE_OF_TIME_ENTRANCE:
                return placesWithMap[33];
            case THIEVES_HIDEOUT:
                return placesWithMap[34];
            case WATER_TEMPLE:
                return placesWithMap[35];
            case WINDMILL:
                return placesWithMap[36];
            case ZORAS_DOMAIN:
                return placesWithMap[37];
            case ZORAS_FOUNTAIN:
                return placesWithMap[38];
            case ZORAS_RIVER:
                return placesWithMap[39];
            // Zoom areas
            case THIEVES_HIDEOUT_OUTSIDE:
                return placesWithMap[40];
            default:
                throw new UnknownPlaceWithMapException(this);
        }
    }
}
