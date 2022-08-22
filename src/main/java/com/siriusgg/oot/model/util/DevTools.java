package com.siriusgg.oot.model.util;

import java.util.*;

@SuppressWarnings("unused")
public class DevTools {
    private static DevTools devTools = null;

    private final ArrayList<DevMode> devModes;

    private DevTools() {
        devModes = new ArrayList<>();
    }

    public static DevTools getInstance() {
        if (devTools == null) devTools = new DevTools();
        return devTools;
    }

    public ArrayList<DevMode> getDevModes() {
        return devModes;
    }

    /**
     * Adds the specified DevMode to the list of DevModes.
     */
    public void addDevMode(final DevMode devMode) {
        if (!devMode.isContained(devModes)) {
            devModes.add(devMode);
        }
    }

    /**
     * Removes a specified DevMode from the DevModes list if it was in it.
     *
     * @param devMode any DevMode.
     * @return true if operation was successful, false if the specified devMode was not in the list.
     */
    public boolean removeDevMode(final DevMode devMode) {
        if (devMode.isContained(devModes)) {
            devModes.remove(devMode);
            return true;
        }
        return false;
    }
}
