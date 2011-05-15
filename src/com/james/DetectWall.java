package com.james;

import lejos.nxt.Sound;
import lejos.robotics.subsumption.Behavior;

public class DetectWall implements Behavior {
    private final Motors  motors;
    private final Sensors sensors;

    public DetectWall(Sensors sensors, Motors motors) {
        this.sensors = sensors;
        this.motors = motors;
    }

    @Override
    public void action() {
        motors.reverseRight();
    }

    @Override
    public void suppress() {
        // Since this is highest priority behavior, suppress will never be called.
    }

    @Override
    public boolean takeControl() {
        sensors.getSonar().ping();
        Sound.pause(20);
        return sensors.getTouch().isPressed() || sensors.getSonar().getDistance() < 25;
    }
}
