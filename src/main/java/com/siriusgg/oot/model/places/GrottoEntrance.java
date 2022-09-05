package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.OoTMConstants;

public enum GrottoEntrance {
    KF_STORMS_GROTTO,
    LW_NEAR_SHORTCUTS_GROTTO,
    DEKU_THEATER,
    LW_SCRUBS_GROTTO,
    SFM_WOLFOS_GROTTO,
    SFM_FAIRY_GROTTO,
    SFM_STORMS_GROTTO,
    HF_SOUTHEAST_GROTTO,
    HF_OPEN_GROTTO,
    HF_INSIDE_FENCE_GROTTO,
    HF_COW_GROTTO,
    HF_NEAR_MARKET_GROTTO,
    HF_FAIRY_GROTTO,
    HF_NEAR_KAK_GROTTO,
    HF_TEKTITE_GROTTO,
    HC_STORMS_GROTTO,
    LLR_GROTTO,
    KAK_REDEAD_GROTTO,
    KAK_OPEN_GROTTO,
    GRAVEYARD_SHIELD_GRAVE,
    GRAVEYARD_HEART_PIECE_GRAVE,
    GRAVEYARD_ROYAL_FAMILYS_TOMB,
    DAMPES_GRAVE,
    DMT_STORMS_GROTTO,
    DMT_COW_GROTTO,
    GC_GROTTO,
    DMC_UPPER_GROTTO,
    DMC_HAMMER_GROTTO,
    ZR_OPEN_GROTTO,
    ZR_FAIRY_GROTTO,
    ZR_STORMS_GROTTO,
    ZD_STORMS_GROTTO,
    LH_GROTTO,
    GV_STORMS_GROTTO,
    GV_OCTOROK_GROTTO,
    GF_STORMS_GROTTO,
    COLOSSUS_GROTTO;

    public String toNiceName() {
        String[] names = OoTMConstants.NICE_GROTTOS;
        switch (this) {
            case KF_STORMS_GROTTO:
                return names[0];
            case LW_NEAR_SHORTCUTS_GROTTO:
                return names[1];
            case DEKU_THEATER:
                return names[2];
            case LW_SCRUBS_GROTTO:
                return names[3];
            case SFM_WOLFOS_GROTTO:
                return names[4];
            case SFM_FAIRY_GROTTO:
                return names[5];
            case SFM_STORMS_GROTTO:
                return names[6];
            case HF_SOUTHEAST_GROTTO:
                return names[7];
            case HF_OPEN_GROTTO:
                return names[8];
            case HF_INSIDE_FENCE_GROTTO:
                return names[9];
            case HF_COW_GROTTO:
                return names[10];
            case HF_NEAR_MARKET_GROTTO:
                return names[11];
            case HF_FAIRY_GROTTO:
                return names[12];
            case HF_NEAR_KAK_GROTTO:
                return names[13];
            case HF_TEKTITE_GROTTO:
                return names[14];
            case HC_STORMS_GROTTO:
                return names[15];
            case LLR_GROTTO:
                return names[16];
            case KAK_REDEAD_GROTTO:
                return names[17];
            case KAK_OPEN_GROTTO:
                return names[18];
            case GRAVEYARD_SHIELD_GRAVE:
                return names[19];
            case GRAVEYARD_HEART_PIECE_GRAVE:
                return names[20];
            case GRAVEYARD_ROYAL_FAMILYS_TOMB:
                return names[21];
            case DAMPES_GRAVE:
                return names[22];
            case DMT_STORMS_GROTTO:
                return names[23];
            case DMT_COW_GROTTO:
                return names[24];
            case GC_GROTTO:
                return names[25];
            case DMC_UPPER_GROTTO:
                return names[26];
            case DMC_HAMMER_GROTTO:
                return names[27];
            case ZR_OPEN_GROTTO:
                return names[28];
            case ZR_FAIRY_GROTTO:
                return names[29];
            case ZR_STORMS_GROTTO:
                return names[30];
            case ZD_STORMS_GROTTO:
                return names[31];
            case LH_GROTTO:
                return names[32];
            case GV_STORMS_GROTTO:
                return names[33];
            case GV_OCTOROK_GROTTO:
                return names[34];
            case GF_STORMS_GROTTO:
                return names[35];
            case COLOSSUS_GROTTO:
                return names[36];
            default:
                throw new IllegalArgumentException(this.name());
        }
    }
}
