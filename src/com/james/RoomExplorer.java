package com.james;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RoomExplorer {
    public static void main(String[] args) {
        new RoomExplorer().run();
    }

    private final Arbitrator arbitrator;
    private final Motors     motors;

    private final Sensors    sensors;

    public RoomExplorer() {
        sensors = new Sensors();
        motors = new Motors();

        Behavior b1 = new DriveForward();
        Behavior b2 = new DetectWall(sensors, motors);
        Behavior[] behaviorList = new Behavior[] { b1, b2 };
        arbitrator = new Arbitrator(behaviorList);
    }

    private void displayMessage(String message) {
        LCD.drawString(message, 0, 1);
    }

    public void run() {
        motors.moveForward();

        displayMessage("Bumper Car");
        Button.waitForPress();
        arbitrator.start();
    }
}
