package com.siriusgg.oot.view;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.controller.*;
import com.siriusgg.oot.exception.*;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.translation.Translation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class CurrentLocationFrame extends JFrame {
    private final CurrentLocationController clc;
    private final Translation t;

    private int menuBarHeight;
    private int mapWidth;
    private int rightLAFSpacer;
    private int tileBarLAFSpacer;
    private int mapHeight;
    private int placeComboBoxWidth;
    private int ageComboBoxWidth;
    private int perspectiveComboBoxWidth;
    private int zoomButtonWidth;
    private int buttonBarHeight;
    private int buttonBarElementHeight;
    private int miniSpacer;
    private int frameWidth;
    private int frameWidthByMap;
    private int frameWidthByBar;
    private int frameHeight;

    private JLabel mapLabel;
    private JPanel bottomBar;
    private JComboBox<String> mapsComboBox;
    private JComboBox<String> ageComboBox;
    private JComboBox<String> perspectiveComboBox;
    private JButton zoomButton;
    private JLayeredPane layeredPane;

    public CurrentLocationFrame(final CurrentLocationController clc) {
        super("OoT Maps");
        t = GlobalSettings.getInstance().getTranslation();
        this.clc = clc;
    }

    public void init() {
        setTitle("OoT Maps: " + t.getTranslatedText(clc.getExitMap().getNiceName()));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(final WindowEvent e) {
                clc.close();
            }
        });
        Container cp = getContentPane();
        setLayout(null);
        cp.setBackground(Color.WHITE);
        mapWidth = clc.getMapWidth();
        rightLAFSpacer = 16;
        tileBarLAFSpacer = 38;
        int menuBarMaxWidth = 7680;
        menuBarHeight = 25;
        mapHeight = clc.getMapHeight();
        placeComboBoxWidth = 200;
        ageComboBoxWidth = 120;
        perspectiveComboBoxWidth = 70;
        zoomButtonWidth = 80;
        buttonBarHeight = 50;
        buttonBarElementHeight = 40;
        miniSpacer = 5;
        frameWidthByMap = calcFrameWidthByMap();
        frameWidthByBar = calcFrameWidthByBar();
        frameWidth = Math.max(frameWidthByMap, frameWidthByBar);
        frameHeight = calcFrameHeight();
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMain = new JMenu(t.getTranslatedText("Main"));
        JMenuItem menuItemMainMenu = new JMenuItem(t.getTranslatedText("Main menu"));
        menuItemMainMenu.addActionListener(this::menuItemMainMenuActionPerformed);
        menuMain.add(menuItemMainMenu);
        menuMain.add(new JSeparator());
        JMenuItem menuItemBrowseSaves = new JMenuItem(t.getTranslatedText(t.getTranslatedText("Browse") + " " +
                OoTMConstants.SAVE_DIRECTORY +
                t.getTranslatedText(" directory")));
        menuItemBrowseSaves.addActionListener(this::menuItemBrowseSavesActionPerformed);
        menuMain.add(menuItemBrowseSaves);
        menuMain.add(new JSeparator());
        JMenuItem menuItemExit = new JMenuItem(t.getTranslatedText("Exit"));
        menuItemExit.addActionListener(this::menuItemExitActionPerformed);
        menuMain.add(menuItemExit);
        menuBar.add(menuMain);
        JMenu menuSeed = new JMenu(t.getTranslatedText("Seed"));
        JMenu menuSetHomeLocation = new JMenu(t.getTranslatedText("Set home location"));
        JMenuItem menuItemSetChildHomeLocation = new JMenuItem(t.getTranslatedText("For child"));
        menuItemSetChildHomeLocation.addActionListener(this::menuItemSetChildHomeLocationActionPerformed);
        menuSetHomeLocation.add(menuItemSetChildHomeLocation);
        JMenuItem menuItemSetAdultHomeLocation = new JMenuItem(t.getTranslatedText("For adult"));
        menuItemSetAdultHomeLocation.addActionListener(this::menuItemSetAdultHomeLocationActionPerformed);
        menuSetHomeLocation.add(menuItemSetAdultHomeLocation);
        menuSeed.add(menuSetHomeLocation);
        menuSeed.add(new JSeparator());
        JMenuItem menuItemBrowseSeed = new JMenuItem(t.getTranslatedText("Browse seed directory"));
        menuItemBrowseSeed.addActionListener(this::menuItemBrowseSeedActionPerformed);
        menuSeed.add(menuItemBrowseSeed);
        menuBar.add(menuSeed);
        JMenu menuView = new JMenu(t.getTranslatedText("View"));
        JCheckBoxMenuItem menuItemHideShow = new JCheckBoxMenuItem(t.getTranslatedText("Show transitions"));
        clc.handleMenuItemHideShowState(menuItemHideShow);
        menuItemHideShow.addActionListener(this::menuItemHideShowActionPerformed);
        menuView.add(menuItemHideShow);
        menuBar.add(menuView);
        JMenu menuLists = new JMenu(t.getTranslatedText("Lists"));
        JMenuItem menuItemShops = new JMenuItem(t.getTranslatedText("Shops"));
        menuItemShops.addActionListener(this::menuItemShopsActionPerformed);
        menuLists.add(menuItemShops);
        menuLists.add(new JSeparator());
        JMenuItem menuItemCowList = new JMenuItem(t.getTranslatedText("Cows"));
        menuItemCowList.addActionListener(this::menuItemCowListActionPerformed);
        menuLists.add(menuItemCowList);
        menuLists.add(new JSeparator());
        JMenuItem menuItemBeanSpotList = new JMenuItem(t.getTranslatedText("Bean spots"));
        menuItemBeanSpotList.addActionListener(this::menuItemBeanSpotListActionPerformed);
        menuLists.add(menuItemBeanSpotList);
        menuBar.add(menuLists);
        JMenu menuTools = new JMenu(t.getTranslatedText("Tools"));
        JMenuItem menuItemNotes = new JMenuItem(t.getTranslatedText("Notes"));
        menuItemNotes.addActionListener(this::menuItemNotesActionPerformed);
        menuTools.add(menuItemNotes);
        menuBar.add(menuTools);
        menuBar.setBounds(0, 0, menuBarMaxWidth, menuBarHeight);
        cp.add(menuBar);
        layeredPane = new JLayeredPane();
        mapLabel = new JLabel(clc.getMapImage());
        mapLabel.setBounds(0, 0, mapWidth, mapHeight); // bounds within layeredPane
        layeredPane.add(mapLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.setBounds(((frameWidth - rightLAFSpacer) - mapWidth) / 2, menuBarHeight, mapWidth, mapHeight);
        bottomBar = new JPanel();
        bottomBar.setLayout(null);
        bottomBar.setBounds(0, menuBarHeight + mapHeight, frameWidth, buttonBarHeight);
        bottomBar.setBackground(Color.GRAY);
        mapsComboBox = new JComboBox<>();
        clc.fillMapsComboBox(mapsComboBox);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, buttonBarElementHeight);
        mapsComboBox.setBackground(Color.WHITE);
        clc.setSelectedMap(mapsComboBox);
        mapsComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                clc.loadMap(Translation.toEnglish((String) Objects.requireNonNull(mapsComboBox.getSelectedItem())));
            }
        });
        bottomBar.add(mapsComboBox);
        ageComboBox = new JComboBox<>();
        clc.fillAgesComboBox(ageComboBox);
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, ageComboBoxWidth,
                buttonBarElementHeight);
        ageComboBox.setBackground(Color.WHITE);
        clc.setSelectedAge(ageComboBox);
        ageComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                try {
                    clc.loadAge(Translation.toEnglish((String) Objects.requireNonNull(ageComboBox.getSelectedItem())));
                } catch (final UnknownAgeStringException ex) {
                    ex.printStackTrace();
                }
            }
        });
        bottomBar.add(ageComboBox);
        perspectiveComboBox = new JComboBox<>();
        clc.fillPerspectivesComboBox(perspectiveComboBox);
        perspectiveComboBox.setBounds((3 * miniSpacer) + placeComboBoxWidth + ageComboBoxWidth, miniSpacer,
                perspectiveComboBoxWidth, buttonBarElementHeight);
        perspectiveComboBox.setBackground(Color.WHITE);
        clc.setSelectedPerspective(perspectiveComboBox);
        perspectiveComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                try {
                    clc.loadPerspective(Translation.toEnglish((String) Objects.requireNonNull(
                            perspectiveComboBox.getSelectedItem())));
                } catch (final UnknownPerspectiveStringException ex) {
                    ex.printStackTrace();
                }
            }
        });
        bottomBar.add(perspectiveComboBox);
        zoomButton = new JButton(t.getTranslatedText("Zoom"));
        zoomButton.setBounds((4 * miniSpacer) + placeComboBoxWidth + ageComboBoxWidth + perspectiveComboBoxWidth,
                miniSpacer, zoomButtonWidth, buttonBarElementHeight);
        zoomButton.setBackground(Color.WHITE);
        clc.hideShowZoomButton();
        zoomButton.addActionListener(this::buttonZoomPerformed);
        bottomBar.add(zoomButton);
        cp.add(bottomBar);
        clc.drawTransitionBoxes(layeredPane);
        cp.add(layeredPane);
        setSize(frameWidth, frameHeight);
        setResizable(false);
    }

    private void menuItemMainMenuActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemMainMenu();
    }

    private void menuItemBrowseSavesActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemBrowseSaves();
    }

    private void menuItemExitActionPerformed(final ActionEvent actionEvent) {
        System.exit(0);
    }

    private void menuItemSetChildHomeLocationActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemSetChildHomeLocation();
    }

    private void menuItemSetAdultHomeLocationActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemSetAdultHomeLocation();
    }

    private void menuItemBrowseSeedActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemBrowseSeed();
    }

    private void menuItemHideShowActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemHideShow(layeredPane);
    }

    private void menuItemShopsActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemShops();
    }

    private void menuItemCowListActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemCowList();
    }

    private void menuItemBeanSpotListActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemBeanSpotList();
    }

    private void menuItemNotesActionPerformed(final ActionEvent actionEvent) {
        clc.menuItemNotes();
    }

    private int calcFrameHeight() {
        return tileBarLAFSpacer + menuBarHeight + mapHeight + buttonBarHeight;
    }

    private int calcFrameWidthByBar() {
        int sum = (4 * miniSpacer) + placeComboBoxWidth + ageComboBoxWidth + perspectiveComboBoxWidth + rightLAFSpacer;
        if (clc.getZoomable()) sum += zoomButtonWidth + miniSpacer;
        return sum;
    }

    private int calcFrameWidthByMap() {
        return mapWidth + rightLAFSpacer;
    }

    public void reInit() {
        setTitle("OoT Maps: " + t.getTranslatedText(clc.getExitMap().getNiceName()));
        mapWidth = clc.getMapWidth();
        mapHeight = clc.getMapHeight();
        frameWidthByMap = calcFrameWidthByMap();
        frameWidthByBar = calcFrameWidthByBar();
        frameWidth = Math.max(frameWidthByMap, frameWidthByBar);
        frameHeight = calcFrameHeight();
        layeredPane.setBounds(((frameWidth - rightLAFSpacer) - mapWidth) / 2, menuBarHeight, mapWidth, mapHeight);
        mapLabel.setBounds(0, 0, mapWidth, mapHeight);
        mapLabel.setIcon(clc.getMapImage());
        bottomBar.setBounds(0, menuBarHeight + mapHeight, frameWidth, buttonBarHeight);
        mapsComboBox.setBounds(miniSpacer, miniSpacer, placeComboBoxWidth, buttonBarElementHeight);
        mapsComboBox.setSelectedItem(t.getTranslatedText(clc.getExitMap().getNiceName()));
        ageComboBox.setBounds((2 * miniSpacer) + placeComboBoxWidth, miniSpacer, ageComboBoxWidth,
                buttonBarElementHeight);
        clc.setSelectedAge(ageComboBox);
        perspectiveComboBox.setBounds((3 * miniSpacer) + placeComboBoxWidth + ageComboBoxWidth, miniSpacer,
                perspectiveComboBoxWidth, buttonBarElementHeight);
        clc.setSelectedPerspective(perspectiveComboBox);
        zoomButton.setBounds((4 * miniSpacer) + placeComboBoxWidth + ageComboBoxWidth + perspectiveComboBoxWidth,
                miniSpacer, zoomButtonWidth, buttonBarElementHeight);
        clc.hideShowZoomButton();
        clc.unloadTransitionBoxes(layeredPane);
        clc.drawTransitionBoxes(layeredPane);
        setSize(frameWidth, frameHeight);
    }

    private void buttonZoomPerformed(final ActionEvent actionEvent) {
        clc.buttonZoom();
    }

    public JButton getZoomButton() {
        return zoomButton;
    }

    public CurrentLocationController getController() {
        return clc;
    }
}
