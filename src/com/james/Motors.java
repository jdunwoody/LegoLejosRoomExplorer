package com.james;
import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class Motors {
	public final NXTRegulatedMotor left;
	public final NXTRegulatedMotor right;

	public Motors() {
		left = Motor.A;
		right = Motor.C;
	}
}
