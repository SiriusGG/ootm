package com.siriusgg.oot.model.util;

import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.Perspective;
import com.siriusgg.oot.model.time.Age;

import java.io.*;

public class SaveLoad {
    public static File ensureBaseDirectoryExists() throws IOException {
        File baseDirectory = new File(System.getProperty("user.home") + "/" + BuildData.SAVE_DIRECTORY);
        if (!baseDirectory.exists()) {
            if (!baseDirectory.mkdir()) {
                throw new IOException();
            }
        }
        return baseDirectory;
    }

    public static File ensureSeedDirectoryExists(final String seedName) throws IOException {
        File baseDirectory = ensureBaseDirectoryExists();
        File seedDirectory = new File(baseDirectory + "/" + seedName);
        if (!seedDirectory.exists()) {
            if (!seedDirectory.mkdir()) {
                throw new IOException();
            }
        }
        return seedDirectory;
    }

    public static void writeSettingsFile(final String seedName, final Settings settings) {
        try {
            File seedDirectory = ensureSeedDirectoryExists(seedName);
            File settingsFile = new File(seedDirectory + "/" + BuildData.SETTINGS_FILE);
            String age = settings.getTime().getAge().toString();
            String perspective = settings.getPerspective().toString();
            String hideShowTransitionsMode = settings.getHideShowTransitionsMode().toString();
            String rememberWayBackMode = settings.getRememberWayBackMode().toString();
            if (settingsFile.exists()) {
                if (!settingsFile.delete()) {
                    throw new IOException("Could not delete old settings file \"" + settingsFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(settingsFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("AGE=" + age + "\n");
            bw.write("PERSPECTIVE=" + perspective + "\n");
            bw.write("HIDE_SHOW_TRANSITION_MODE=" + hideShowTransitionsMode + "\n");
            bw.write("REMEMBER_WAY_BACK_MODE=" + rememberWayBackMode + "\n");
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public static Settings readSettingsFile(String seedName) {
        if (settingsStored(seedName)) {
            if (settingsFileIsValid(seedName)) {
                File settingsFile = new File(System.getProperty("user.home") + "/" + BuildData.SAVE_DIRECTORY + "/" + seedName + "/" + BuildData.SETTINGS_FILE);
                String currentLine;
                String ageString = "";
                String perspectiveString = "";
                String hideShowTransitionsModeString = "";
                String rememberWayBackModeString = "";
                FileReader fr;
                try {
                    fr = new FileReader(settingsFile);
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
                        }
                    }
                    br.close();
                    Age age = Age.fromString(ageString);
                    Perspective perspective = Perspective.fromString(perspectiveString);
                    HideShowTransitionsMode hideShowTransitionsMode = HideShowTransitionsMode.fromString(hideShowTransitionsModeString);
                    RememberWayBackMode rememberWayBackMode = RememberWayBackMode.fromString(rememberWayBackModeString);
                    Settings s = Settings.getInstance();
                    s.getTime().setAge(age);
                    s.setPerspective(perspective);
                    s.setHideShowTransitionsMode(hideShowTransitionsMode);
                    s.setRememberWayBackMode(rememberWayBackMode);
                    return s;
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private static boolean settingsFileIsValid(final String seedName) {
        File settingsFile = new File(System.getProperty("user.home") + "/" + BuildData.SAVE_DIRECTORY + "/" + seedName + "/" + BuildData.SETTINGS_FILE);
        if (settingsFile.exists()) {
            return true; // ToDo
        }
        return false;
    }

    /**
     * Check whether a settings file exists.
     *
     * @return true if settings file exists, else false.
     */
    private static boolean settingsStored(final String seedName) {
        File baseDirectory = new File(System.getProperty("user.home") + "/" + BuildData.SAVE_DIRECTORY);
        if (baseDirectory.exists()) {
            File seedDirectory = new File(baseDirectory + "/" + seedName);
            if (seedDirectory.exists()) {
                File settingsFile = new File(seedDirectory + "/" + BuildData.SETTINGS_FILE);
                return settingsFile.exists();
            }
        }
        return false;
    }
}
