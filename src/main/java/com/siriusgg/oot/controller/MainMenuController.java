package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.places.ExitMap;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.view.MainMenuFrame;

public class MainMenuController {
    private MainMenuFrame mmf;

    public MainMenuController() {}

    public void init() {
        mmf = new MainMenuFrame(this);
        ComponentFunctions.center(mmf);
        mmf.setVisible(true);
    }

    public void newMap() {
        mmf.setVisible(false);
        ExitMap exitMap = new LinksHouse();
        CurrentLocationController clc = new CurrentLocationController(exitMap);
        clc.init();
        mmf.dispose();
    }

    public void loadMap() {
        // ToDo
    }

    public void about() {
        AboutController ac = new AboutController();
        ac.init();
    }
}
