package com.siriusgg.oot.model.places;

public class NiceNames {
    public static String toNiceName(final String origName) {
        switch (origName) {
            case "DesertColossus": return "Desert Colossus";
            case "LakeHylia": return "Lake Hylia";
            case "ThievesHideout": return "Thieves' Hideout";
            case "ThievesHideoutOutside": return "Thieves' Hideout Outside";
            case "SpiritTemple": return "Spirit Temple";
            case "Windmill": return "Windmill";
            default: throw new IllegalArgumentException(origName);
        }
    }
}
