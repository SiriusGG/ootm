package com.siriusgg.oot.controller;

import com.siriusgg.oot.view.*;

public class ShopsController {
    final String seedName;
    final CurrentLocationFrame clf;

    public ShopsController(final String seedName, final CurrentLocationFrame clf) {
        this.seedName = seedName;
        this.clf = clf;
    }

    public void init() {
        new ShopsFrame(); // ToDo
    }
}
