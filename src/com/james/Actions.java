package com.james;

public class Actions {

	private final Calibration calibration;
	private final Hardware hardware;
	private final Motors motors;

	public Actions(Calibration calibration, Hardware hardware) {
		this.calibration = calibration;
		this.hardware = hardware;
		motors = hardware.getMotors();
	}

	public void moveBackward() {
		motors.left.setSpeed(-400);
		motors.right.setSpeed(-400);
	}

	public void moveForward() {
		motors.left.setSpeed(400);
		motors.right.setSpeed(400);
	}

	public void reverseRight() {
		motors.left.rotate(-180, true);
		motors.right.rotate(-360);
	}

	public void spinLeft() {
		motors.left.setSpeed(-100);
		motors.right.setSpeed(100);
	}

	public void spinRight() {
		motors.left.setSpeed(100);
		motors.right.setSpeed(-100);
	}

	public void stop() {
		motors.left.stop();
		motors.right.stop();
	}
}
