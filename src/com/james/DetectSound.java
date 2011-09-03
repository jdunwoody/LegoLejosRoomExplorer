package com.james;
import lejos.robotics.subsumption.Behavior;

public class DetectSound implements Behavior {

    private final Calibration calibration;
    private final Hardware    hardware;
    private final int         soundThreshold;

    public DetectSound(Hardware hardware, Calibration calibration) {
        this.hardware = hardware;
        this.calibration = calibration;
        soundThreshold = calibration.getBackgroundSoundLevel() + 20;
    }

    @Override
    public void action() {

    }

    @Override
    public void suppress() {

    }

    @Override
    public boolean takeControl() {
        return noticableSound();
    }

    private boolean noticableSound() {
        return hardware.getSensors().getSound().readValue() > soundThreshold;
    }
}