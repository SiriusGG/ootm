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
        temp = temp.replaceAll(" of ", " Of ");
        temp = temp.replaceAll(" the ", " The ");
        return removeSpecialCharacters(temp);
    }

    /**
     * Returns a copy of the input String without characters which are neither alphabetical nor numerical.
     * If the input String is null, the result is null.
     * If the input String is empty or contains only special characters, the result is empty.
     *
     * @param string any String.
     * @return a copy of the String without special characters.
     */
    public static String removeSpecialCharacters(final String string) {
        if (string != null) {
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                if (CharacterFunctions.isStandardAlphaNumericalCharacter(string.charAt(i))) {
                    output.append(string.charAt(i));
                }
            }
            return output.toString();
        } else {
            return null;
        }
    }

    public static String toForwardSlashes(final String string) {
        if (string != null) {
            if (!string.equals("")) {
                StringBuilder output = new StringBuilder();
                char c;
                for (int i = 0; i < string.length(); i++) {
                    c = string.charAt(i);
                    if (c == '\\') {
                        output.append("/");
                    } else {
                        output.append(c);
                    }
                }
                return output.toString();
            } else {
                return "";
            }
        } else {
            return null;
        }
    }

    public static boolean startsWithDigit(final String string) {
        return CharacterFunctions.isDigit(string.charAt(0));
    }
}
