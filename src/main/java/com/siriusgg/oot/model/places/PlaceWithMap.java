package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.UnknownPlaceWithMapException;

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
    WINDMILL,
    ZORAS_DOMAIN,
    ZORAS_FOUNTAIN,
    ZORAS_RIVER;

    public String getName() throws UnknownPlaceWithMapException {
        switch (this) {
            case BOTTOM_OF_THE_WELL:
                return "Bottom of the Well";
            case DAMPES_GRAVE:
                return "Dampe's Grave";
            case DEATH_MOUNTAIN_CRATER:
                return "Death Mountain Crater";
            case DEATH_MOUNTAIN_TAIL:
                return "Death Mountain Trail";
            case DESERT_COLOSSUS:
                return "Desert Colossus";
            case DODONGOS_CAVERN:
                return "Dodongo's Cavern";
            case FIRE_TEMPLE:
                return "Fire Temple";
            case FOREST_TEMPLE:
                return "Forest Temple";
            case GERUDOS_FORTRESS:
                return "Gerudo's Fortress";
            case GERUDO_TRAINING_GROUND:
                return "Gerudo Training Ground";
            case GORON_CITY:
                return "Goron City";
            case GRAVEYARD:
                return "Graveyard";
            case HAUNTED_WASTELAND:
                return "Haunted Wasteland";
            case HYRULE_CASTLE:
                return "Hyrule Castle";
            case HYRULE_FIELD:
                return "Hyrule Field";
            case ICE_CAVERN:
                return "Ice Cavern";
            case INSIDE_GANONS_CASTLE:
                return "Inside Ganon's Castle";
            case INSIDE_JABU_JABUS_BELLY:
                return "Inside Jabu-Jabu's Belly";
            case INSIDE_THE_DEKU_TREE:
                return "Inside the Deku Tree";
            case KAKARIKO_MAGIC_POTION_SHOP:
                return "Kakariko Magic Potion Shop";
            case KOKIRI_FOREST:
                return "Kokiri Forest";
            case LAKE_HYLIA:
                return "Lake Hylia";
            case LINKS_HOUSE:
                return "Link's House";
            case LON_LON_RANCH:
                return "Lon Lon Ranch";
            case LOST_WOODS:
                return "Lost Woods";
            case MARKET:
                return "Market";
            case MARKET_ENTRANCE:
                return "Market Entrance";
            case SACRED_FOREST_MEADOW:
                return "Sacred Forest Meadow";
            case SHADOW_TEMPLE:
                return "Shadow Temple";
            case SPIRIT_TEMPLE:
                return "Spirit Temple";
            case TEMPLE_OF_TIME:
                return "Temple of Time";
            case TEMPLE_OF_TIME_ENTRANCE:
                return "Temple of Time Entrance";
            case THIEVES_HIDEOUT:
                return "Thieves' Hideout";
            case WINDMILL:
                return "Windmill";
            case ZORAS_DOMAIN:
                return "Zora's Domain";
            case ZORAS_FOUNTAIN:
                return "Zora's Fountain";
            case ZORAS_RIVER:
                return "Zora's River";
            default:
                throw new UnknownPlaceWithMapException(this);
        }
    }
}
