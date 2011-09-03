package com.james;
public class Calibration {
    private Hardware hardware;

    public void calibrate(Hardware hardware) {
        this.hardware = hardware;

    }

    public int getBackgroundSoundLevel() {
        return 0;
    }
}