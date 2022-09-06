package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Time;
import com.siriusgg.oot.model.util.SaveLoad;

public class Settings {
    private static Settings settings = null;
    private final Time time;
    private Perspective perspective;
    private HideShowTransitionsMode hideShowTransitionsMode;
    private RememberWayBackMode rememberWayBackMode;
    private boolean masterQuestJabuJabu;

    private Settings(final Time time,
                     final Perspective perspective,
                     final HideShowTransitionsMode hideShowTransitionsMode,
                     final RememberWayBackMode rememberWayBackMode,
                     final boolean masterQuestJabuJabu) {
        this.time = time;
        this.perspective = perspective;
        this.hideShowTransitionsMode = hideShowTransitionsMode;
        this.rememberWayBackMode = rememberWayBackMode;
        this.masterQuestJabuJabu = masterQuestJabuJabu;
    }

    public static Settings getInstance(final String seedName) {
        if (settings == null) {
            settings = loadSettings(seedName);
            if (settings == null) {
                settings = createDefaultSettings();
            }
        }
        return settings;
    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = createDefaultSettings();
        }
        return settings;
    }

    private static Settings createDefaultSettings() {
        return new Settings(Time.getInstance(), Perspective.SIDE,
                HideShowTransitionsMode.SHOW, RememberWayBackMode.DO_NOT_REMEMBER, true);
    }

    /**
     * Creates a Settings instance from a file.
     * Should only be used in getInstance() since Settings is a singleton and there should only ever be one instance of Settings.
     *
     * @param seedName Any seed name. May not contain special characters.
     * @return Either a Settings instance or null if none was found.
     */
    private static Settings loadSettings(final String seedName) {
        return SaveLoad.loadSettings(seedName);
    }

    public Time getTime() {
        return time;
    }

    public Perspective getPerspective() {
        return perspective;
    }

    public void setPerspective(final Perspective perspective) {
        this.perspective = perspective;
    }

    public HideShowTransitionsMode getHideShowTransitionsMode() {
        return hideShowTransitionsMode;
    }

    public void setHideShowTransitionsMode(final HideShowTransitionsMode hideShowTransitionsMode) {
        switch (hideShowTransitionsMode) {
            case HIDE:
            case SHOW:
                this.hideShowTransitionsMode = hideShowTransitionsMode;
                break;
            default:
                throw new IllegalArgumentException("hideShowTransitionMode must be either HIDE or SHOW");
        }
    }

    public void switchHideShowTransitionMode() {
        if (hideShowTransitionsMode != null) {
            if (hideShowTransitionsMode == HideShowTransitionsMode.HIDE) {
                hideShowTransitionsMode = HideShowTransitionsMode.SHOW;
            } else {
                hideShowTransitionsMode = HideShowTransitionsMode.HIDE;
            }
        } else {
            throw new IllegalStateException("hideShowTransitionMode was null before this operation.");
        }
    }

    public RememberWayBackMode getRememberWayBackMode() {
        return rememberWayBackMode;
    }

    public void setRememberWayBackMode(final RememberWayBackMode rememberWayBackMode) {
        this.rememberWayBackMode = rememberWayBackMode;
    }

    public boolean hasMasterQuestJabuJabu() {
        return masterQuestJabuJabu;
    }

    public void setMasterQuestJabuJabu(boolean masterQuestJabuJabu) {
        this.masterQuestJabuJabu = masterQuestJabuJabu;
    }

    /**
     * Saves the Settings instance to a file.
     *
     * @param seedName Any seed name. May not contain special characters.
     */
    public void saveSettings(final String seedName) {
        SaveLoad.saveSettings(seedName, this);
    }

    public void dissolve() {
        settings = null;
    }
}
