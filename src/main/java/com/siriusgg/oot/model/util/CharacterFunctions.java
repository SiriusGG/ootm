package com.siriusgg.oot.model.util;

public class CharacterFunctions {
    public static boolean isStandardAlphaNumericalCharacter(final char character) {
        if (character >= 'a' && character <= 'z') return true;
        if (character >= 'A' && character <= 'Z') return true;
        return character >= '0' && character <= '9';
    }
}
