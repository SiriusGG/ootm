package com.siriusgg.oot.model.places;

import com.siriusgg.oot.model.util.*;

public class AutomaticWayBack {
    public static boolean moreThanOneOption(final ExitMap exitMap, final ExitType exitType) {
        int length = getOptions(exitMap, exitType).length;
        if (length >= 2) {
            return true;
        } else if (length == 1) {
            return false;
        } else {
            throw new IllegalArgumentException("exitMap " + exitMap.getNiceName() + " has no plausible options.");
        }
    }

    private static String[] getOptions(final ExitMap exitMap, final ExitType exitType) {
        String[] possibleExits;
        switch (exitType) {
            case DOOR_ENTRANCE:
            case DOOR_EXIT:
                possibleExits = ExitMap.getNiceDoorsOf(exitMap);
                break;
            case DUNGEON_ENTRANCE:
            case DUNGEON_EXIT:
                possibleExits = ExitMap.getNiceDungeonsOf(exitMap);
                break;
            case GROTTO_ENTRANCE:
            case GROTTO_EXIT:
                possibleExits = ExitMap.getNiceGrottosOf(exitMap);
                break;
            case OVERWORLD:
            case OWL_START:
                possibleExits = ExitMap.getNiceOverworldsOf(exitMap);
                break;
            default:
                throw new IllegalArgumentException("ExitType " + exitType.name() + " has no defined behaviour.");
        }
        return possibleExits;
    }

    public static void automaticallySetOnlyOption(final ExitMap exitMapFrom, final ExitMap exitMapTo,
                                                  final ExitType exitType, final String seedName) {
        if (moreThanOneOption(exitMapFrom, exitType)) {
            throw new IllegalStateException("Cannot determine automatic way back if there are multiple options.");
        } else {
            String connection = StringFunctions.mapNameToMapId(getOptions(exitMapFrom, exitType)[0]);
            for (int i = 0; i < exitMapFrom.getExitsAmount(); i++) {
                Exit maybeExit = exitMapFrom.getExit(i);
                String exitName = maybeExit.getName();
                if (exitName.endsWith(connection) ||
                        (exitName.contains(connection) && !maybeExit.getName().startsWith(connection))) {
                    maybeExit.setDestinationExitMap(exitMapTo.getClass());
                    break;
                }
            }
        }
        SaveLoad.saveExitMap(seedName, exitMapFrom);
    }

    @SuppressWarnings("unused")
    public static int countOptions(final ExitMap exitMap, final ExitType exitType) {
        return getOptions(exitMap, exitType).length;
    }
}
