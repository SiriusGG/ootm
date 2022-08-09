package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.places.exitmaps.*;

public class MapClassifier {
    public static Class classify(final String mapNiceName) {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String[] places = pli.getNicePlacesWithMap();
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
        if (mapNiceName.equals(places[20])) return KakarikoPotionShop.class;
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
