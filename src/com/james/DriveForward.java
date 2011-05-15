package com.james;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior {

    private boolean suppressed = false;

    @Override
    public void action() {
        suppressed = false;
        Motor.A.forward();
        Motor.C.forward();
        while (!suppressed) {
            Thread.yield();
        }
        allMoving();
    }

    private void allMoving() {
        Motor.A.stop();
        Motor.C.stop();
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