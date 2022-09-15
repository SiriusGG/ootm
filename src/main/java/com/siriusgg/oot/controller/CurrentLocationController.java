package com.siriusgg.oot.controller;

import com.siriusgg.oot.components.*;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.places.exitmaps.TempleOfTime;
import com.siriusgg.oot.model.time.*;
import com.siriusgg.oot.model.util.*;
import com.siriusgg.oot.view.CurrentLocationFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;

public class CurrentLocationController {
    private final String seedName;
    private final SeedSettings s;
    private ExitMap exitMap;
    private CurrentLocationFrame clf;
    private ImageIcon iiMap = null;
    private int transitionButtonWidth;
    private int transitionButtonHeight;
    private boolean transitionBoxesWereDrawn = false;

    public CurrentLocationController(final String seedName, final ExitMap exitMap) {
        s = SeedSettings.getInstance(seedName);
        this.seedName = seedName;
        this.exitMap = exitMap;
    }

    public void init() {
        if (!SeedSettings.seedSettingsExist(seedName)) SeedSettings.saveSeedSettings(seedName, s);
        setTransitionButtonSizes();
        loadMap();
        initFrame();
    }

    public void initFrame() {
        clf = new CurrentLocationFrame(this);
        clf.init();
        ComponentFunctions.center(clf);
        clf.setVisible(true);
    }

