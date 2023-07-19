package com.siriusgg.oot.model.list;

import com.siriusgg.oot.constants.OoTMConstants;

import java.util.Arrays;

public class CowCheckList {
    final boolean[] cowChecks = new boolean[OoTMConstants.COWS_AMOUNT];

    public CowCheckList() {
        Arrays.fill(cowChecks, false);
    }

    public CowCheckList(final boolean[] cowValues) {
        if (cowValues.length == cowChecks.length) {
            System.arraycopy(cowValues, 0, cowChecks, 0, cowValues.length);
        } else {
            throw new IllegalArgumentException("cowValues.length is not identical to cowChecks.length, " +
                    "which should both be equal to OoTMConstants.COWS_AMOUNT.");
        }
    }

    public boolean getCowCheckAt(final int index) {
        if (cowChecks.length >= index + 1) {
            if (index >= 0) {
                return cowChecks[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public void setCowCheckAt(final int index, final boolean value) {
        if (cowChecks.length >= index + 1) {
            if (index >= 0) {
                cowChecks[index] = value;
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }
}
