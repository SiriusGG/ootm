package com.siriusgg.oot.model.time;

public class Time {
    private static Time time = null;
    private Age age;

    private Time(final Age age) {
        this.age = age;
    }

    public static Time getInstance() {
        if (time == null) {
            time = new Time(Age.CHILD);
        }
        return time;
    }

    public void setChild() {
        age = Age.CHILD;
    }

    public void setAdult() {
        age = Age.ADULT;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(final Age age) {
        this.age = age;
    }

    public void dissolve() {
        time = null;
    }

    public void switchAge() {
        switch (age) {
            case CHILD:
                age = Age.ADULT;
                return;
            case ADULT:
                age = Age.CHILD;
        }
    }
}
