package com.siriusgg.oot.model.list;

import com.siriusgg.oot.constants.OoTMConstants;

import java.util.Arrays;

public class BeanSpotCheckList {
    final boolean[] beanChecks = new boolean[OoTMConstants.BEAN_SPOTS_AMOUNT];
    final boolean[] skulltulaChecks = new boolean[OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT];

    public BeanSpotCheckList() {
        Arrays.fill(beanChecks, false);
        Arrays.fill(skulltulaChecks, false);
    }

    public BeanSpotCheckList(final boolean[] beanValues, final boolean[] skulltulaValues) {
        if (beanValues.length == beanChecks.length) {
            System.arraycopy(beanValues, 0, beanChecks, 0, beanValues.length);
        } else {
            throw new IllegalArgumentException("beanValues.length is not identical to beanChecks.length, " +
                    "which should both be equal to OoTMConstants.BEAN_SPOTS_AMOUNT.");
        }
        if (skulltulaValues.length == skulltulaChecks.length) {
            System.arraycopy(skulltulaValues, 0, skulltulaChecks, 0, skulltulaValues.length);
        } else {
            throw new IllegalArgumentException("skulltulaValues.length is not identical to skulltulaChecks.length, " +
                    "which should both be equal to OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT.");
        }
    }

    public boolean getBeanCheckAt(final int index) {
        if (beanChecks.length >= index + 1) {
            if (index >= 0) {
                return beanChecks[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public void setBeanCheckAt(final int index, final boolean value) {
        if (beanChecks.length >= index + 1) {
            if (index >= 0) {
                beanChecks[index] = value;
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public boolean getSkulltulaCheckAt(final int index) {
        if (skulltulaChecks.length >= index + 1) {
            if (index >= 0) {
                return skulltulaChecks[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public void setSkulltulaCheckAt(final int index, final boolean value) {
        if (skulltulaChecks.length >= index + 1) {
            if (index >= 0) {
                skulltulaChecks[index] = value;
            } else {
                throw new ArrayIndexOutOfBoundsException("Expected non-negative value for index. Got " + index + ".");
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }
}
