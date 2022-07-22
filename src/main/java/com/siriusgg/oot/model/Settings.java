package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Time;

public class Settings {
    private static Settings settings = null;
    private final Time time;
    private Perspective perspective;
    private String hideShow;

    private Settings(final Time time, final Perspective perspective, final String hideShow) {
        this.time = time;
        this.perspective = perspective;
        this.hideShow = hideShow;
    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings(Time.getInstance(), Perspective.SIDE, "show");
        }
        return settings;
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
}