    private void loadMap() {
        ImageIcon mapGraphic = null;
        String mapName = exitMap.getMapGraphicPath();
        try {
            mapGraphic = new ImageIcon(ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(mapName))));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        if (mapGraphic != null) {
            double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            // the following condition is just a complicated way to say
            // "if you have a 1080p monitor and use pre-scaled map files".
            if (screenHeight == 1080 &&
                    ((mapGraphic.getIconWidth() == 1535 || mapGraphic.getIconWidth() == 1536) ||
                            (mapGraphic.getIconHeight() == 863 || mapGraphic.getIconHeight() == 864))) {
                iiMap = mapGraphic; // screen and image size are close enough, no need to resize.
            } else {
                iiMap = ImageIconFunctions.limitSize(mapGraphic, 80); // scale
            }
        }
    }

    public void reInit(final ExitMap exitMap) {
        this.exitMap = exitMap;
        setTransitionButtonSizes();
        loadMap();
        transitionBoxesWereDrawn = false;
        reInitFrame();
    }

    private void setTransitionButtonSizes() {
        try {
            transitionButtonWidth = exitMap.getPreferredButtonWidth();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            transitionButtonWidth = 60;
        }
        try {
            transitionButtonHeight = exitMap.getPreferredButtonHeight();
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
            transitionButtonHeight = 60;
        }
    }

    private void reInitFrame() {
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

    @SuppressWarnings("unused")
    public void reposition(final int x, final int y) {
        clf.setLocation(x, y);
    }

    public void fillMapsComboBox(final JComboBox<String> mapsComboBox) {
        String[] placesWithMap = OoTMConstants.NICE_PLACES_WITH_MAP;
        int maxAmount = OoTMConstants.SELECTABLE_PLACES_AMOUNT;
        for (int i = 0; i < placesWithMap.length; i++) {
            if (i < maxAmount) {
                String name = placesWithMap[i];
                mapsComboBox.addItem(name);
            }
        }
    }

    public void fillAgesComboBox(final JComboBox<String> ageComboBox) {
        for (final Age a : Age.values()) {
            try {
                ageComboBox.addItem(Age.getAgeString(a));
            } catch (final UnknownAgeException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillPerspectivesComboBox(final JComboBox<String> perspectiveComboBox) {
        for (final Perspective p : Perspective.values()) {
            try {
                perspectiveComboBox.addItem(Perspective.getPerspectiveString(p));
            } catch (final UnknownPerspectiveException e) {
                e.printStackTrace();
            }
        }
    }

    public void setSelectedMap(final JComboBox<String> mapsComboBox) {
        mapsComboBox.setSelectedItem(exitMap.getNiceName());
    }

    public void setSelectedAge(final JComboBox<String> ageComboBox) {
        try {
            ageComboBox.setSelectedItem(Age.getAgeString(s.getTime().getAge()));
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
    }

    public void setSelectedPerspective(final JComboBox<String> perspectiveComboBox) {
        try {
            perspectiveComboBox.setSelectedItem(Perspective.getPerspectiveString(s.getPerspective()));
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(final String selectedItem) {
        try {
            reInit(ExitMap.fromString(selectedItem, seedName));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadAge(final String selectedItem) throws UnknownAgeStringException {
        try {
            if (selectedItem.equals(Age.getAgeString(Age.CHILD))) {
                s.getTime().setChild();
            } else if (selectedItem.equals(Age.getAgeString(Age.ADULT))) {
                s.getTime().setAdult();
            } else {throw new UnknownAgeStringException(selectedItem);}
            SeedSettings.saveSeedSettings(seedName, s);
        } catch (final UnknownAgeException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.fromString(exitMap.getNiceName(), seedName));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void loadPerspective(final String selectedItem) throws UnknownPerspectiveStringException {
        try {
            if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.SIDE))) {
                s.setPerspective(Perspective.SIDE);
            } else if (selectedItem.equals(Perspective.getPerspectiveString(Perspective.TOP))) {
                s.setPerspective(Perspective.TOP);
            } else {throw new UnknownPerspectiveStringException(selectedItem);}
            SeedSettings.saveSeedSettings(seedName, s);
        } catch (final UnknownPerspectiveException e) {
            e.printStackTrace();
        }
        try {
            reInit(ExitMap.fromString(exitMap.getNiceName(), seedName));
        } catch (final UnknownPlaceWithMapStringException e) {
            e.printStackTrace();
        }
    }

    public void drawTransitionBoxes(final JLayeredPane layeredPane) {
        if (s.getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            int mapWidth = getMapWidth();
            int mapHeight = getMapHeight();
            if (DevTools.getInstance().hasMode(DevMode.TRANSITION_BUTTON_DRAGGABLE)) {
                drawTransitionBoxesDevModeDraggable(layeredPane, mapWidth, mapHeight);
            } else {
                drawTransitionBoxesNormalMode(layeredPane, mapWidth, mapHeight);
            }
            decideShowTempleOfTimeAgeSwitchButton(layeredPane);
            transitionBoxesWereDrawn = true;
        }
        layeredPane.repaint();
    }

    private void drawTransitionBoxesNormalMode(final JLayeredPane layeredPane, final int mapWidth,
                                               final int mapHeight) {
        if (transitionBoxesWereDrawn) {
            Component[] components = layeredPane.getComponents();
            ArrayList<Component> transitionButtons = ComponentFunctions.toComponentArrayList(components);
            transitionButtons.removeIf(component -> !(component instanceof TransitionButton) &&
                    !(component instanceof TimeSwitchButton));
            for (int i = 0; i < transitionButtons.size(); i++) {
                Component component = transitionButtons.get(i);
                if (component instanceof TransitionButton) {
                    if (s.getTime().getAge() == Age.CHILD) {
                        component.setVisible(exitMap.getExit(i).canBeUsedAsChild());
                    } else if (s.getTime().getAge() == Age.ADULT) {
                        component.setVisible(exitMap.getExit(i).canBeUsedAsAdult());
                    }
                }
            }
        } else {
            Position[] exitPositions = new Position[0];
            try {
                exitPositions = exitMap.getExitPositions();
            } catch (final UnknownPerspectiveException | UnknownAgeException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < exitPositions.length; i++) {
                Position exitPosition = exitPositions[i];
                TransitionButton transitionButton = new TransitionButton(exitMap.getExit(i));
                setTransitionButtonImage(transitionButton, exitMap.getExit(i).getExitType());
                transitionButton.setBounds((int) (mapWidth * (exitPosition.getX() / 100)),
                        (int) (mapHeight * (exitPosition.getY() / 100)),
                        transitionButtonWidth, transitionButtonHeight);
                transitionButton.setBackground(Color.WHITE);
                transitionButton.setActionCommand(exitMap.getExit(i).getName());
                if (s.getTime().getAge() == Age.CHILD) {
                    transitionButton.setVisible(exitMap.getExit(i).canBeUsedAsChild());
                } else if (s.getTime().getAge() == Age.ADULT) {
                    transitionButton.setVisible(exitMap.getExit(i).canBeUsedAsAdult());
                }
                final int finalI = i;
                transitionButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(final MouseEvent e) {
                        showTransitionInformation(e, finalI, layeredPane);
                    }

                    @Override
                    public void mouseExited(final MouseEvent e) {
                        hideTransitionInformation(layeredPane);
                    }

                    @Override
                    public void mouseClicked(final MouseEvent e) {
                        transitionButtonActionPerformed(e, layeredPane);
                    }
                });
                layeredPane.add(transitionButton, JLayeredPane.MODAL_LAYER);
            }
        }
    }

    private void drawTransitionBoxesDevModeDraggable(final JLayeredPane layeredPane, final int mapWidth,
                                                     final int mapHeight) {
        Position[] exitPositions;
        try {
            exitPositions = exitMap.getExitPositions();
        } catch (final UnknownPerspectiveException | UnknownAgeException e) {
            exitPositions = new Position[0];
        }
        if (transitionBoxesWereDrawn) {
            Component[] components = layeredPane.getComponents();
            ArrayList<Component> draggableLabels = ComponentFunctions.toComponentArrayList(components);
            draggableLabels.removeIf(c -> (!(c instanceof DraggableJLabel) && !(c instanceof TimeSwitchButton)));
            for (int i = 0; i < draggableLabels.size(); i++) {
                Component c = draggableLabels.get(i);
                if (c instanceof DraggableJLabel) {
                    if (s.getTime().getAge() == Age.CHILD) {
                        c.setVisible(exitMap.getExit(i).canBeUsedAsChild());
                    } else if (s.getTime().getAge() == Age.ADULT) {
                        c.setVisible(exitMap.getExit(i).canBeUsedAsAdult());
                    }
                } else if (c instanceof TimeSwitchButton) {
                    c.setVisible(true);
                }
            }
        } else {
            for (int i = 0; i < exitPositions.length; i++) {
                DraggableJLabel draggableLabel = new DraggableJLabel();
                Position exitPosition = exitPositions[i];
                setDraggableLabelImage(draggableLabel, exitMap.getExit(i).getExitType());
                draggableLabel.setBounds((int) (mapWidth * (exitPosition.getX() / 100)),
                        (int) (mapHeight * (exitPosition.getY() / 100)),
                        transitionButtonWidth, transitionButtonHeight);
                draggableLabel.setBackground(Color.WHITE);
                if (s.getTime().getAge() == Age.CHILD) {
                    draggableLabel.setVisible(exitMap.getExit(i).canBeUsedAsChild());
                } else if (s.getTime().getAge() == Age.ADULT) {
                    draggableLabel.setVisible(exitMap.getExit(i).canBeUsedAsAdult());
                }
                draggableLabel.setDraggableArea(layeredPane.getSize());
                layeredPane.add(draggableLabel, JLayeredPane.MODAL_LAYER);
            }
        }
    }

    private void showTransitionInformation(final MouseEvent e, final int i, final JLayeredPane layeredPane) {
        int containerWidth = layeredPane.getWidth();
        int containerHeight = layeredPane.getHeight();
        TransitionInformationPanel tip = new TransitionInformationPanel(exitMap.getExit(i));
        JButton button = (JButton) e.getSource();
        int buttonX = button.getX();
        int buttonY = button.getY();
        int buttonWidth = button.getWidth();
        int buttonHeight = button.getHeight();
        int buttonCenterX = buttonX + (buttonWidth / 2);
        int buttonCenterY = buttonY + (buttonHeight / 2);
        int tipWidth = tip.getWidth();
        int tipHeight = tip.getHeight();
        int preferredX = buttonCenterX - (tipWidth / 2);
        int preferredY = buttonCenterY - (tipHeight / 2);
        int leftBorderSpacerPixels = 2;
        int upperBorderSpacerPixels = 1;
        int rightBorderSpacerPixels = 2;
        int lowerBorderSpacerPixels = 1;
        int x = preferredX;
        int y = preferredY;
        if (x < leftBorderSpacerPixels) x = leftBorderSpacerPixels;
        if (y < upperBorderSpacerPixels) y = upperBorderSpacerPixels;
        if (x + tipWidth > containerWidth - rightBorderSpacerPixels) {
            x = containerWidth - tipWidth - rightBorderSpacerPixels;
        }
        if (y + tipHeight > containerHeight - lowerBorderSpacerPixels) {
            y = containerHeight - tipHeight - lowerBorderSpacerPixels;
        }
        tip.setLocation(x, y);
        layeredPane.add(tip, JLayeredPane.POPUP_LAYER);
        layeredPane.repaint();
    }

    private void hideTransitionInformation(final JLayeredPane layeredPane) {
        Component[] components = layeredPane.getComponentsInLayer(JLayeredPane.POPUP_LAYER);
        for (final Component component : components) {
            if (component instanceof TransitionInformationPanel) {
                layeredPane.remove(component);
            }
        }
        layeredPane.repaint();
    }

    private void transitionButtonActionPerformed(final MouseEvent mouseEvent, final JLayeredPane layeredPane) {
        TransitionButton button = (TransitionButton) mouseEvent.getSource();
        Exit exit = button.getExit();
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) { // add on left click
            String[] nonOverworldExtraPlaces = OoTMConstants.NICE_NON_OVERWORLD_EXTRA_PLACES;
            if (exit.getExitType() != ExitType.UNCHANGING) { // dynamic transition
                if (exit.getDestination() == null) {
                    if (exit.getDestinationExitMap() == null) {
                        if (exit.getDestinationString() == null) {
                            AddTransitionController atc = new AddTransitionController(this, exit, seedName);
                            atc.init();
                        } else {
                            if (StringArrayFunctions.contains(nonOverworldExtraPlaces, exit.getDestinationString())) {
                                reInit(ExitMap.fromDestinationString(exit.getDestinationString(), seedName));
                            }
                        }
                    } else {
                        reInit(ExitMap.fromClass(exit.getDestinationExitMap(), seedName));
                    }
                } else {
                    reInit(exit.getDestination().getExitMap());
                }
            } else { // unchanging transition
                if (exit.getDestination() != null) {
                    if (exit.getDestination().getExitMap() != null) {
                        reInit(exit.getDestination().getExitMap());
                    }
                }
                if (exit.getDestinationExitMap() != null) {
                    reInit(ExitMap.fromClass(exit.getDestinationExitMap(), seedName));
                }
            }
            hideTransitionInformation(layeredPane);
        } else if (SwingUtilities.isRightMouseButton(mouseEvent)) { // delete on right click
            if (exit.getDestination() != null ||
                    exit.getDestinationExitMap() != null ||
                    exit.getDestinationString() != null) {
                exit.setDestination(null);
                exit.setDestinationExitMap(null);
                exit.setDestinationString(null);
                SaveLoad.saveExitMap(seedName, exitMap);
                hideTransitionInformation(layeredPane);
            }
        }
    }

    private ImageIcon prepareOriginalImage(final ExitType exitType) throws UnknownExitTypeException {
        ImageIcon origImage = null;
        try {
            switch (exitType) {
                case DOOR_ENTRANCE:
                case DOOR_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.DOOR.getTransitionGraphicPath()))));
                    break;
                case DUNGEON_ENTRANCE:
                case DUNGEON_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.DUNGEON.getTransitionGraphicPath()))));
                    break;
                case GROTTO_ENTRANCE:
                case GROTTO_EXIT:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.GROTTO.getTransitionGraphicPath()))));
                    break;
                case OVERWORLD:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.OVERWORLD.getTransitionGraphicPath()))));
                    break;
                case OWL_START:
                case OWL_LANDING:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.OWL.getTransitionGraphicPath()))));
                    break;
                case UNCHANGING:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.UNCHANGING.getTransitionGraphicPath()))));
                    break;
                case WARP:
                    origImage = new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().
                            getResource(TransitionGraphic.WARP.getTransitionGraphicPath()))));
                    break;
                default:
                    throw new UnknownExitTypeException(exitType);
            }
        } catch (final IOException | UnknownTransitionGraphicException e) {
            e.printStackTrace();
        }
        return origImage;
    }

    private ImageIcon getSafeOriginalImage(final ExitType exitType) {
        ImageIcon origImage = null;
        try {
            origImage = prepareOriginalImage(exitType);
        } catch (final UnknownExitTypeException e) {
            e.printStackTrace();
        }
        return origImage;
    }

    private void setTransitionButtonImage(final JButton button, final ExitType exitType) {
        ImageIcon origImage = getSafeOriginalImage(exitType);
        if (origImage != null) {
            button.setIcon(new ImageIcon(getScaledTransitionImage(origImage.getImage())));
        }
    }

    private Image getScaledTransitionImage(final Image origImage) {
        return origImage.getScaledInstance(transitionButtonWidth, transitionButtonHeight, Image.SCALE_SMOOTH);
    }

    private void setDraggableLabelImage(final DraggableJLabel draggableLabel, final ExitType exitType) {
        ImageIcon origImage = getSafeOriginalImage(exitType);
        if (origImage != null) {
            draggableLabel.setIcon(new ImageIcon(getScaledTransitionImage(origImage.getImage())));
        }
    }

    public void hideTransitionBoxes(final JLayeredPane layeredPane) {
        Component[] components = layeredPane.getComponents();
        for (final Component component : components) {
            if (DevTools.getInstance().hasMode(DevMode.TRANSITION_BUTTON_DRAGGABLE)) {
                if (component instanceof DraggableJLabel || component instanceof TimeSwitchButton) {
                    component.setVisible(false);
                }
            } else {
                if (component instanceof TransitionButton || component instanceof TimeSwitchButton) {
                    component.setVisible(false);
                }
            }
        }
        layeredPane.repaint();
    }

    public ExitMap getExitMap() {
        return exitMap;
    }

    public void menuItemHideShow(final JLayeredPane layeredPane) {
        if (s.getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            hideTransitionBoxes(layeredPane);
            s.switchHideShowTransitionMode();
            SeedSettings.saveSeedSettings(seedName, s);
        } else {
            s.switchHideShowTransitionMode();
            SeedSettings.saveSeedSettings(seedName, s);
            drawTransitionBoxes(layeredPane);
        }
    }

    public void buttonZoom() {
        // Gerudo's Fortress -> zoom in -> Outside Thieves' Hideout
        if (exitMap.getNiceName().equals(OoTMConstants.NICE_PLACES_WITH_MAP[8])) {
            loadMap(OoTMConstants.NICE_PLACES_WITH_MAP[40]);
        }
        // Outside Thieves' Hideout -> zoom out -> Gerudo's Fortress
        else if (exitMap.getNiceName().equals(OoTMConstants.NICE_PLACES_WITH_MAP[40])) {
            loadMap(OoTMConstants.NICE_PLACES_WITH_MAP[8]);
        }
        // error case
        else {
            throw new IllegalStateException("Zoom button should not exist on this map.");
        }
    }

    public void hideShowZoomButton() {
        clf.getZoomButton().setVisible(exitMap.getZoom() != null);
    }

    public boolean getZoomable() {
        return exitMap.getZoom() != null;
    }

    public CurrentLocationFrame getFrame() {
        return clf;
    }

    public void handleMenuItemHideShowState(final JCheckBoxMenuItem menuItemHideShow) {
        menuItemHideShow.setState(s.getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW);
    }

    private void decideShowTempleOfTimeAgeSwitchButton(final JLayeredPane layeredPane) {
        String templeOfTimeString = OoTMConstants.NICE_PLACES_WITH_MAP[32];
        if (exitMap.getNiceName().equals(templeOfTimeString)) {
            showTempleOfTimeAgeSwitchButton(layeredPane);
        } else {
            hideTempleOfTimeAgeSwitchButton(layeredPane);
        }
    }

    private void showTempleOfTimeAgeSwitchButton(final JLayeredPane layeredPane) {
        if (s.getHideShowTransitionsMode() == HideShowTransitionsMode.SHOW) {
            if (!transitionBoxesWereDrawn) {
                if (exitMap instanceof TempleOfTime) {
                    TimeSwitchButton tsb = new TimeSwitchButton(seedName, (TempleOfTime) exitMap, layeredPane, this);
                    layeredPane.add(tsb, JLayeredPane.MODAL_LAYER);
                }
            } else {
                for (final Component component : layeredPane.getComponents()) {
                    if (component instanceof TimeSwitchButton) {
                        component.setVisible(true);
                    }
                }
            }
        }
    }

    private void hideTempleOfTimeAgeSwitchButton(final JLayeredPane layeredPane) {
        for (final Component component : layeredPane.getComponents()) {
            if (component instanceof TimeSwitchButton) component.setVisible(false);
        }
    }

    public void menuItemMainMenu() {
        MainMenuController mmc = new MainMenuController();
        s.dissolve();
        Time.getInstance().dissolve();
        mmc.init();
        clf.dispose();
    }

    public void menuItemSetChildHomeLocation() {
        SetHomeLocationController shlc = new SetHomeLocationController(seedName, clf, Age.CHILD);
        shlc.init();
    }

    public void menuItemSetAdultHomeLocation() {
        SetHomeLocationController shlc = new SetHomeLocationController(seedName, clf, Age.ADULT);
        shlc.init();
    }

    public void menuItemCowList() {
        CowCheckListController cclc = new CowCheckListController(seedName, clf);
        cclc.init();
    }

    public void menuItemBeanSpotList() {
        BeanSpotCheckListController bsclc = new BeanSpotCheckListController(seedName, clf);
        bsclc.init();
    }

    public void menuItemNotes() {
        NotesController nc = new NotesController(seedName, clf);
        nc.init();
    }

    public void unloadTransitionBoxes(final JLayeredPane layeredPane) {
        for (final Component component : layeredPane.getComponents()) {
            if (component instanceof TransitionButton || component instanceof DraggableJLabel ||
                    component instanceof TimeSwitchButton) {
                layeredPane.remove(component);
            }
        }
        transitionBoxesWereDrawn = false;
    }
}
