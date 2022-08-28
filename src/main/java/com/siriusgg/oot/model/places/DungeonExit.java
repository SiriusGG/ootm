package com.siriusgg.oot.model.places;

import com.siriusgg.oot.Constants;

public enum DungeonExit {
    INSIDE_THE_DEKU_TREE,
    DODONGOS_CAVERN,
    INSIDE_JABU_JABUS_BELLY,
    FOREST_TEMPLE,
    FIRE_TEMPLE,
    ICE_CAVERN,
    WATER_TEMPLE,
    BOTTOM_OF_THE_WELL,
    SHADOW_TEMPLE,
    GERUDO_TRAINING_GROUND,
    SPIRIT_TEMPLE,
    INSIDE_GANONS_CASTLE;

    public String toNiceName() {
        String[] names = Constants.NICE_DUNGEONS;
        switch (this) {
            case BOTTOM_OF_THE_WELL:
                return names[0];
            case DODONGOS_CAVERN:
                return names[1];
            case FIRE_TEMPLE:
                return names[2];
            case FOREST_TEMPLE:
                return names[3];
            case GERUDO_TRAINING_GROUND:
                return names[4];
            case ICE_CAVERN:
                return names[5];
            case INSIDE_GANONS_CASTLE:
                return names[6];
            case INSIDE_JABU_JABUS_BELLY:
                return names[7];
            case INSIDE_THE_DEKU_TREE:
                return names[8];
            case SHADOW_TEMPLE:
                return names[9];
            case SPIRIT_TEMPLE:
                return names[10];
            case WATER_TEMPLE:
                return names[11];
            default:
                throw new IllegalArgumentException(this.name());
        }
    }
}
