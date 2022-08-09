package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Time;

public class Settings {
    private static Settings settings = null;
    private final Time time;
    private Perspective perspective;
    private String hideShow;
    private RememberWayBackMode rwbm;

    private Settings(final Time time, final Perspective perspective, final String hideShow, final RememberWayBackMode rwbm) {
        this.time = time;
        this.perspective = perspective;
        this.hideShow = hideShow;
        this.rwbm = rwbm;
    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = loadSettings();
            if (settings == null) {
                settings = createDefaultSettings();
            }
        }
        return settings;
    }

    private static Settings createDefaultSettings() {
        return new Settings(Time.getInstance(), Perspective.SIDE, "show", RememberWayBackMode.DO_NOT_REMEMBER);
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


    public String getHideShow() {
        return hideShow;
    }

    private void setHideShow(final String hideShow) {
        if (hideShow == null) {
            throw new IllegalArgumentException("hideShow may not be null.");
        } else {
            if (hideShow.equals("hide") | hideShow.equals("show")) {
                this.hideShow = hideShow;
            } else {
                throw new IllegalArgumentException("hideShow must be either 'hide' or 'show'.");
            }
        }
    }

    public void switchHideShow() {
        if (hideShow.equals("show")) hideShow = "hide";
        else hideShow = "show";
    }

    public RememberWayBackMode getRwbm() {
        return rwbm;
    }

    public void setRwbm(final RememberWayBackMode rwbm) {
        this.rwbm = rwbm;
    }

    /**
     * Creates a Settings instance from a file.
     * Should only be used in getInstance() since settings is a singleton and there should only ever be one instance of Settings.
     *
     * @return either a Settings instance or null if none was found.
     */
    private static Settings loadSettings() {
        if (settingsStored()) {
            return new Settings(null, null, null, null); // ToDo
        } else return null;
    }

    /**
     * Check whether a settings file exists.
     *
     * @return true if settings file exists, else false.
     */
    private static boolean settingsStored() {
        // ToDo
        return false;
    }
}
