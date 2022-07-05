package com.siriusgg.oot.model;

import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Time;

public class Settings {
    private Time time;
    private Perspective perspective;

    public Settings() {
        time = null;
        perspective = null;
    }

    public Settings(final Time time, final Perspective perspective) {
        this.time = time;
        this.perspective = perspective;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Perspective getPerspective() {
        return perspective;
    }

    public void setPerspective(Perspective perspective) {
        this.perspective = perspective;
    }
}
