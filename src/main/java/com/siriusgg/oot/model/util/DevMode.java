package com.siriusgg.oot.model.util;

import java.util.ArrayList;

public enum DevMode {
    TRANSITION_BUTTON_DRAGGABLE;

    public boolean isContained(final ArrayList<DevMode> devModes) {
        for (final DevMode devMode : devModes) {
            if (devMode == this) return true;
        }
        return false;
    }

    public static boolean isActive(final DevMode devMode) {
        ArrayList<DevMode> devModes = DevTools.getInstance().getDevModes();
        return devMode.isContained(devModes);
    }
}
