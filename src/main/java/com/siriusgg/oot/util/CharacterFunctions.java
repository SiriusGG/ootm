package com.siriusgg.oot.util;

public class CharacterFunctions {
    public static boolean isStandardAlphaNumericalCharacter(final char character) {
        if (character >= 'a' && character <= 'z') return true;
        if (character >= 'A' && character <= 'Z') return true;
        return character >= '0' && character <= '9';
    }

    public static boolean isDigit(final char character) {
        return character >= '0' && character <= '9';
    }
}
