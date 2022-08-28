package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.Constants;
import com.siriusgg.oot.model.places.exitmaps.*;

@SuppressWarnings("rawtypes")
public class MapClassifier {
    public static Class classifyByName(final String mapName) {
        String[] places = Constants.PLACES_WITH_MAP;
        String[] nonOverworldExtraPlaces = Constants.NON_OVERWORLD_EXTRA_PLACES;
        if (mapName.equals(places[0])) return BottomOfTheWell.class;
        if (mapName.equals(places[1])) return DampesGrave.class;
        if (mapName.equals(places[2])) return DeathMountainCrater.class;
        if (mapName.equals(places[3])) return DeathMountainTrail.class;
        if (mapName.equals(places[4])) return DesertColossus.class;
        if (mapName.equals(places[5])) return DodongosCavern.class;
        if (mapName.equals(places[6])) return FireTemple.class;
        if (mapName.equals(places[7])) return ForestTemple.class;
        if (mapName.equals(places[8])) return GerudosFortress.class;
        if (mapName.equals(places[9])) return GerudoTrainingGround.class;
        if (mapName.equals(places[10])) return GerudoValley.class;
        if (mapName.equals(places[11])) return GoronCity.class;
        if (mapName.equals(places[12])) return Graveyard.class;
        if (mapName.equals(places[13])) return HauntedWasteland.class;
        if (mapName.equals(places[14])) return HyruleCastle.class;
        if (mapName.equals(places[15])) return HyruleField.class;
        if (mapName.equals(places[16])) return IceCavern.class;
        if (mapName.equals(places[17])) return InsideGanonsCastle.class;
        if (mapName.equals(places[18])) return InsideJabuJabusBelly.class;
        if (mapName.equals(places[19])) return InsideTheDekuTree.class;
        if (mapName.equals(places[20]) ||
                mapName.equals(nonOverworldExtraPlaces[0]) ||
                mapName.equals(nonOverworldExtraPlaces[1])) return KakarikoPotionShop.class;
        if (mapName.equals(places[21])) return KakarikoVillage.class;
        if (mapName.equals(places[22])) return KokiriForest.class;
        if (mapName.equals(places[23])) return LakeHylia.class;
        if (mapName.equals(places[24])) return LinksHouse.class;
        if (mapName.equals(places[25])) return LonLonRanch.class;
        if (mapName.equals(places[26])) return LostWoods.class;
        if (mapName.equals(places[27])) return Market.class;
        if (mapName.equals(places[28])) return MarketEntrance.class;
        if (mapName.equals(places[29])) return SacredForestMeadow.class;
        if (mapName.equals(places[30])) return ShadowTemple.class;
        if (mapName.equals(places[31])) return SpiritTemple.class;
        if (mapName.equals(places[32])) return TempleOfTime.class;
        if (mapName.equals(places[33])) return TempleOfTimeEntrance.class;
        if (mapName.equals(places[34])) return ThievesHideout.class;
        if (mapName.equals(places[35])) return WaterTemple.class;
        if (mapName.equals(places[36])) return Windmill.class;
        if (mapName.equals(places[37])) return ZorasDomain.class;
        if (mapName.equals(places[38])) return ZorasFountain.class;
        if (mapName.equals(places[39])) return ZorasRiver.class;
        if (mapName.equals(places[40])) return ThievesHideoutOutside.class;
        throw new IllegalArgumentException("Unknown mapName: " + mapName);
    }

    public static Class classifyByNiceName(final String mapNiceName) {
        String[] places = Constants.NICE_PLACES_WITH_MAP;
        String[] niceNonOverworldExtraPlaces = Constants.NICE_NON_OVERWORLD_EXTRA_PLACES;
        if (mapNiceName.equals(places[0])) return BottomOfTheWell.class;
        if (mapNiceName.equals(places[1])) return DampesGrave.class;
        if (mapNiceName.equals(places[2])) return DeathMountainCrater.class;
        if (mapNiceName.equals(places[3])) return DeathMountainTrail.class;
        if (mapNiceName.equals(places[4])) return DesertColossus.class;
        if (mapNiceName.equals(places[5])) return DodongosCavern.class;
        if (mapNiceName.equals(places[6])) return FireTemple.class;
        if (mapNiceName.equals(places[7])) return ForestTemple.class;
        if (mapNiceName.equals(places[8])) return GerudosFortress.class;
        if (mapNiceName.equals(places[9])) return GerudoTrainingGround.class;
        if (mapNiceName.equals(places[10])) return GerudoValley.class;
        if (mapNiceName.equals(places[11])) return GoronCity.class;
        if (mapNiceName.equals(places[12])) return Graveyard.class;
        if (mapNiceName.equals(places[13])) return HauntedWasteland.class;
        if (mapNiceName.equals(places[14])) return HyruleCastle.class;
        if (mapNiceName.equals(places[15])) return HyruleField.class;
        if (mapNiceName.equals(places[16])) return IceCavern.class;
        if (mapNiceName.equals(places[17])) return InsideGanonsCastle.class;
        if (mapNiceName.equals(places[18])) return InsideJabuJabusBelly.class;
        if (mapNiceName.equals(places[19])) return InsideTheDekuTree.class;
        if (mapNiceName.equals(places[20]) ||
                mapNiceName.equals(niceNonOverworldExtraPlaces[0]) ||
                mapNiceName.equals(niceNonOverworldExtraPlaces[1])) return KakarikoPotionShop.class;
        if (mapNiceName.equals(places[21])) return KakarikoVillage.class;
        if (mapNiceName.equals(places[22])) return KokiriForest.class;
        if (mapNiceName.equals(places[23])) return LakeHylia.class;
        if (mapNiceName.equals(places[24])) return LinksHouse.class;
        if (mapNiceName.equals(places[25])) return LonLonRanch.class;
        if (mapNiceName.equals(places[26])) return LostWoods.class;
        if (mapNiceName.equals(places[27])) return Market.class;
        if (mapNiceName.equals(places[28])) return MarketEntrance.class;
        if (mapNiceName.equals(places[29])) return SacredForestMeadow.class;
        if (mapNiceName.equals(places[30])) return ShadowTemple.class;
        if (mapNiceName.equals(places[31])) return SpiritTemple.class;
        if (mapNiceName.equals(places[32])) return TempleOfTime.class;
        if (mapNiceName.equals(places[33])) return TempleOfTimeEntrance.class;
        if (mapNiceName.equals(places[34])) return ThievesHideout.class;
        if (mapNiceName.equals(places[35])) return WaterTemple.class;
        if (mapNiceName.equals(places[36])) return Windmill.class;
        if (mapNiceName.equals(places[37])) return ZorasDomain.class;
        if (mapNiceName.equals(places[38])) return ZorasFountain.class;
        if (mapNiceName.equals(places[39])) return ZorasRiver.class;
        if (mapNiceName.equals(places[40])) return ThievesHideoutOutside.class;
        throw new IllegalArgumentException("Unknown mapNiceName: " + mapNiceName);
    }
}
