package com.github.chabanenk0.Entity;

/**
 * Created by dmitry on 12.02.17.
 */
public class Wheel
{
    private Tyre tyre;
    private String modelName;
    private String type;
    private double diameter;

    public Wheel(Tyre tyre, String modelName, String type, double diameter)
    {
        this.tyre = tyre;
        this.modelName = modelName;
        this.type = type;
        this.diameter = diameter;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
