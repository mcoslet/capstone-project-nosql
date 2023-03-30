package com.learn.mongo.helper.pojo;

public class SurfaceTemperatureC {
    private double min;
    private double max;
    private double mean;

    public SurfaceTemperatureC(double min, double max, double mean){
        this.min = min;
        this.max = max;
        this.mean = mean;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public double getMean() {
        return mean;
    }

    public double getMin() {
        return min;
    }
}
