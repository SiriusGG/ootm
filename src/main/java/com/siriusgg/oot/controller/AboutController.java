package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.view.AboutFrame;

public class AboutController {
    public AboutController() {}

    public void init() {
        AboutFrame af = new AboutFrame();
        af.init();
        ComponentFunctions.center(af);
    }
}
