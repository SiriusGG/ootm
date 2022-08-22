package com.siriusgg.oot.model.util;

import java.util.*;

/**
 * A singleton which manages the list of active development modes (aka DevModes).
 */
@SuppressWarnings("unused")
public class DevTools {
    /**
     * The only existing instance of this class.
     */
    private static DevTools devTools = null;

    /**
     * A list of all active DevModes.
     */
    private final ArrayList<DevMode> devModes;

    /**
     * The private constructor only used in DevTools.getInstance().
     */
    private DevTools() {
        devModes = new ArrayList<>();
    }

    /**
     * Returns the only instance of the DevTools object.
     *
     * @return the DevTools instance.
     */
    public static DevTools getInstance() {
        if (devTools == null) devTools = new DevTools();
        return devTools;
    }

    /**
     * Returns whether the specified DevMode is in the list of DevModes.
     *
     * @param devMode any DevMode.
     * @return true if the specified DevMode is in the list, else false.
     */
    public boolean hasMode(final DevMode devMode) {
        for (final DevMode currentDevMode : devModes) {
            if (currentDevMode == devMode) return true;
        }
        return false;
    }

    /**
     * Adds the specified DevMode to the list of DevModes if it isn't in it already.
     *
     * @param devMode any DevMode.
     * @return true if the specified DevMode has been added, false if it has already been in the list.
     */
    public boolean addDevMode(final DevMode devMode) {
        if (!hasMode(devMode)) {
            devModes.add(devMode);
            return true;
        }
        return false;
    }

    /**
     * Removes a specified DevMode from the DevModes list if it was in it.
     *
     * @param devMode any DevMode.
     * @return true if operation was successful, false if the specified devMode was not in the list.
     */
    public boolean removeDevMode(final DevMode devMode) {
        if (hasMode(devMode)) {
            devModes.remove(devMode);
            return true;
        }
        return false;
    }
}











