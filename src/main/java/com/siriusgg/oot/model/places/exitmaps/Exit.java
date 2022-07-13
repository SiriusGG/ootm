package com.siriusgg.oot.model.places.exitmaps;

import com.siriusgg.oot.exception.UnknownExitTypeException;
import com.siriusgg.oot.model.Position;
import com.siriusgg.oot.model.places.*;

public abstract class Exit {
    private final ExitType exitType;
    private boolean child;
    private boolean adult;
    private Position topPosition;
    private Position sidePosition;
    private DoorEntrance doorEntrance;
    private DoorExit doorExit;
    private DungeonEntrance dungeonEntrance;
    private DungeonExit dungeonExit;
    private GrottoEntrance grottoEntrance;
    private GrottoExit grottoExit;
    private Overworld overworld;
    private OwlStart owlStart;
    private OwlLanding owlLanding;
    private Warp warp;
    private UnchangingTransition unchangingTransition;

    public Exit(final ExitType exitType) {
        this.exitType = exitType;
        sidePosition = new Position(0.0, 0.0);
        topPosition = new Position(0.0, 0.0);
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public Class getExitTypeClass() throws UnknownExitTypeException {
        switch (exitType) {
            case DOOR_ENTRANCE:
                return DoorEntrance.class;
            case DOOR_EXIT:
                return DoorExit.class;
            case DUNGEON_ENTRANCE:
                return DungeonEntrance.class;
            case DUNGEON_EXIT:
                return DungeonExit.class;
            case GROTTO_ENTRANCE:
                return GrottoEntrance.class;
            case GROTTO_EXIT:
                return GrottoExit.class;
            case OVERWORLD:
                return Overworld.class;
            case OWL_START:
                return OwlStart.class;
            case OWL_LANDING:
                return OwlLanding.class;
            case UNCHANGING:
                return UnchangingTransition.class;
            default:
                throw new UnknownExitTypeException(exitType);
        }
    }

    public boolean canBeUsedAsChild() {
        return child;
    }

    public void intendedAccessibleAsChild(final boolean accessible) {
        child = accessible;
    }

    public boolean canBeUsedAsAdult() {
        return adult;
    }

    public void intendedAccessibleAsAdult(final boolean accessible) {
        adult = accessible;
    }

    public ExitType getExitType() {
        return exitType;
    }

    public Position getSidePosition() {
        return sidePosition;
    }

    public void setSidePosition(final Position sidePosition) {
        this.sidePosition = sidePosition;
    }

    public Position getTopPosition() {
        return topPosition;
    }

    public void setTopPosition(final Position topPosition) {
        this.topPosition = topPosition;
    }

    public DoorEntrance getDoorEntrance() {
        return doorEntrance;
    }

    public void setDoorEntrance(final DoorEntrance doorEntrance) {
        this.doorEntrance = doorEntrance;
    }

    public DoorExit getDoorExit() {
        return doorExit;
    }

    public void setDoorExit(final DoorExit doorExit) {
        this.doorExit = doorExit;
    }

    public DungeonEntrance getDungeonEntrance() {
        return dungeonEntrance;
    }

    public void setDungeonEntrance(final DungeonEntrance dungeonEntrance) {
        this.dungeonEntrance = dungeonEntrance;
    }

    public DungeonExit getDungeonExit() {
        return dungeonExit;
    }

    public void setDungeonExit(final DungeonExit dungeonExit) {
        this.dungeonExit = dungeonExit;
    }

    public GrottoEntrance getGrottoEntrance() {
        return grottoEntrance;
    }

    public void setGrottoEntrance(final GrottoEntrance grottoEntrance) {
        this.grottoEntrance = grottoEntrance;
    }

    public GrottoExit getGrottoExit() {
        return grottoExit;
    }

    public void setGrottoExit(final GrottoExit grottoExit) {
        this.grottoExit = grottoExit;
    }

    public Overworld getOverworld() {
        return overworld;
    }

    public void setOverworld(final Overworld overworld) {
        this.overworld = overworld;
    }

    public OwlStart getOwlStart() {
        return owlStart;
    }

    public void setOwlStart(final OwlStart owlStart) {
        this.owlStart = owlStart;
    }

    public OwlLanding getOwlLanding() {
        return owlLanding;
    }

    public void setOwlLanding(final OwlLanding owlLanding) {
        this.owlLanding = owlLanding;
    }

    public void setWarp(final Warp warp) {
        this.warp = warp;
    }

    public Warp getWarp() {
        return warp;
    }

    public void setUnchangingTransition(final UnchangingTransition unchangingTransition) {
        this.unchangingTransition = unchangingTransition;
    }

    public UnchangingTransition getUnchangingTransition() {
        return unchangingTransition;
    }
}
