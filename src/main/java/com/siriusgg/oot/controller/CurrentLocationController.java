package com.siriusgg.oot.controller;

import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.PermanentlyLoadedInformation;
import com.siriusgg.oot.model.Position;
import com.siriusgg.oot.model.Settings;
import com.siriusgg.oot.model.places.ExitType;
import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.places.PlaceWithMap;
import com.siriusgg.oot.model.places.TransitionGraphic;
import com.siriusgg.oot.model.places.exitmaps.ExitMap;
import com.siriusgg.oot.model.time.Age;
import com.siriusgg.oot.model.time.Time;
import com.siriusgg.oot.model.util.ComponentFunctions;
import com.siriusgg.oot.model.util.FileFunctions;
import com.siriusgg.oot.model.util.ImageIconFunctions;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URISyntaxException;

public class CurrentLocationController {
    private ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;
    private FileFunctions fileFunctions;
    private final int transitionButtonSize = 60;

    public CurrentLocationController(final ExitMap exitMap) {
        this.exitMap = exitMap;
    }

    public void init() {
        ImageIcon graphic;
        File mapFile;
        fileFunctions = FileFunctions.getInstance();
        try {
            mapFile = fileFunctions.getFileFromResource(exitMap.getMap());
            graphic = new ImageIcon(mapFile.getAbsolutePath());
            iiMap = ImageIconFunctions.limitSize(graphic, 80);
        } catch (final URISyntaxException | IllegalArgumentException e) {
            if (iiMap == null) {
                try {
                    Time.getInstance().changeAge();
                    mapFile = fileFunctions.getFileFromResource(exitMap.getMap());
                    graphic = new ImageIcon(mapFile.getAbsolutePath());
                    iiMap = ImageIconFunctions.limitSize(graphic, 80);
                    Time.getInstance().changeAge();
                } catch (final URISyntaxException | IllegalArgumentException ex) {
                    e.printStackTrace();
                }
            }
        }
        clf = new CurrentLocationFrame(this);
        clf.init();
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    public void reInit(final ExitMap exitMap) {
        this.exitMap = exitMap;
        ImageIcon graphic;
        File mapFile;
        try {
            mapFile = fileFunctions.getFileFromResource(exitMap.getMap());
            graphic = new ImageIcon(mapFile.getAbsolutePath());
            iiMap = ImageIconFunctions.limitSize(graphic, 80);
        } catch (final URISyntaxException | IllegalArgumentException e) {
            if (iiMap == null) {
                try {
                    Time.getInstance().changeAge();
                    mapFile = fileFunctions.getFileFromResource(exitMap.getMap());
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

    public void fillMapsComboBox(final JComboBox<String> mapsComboBox) {
        for (String name : PermanentlyLoadedInformation.getInstance().getPlacesWithMap()) {
            mapsComboBox.addItem(name);
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
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void drawTransitionBoxes() {
        int mapWidth = getMapWidth();
        int mapHeight = getMapHeight();
        try {
            Position[] exitPositions = exitMap.getExitPositions();
            for (int i = 0; i < exitPositions.length; i++) {
                Position exitPosition = exitPositions[i];
                JButton transitionButton = new JButton();
                try {
                    setButtonImage(transitionButton, exitMap.getExit(i).getExitType());
                } catch (UnknownExitTypeException e) {
                    e.printStackTrace();
                }
                transitionButton.setBounds((int) (mapWidth * (exitPosition.getX() / 100)),
                        (int) (mapHeight * (exitPosition.getY() / 100)), transitionButtonSize, transitionButtonSize);
                transitionButton.setBackground(Color.WHITE);
                transitionButton.setActionCommand(exitMap.getExit(i).getName());
                transitionButton.setVisible(true);
                transitionButton.addActionListener(this::transitionButtonActionPerformed);
                clf.getTransitionLayeredPane().add(transitionButton, JLayeredPane.MODAL_LAYER);
            }
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
    }

    private void transitionButtonActionPerformed(final ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand());
        // ToDo
    }

    public void setButtonImage(final JButton button, final ExitType exitType) throws UnknownExitTypeException {
        ImageIcon origImage = null;
        try {
            switch (exitType) {
                case DOOR_ENTRANCE:
                case DOOR_EXIT:
                    origImage = new ImageIcon(TransitionGraphic.DOOR.getTransitionGraphicPath());
                    break;
                case DUNGEON_ENTRANCE:
                case DUNGEON_EXIT:
                    origImage = new ImageIcon(TransitionGraphic.DUNGEON.getTransitionGraphicPath());
                    break;
                case GROTTO_ENTRANCE:
                case GROTTO_EXIT:
                    origImage = new ImageIcon(TransitionGraphic.GROTTO.getTransitionGraphicPath());
                    break;
                case OVERWORLD:
                    origImage = new ImageIcon(TransitionGraphic.OVERWORLD.getTransitionGraphicPath());
                    break;
                case OWL_START:
                case OWL_LANDING:
                    origImage = new ImageIcon(TransitionGraphic.OWL.getTransitionGraphicPath());
                    break;
                case UNCHANGING:
                    // ToDo: "Unchanging" transition graphic?
                case WARP:
                    // ToDo: "Warp" transition graphic?
                    break;
                default:
                    throw new UnknownExitTypeException(exitType);
            }
        } catch(final UnknownTransitionGraphicException e){
            e.printStackTrace();
        }
        if (origImage != null) {
            Image oldImage = origImage.getImage();
            Image newImage = oldImage.getScaledInstance(transitionButtonSize, transitionButtonSize, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(newImage));
        }
    }

    public void hideTransitionBoxes() {
        Component[] components = clf.getTransitionLayeredPane().getComponents();
        for (final Component component : components) {
            if (!(component instanceof JLabel)) {
                clf.getTransitionLayeredPane().remove(component);
            }
        }
    }
}
