package com.siriusgg.oot.exception;

public class NoMapConnectionException extends Exception {
    public NoMapConnectionException(final Object o) {
        super("The passed object must be a value of either the enum Overworld or AdditionalConnection.\n" +
                "An object of type " + o.getClass().toString() + " was passed instead.");
    }
}
