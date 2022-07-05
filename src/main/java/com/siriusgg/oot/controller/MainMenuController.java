package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.teststuff.OpenAllMaps;
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
        /*
        Settings settings = new Settings(Time.getInstance(), Perspective.SIDE);
        ExitMap exitMap = new KokiriForest(settings);
        CurrentLocationController clc = new CurrentLocationController(exitMap);
        clc.init();
         */
        OpenAllMaps.openAllMaps();
        mmf.dispose();
    }

    public void loadMap() {
        // ToDo
    }

    public void about() {
        new AboutController();
    }
}
