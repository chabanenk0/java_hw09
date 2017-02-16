package com.github.chabanenk0.Entity;

public class Engine
{
    private String modelName;
    private long serialNumber;
    private double volume;
    private String type;

    public Engine(String modelName, long serialNumber, double volume, String type)
    {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.volume = volume;
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
