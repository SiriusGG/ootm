package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Time;
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
        Settings settings = new Settings(Time.getInstance(), Perspective.SIDE);
        ExitMap exitMap = new KokiriForest(settings);
        CurrentLocationController clc = new CurrentLocationController(exitMap);
        clc.init();
        mmf.dispose();
    }

    public void loadMap() {
        // ToDo
    }

    public void about() {
        new AboutController();
    }
}
