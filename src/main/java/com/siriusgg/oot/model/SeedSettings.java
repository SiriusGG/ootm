package com.siriusgg.oot.model;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.time.*;
import com.siriusgg.oot.util.SaveLoad;

import java.io.*;

public class SeedSettings {
    private static SeedSettings seedSettings = null;
    private final Time time;
    private Perspective perspective;
    private HideShowTransitionsMode hideShowTransitionsMode;
    private RememberWayBackMode rememberWayBackMode;
    private boolean masterQuestJabuJabu;
    private PlaceWithMap childHomeLocation;
    private PlaceWithMap adultHomeLocation;

    private SeedSettings(final Time time,
                         final Perspective perspective,
                         final HideShowTransitionsMode hideShowTransitionsMode,
                         final RememberWayBackMode rememberWayBackMode,
                         final boolean masterQuestJabuJabu,
                         final PlaceWithMap childHomeLocation,
                         final PlaceWithMap adultHomeLocation) {
        this.time = time;
        this.perspective = perspective;
        this.hideShowTransitionsMode = hideShowTransitionsMode;
        this.rememberWayBackMode = rememberWayBackMode;
        this.masterQuestJabuJabu = masterQuestJabuJabu;
        this.childHomeLocation = childHomeLocation;
        this.adultHomeLocation = adultHomeLocation;
    }

    public static SeedSettings getInstance(final String seedName) {
        if (seedSettings == null) {
            seedSettings = loadSeedSettings(seedName);
            if (seedSettings == null) {
                seedSettings = createDefaultSeedSettings();
                saveSeedSettings(seedName, seedSettings);
            }
        }
        return seedSettings;
    }

    private static SeedSettings createDefaultSeedSettings() {
        return new SeedSettings(Time.getInstance(), Perspective.SIDE, HideShowTransitionsMode.SHOW,
                RememberWayBackMode.DO_NOT_REMEMBER, true, PlaceWithMap.LINKS_HOUSE, PlaceWithMap.TEMPLE_OF_TIME);
    }

