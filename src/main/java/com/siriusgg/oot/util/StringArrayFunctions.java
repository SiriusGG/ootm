package com.siriusgg.oot.util;

public class StringArrayFunctions {
    public static boolean contains(final String[] stringArray, final String content) {
        for (String s : stringArray) {
            if (s.equals(content)) {
                return true;
            }
        }
        return false;
    }
}
