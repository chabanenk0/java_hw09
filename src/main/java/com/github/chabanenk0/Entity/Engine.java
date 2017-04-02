package com.github.chabanenk0.Entity;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine
{
    private String modelName;
    private long serialNumber;
    private double volume;
    private String type;

    public Engine()
    {
        this.modelName = "no model name";
        this.serialNumber = 0;
        this.volume = 0;
        this.type = "undefined type";
    }

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

    public String toString()
    {
        return "Engine(modelName=" + this.getModelName() + ",volume=" + this.getVolume() + ",serialNumber="
                + this.getSerialNumber() + ",type=" + this.getType() + ")";
    }
}
