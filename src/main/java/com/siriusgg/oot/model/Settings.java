package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.time.Time;
import com.siriusgg.oot.model.util.SaveLoad;

public class Settings {
    private static Settings settings = null;
    private final Time time;
    private Perspective perspective;
    private HideShowTransitionsMode hideShowTransitionsMode;
    private RememberWayBackMode rememberWayBackMode;
    private boolean masterQuestJabuJabu;
    private PlaceWithMap childHomeLocation;
    private PlaceWithMap adultHomeLocation;

    private Settings(final Time time,
                     final Perspective perspective,
                     final HideShowTransitionsMode hideShowTransitionsMode,
                     final RememberWayBackMode rememberWayBackMode,
                     final boolean masterQuestJabuJabu,
                     final PlaceWithMap childHomeLocation,
                     final PlaceWithMap adultHomeLocation) {
        this.time = time;
        this.perspective = perspective;
        this.hideShowTransitionsMode = hideShowTransitionsMode;
        this.rememberWayBackMode = rememberWayBackMode;
        this.childHomeLocation = childHomeLocation;
        this.adultHomeLocation = adultHomeLocation;
        this.masterQuestJabuJabu = masterQuestJabuJabu;
    }

    public static Settings getInstance(final String seedName) {
        if (settings == null) {
            settings = SaveLoad.loadSettings(seedName);
            if (settings == null) {
                settings = createDefaultSettings();
                SaveLoad.saveSettings(seedName, settings);
            }
        }
        return settings;
    }

    public static Settings getInstance() { // ToDo: Get rid of this method
        if (settings == null) {
            settings = createDefaultSettings();
        }
        return settings;
    }

    private static Settings createDefaultSettings() {
        return new Settings(Time.getInstance(), Perspective.SIDE, HideShowTransitionsMode.SHOW,
                RememberWayBackMode.DO_NOT_REMEMBER, true, PlaceWithMap.LINKS_HOUSE, PlaceWithMap.TEMPLE_OF_TIME);
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

    public void setMasterQuestJabuJabu(final boolean masterQuestJabuJabu) {
        this.masterQuestJabuJabu = masterQuestJabuJabu;
    }

    public PlaceWithMap getChildHomeLocation() {
        return childHomeLocation;
    }

    public void setChildHomeLocation(final PlaceWithMap childHomeLocation) {
        this.childHomeLocation = childHomeLocation;
    }

    public PlaceWithMap getAdultHomeLocation() {
        return adultHomeLocation;
    }

    public void setAdultHomeLocation(final PlaceWithMap adultHomeLocation) {
        this.adultHomeLocation = adultHomeLocation;
    }

    public void dissolve() {
        settings = null;
    }
}
