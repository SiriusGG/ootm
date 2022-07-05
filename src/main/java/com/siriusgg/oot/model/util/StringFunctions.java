package com.siriusgg.oot.model.util;

public class StringFunctions {
    public static String removeAllWhiteSpaces(final String string) {
        String output = string;
        output = output.replaceAll(" ", "");
        return output;
    }

    public static String removeAllApostrophes(final String string) {
        String output = string;
        output = output.replaceAll("'", "");
        return output;
    }

    public static String removeAllDashes(final String string) {
        String output = string;
        output = output.replaceAll("-", "");
        return output;
    }

    public static String mapNameToMapId(final String mapName) {
        String temp = mapName;
        temp = temp.replaceAll("Temple of Time Entrance", "ToTEntrance");
        temp = temp.replaceAll(" of ", " Of ");
        temp = temp.replaceAll(" the ", " The ");
        return removeAllDashes(removeAllApostrophes(removeAllWhiteSpaces(temp)));
    }
}
