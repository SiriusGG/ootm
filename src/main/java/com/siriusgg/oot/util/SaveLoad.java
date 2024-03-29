package com.siriusgg.oot.util;

import com.siriusgg.oot.constants.OoTMConstants;
import com.siriusgg.oot.model.SeedSettings;
import com.siriusgg.oot.model.list.*;
import com.siriusgg.oot.model.places.*;

import java.io.*;
import java.util.Arrays;

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

    public static File ensureShopsDirectoryExists(final String seedName) throws IOException {
        File seedDirectory = ensureSeedDirectoryExists(seedName);
        File shopsDirectory = new File(seedDirectory + "/" + OoTMConstants.SHOPS_DIRECTORY);
        if (!shopsDirectory.exists()) {
            if (!shopsDirectory.mkdir()) {
                throw new IOException();
            }
        }
        return shopsDirectory;
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
                int withValidSeedSettingsFile = 0;
                for (final File potentialSeedDirectory : potentialSeedDirectories) {
                    if (potentialSeedDirectory.isDirectory() &&
                            SeedSettings.seedSettingsFileIsValid(potentialSeedDirectory.getName())) {
                        withValidSeedSettingsFile++;
                    }
                }
                File[] seedDirectories = new File[withValidSeedSettingsFile];
                int counter = 0;
                for (final File potentialSeedDirectory : potentialSeedDirectories) {
                    if (potentialSeedDirectory.isDirectory() &&
                            SeedSettings.seedSettingsFileIsValid(potentialSeedDirectory.getName())) {
                        seedDirectories[counter] = potentialSeedDirectory;
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
                    throw new IOException("Could not delete old map file \"" + mapFile.getAbsolutePath() + "\".");
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
            System.err.println("Could not save map file " + mapFileString);
            e.printStackTrace();
        }
    }

    public static String[] loadExits(final String seedName, final String exitMapName) {
        String[] exitStrings;
        String mapId = StringFunctions.mapNameToMapId(exitMapName);
        String fileName = StringFunctions.removeSpecialCharacters(mapId) + OoTMConstants.EXIT_FILE_EXTENSION;
        File exitsFile = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + fileName);
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

    public static boolean seedIsValid(final String seedName) {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDir.exists()) {
            if (possibleSeedDir.isDirectory()) {
                return SeedSettings.seedSettingsFileIsValid(seedName);
            }
        }
        return false;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void deleteSeed(final String seedName) {
        File possibleSeedDirectory = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
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

    public static void saveCowCheckList(final String seedName, final CowCheckList list) {
        String saveDirectory = OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY;
        String cowListFileString = saveDirectory + "/" + seedName + "/" + OoTMConstants.COW_LIST_FILE;
        try {
            ensureSeedDirectoryExists(seedName);
            File cowListFile = new File(cowListFileString);
            if (cowListFile.exists()) {
                if (!cowListFile.delete()) {
                    throw new IOException("Could not delete old cow list file \"" +
                            cowListFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(cowListFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < OoTMConstants.COWS_AMOUNT; i++) {
                bw.write(i + "=" + list.getCowCheckAt(i) + "\n");
            }
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            System.err.println("Could not save cow list file " + cowListFileString);
            e.printStackTrace();
        }
    }

    public static CowCheckList loadCowCheckList(final String seedName) {
        if (cowCheckListFileExists(seedName)) {
            if (cowCheckListFileIsValid(seedName)) {
                try {
                    File cowCheckListFile = new File(OoTMConstants.USER_HOME + "/" +
                            OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.COW_LIST_FILE);
                    FileReader fr = new FileReader(cowCheckListFile);
                    BufferedReader br = new BufferedReader(fr);
                    String currentLine;
                    boolean[] cowValues = new boolean[OoTMConstants.COWS_AMOUNT];
                    while ((currentLine = br.readLine()) != null) {
                        if (StringFunctions.startsWithDigit(currentLine)) {
                            int i = Integer.parseInt("" + currentLine.charAt(0));
                            cowValues[i] = Boolean.parseBoolean(
                                    currentLine.substring(currentLine.lastIndexOf("=") + 1));
                        }
                    }
                    br.close();
                    return new CowCheckList(cowValues);
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private static boolean cowCheckListFileIsValid(final String seedName) {
        try {
            File cowListFile = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" +
                    seedName + "/" + OoTMConstants.COW_LIST_FILE);
            FileReader fr = new FileReader(cowListFile);
            BufferedReader br = new BufferedReader(fr);
            String currentLine;
            int[] cowValues = new int[OoTMConstants.COWS_AMOUNT];
            Arrays.fill(cowValues, -1);
            while ((currentLine = br.readLine()) != null) {
                if (StringFunctions.startsWithDigit(currentLine)) {
                    int i = Integer.parseInt("" + currentLine.charAt(0));
                    cowValues[i] = i;
                }
            }
            br.close();
            for (int cowValue : cowValues) {
                if (cowValue < 0 || cowValue >= OoTMConstants.COWS_AMOUNT) {
                    return false;
                }
            }
            return IntArrayFunctions.isUnsortedIndexArray(cowValues);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean cowCheckListFileExists(final String seedName) {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDir.exists()) {
            if (possibleSeedDir.isDirectory()) {
                File f = new File(possibleSeedDir + "/" + OoTMConstants.COW_LIST_FILE);
                return f.exists() && f.isFile();
            }
        }
        return false;
    }

    public static void saveBeanSpotCheckList(final String seedName, final BeanSpotCheckList list) {
        String saveDirectory = OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY;
        String beanListFileString = saveDirectory + "/" + seedName + "/" + OoTMConstants.BEAN_LIST_FILE;
        try {
            ensureSeedDirectoryExists(seedName);
            File beanListFile = new File(beanListFileString);
            if (beanListFile.exists()) {
                if (!beanListFile.delete()) {
                    throw new IOException("Could not delete old bean list file \"" +
                            beanListFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(beanListFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < OoTMConstants.BEAN_SPOTS_AMOUNT; i++) {
                bw.write("B" + i + "=" + list.getBeanCheckAt(i) + "\n");
            }
            for (int i = 0; i < OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT; i++) {
                bw.write("S" + i + "=" + list.getSkulltulaCheckAt(i) + "\n");
            }
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            System.err.println("Could not save bean list file " + beanListFileString);
            e.printStackTrace();
        }
    }

    public static BeanSpotCheckList loadBeanSpotCheckList(final String seedName) {
        if (beanSpotListFileExists(seedName)) {
            if (beanSpotCheckListFileIsValid(seedName)) {
                try {
                    File beanSpotCheckListFile = new File(OoTMConstants.USER_HOME + "/" +
                            OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.BEAN_LIST_FILE);
                    FileReader fr = new FileReader(beanSpotCheckListFile);
                    BufferedReader br = new BufferedReader(fr);
                    String currentLine;
                    boolean[] beansValues = new boolean[OoTMConstants.BEAN_SPOTS_AMOUNT];
                    boolean[] skulltulaValues = new boolean[OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT];
                    while ((currentLine = br.readLine()) != null) {
                        boolean parsedBool = Boolean.parseBoolean(
                                currentLine.substring(currentLine.lastIndexOf("=") + 1));
                        if (currentLine.startsWith("B")) {
                            int i = Integer.parseInt("" + currentLine.charAt(1));
                            beansValues[i] = parsedBool;
                        } else if (currentLine.startsWith("S")) {
                            int i = Integer.parseInt("" + currentLine.charAt(1));
                            skulltulaValues[i] = parsedBool;
                        }
                    }
                    br.close();
                    return new BeanSpotCheckList(beansValues, skulltulaValues);
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private static boolean beanSpotCheckListFileIsValid(final String seedName) {
        try {
            File beanListFile = new File(OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY + "/" +
                    seedName + "/" + OoTMConstants.BEAN_LIST_FILE);
            FileReader fr = new FileReader(beanListFile);
            BufferedReader br = new BufferedReader(fr);
            String currentLine;
            int[] beansValues = new int[OoTMConstants.BEAN_SPOTS_AMOUNT];
            int[] skulltulaValues = new int[OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT];
            Arrays.fill(beansValues, -1);
            Arrays.fill(skulltulaValues, -1);
            while ((currentLine = br.readLine()) != null) {
                if (currentLine.startsWith("B")) {
                    int i = Integer.parseInt("" + currentLine.charAt(1));
                    beansValues[i] = i;
                } else if (currentLine.startsWith("S")) {
                    int i = Integer.parseInt("" + currentLine.charAt(1));
                    skulltulaValues[i] = i;
                }
            }
            br.close();
            for (int beanValue : beansValues) {
                if (beanValue < 0 || beanValue >= OoTMConstants.BEAN_SPOTS_AMOUNT) {
                    return false;
                }
            }
            for (int skulltulaValue : skulltulaValues) {
                if (skulltulaValue < 0 || skulltulaValue >= OoTMConstants.BEAN_SPOT_SKULLTULAS_AMOUNT) {
                    return false;
                }
            }
            return IntArrayFunctions.isUnsortedIndexArray(beansValues) &&
                    IntArrayFunctions.isUnsortedIndexArray(skulltulaValues);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean beanSpotListFileExists(final String seedName) {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDir.exists()) {
            if (possibleSeedDir.isDirectory()) {
                File f = new File(possibleSeedDir + "/" + OoTMConstants.BEAN_LIST_FILE);
                return f.exists() && f.isFile();
            }
        }
        return false;
    }

    public static void saveNotes(final String seedName, final String notes) {
        String saveDirectory = OoTMConstants.USER_HOME + "/" + OoTMConstants.SAVE_DIRECTORY;
        String notesFileString = saveDirectory + "/" + seedName + "/" + OoTMConstants.NOTES_FILE;
        try {
            ensureSeedDirectoryExists(seedName);
            File notesFile = new File(notesFileString);
            if (notesFile.exists()) {
                if (!notesFile.delete()) {
                    throw new IOException("Could not delete old notes file \"" +
                            notesFile.getAbsolutePath() + "\".");
                }
            }
            FileWriter fw = new FileWriter(notesFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(StringFunctions.removeMainInvisibleCharacters(notes));
            bw.flush();
            bw.close();
        } catch (final IOException e) {
            System.err.println("Could not save notes file " + notesFileString);
            e.printStackTrace();
        }
    }

    public static String loadNotes(final String seedName) {
        if (notesFileExists(seedName)) {
            try {
                File notesListFile = new File(OoTMConstants.USER_HOME + "/" +
                        OoTMConstants.SAVE_DIRECTORY + "/" + seedName + "/" + OoTMConstants.NOTES_FILE);
                FileReader fr = new FileReader(notesListFile);
                BufferedReader br = new BufferedReader(fr);
                String currentLine;
                StringBuilder notes = new StringBuilder();
                boolean firstIteration = true;
                while ((currentLine = br.readLine()) != null) {
                    if (!firstIteration) notes.append("\n");
                    notes.append(currentLine);
                    firstIteration = false;
                }
                br.close();
                return notes.toString();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static boolean notesFileExists(final String seedName) {
        File possibleSeedDir = new File(OoTMConstants.USER_HOME + "/" +
                OoTMConstants.SAVE_DIRECTORY + "/" + seedName);
        if (possibleSeedDir.exists()) {
            if (possibleSeedDir.isDirectory()) {
                File f = new File(possibleSeedDir + "/" + OoTMConstants.NOTES_FILE);
                return f.exists() && f.isFile();
            }
        }
        return false;
    }
}
