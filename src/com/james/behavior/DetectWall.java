package com.james.behavior;

import lejos.nxt.Sound;
import lejos.robotics.subsumption.Behavior;

import com.james.actions.Actions;
import com.james.hardware.Hardware;

public class DetectWall implements Behavior {
    private final Actions  actions;
    private final Hardware hardware;

    public DetectWall(Actions actions, Hardware hardware) {
        this.actions = actions;
        this.hardware = hardware;
    }

    @Override
    public void action() {
        actions.reverseRight();
    }

    @Override
    public void suppress() {
        // Since this is highest priority behavior, suppress will never be called.
    }

    @Override
    public boolean takeControl() {
        hardware.getSensors().getSonar().ping();
        Sound.pause(20);
        return hardware.getSensors().getTouch().isPressed() || hardware.getSensors().getSonar().getDistance() < 25;
    }
}
