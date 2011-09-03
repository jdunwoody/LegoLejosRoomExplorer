package com.james;
public class Hardware {
	private final Display display;
	private final Motors motors;
	private final Sensors sensors;

	public Hardware() {
		sensors = new Sensors();
		motors = new Motors();
		display = new Display();
	}

	public Display getDisplay() {
		return display;
	}

	public Motors getMotors() {
		return motors;
	}

	public Sensors getSensors() {
		return sensors;
	}
}
