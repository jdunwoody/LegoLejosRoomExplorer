package com.james.hardware;

import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class Sensors {
    private final UltrasonicSensor sonar;
    private final SoundSensor      sound;
    private final TouchSensor      touch;

    public Sensors() {
        touch = new TouchSensor(SensorPort.S1);
        sonar = new UltrasonicSensor(SensorPort.S3);
        sound = new SoundSensor(SensorPort.S3);
    }

    public UltrasonicSensor getSonar() {
        return sonar;
    }

    public SoundSensor getSound() {
        return sound;
    }

    public TouchSensor getTouch() {
        return touch;
    }
}
