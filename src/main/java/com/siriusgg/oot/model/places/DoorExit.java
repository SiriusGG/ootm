package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.OoTMConstants;

public enum DoorExit {
    // Kokiri Forest
    KF_LINKS_HOUSE,
    KF_MIDOS_HOUSE,
    KF_SARIAS_HOUSE,
    KF_HOUSE_OF_TWINS,
    KF_KNOW_IT_ALL_HOUSE,
    KF_KOKIRI_SHOP,

    // Lost Woods (none)

    // Hyrule Field (none)

    // Market Entrance
    MARKET_GUARD_HOUSE,

    // Market
    MARKET_TREASURE_CHEST_GAME,
    MARKET_BOMBCHU_SHOP,
    MARKET_MAN_IN_GREEN_HOUSE,
    MARKET_BOMBCHU_BOWLING,
    MARKET_SHOOTING_GALLERY,
    MARKET_MASK_SHOP,
    MARKET_POTION_SHOP,
    MARKET_BAZAAR,

    // Temple of Time Entrance
    TEMPLE_OF_TIME,

    // Hyrule Castle / Outside Ganon's Castle
    HC_GREAT_FAIRY_FOUNTAIN,
    OGC_GREAT_FAIRY_FOUNTAIN,

    // Lon Lon Ranch
    LLR_TALONS_HOUSE,
    LLR_STABLES,
    LLR_TOWER,

    // Kakariko Village
    KAK_CARPENTER_BOSS_HOUSE,
    KAK_HOUSE_OF_SKULLTULA,
    KAK_IMPAS_HOUSE_FRONT,
    KAK_WINDMILL,
    KAK_BAZAAR,
    KAK_SHOOTING_GALLERY,
    KAK_POTION_SHOP_FRONT,
    KAK_ODD_MEDICINE_BUILDING,
    KAK_POTION_SHOP_BACK,
    KAK_IMPAS_HOUSE_BACK,

    // Graveyard
    GRAVEYARD_DAMPES_HOUSE,

    // Death Mountain Trail
    DMT_GREAT_FAIRY_FOUNTAIN,

    // Sacred Forest Meadow (none)

    // Goron City
    GC_SHOP,

    // Death Mountain Crater
    DMC_GREAT_FAIRY_FOUNTAIN,

    // Zoras River (none)

    // Zoras Domain
    ZD_SHOP,

    // Lake Hylia
    LH_FISHING_HOLE,
    LH_LAB,

    // Zoras Fountain
    ZF_GREAT_FAIRY_FOUNTAIN,

    // Gerudo Valley
    GV_CARPENTER_TENT,

    // Gerudo's Fortress (none)

    // Haunted Wasteland (none)

    // Desert Colossus
    COLOSSUS_GREAT_FAIRY_FOUNTAIN;

    public String toNiceName() {
        String[] names = OoTMConstants.NICE_DOORS;
        switch (this) {
            case KF_LINKS_HOUSE:
                return names[0];
            case KF_MIDOS_HOUSE:
                return names[1];
            case KF_SARIAS_HOUSE:
                return names[2];
            case KF_HOUSE_OF_TWINS:
                return names[3];
            case KF_KNOW_IT_ALL_HOUSE:
                return names[4];
            case KF_KOKIRI_SHOP:
                return names[5];
            case MARKET_GUARD_HOUSE:
                return names[6];
            case MARKET_TREASURE_CHEST_GAME:
                return names[7];
            case MARKET_BOMBCHU_SHOP:
                return names[8];
            case MARKET_MAN_IN_GREEN_HOUSE:
                return names[9];
            case MARKET_BOMBCHU_BOWLING:
                return names[10];
            case MARKET_SHOOTING_GALLERY:
                return names[11];
            case MARKET_MASK_SHOP:
                return names[12];
            case MARKET_POTION_SHOP:
                return names[13];
            case MARKET_BAZAAR:
                return names[14];
            case TEMPLE_OF_TIME:
                return names[15];
            case HC_GREAT_FAIRY_FOUNTAIN:
                return names[16];
            case OGC_GREAT_FAIRY_FOUNTAIN:
                return names[17];
            case LLR_TALONS_HOUSE:
                return names[18];
            case LLR_STABLES:
                return names[19];
            case LLR_TOWER:
                return names[20];
            case KAK_CARPENTER_BOSS_HOUSE:
                return names[21];
            case KAK_HOUSE_OF_SKULLTULA:
                return names[22];
            case KAK_IMPAS_HOUSE_FRONT:
                return names[23];
            case KAK_WINDMILL:
                return names[24];
            case KAK_BAZAAR:
                return names[25];
            case KAK_SHOOTING_GALLERY:
                return names[26];
            case KAK_POTION_SHOP_FRONT:
                return names[27];
            case KAK_ODD_MEDICINE_BUILDING:
                return names[28];
            case KAK_POTION_SHOP_BACK:
                return names[29];
            case KAK_IMPAS_HOUSE_BACK:
                return names[30];
            case GRAVEYARD_DAMPES_HOUSE:
                return names[31];
            case DMT_GREAT_FAIRY_FOUNTAIN:
                return names[32];
            case GC_SHOP:
                return names[33];
            case DMC_GREAT_FAIRY_FOUNTAIN:
                return names[34];
            case ZD_SHOP:
                return names[35];
            case LH_FISHING_HOLE:
                return names[36];
            case LH_LAB:
                return names[37];
            case ZF_GREAT_FAIRY_FOUNTAIN:
                return names[38];
            case GV_CARPENTER_TENT:
                return names[39];
            case COLOSSUS_GREAT_FAIRY_FOUNTAIN:
                return names[40];
            default:
                throw new IllegalArgumentException(this.name());
        }
    }
}
