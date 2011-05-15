package com.james;

import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class Sensors {
    private final UltrasonicSensor sonar;
    private final TouchSensor      touch;

    public Sensors() {
        touch = new TouchSensor(SensorPort.S1);
        sonar = new UltrasonicSensor(SensorPort.S3);
    }

    public UltrasonicSensor getSonar() {
        return sonar;
    }

    public TouchSensor getTouch() {
        return touch;
    }
}
