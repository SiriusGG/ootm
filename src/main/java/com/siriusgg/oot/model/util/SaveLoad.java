package com.siriusgg.oot.model.util;

import com.siriusgg.oot.model.OoTMConstants;
import com.siriusgg.oot.model.*;
import com.siriusgg.oot.model.places.*;
import com.siriusgg.oot.model.time.Age;

import java.io.*;

public class SaveLoad {
    public static File ensureBaseDirectoryExists() throws IOException {
        File baseDirectory = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
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
            File settingsFile = new File(seedDirectory + "/" + OoTMConstants.SETTINGS_FILE);
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

    public static Settings readSettingsFile(final String seedName) {
        if (settingsStored(seedName)) {
            if (settingsFileIsValid(seedName)) {
                File settingsFile = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.SETTINGS_FILE);
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
        File settingsFile = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.SETTINGS_FILE);
        if (settingsFile.exists()) {
            FileReader fr;
            String currentLine;
            String ageString = null;
            String perspectiveString = null;
            String hideShowTransitionsModeString = null;
            String rememberWayBackModeString = null;
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
                Age age;
                if (ageString != null) age = Age.fromString(ageString);
                else return false;
                Perspective perspective;
                if (perspectiveString != null) perspective = Perspective.fromString(perspectiveString);
                else return false;
                HideShowTransitionsMode hideShowTransitionsMode;
                if (hideShowTransitionsModeString != null) {
                    hideShowTransitionsMode = HideShowTransitionsMode.fromString(hideShowTransitionsModeString);
                } else {
                    return false;
                }
                RememberWayBackMode rememberWayBackMode;
                if (rememberWayBackModeString != null) {
                    rememberWayBackMode = RememberWayBackMode.fromString(rememberWayBackModeString);
                } else {
                    return false;
                }
                if (age == null || perspective == null || hideShowTransitionsMode == null || rememberWayBackMode == null) {
                    return false;
                }
            } catch (final IOException e) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Check whether a settings file exists.
     *
     * @return true if settings file exists, else false.
     */
    private static boolean settingsStored(final String seedName) {
        File baseDirectory = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
        if (baseDirectory.exists()) {
            File seedDirectory = new File(baseDirectory + "/" + seedName);
            if (seedDirectory.exists()) {
                File settingsFile = new File(seedDirectory + "/" + OoTMConstants.SETTINGS_FILE);
                return settingsFile.exists();
            }
        }
        return false;
    }

    public static String[] getSeedNames() {
        String[] seedNames = new String[getSeedsAmount()];
        File[] seedDirectories = getSeedDirectories();
        for (int i = 0; i < seedDirectories.length; i++) {
            seedNames[i] = seedDirectories[i].getName();
        }
        return seedNames;
    }

    private static File[] getSeedDirectories() {
        File seedsRoot = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY);
        if (seedsRoot.exists()) {
            File[] potentialSeedDirectories = seedsRoot.listFiles();
            if (potentialSeedDirectories != null) {
                int directoriesAmount = 0;
                for (final File potentialDirectory : potentialSeedDirectories) {
                    if (potentialDirectory.isDirectory()) directoriesAmount++;
                }
                int withValidSettingsFile = 0;
                for (final File potentialSeedDirectory : potentialSeedDirectories) {
                    if (potentialSeedDirectory.isDirectory() && settingsFileIsValid(potentialSeedDirectory.getName())) {
                        withValidSettingsFile++;
                    }
                }
                File[] seedDirectories = new File[withValidSettingsFile];
                int counter = 0;
                for (int i = 0; i < directoriesAmount; i++) {
                    if (potentialSeedDirectories[i].isDirectory() && settingsFileIsValid(potentialSeedDirectories[i].getName())) {
                        seedDirectories[counter] = potentialSeedDirectories[i];
                        counter++;
                    }
                }
                return seedDirectories;
            }
        }
        return new File[0];
    }

    public static int getSeedsAmount() {
        return getSeedDirectories().length;
    }

    public static void saveExitMap(final String seedName, final ExitMap exitMap) {
        String mapId = StringFunctions.mapNameToMapId(exitMap.getNiceName());
        String saveDirectory = OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY;
        String mapFileString = saveDirectory + "/" + seedName + "/" + mapId + OoTMConstants.EXIT_FILE_EXTENSION;
        try {
            ensureSeedDirectoryExists(seedName);
            File mapFile = new File(mapFileString);
            if (mapFile.exists()) {
                if (!mapFile.delete()) {
                    throw new IOException("Could not delete old settings file \"" + mapFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(mapFile);
            BufferedWriter bw = new BufferedWriter(fw);
            Exit exit;
            for (int i = 0; i < exitMap.getExitsAmount(); i++) {
                exit = exitMap.getExit(i);
                if (exit.getExitType() != ExitType.UNCHANGING) {
                    if (exit.getDestination() != null) {
                        bw.write(exit.getName() + "=D=" + exit.getDestination().getName() + "\n");
                    } else if (exit.getDestinationExitMap() != null) {
                        bw.write(exit.getName() + "=DEM=" + exit.getDestinationExitMap().getSimpleName() + "\n");
                    } else if (exit.getDestinationString() != null) {
                        bw.write(exit.getName() + "=DS=" + exit.getDestinationString() + "\n");
                    }
                }
            }
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            System.err.println("Could not save file " + mapFileString);
            e.printStackTrace();
        }
    }

    public static String[] loadExits(final String seedName, final String exitMapName) {
        String[] exitStrings;
        String mapId = StringFunctions.mapNameToMapId(exitMapName);
        String fileName = StringFunctions.removeSpecialCharacters(mapId) + OoTMConstants.EXIT_FILE_EXTENSION;
        File exitsFile = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + fileName);
        String currentLine;
        int lineCount = 0;
        try {
            FileReader fr1 = new FileReader(exitsFile);
            BufferedReader br1 = new BufferedReader(fr1);
            while ((currentLine = br1.readLine()) != null) {
                if (currentLine.contains("=")) {
                    lineCount++;
                }
            }
            exitStrings = new String[lineCount];
            br1.close();
            FileReader fr2 = new FileReader(exitsFile);
            BufferedReader br2 = new BufferedReader(fr2);
            int i = 0;
            while ((currentLine = br2.readLine()) != null) {
                if (currentLine.contains("=")) {
                    exitStrings[i] = currentLine;
                    i++;
                }
            }
            br2.close();
            return exitStrings;
        } catch (final IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static boolean seedExists(final String seedName) {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDir.exists()) {
            if (possibleSeedDir.isDirectory()) {
                return settingsFileIsValid(seedName);
            }
        }
        return false;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void deleteSeed(final String seedName) {
        File possibleSeedDirectory = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDirectory.exists()) {
            if (!possibleSeedDirectory.delete()) {
                File[] files = possibleSeedDirectory.listFiles();
                if (files != null) {
                    for (final File f : files) {
                        f.delete();
                    }
                }
                possibleSeedDirectory.delete();
            }
        }
    }
}
