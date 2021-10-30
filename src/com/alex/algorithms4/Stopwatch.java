package com.alex.algorithms4;

public class Stopwatch {

    private long start;

    public void start() {
        start = System.currentTimeMillis();
    }

    public double elapsesTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }


}
