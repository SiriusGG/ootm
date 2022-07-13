package com.siriusgg.oot.model.util;

import java.io.File;
import java.net.*;

public class FileFunctions {
    private static FileFunctions fileFunctions = null;

    private FileFunctions() {}

    public static FileFunctions getInstance() {
        if (fileFunctions == null) {
            fileFunctions = new FileFunctions();
        }
        return fileFunctions;
    }

    public File getFileFromResource(final String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }

    public String getFilePathFromResource(final String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        } else {
            return resource.getPath();
        }
    }
}
