package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.model.util.StringArrayFunctions;

import java.util.Arrays;

public class NiceNames {
    public static String toNiceName(final String origName) {
        String[] mainPlaces = OoTMConstants.PLACES_WITH_MAP;
        String[] niceMainPlaces = OoTMConstants.NICE_PLACES_WITH_MAP;
        String[] additionalConnections = OoTMConstants.ADDITIONAL_CONNECTIONS;
        String[] niceAdditionalConnections = OoTMConstants.NICE_ADDITIONAL_CONNECTIONS;
        if (StringArrayFunctions.contains(mainPlaces, origName)) {
            int index = Arrays.asList(mainPlaces).indexOf(origName);
            return niceMainPlaces[index];
        }
        if (StringArrayFunctions.contains(additionalConnections, origName)) {
            int index = Arrays.asList(additionalConnections).indexOf(origName);
            return niceAdditionalConnections[index];
        }
        throw new IllegalArgumentException(origName);
    }
}
