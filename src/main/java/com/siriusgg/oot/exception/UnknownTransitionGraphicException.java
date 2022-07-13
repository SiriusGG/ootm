package com.siriusgg.oot.exception;

import com.siriusgg.oot.model.places.TransitionGraphic;

public class UnknownTransitionGraphicException extends Exception {
    public UnknownTransitionGraphicException(TransitionGraphic transitionGraphic) {
        super("Unknown TransitionGraphic: " + transitionGraphic.name());
    }
}
