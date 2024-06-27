package com.sparta.dc;

public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration; // Duration in seconds

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
