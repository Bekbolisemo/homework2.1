package com.company;

final public class Accent extends Car {
    private float volume;
    private color color;
    private int release;

    public Accent(float volume, com.company. color color , int release) {
        this.volume = volume;
        this.color = color;
        this.release = release;
    }

    public Accent() {
    }

    public float getVolume() {
        return volume;
    }

    public com.company.color getColor() {
        return color;
    }

    public int getRelease() {
        return release;
    }

}
