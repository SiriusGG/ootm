package com.siriusgg.oot.model.places;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.util.StringArrayFunctions;

import static com.siriusgg.oot.model.BuildData.*;

public enum MapType {
    ADDITIONAL_CONNECTION,
    DUNGEON,
    OVERWORLD;

    public static String getMapTypeString(final MapType mapType) throws UnknownMapTypeException {
        if (mapType == MapType.ADDITIONAL_CONNECTION) {
            return ADDITIONAL_CONNECTIONS_DIRECTORY;
        } else if (mapType == MapType.DUNGEON) {
            return DUNGEONS_DIRECTORY;
        } else if (mapType == MapType.OVERWORLD) {
            return OVERWORLD_DIRECTORY;
        } else {
            throw new UnknownMapTypeException(mapType);
        }
    }

    public static MapType getMypTypeByMapId(final String mapId) throws UnknownMapIdException {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        if (StringArrayFunctions.contains(pli.getAdditionalConnections(), mapId)) {
            return MapType.ADDITIONAL_CONNECTION;
        } else if (StringArrayFunctions.contains(pli.getDungeons(), mapId)) {
            return MapType.DUNGEON;
        } else if (StringArrayFunctions.contains(pli.getOverworld(), mapId)) {
            return MapType.OVERWORLD;
        } else {
            throw new UnknownMapIdException(mapId);
        }
    }
}
