package com.james.behavior;

import lejos.robotics.subsumption.Behavior;

import com.james.actions.Actions;
import com.james.hardware.Hardware;

public class DriveForward implements Behavior {

    private final Actions  actions;
    private final Hardware hardware;
    private boolean        suppressed = false;

    public DriveForward(Actions actions, Hardware hardware) {
        this.actions = actions;
        this.hardware = hardware;
    }

    @Override
    public void action() {
        suppressed = false;
        actions.moveForward();
        while (!suppressed) {
            Thread.yield();
        }
        actions.stop();
    }

    @Override
    public void suppress() {
        suppressed = true;
    }

    @Override
    public boolean takeControl() {
        return true;
    }
}