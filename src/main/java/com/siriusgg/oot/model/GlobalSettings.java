package com.siriusgg.oot.model;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.util.SaveLoad;
import com.siriusgg.oot.translation.Translation;

import java.io.*;

public class GlobalSettings {
    private static GlobalSettings globalSettings = null;
    private Translation translation;

    private GlobalSettings(final Translation translation) {
        this.translation = translation;
    }

    public static GlobalSettings getInstance() {
        if (globalSettings == null) {
            globalSettings = loadGlobalSettings();
            if (globalSettings == null) {
                globalSettings = createDefaultGlobalSettings();
                saveGlobalSettings(globalSettings);
            }
        }
        return globalSettings;
    }

    private static GlobalSettings createDefaultGlobalSettings() {
        return new GlobalSettings(Translation.ENGLISH);
    }

    public static void saveGlobalSettings(final GlobalSettings globalSettings) {
        try {
            File baseDirectory = SaveLoad.ensureBaseDirectoryExists();
            File globalSettingsFile = new File(baseDirectory + "/" + OoTMConstants.GLOBAL_SETTINGS_FILE);
            String translationString = globalSettings.getTranslation().toString();
            if (globalSettingsFile.exists()) {
                if (!globalSettingsFile.delete()) {
                    throw new IOException("Could not delete old global settings file \"" +
                            globalSettingsFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(globalSettingsFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("TRANSLATION=" + translationString + "\n");
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private static GlobalSettings loadGlobalSettings() {
        if (globalSettingsFileIsValid()) {
            File globalSettingsFile = new File(OoTMConstants.USER_HOME + "/" +
                    OoTMConstants.SAVE_DIRECTORY + "/" + OoTMConstants.GLOBAL_SETTINGS_FILE);
            String currentLine;
            String translationString = "";
            FileReader fr;
            try {
                fr = new FileReader(globalSettingsFile);
                BufferedReader br = new BufferedReader(fr);
                while ((currentLine = br.readLine()) != null) {
                    if (currentLine.startsWith("TRANSLATION=")) {
                        translationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    }
                }
                br.close();
                Translation translation = Translation.fromString(translationString);
                return new GlobalSettings(translation);
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static boolean globalSettingsFileIsValid() {
        if (globalSettingsExist()) {
            File globalSettingsFile = new File(OoTMConstants.USER_HOME + "/" +
                    OoTMConstants.SAVE_DIRECTORY + "/" + OoTMConstants.GLOBAL_SETTINGS_FILE);
            FileReader fr;
            String currentLine;
            String translationString = null;
            try {
                fr = new FileReader(globalSettingsFile);
                BufferedReader br = new BufferedReader(fr);
                while ((currentLine = br.readLine()) != null) {
                    if (currentLine.startsWith("TRANSLATION=")) {
                        translationString = currentLine.substring(currentLine.lastIndexOf("=") + 1);
                    }
                }
                br.close();
                if (translationString == null) return false;
                return Translation.fromString(translationString) != null;
            } catch (final Exception e) {
                return false;
            }
        }
        return false;
    }

    /**
     * Check whether the global settings file exists.
     *
     * @return true if the global settings file exists, else false.
     */
    private static boolean globalSettingsExist() {
        File baseDirectory = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
        if (baseDirectory.exists()) {
            File globalSettingsFile = new File(baseDirectory + "/" + OoTMConstants.GLOBAL_SETTINGS_FILE);
            return globalSettingsFile.exists();
        }
        return false;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(final Translation translation) {
        this.translation = translation;
    }
}
