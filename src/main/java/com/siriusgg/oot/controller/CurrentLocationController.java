package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.*;
import com.siriusgg.oot.model.time.*;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.swing.*;
import java.io.File;
import java.net.*;

public class CurrentLocationController {
    private ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;

    public CurrentLocationController(final ExitMap exitMap) {
        this.exitMap = exitMap;
    }

    public void init() {
        ImageIcon graphic;
        File mapFile;
        try {
            mapFile = getFileFromResource(exitMap.getMap());
            graphic = new ImageIcon(mapFile.getAbsolutePath());
            iiMap = ImageIconFunctions.limitSize(graphic, 80);
        } catch (final URISyntaxException | IllegalArgumentException e) {
            if (iiMap == null) {
                try {
                    Time.getInstance().changeAge();
                    mapFile = getFileFromResource(exitMap.getMap());
                    graphic = new ImageIcon(mapFile.getAbsolutePath());
                    iiMap = ImageIconFunctions.limitSize(graphic, 80);
                    Time.getInstance().changeAge();
                } catch (final URISyntaxException | IllegalArgumentException ex) {
                    e.printStackTrace();
                }
            }
        }
        clf = new CurrentLocationFrame(this);
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    public void reInit(final ExitMap exitMap) {
        this.exitMap = exitMap;
        ImageIcon graphic;
        File mapFile;
        try {
            mapFile = getFileFromResource(exitMap.getMap());
            graphic = new ImageIcon(mapFile.getAbsolutePath());
            iiMap = ImageIconFunctions.limitSize(graphic, 80);
        } catch (final URISyntaxException | IllegalArgumentException e) {
            if (iiMap == null) {
                try {
                    Time.getInstance().changeAge();
                    mapFile = getFileFromResource(exitMap.getMap());
                    graphic = new ImageIcon(mapFile.getAbsolutePath());
                    iiMap = ImageIconFunctions.limitSize(graphic, 80);
                    Time.getInstance().changeAge();
                } catch (final URISyntaxException | IllegalArgumentException ex) {
                    e.printStackTrace();
                }
            }
        }
        clf.reInit();
        ComponentFunctions.center(clf);
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

    public void fillMapsComboBox(final JComboBox<String> mapsComboBox) {
        for (PlaceWithMap pwm : PlaceWithMap.values()) {
            try {
                mapsComboBox.addItem(pwm.getName());
            } catch (final UnknownPlaceWithMapException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillAgesComboBox(final JComboBox<String> ageComboBox) {
        for (Age a : Age.values()) {
            try {
                ageComboBox.addItem(Age.getAgeString(a));
            } catch (final UnknownAgeException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillPerspectivesComboBox(final JComboBox<String> perspectiveComboBox) {
        for (Perspective p : Perspective.values()) {
            try {
                perspectiveComboBox.addItem(Perspective.getPerspectiveString(p));
            } catch (final UnknownPerspectiveException e) {
                e.printStackTrace();
            }
        }
    }

    public void setSelectedMap(final JComboBox<String> mapsComboBox) {
        mapsComboBox.setSelectedItem(exitMap.getName());
    }

    public void setSelectedAge(final JComboBox<String> ageComboBox) {
        try {
            ageComboBox.setSelectedItem(Age.getAgeString(Settings.getInstance().getTime().getAge()));
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
    }

    public void setSelectedPerspective(final JComboBox<String> perspectiveComboBox) {
        try {
            perspectiveComboBox.setSelectedItem(Perspective.getPerspectiveString(Settings.getInstance().getPerspective()));
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(final String selectedItem) {
        try {
            reInit(ExitMap.toExitMap(selectedItem));
        } catch (UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadAge(final String selectedItem) throws UnknownAgeStringException {
        try {
            if (selectedItem.equals(Age.getAgeString(Age.CHILD))) {
                Settings.getInstance().getTime().setChild();
            } else if (selectedItem.equals(Age.getAgeString(Age.ADULT))) {
                Settings.getInstance().getTime().setAdult();
            } else throw new UnknownAgeStringException(selectedItem);
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.toExitMap(exitMap.getName()));
        } catch (UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadPerspective(final String selectedItem) throws UnknownPerspectiveStringException {
        try {
            if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.SIDE))) {
                Settings.getInstance().setPerspective(Perspective.SIDE);
            } else if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.TOP))) {
                Settings.getInstance().setPerspective(Perspective.TOP);
            } else throw new UnknownPerspectiveStringException(selectedItem);
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.toExitMap(exitMap.getName()));
        } catch (UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }
}
