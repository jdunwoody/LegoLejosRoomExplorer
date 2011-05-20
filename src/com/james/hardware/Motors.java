package com.james.hardware;

import lejos.nxt.Motor;

public class Motors {
    public final Motor left;
    public final Motor right;

    public Motors() {
        left = Motor.A;
        right = Motor.C;
    }
}
