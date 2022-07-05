package com.siriusgg.oot.controller;

import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.Time;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.swing.*;
import java.io.File;
import java.net.*;

public class CurrentLocationController {
    private final ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;

    public CurrentLocationController(final ExitMap exitMap) {
        this.exitMap = exitMap;
    }

    public void init() {
        ImageIcon graphic = null;
        File mapFile = null;
        try {
            mapFile = getFileFromResource(exitMap.getMap());
            graphic = new ImageIcon(mapFile.getAbsolutePath());
            iiMap = ImageIconFunctions.limitSize(graphic, 80);
        } catch (URISyntaxException | IllegalArgumentException e) {
            if (iiMap == null) {
                try {
                    Time.getInstance().changeAge();
                    mapFile = getFileFromResource(exitMap.getMap());
                    graphic = new ImageIcon(mapFile.getAbsolutePath());
                    iiMap = ImageIconFunctions.limitSize(graphic, 80);
                    Time.getInstance().changeAge();
                } catch (URISyntaxException | IllegalArgumentException ex) {
                    e.printStackTrace();
                }
            }
        }
        clf = new CurrentLocationFrame(this);
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    public int getMapWidth() {
        return iiMap.getIconWidth();
    }

    public int getMapHeight() {
        return iiMap.getIconHeight();
    }

    public ImageIcon getMapImage() {
        return iiMap;
    }

    private File getFileFromResource(final String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }
}
