package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.util.StringArrayFunctions;

import java.util.Arrays;

public class NiceNames {
    public static String toNiceName(final String origName) {
        PermanentlyLoadedInformation pli = PermanentlyLoadedInformation.getInstance();
        String[] mainPlaces = pli.getPlacesWithMap();
        String[] niceMainPlaces = pli.getNicePlacesWithMap();
        String[] additionalConnections = pli.getAdditionalConnections();
        String[] niceAdditionalConnections = pli.getNiceAdditionalConnections();
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