    public static void saveSeedSettings(final String seedName, final SeedSettings seedSettings) {
        try {
            File seedDirectory = SaveLoad.ensureSeedDirectoryExists(seedName);
            File seedSettingsFile = new File(seedDirectory + "/" + OoTMConstants.SEED_SETTINGS_FILE);
            String age = seedSettings.getTime().getAge().toString();
            String perspective = seedSettings.getPerspective().toString();
            String hideShowTransitionsMode = seedSettings.getHideShowTransitionsMode().toString();
            String rememberWayBackMode = seedSettings.getRememberWayBackMode().toString();
            boolean masterQuestJabuJabu = seedSettings.hasMasterQuestJabuJabu();
            String childHomeLocation = seedSettings.getChildHomeLocation().toString();
            String adultHomeLocation = seedSettings.getAdultHomeLocation().toString();
            if (seedSettingsFile.exists()) {
                if (!seedSettingsFile.delete()) {
                    throw new IOException("Could not delete old seed settings file \"" +
                            seedSettingsFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(seedSettingsFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("AGE=" + age + "\n");
            bw.write("PERSPECTIVE=" + perspective + "\n");
            bw.write("HIDE_SHOW_TRANSITION_MODE=" + hideShowTransitionsMode + "\n");
            bw.write("REMEMBER_WAY_BACK_MODE=" + rememberWayBackMode + "\n");
            bw.write("MASTER_QUEST_JABU_JABU=" + masterQuestJabuJabu + "\n");
            bw.write("CHILD_HOME_LOCATION=" + childHomeLocation + "\n");
            bw.write("ADULT_HOME_LOCATION=" + adultHomeLocation + "\n");
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public static SeedSettings loadSeedSettings(final String seedName) {
        if (seedSettingsExist(seedName)) {
            if (seedSettingsFileIsValid(seedName)) {
                File seedSettingsFile = new File(OoTMConstants.USER_HOME + "/" +
                        OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.SEED_SETTINGS_FILE);
                String currentLine;
                String ageString = "";
                String perspectiveString = "";
                String hstModeString = "";
                String rwbModeString = "";
                String masterQuestJabuJabuString = "";
                String childHomeLocationString = "";
                String adultHomeLocationString = "";
                FileReader fr;
                try {
                    fr = new FileReader(seedSettingsFile);
                    BufferedReader br = new BufferedReader(fr);
                    while ((currentLine = br.readLine()) != null) {
                        if (currentLine.startsWith("AGE")) {
                            ageString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("PERSPECTIVE")) {
                            perspectiveString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("HIDE_SHOW_TRANSITION_MODE")) {
                            hstModeString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("REMEMBER_WAY_BACK_MODE")) {
                            rwbModeString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("MASTER_QUEST_JABU_JABU")) {
                            masterQuestJabuJabuString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("CHILD_HOME_LOCATION")) {
                            childHomeLocationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        } else if (currentLine.startsWith("ADULT_HOME_LOCATION")) {
                            adultHomeLocationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                        }
                    }
                    br.close();
                    Time time = Time.getInstance();
                    time.setAge(Age.fromString(ageString));
                    Perspective perspective = Perspective.fromString(perspectiveString);
                    HideShowTransitionsMode hstMode = HideShowTransitionsMode.fromString(hstModeString);
                    RememberWayBackMode rwbMode = RememberWayBackMode.fromString(rwbModeString);
                    boolean masterQuestJabuJabu = Boolean.parseBoolean(masterQuestJabuJabuString);
                    PlaceWithMap childHomeLocation = PlaceWithMap.fromString(childHomeLocationString);
                    PlaceWithMap adultHomeLocation = PlaceWithMap.fromString(adultHomeLocationString);
                    return new SeedSettings(time, perspective, hstMode, rwbMode, masterQuestJabuJabu,
                            childHomeLocation, adultHomeLocation);
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static boolean seedSettingsFileIsValid(final String seedName) {
        File seedSettingsFile = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.SEED_SETTINGS_FILE);
        if (seedSettingsFile.exists()) {
            FileReader fr;
            String currentLine;
            String ageString = null;
            String perspectiveString = null;
            String hideShowTransitionsModeString = null;
            String rememberWayBackModeString = null;
            String masterQuestJabuJabuString = null;
            String childHomeLocationString = null;
            String adultHomeLocationString = null;
            try {
                fr = new FileReader(seedSettingsFile);
                BufferedReader br = new BufferedReader(fr);
                while ((currentLine = br.readLine()) != null) {
                    if (currentLine.startsWith("AGE")) {
                        ageString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("PERSPECTIVE")) {
                        perspectiveString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("HIDE_SHOW_TRANSITION_MODE")) {
                        hideShowTransitionsModeString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("REMEMBER_WAY_BACK_MODE")) {
                        rememberWayBackModeString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("MASTER_QUEST_JABU_JABU")) {
                        masterQuestJabuJabuString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("CHILD_HOME_LOCATION")) {
                        childHomeLocationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    } else if (currentLine.startsWith("ADULT_HOME_LOCATION")) {
                        adultHomeLocationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    }
                }
                br.close();
                if (ageString == null || perspectiveString == null || hideShowTransitionsModeString == null ||
                        rememberWayBackModeString == null || masterQuestJabuJabuString == null ||
                        childHomeLocationString == null || adultHomeLocationString == null) {
                    return false;
                }
                Age.fromString(ageString);
                Perspective.fromString(perspectiveString);
                HideShowTransitionsMode.fromString(hideShowTransitionsModeString);
                RememberWayBackMode.fromString(rememberWayBackModeString);
                PlaceWithMap.fromString(childHomeLocationString);
                PlaceWithMap.fromString(adultHomeLocationString);
                return true;
            } catch (final Exception e) {
                return false;
            }
        }
        return false;
    }

    /**
     * Check whether a seed settings file exists.
     *
     * @param seedName any seed name.
     * @return true if seed settings file exists, else false.
     */
    public static boolean seedSettingsExist(final String seedName) {
        File baseDirectory = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
        if (baseDirectory.exists()) {
            File seedDirectory = new File(baseDirectory + "/" + seedName);
            if (seedDirectory.exists()) {
                File seedSettingsFile = new File(seedDirectory + "/" + OoTMConstants.SEED_SETTINGS_FILE);
                return seedSettingsFile.exists();
            }
        }
        return false;
    }

    public Time getTime() {
        return time;
    }

    public Perspective getPerspective() {
        return perspective;
    }

    public void setPerspective(final Perspective perspective) {
        this.perspective = perspective;
    }

    public HideShowTransitionsMode getHideShowTransitionsMode() {
        return hideShowTransitionsMode;
    }

    public void switchHideShowTransitionMode() {
        if (hideShowTransitionsMode != null) {
            if (hideShowTransitionsMode == HideShowTransitionsMode.HIDE) {
                hideShowTransitionsMode = HideShowTransitionsMode.SHOW;
            } else {
                hideShowTransitionsMode = HideShowTransitionsMode.HIDE;
            }
        } else {
            throw new IllegalStateException("hideShowTransitionMode was null before this operation.");
        }
    }

    public RememberWayBackMode getRememberWayBackMode() {
        return rememberWayBackMode;
    }

    public void setRememberWayBackMode(final RememberWayBackMode rememberWayBackMode) {
        this.rememberWayBackMode = rememberWayBackMode;
    }

    public boolean hasMasterQuestJabuJabu() {
        return masterQuestJabuJabu;
    }

    public void setMasterQuestJabuJabu(final boolean masterQuestJabuJabu) {
        this.masterQuestJabuJabu = masterQuestJabuJabu;
    }

    public PlaceWithMap getChildHomeLocation() {
        return childHomeLocation;
    }

    public void setChildHomeLocation(final PlaceWithMap childHomeLocation) {
        this.childHomeLocation = childHomeLocation;
    }

    public PlaceWithMap getAdultHomeLocation() {
        return adultHomeLocation;
    }

    public void setAdultHomeLocation(final PlaceWithMap adultHomeLocation) {
        this.adultHomeLocation = adultHomeLocation;
    }

    public void dissolve() {
        seedSettings = null;
    }
}
