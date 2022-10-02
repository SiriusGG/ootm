package com.siriusgg.oot.util;

import java.util.ArrayList;
import java.util.stream.*;

public class IntArrayFunctions {
    public static boolean isUnsortedIndexArray(final int[] input) {
        if (input == null) return false;
        else {
            ArrayList<Integer> r = IntStream.of(input).boxed().collect(Collectors.toCollection(ArrayList::new));
            for (int i = 0; i < input.length; i++) {
                if (r.contains(i)) {
                    if (!r.remove((Integer)i)) { // cast, so remove(Object o) is used instead of remove(int index)
                        throw new IllegalStateException("Tried to remove " + i + " from remaining list. Did not work.");
                    }
                } else {
                    return false;
                }
            }
            return r.isEmpty();
        }
    }

    public static boolean isSortedIndexArray(final int[] possibleIndexes) {
        if (possibleIndexes == null) return false;
        else {
            for (int i = 0; i < possibleIndexes.length; i++) {
                if (possibleIndexes[i] != i) {
                    return false;
                }
            }
            return true;
        }
    }
}
