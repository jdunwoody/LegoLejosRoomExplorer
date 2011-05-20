package com.james;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

import com.james.actions.Actions;
import com.james.behavior.DetectSound;
import com.james.behavior.DetectWall;
import com.james.behavior.DriveForward;
import com.james.hardware.Calibration;
import com.james.hardware.Hardware;

public class RoomExplorer {
    public static void main(String[] args) {
        new RoomExplorer().run();
    }

    private final Actions     actions;
    private final Arbitrator  arbitrator;

    private final Calibration calibration;
    private final Hardware    hardware;

    public RoomExplorer() {
        hardware = new Hardware();

        calibration = new Calibration();
        calibration.calibrate(hardware);

        actions = new Actions(calibration, hardware);
        Behavior[] behaviorList = new Behavior[] { new DetectWall(actions, hardware), new DetectSound(hardware, calibration),
                new DriveForward(actions, hardware) };
        arbitrator = new Arbitrator(behaviorList);
    }

    private void displayMessage(String message) {
        LCD.drawString(message, 0, 1);
    }

    public void run() {
        actions.moveForward();

        displayMessage("Bumper Car");
        Button.waitForPress();
        arbitrator.start();
    }
}
