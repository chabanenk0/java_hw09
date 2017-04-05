package com.github.chabanenk0.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tyre")
public class Tyre
{
    private double diameter;
    private String modelName;

    public Tyre()
    {
        this.diameter = 0;
        this.modelName = "";
    }

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
    public Object clone() throws CloneNotSupportedException
    {
        return (Object) new Tyre(this.diameter, this.modelName);
    }
}
