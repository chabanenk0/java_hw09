package com.github.chabanenk0.Entity;

/**
 * Created by dmitry on 13.02.17.
 */
public class Tyre
{
    private double diameter;
    private String modelName;

    public Tyre(double diameter, String modelName)
    {
        this.diameter = diameter;
        this.modelName = modelName;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
