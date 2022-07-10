package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Time;

public class Settings {
    private static Settings settings = null;
    private final Time time;
    private Perspective perspective;

    private Settings(final Time time, final Perspective perspective) {
        this.time = time;
        this.perspective = perspective;
    }

    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings(Time.getInstance(), Perspective.SIDE);
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
}
