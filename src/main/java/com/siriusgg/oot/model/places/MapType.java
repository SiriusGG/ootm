package com.siriusgg.oot.model.places;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.util.StringArrayFunctions;

public enum MapType {
    ADDITIONAL_CONNECTION,
    ADULT_ONLY,
    DUNGEON,
    OVERWORLD,
    ZOOM;

    public static String getMapDirectoryString(final MapType mapType) throws UnknownMapTypeException {
        if (mapType == MapType.ADDITIONAL_CONNECTION) {
            return OoTMConstants.ADDITIONAL_CONNECTIONS_DIRECTORY;
        } else if (mapType == MapType.DUNGEON) {
            return OoTMConstants.DUNGEONS_DIRECTORY;
        } else if (mapType == MapType.ADULT_ONLY) {
            return OoTMConstants.ADULT_ONLY_DIRECTORY;
        } else if (mapType == MapType.OVERWORLD) {
            return OoTMConstants.OVERWORLD_DIRECTORY;
        } else if (mapType == MapType.ZOOM) {
            return OoTMConstants.ZOOM_DIRECTORY;
        } else {
            throw new UnknownMapTypeException(mapType);
        }
    }

    public static MapType getMypTypeByMapId(final String mapId) throws UnknownMapIdException {
        if (StringArrayFunctions.contains(OoTMConstants.ADDITIONAL_CONNECTIONS, mapId)) {
            return MapType.ADDITIONAL_CONNECTION;
        } else if (StringArrayFunctions.contains(OoTMConstants.ADULT_ONLY_CONNECTIONS, mapId)) {
            return MapType.ADULT_ONLY;
        } else if (StringArrayFunctions.contains(OoTMConstants.DUNGEONS, mapId)) {
            return MapType.DUNGEON;
        } else if (StringArrayFunctions.contains(OoTMConstants.OVERWORLDS, mapId)) {
            return MapType.OVERWORLD;
        } else if (StringArrayFunctions.contains(OoTMConstants.ZOOM, mapId)) {
            return MapType.ZOOM;
        } else {
            throw new UnknownMapIdException(mapId);
        }
    }
}
