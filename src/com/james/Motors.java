package com.james;

import lejos.nxt.Motor;

public class Motors {
    private final Motor left;
    private final Motor right;

    public Motors() {
        left = Motor.A;
        right = Motor.C;
    }

    public void moveBackward() {
        left.setSpeed(-400);
        right.setSpeed(-400);
    }

    public void moveForward() {
        left.setSpeed(400);
        right.setSpeed(400);
    }

    public void reverseRight() {
        left.rotate(-180, true);
        right.rotate(-360);
    }

    public void spinLeft() {
        left.setSpeed(-100);
        right.setSpeed(100);
    }

    public void spinRight() {
        left.setSpeed(100);
        right.setSpeed(-100);
    }
}
